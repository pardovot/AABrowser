package com.kododake.aabrowser

import android.os.Bundle
import android.service.media.MediaBrowserService
import android.media.browse.MediaBrowser

class AABrowserMediaService : MediaBrowserService() {

    override fun onGetRoot(
        clientPackageName: String,
        clientUid: Int,
        rootHints: Bundle?
    ): BrowserRoot? = null

    override fun onLoadChildren(
        parentId: String,
        result: Result<MutableList<MediaBrowser.MediaItem>>
    ) {
        result.sendResult(mutableListOf())
    }
}
