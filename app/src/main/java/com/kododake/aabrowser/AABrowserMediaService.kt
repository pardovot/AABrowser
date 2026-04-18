package com.kododake.aabrowser

import android.content.Intent
import android.os.Bundle
import android.service.media.MediaBrowserService
import android.media.browse.MediaBrowser

class AABrowserMediaService : MediaBrowserService() {

    override fun onGetRoot(
        clientPackageName: String,
        clientUid: Int,
        rootHints: Bundle?
    ): BrowserRoot {
        val launch = Intent(this, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        startActivity(launch)
        return BrowserRoot(ROOT_ID, null)
    }

    override fun onLoadChildren(
        parentId: String,
        result: Result<MutableList<MediaBrowser.MediaItem>>
    ) {
        result.sendResult(mutableListOf())
    }

    companion object {
        private const val ROOT_ID = "root"
    }
}
