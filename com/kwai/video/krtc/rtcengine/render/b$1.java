package com.kwai.video.krtc.rtcengine.render.b$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import com.kwai.video.krtc.GL.EglBase$Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.EglBase14;
import com.kwai.video.krtc.GL.EglBase;

public class b$1 implements Runnable	// class@0008ae
{
    public final EglBase$Context a;
    public final int[] b;
    public final b c;

    public void b$1(b p0,EglBase$Context p1,int[] p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$1.class, "1")) {
          return;
       }
       b$1 ta = this.a;
       if (ta == null) {
          if (EglBase14.a()) {
             b.a(this.c, EglBase.createEgl14(this.b));
          }else {
             b.a(this.c, EglBase.createEgl10(this.b));
          }
       }else {
          b.a(this.c, EglBase.create(ta, this.b));
       }
       return;
    }
}
