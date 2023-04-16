package com.kuaishou.live.core.show.fansgroup.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import z12.x;
import a61.a;
import ekd.k1;
import java.lang.Boolean;
import java.lang.Long;
import f82.a;
import android.os.Looper;
import java.lang.Runnable;

public class b	// class@000b42
{
    public View a;
    public View b;
    public AnimatorSet c;
    public a d;
    public boolean e;
    public int f;
    public Object g;

    public void b(View p0,View p1){
       super();
       this.g = new Object();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(){
       return this.e;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       x.I(this.c);
       b td = this.d;
       if (td != null) {
          td.d();
       }
       this.b.setAlpha(0x3f800000);
       this.b.setScaleX(0x3f800000);
       this.b.setScaleY(0x3f800000);
       this.a.setVisibility(8);
       k1.n(this);
       k1.n(this.g);
       this.e = false;
       return;
    }
    public void c(boolean p0,long p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, b.class, "1")) {
          return;
       }
       this.e = true;
       this.a.setVisibility(0);
       this.a.setAlpha(0);
       a uoa = new a(this);
       if (p0) {
          if (this.d == null) {
             this.d = new a(Looper.getMainLooper(), p1, uoa);
          }
          this.d.a(p2);
       }else {
          b td = this.d;
          if (td != null) {
             td.d();
          }
          k1.s(uoa, this, p2);
       }
       return;
    }
}
