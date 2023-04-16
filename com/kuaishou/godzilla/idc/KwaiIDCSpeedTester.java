package com.kuaishou.godzilla.idc.KwaiIDCSpeedTester;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.godzilla.Godzilla;
import com.kuaishou.godzilla.Godzilla$LibraryLoader;
import java.util.List;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import com.kuaishou.godzilla.idc.KwaIDCSpeedTestCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class KwaiIDCSpeedTester	// class@00089a
{
    public long mPtr;

    public void KwaiIDCSpeedTester(String p0,boolean p1){
       super();
       if (!Godzilla.isInitialized()) {
          Godzilla.initialize(null);
       }
       this.mPtr = this.nativeInit(p0, p1);
       return;
    }
    public native final void nativeDestroy(long p0);
    public native final long nativeInit(String p0,boolean p1);
    public native final void nativePause(long p0);
    public native final void nativeResume(long p0);
    public native final void nativeTestSpeed(long p0,String p1,List p2,KwaiSpeedTestRequestGenerator p3,KwaIDCSpeedTestCallback p4,long p5,long p6);
    public void pause(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSpeedTester.class, "2")) {
          return;
       }
       this.nativePause(this.mPtr);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSpeedTester.class, "4")) {
          return;
       }
       this.nativeDestroy(this.mPtr);
       this.mPtr = 0;
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSpeedTester.class, "3")) {
          return;
       }
       this.nativeResume(this.mPtr);
       return;
    }
    public void testSpeed(String p0,List p1,KwaiSpeedTestRequestGenerator p2,KwaIDCSpeedTestCallback p3,long p4,long p5){
       KwaiIDCSpeedTester kwaiIDCSpeed = this;
       KwaiIDCSpeedTester kwaiIDCSpeed1 = KwaiIDCSpeedTester.class;
       if (PatchProxy.isSupport(kwaiIDCSpeed1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, kwaiIDCSpeed1, "1")) {
             return;
          }
       }
       this.nativeTestSpeed(kwaiIDCSpeed.mPtr, p0, p1, p2, p3, p4, p5);
       return;
    }
}
