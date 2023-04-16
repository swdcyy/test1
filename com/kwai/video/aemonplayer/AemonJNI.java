package com.kwai.video.aemonplayer.AemonJNI;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.aemonplayer.JavaAttrList;
import com.kwai.video.aemonplayer.IMediaDataSource;
import android.view.Surface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.AemonHotfix;

public abstract class AemonJNI	// class@001996
{

    public void AemonJNI(){
       super();
    }
    public abstract int getJniInstallMode();
    public abstract int native_addDataSource(long p0,String p1,String p2,boolean p3);
    public abstract JavaAttrList native_bizInvoke(long p0,int p1,JavaAttrList p2);
    public abstract long native_createPlayer(Object p0);
    public abstract long native_getCurrentPosition(long p0);
    public abstract long native_getDuration(long p0);
    public abstract float native_getPropertyFloat(long p0,int p1,float p2);
    public abstract int native_getPropertyInt(long p0,int p1,int p2);
    public abstract long native_getPropertyLong(long p0,int p1,long p2);
    public abstract String native_getPropertyString(long p0,int p1);
    public abstract boolean native_isPlaying(long p0);
    public abstract int native_pause(long p0);
    public abstract int native_prepareAsync(long p0);
    public abstract int native_release(long p0);
    public abstract int native_reset(long p0);
    public abstract int native_seekTo(long p0,long p1);
    public abstract int native_setDataSource(long p0,IMediaDataSource p1);
    public abstract int native_setDataSource(long p0,String p1,String[] p2,String[] p3);
    public abstract int native_setDataSourceFd(long p0,int p1,long p2,long p3);
    public abstract int native_setOption(long p0,int p1,String p2,long p3);
    public abstract int native_setOption(long p0,int p1,String p2,String p3);
    public abstract int native_setPropertyBoolean(long p0,int p1,boolean p2);
    public abstract int native_setPropertyFloat(long p0,int p1,float p2);
    public abstract int native_setPropertyInt(long p0,int p1,int p2);
    public abstract int native_setPropertyString(long p0,int p1,String p2);
    public abstract int native_setVideoSurface(long p0,Surface p1,int p2);
    public abstract int native_setVolume(long p0,float p1,float p2);
    public abstract int native_shutdownWaitStop(long p0);
    public abstract int native_start(long p0);
    public abstract int native_stop(long p0);
    public abstract int native_switchToDataSource(long p0,int p1);
    public final JavaAttrList newJavaAttrList(){
       Object obj = PatchProxy.apply(null, this, AemonJNI.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AemonHotfix.staticCreateJavaAttrList(this.getJniInstallMode());
    }
}
