package com.yxcorp.gifshow.v3.editor.segment.timeline.m;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;
import ftc.h;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public class m implements VideoTrimmer$j	// class@0011f3
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public VideoSDKPlayerView f;
    public k$b g;
    public int h;
    public float i;

    public void m(h p0,VideoSDKPlayerView p1,float p2,long p3,k$b p4){
       super();
       this.a = -1;
       this.b = -1;
       this.c = (int)p0.getFrameInterval();
       this.f = p1;
       this.g = p4;
       this.i = p2;
       this.h = (int)p3;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       m tg = this.g;
       if (tg != null) {
          tg.d();
       }
       return;
    }
    public void b(float p0,float p1,int p2,int p3,boolean p4,boolean p5,boolean p6){
       int i3;
       m tg;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, om, "6")) {
             return;
          }
       }
       if (p3 >= p2 && !p4) {
          this.d = Math.round(p0);
          int i = Math.round(p1);
          this.e = i;
          om = this.d;
          int i1 = i - om;
          int i2 = 1000;
          if (i1 <= i2) {
             if (p5) {
                i3 = Math.min(this.h, (om + i2));
                this.e = i3;
                this.d = Math.max(0, (i3 - i2));
             }else {
                i3 = Math.max(0, (i - i2));
                this.d = i3;
                this.e = Math.min(this.h, (i3 + i2));
             }
             tg = this.g;
             if (tg != null) {
                if (p6) {
                   tg.c();
                }
                this.g.a(this.d, this.e, p2, p3);
             }
             return;
          }else {
             float f = this.i * 1000.00f;
             float f1 = Math.abs(((float)i1 - f)) / f;
             Object[] objArray1 = new Object[0];
             a.D().s("VideoTrimmerListener", "onRangeSelected frameRangeTime: "+i1+",  remain: "+f+" delta="+f1, objArray1);
             if (f1 - 0x3b449ba6 <= 0) {
                p0 = 0;
                if (p5) {
                   int i4 = (int)Math.min((float)this.h, ((float)this.d + f));
                   this.e = i4;
                   this.d = (int)Math.max(((float)i4 - f), p0);
                }else {
                   i3 = (int)Math.max(((float)this.e - f), p0);
                   this.d = i3;
                   this.e = (int)Math.min((float)this.h, ((float)i3 + f));
                }
                tg = this.g;
                if (tg != null) {
                   if (p6) {
                      tg.b();
                   }
                   this.g.a(this.d, this.e, p2, p3);
                }
                return;
             }else {
                Object[] objArray2 = new Object[0];
                a.D().s("VideoTrimmerListener", "onRangeSelected: clipStart: "+this.d+", clipEnd: "+this.e+", startMils: "+p0+", endMils: "+p1, objArray2);
                tg = this.g;
                if (tg != null) {
                   tg.a(this.d, this.e, p2, p3);
                }
             }
          }
       }
       return;
    }
    public void c(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "4")) {
          return;
       }
       if (p0 == this.b) {
          return;
       }
       this.b = p0;
       p0 = p0 * this.c;
       om = this.f;
       if (om != null) {
          om.pause();
          this.f.seekTo(this.g((p0 - 2000)));
       }
       return;
    }
    public void d(int p0,int p1,float p2,float p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, m.class, "5")) {
          return;
       }
       if (p0 == this.a) {
          return;
       }
       this.a = p0;
       m tf = this.f;
       if (tf != null) {
          tf.pause();
          this.f.seekTo(this.g(Math.round(p2)));
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       m tg = this.g;
       if (tg != null) {
          tg.e();
       }
       return;
    }
    public void f(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "3")) {
          return;
       }
       if (p0 == this.a) {
          return;
       }
       this.a = p0;
       p0 = p0 * this.c;
       om = this.f;
       if (om != null) {
          om.pause();
          this.f.seekTo(this.g(p0));
       }
       return;
    }
    public final double g(int p0){
       return (double)((float)p0 / 1000.00f);
    }
}
