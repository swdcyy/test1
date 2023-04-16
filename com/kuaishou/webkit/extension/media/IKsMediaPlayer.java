package com.kuaishou.webkit.extension.media.IKsMediaPlayer;
import android.content.Context;
import android.net.Uri;
import java.io.FileDescriptor;
import java.lang.String;
import com.kuaishou.webkit.extension.media.IKsMediaPlayer$OnStateChangedListener;
import android.view.Surface;

public interface abstract IKsMediaPlayer	// class@001309
{

    void abPlay(int p0,int p1,int p2);
    boolean canSeekBackward();
    boolean canSeekForward();
    int getCurrentPosition();
    int getDuration();
    boolean isPlaying();
    void pause();
    boolean prepareAsync();
    void release();
    void seekTo(int p0);
    boolean setDataSource(Context p0,Uri p1);
    boolean setDataSource(FileDescriptor p0,long p1,long p2);
    boolean setDataSource(String p0,String p1,String p2,boolean p3);
    void setPlaybackRate(double p0);
    void setStateChangedListener(IKsMediaPlayer$OnStateChangedListener p0);
    void setSurface(Surface p0);
    void setVolume(double p0);
    void start();
    void updateLiveSrc(String p0);
}
