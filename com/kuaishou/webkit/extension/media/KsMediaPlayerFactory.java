package com.kuaishou.webkit.extension.media.KsMediaPlayerFactory;
import com.kuaishou.webkit.extension.media.IKsMediaPlayer;
import com.kuaishou.webkit.extension.media.KsMediaPlayerFactory$CreateParams;
import com.kuaishou.webkit.extension.media.KsMediaPlayerFactory$CreateLiveParams;

public interface abstract KsMediaPlayerFactory	// class@00130c
{

    IKsMediaPlayer create();
    IKsMediaPlayer create(KsMediaPlayerFactory$CreateParams p0);
    IKsMediaPlayer createLive(KsMediaPlayerFactory$CreateLiveParams p0);
}
