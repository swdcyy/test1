package com.kwai.library.slide.base.widget.e;
import xtd.d;
import xtd.g;
import com.kwai.library.slide.base.widget.e$a;
import ytd.b;
import xtd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import xtd.g$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.slide.base.widget.e$b;
import xtd.g$e;
import com.kwai.library.slide.base.widget.e$c;
import android.view.View;
import java.lang.Float;
import android.view.MotionEvent;
import java.lang.Math;

public class e extends g implements d	// class@000901
{
    public final e$a k;
    public float l;

    public void e(e$a p0,float p1){
       super(p0, -2.00f, p1, 0x3f800000);
       this.k = p0;
       this.b(this);
    }
    public void c(b p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "6")) {
          return;
       }
       int i = 3;
       if (p1 == i && !p2) {
          this.k.h();
       }else if(!p1 && p2 == 2){
          this.k.a();
       }else if(p1 == 2 && p2 == i){
          this.k.c();
       }
       return;
    }
    public g$a e(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e$b(this);
    }
    public g$e f(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e$c(this);
    }
    public void h(View p0,float p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, e.class, "3")) {
          return;
       }
       this.k(p1);
       return;
    }
    public void i(View p0,float p1,MotionEvent p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), p2, this, e.class, "4")) {
          return;
       }
       this.k(p1);
       p2.offsetLocation((p1 - p2.getY(0)), 0);
       return;
    }
    public void k(float p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, e.class, "5")) {
          return;
       }
       p0 = Math.max((float)(- this.k.i()), p0);
       this.l = p0;
       this.k.e(p0);
       return;
    }
}
