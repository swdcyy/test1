package com.kwai.video.krtc.rtcengine.internal.t;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.rtcengine.internal.t$1;
import com.kwai.video.krtc.observers.a;

public class t	// class@000899
{
    public Arya a;
    public z b;

    public void t(Arya p0,z p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static z a(t p0){
       return p0.b;
    }
    public int a(){
       return 0;
    }
    public int a(float p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, ot, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.a.setSoundEffectVolume(p0);
       return 0;
    }
    public int a(String p0){
       return 0;
    }
    public int a(String p0,double p1){
       return 0;
    }
    public int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.playSoundEffect(p1, new t$1(this, p0));
       return 0;
    }
    public int b(){
       return 0;
    }
    public int b(String p0){
       return 0;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.stopAllSoundEffects();
       return 0;
    }
    public int c(String p0){
       return 0;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.cleanSoundEffectCache();
       return 0;
    }
    public int d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.loadSoundEffectCache(p0);
       return 0;
    }
    public double e(){
       return 0;
    }
    public int e(String p0){
       return 0;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, t.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.setMuteSoundEffect(true);
       return 0;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, t.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.a.setMuteSoundEffect(false);
       return false;
    }
}
