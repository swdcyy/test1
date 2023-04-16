package com.kwai.video.aemonplayer.AemonJNIBuiltIn;
import com.kwai.video.aemonplayer.AemonJNI;
import com.kwai.video.aemonplayer.JavaAttrList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.IMediaDataSource;
import android.view.Surface;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Float;

public class AemonJNIBuiltIn extends AemonJNI	// class@001997
{

    public void AemonJNIBuiltIn(){
       super();
    }
    public static native JavaAttrList _native_staticBizInvoke(int p0,JavaAttrList p1);
    public static JavaAttrList native_staticBizInvoke(int p0,JavaAttrList p1){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uAemonJNIBui, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return AemonJNIBuiltIn._native_staticBizInvoke(p0, p1);
    }
    public native final int _native_addDataSource(long p0,String p1,String p2,boolean p3);
    public native final JavaAttrList _native_bizInvoke(long p0,int p1,JavaAttrList p2);
    public native final long _native_createPlayer(Object p0);
    public native final long _native_getCurrentPosition(long p0);
    public native final long _native_getDuration(long p0);
    public native final float _native_getPropertyFloat(long p0,int p1,float p2);
    public native final int _native_getPropertyInt(long p0,int p1,int p2);
    public native final long _native_getPropertyLong(long p0,int p1,long p2);
    public native final String _native_getPropertyString(long p0,int p1);
    public native final boolean _native_isPlaying(long p0);
    public native final int _native_pause(long p0);
    public native final int _native_prepareAsync(long p0);
    public native final int _native_release(long p0);
    public native final int _native_reset(long p0);
    public native final int _native_seekTo(long p0,long p1);
    public native final int _native_setDataSource(long p0,IMediaDataSource p1);
    public native final int _native_setDataSource(long p0,String p1,String[] p2,String[] p3);
    public native final int _native_setDataSourceFd(long p0,int p1,long p2,long p3);
    public native final int _native_setOption(long p0,int p1,String p2,long p3);
    public native final int _native_setOption(long p0,int p1,String p2,String p3);
    public native final int _native_setPropertyBoolean(long p0,int p1,boolean p2);
    public native final int _native_setPropertyFloat(long p0,int p1,float p2);
    public native final int _native_setPropertyInt(long p0,int p1,int p2);
    public native final int _native_setPropertyString(long p0,int p1,String p2);
    public native final int _native_setVideoSurface(long p0,Surface p1,int p2);
    public native final int _native_setVolume(long p0,float p1,float p2);
    public native final int _native_shutdownWaitStop(long p0);
    public native final int _native_start(long p0);
    public native final int _native_stop(long p0);
    public native final int _native_switchToDataSource(long p0,int p1);
    public int getJniInstallMode(){
       return 0;
    }
    public int native_addDataSource(long p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, AemonJNIBuiltIn.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_addDataSource(p0, p1, p2, p3);
    }
    public JavaAttrList native_bizInvoke(long p0,int p1,JavaAttrList p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, this, AemonJNIBuiltIn.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_bizInvoke(p0, p1, p2);
    }
    public long native_createPlayer(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AemonJNIBuiltIn.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this._native_createPlayer(p0);
    }
    public long native_getCurrentPosition(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "17");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._native_getCurrentPosition(p0);
    }
    public long native_getDuration(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "18");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._native_getDuration(p0);
    }
    public float native_getPropertyFloat(long p0,int p1,float p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, AemonJNIBuiltIn.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this._native_getPropertyFloat(p0, p1, p2);
    }
    public int native_getPropertyInt(long p0,int p1,int p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AemonJNIBuiltIn.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_getPropertyInt(p0, p1, p2);
    }
    public long native_getPropertyLong(long p0,int p1,long p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, AemonJNIBuiltIn.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this._native_getPropertyLong(p0, p1, p2);
    }
    public String native_getPropertyString(long p0,int p1){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uAemonJNIBui, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this._native_getPropertyString(p0, p1);
    }
    public boolean native_isPlaying(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this._native_isPlaying(p0);
    }
    public int native_pause(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_pause(p0);
    }
    public int native_prepareAsync(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_prepareAsync(p0);
    }
    public int native_release(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_release(p0);
    }
    public int native_reset(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_reset(p0);
    }
    public int native_seekTo(long p0,long p1){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uAemonJNIBui, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_seekTo(p0, p1);
    }
    public int native_setDataSource(long p0,IMediaDataSource p1){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, uAemonJNIBui, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setDataSource(p0, p1);
    }
    public int native_setDataSource(long p0,String p1,String[] p2,String[] p3){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, p2, p3, this, AemonJNIBuiltIn.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setDataSource(p0, p1, p2, p3);
    }
    public int native_setDataSourceFd(long p0,int p1,long p2,long p3){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, AemonJNIBuiltIn.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setDataSourceFd(p0, p1, p2, p3);
    }
    public int native_setOption(long p0,int p1,String p2,long p3){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, Long.valueOf(p3), this, AemonJNIBuiltIn.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setOption(p0, p1, p2, p3);
    }
    public int native_setOption(long p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, p3, this, AemonJNIBuiltIn.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setOption(p0, p1, p2, p3);
    }
    public int native_setPropertyBoolean(long p0,int p1,boolean p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, AemonJNIBuiltIn.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setPropertyBoolean(p0, p1, p2);
    }
    public int native_setPropertyFloat(long p0,int p1,float p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, AemonJNIBuiltIn.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setPropertyFloat(p0, p1, p2);
    }
    public int native_setPropertyInt(long p0,int p1,int p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AemonJNIBuiltIn.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setPropertyInt(p0, p1, p2);
    }
    public int native_setPropertyString(long p0,int p1,String p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), p2, this, AemonJNIBuiltIn.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setPropertyString(p0, p1, p2);
    }
    public int native_setVideoSurface(long p0,Surface p1,int p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, AemonJNIBuiltIn.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setVideoSurface(p0, p1, p2);
    }
    public int native_setVolume(long p0,float p1,float p2){
       if (PatchProxy.isSupport(AemonJNIBuiltIn.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, AemonJNIBuiltIn.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_setVolume(p0, p1, p2);
    }
    public int native_shutdownWaitStop(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_shutdownWaitStop(p0);
    }
    public int native_start(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_start(p0);
    }
    public int native_stop(long p0){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAemonJNIBui, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_stop(p0);
    }
    public int native_switchToDataSource(long p0,int p1){
       AemonJNIBuiltIn uAemonJNIBui = AemonJNIBuiltIn.class;
       if (PatchProxy.isSupport(uAemonJNIBui)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uAemonJNIBui, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._native_switchToDataSource(p0, p1);
    }
}
