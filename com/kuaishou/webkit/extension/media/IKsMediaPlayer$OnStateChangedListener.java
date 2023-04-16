package com.kuaishou.webkit.extension.media.IKsMediaPlayer$OnStateChangedListener;
import android.os.Bundle;
import java.lang.Object;

public interface abstract IKsMediaPlayer$OnStateChangedListener	// class@001308
{

    void onAbEnded();
    void onCompletion();
    boolean onError(int p0,int p1);
    void onNetworkError(int p0);
    void onNotifyDownloading(boolean p0);
    void onPrepared();
    void onVideoSizeChanged(int p0,int p1);
    boolean setMiscBundle(int p0,Bundle p1);
    boolean setMiscObject(int p0,Object p1);
}
