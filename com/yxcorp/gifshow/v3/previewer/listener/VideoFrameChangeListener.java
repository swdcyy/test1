package com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;

public interface abstract VideoFrameChangeListener	// class@0015e1
{

    void l(VideoFrameChangeListener$CHANGE_TYPE p0);
    void o();
    void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2);
    void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1);
}
