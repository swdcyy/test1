package com.kwai.slide.play.detail.base.BasePage$p1;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import uq7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp7.b;
import uq7.b;
import com.kwai.slide.play.detail.event.CleanType;
import hs7.c;
import android.view.ViewGroup;
import qp7.e;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import bq7.c;
import xq7.a;

public final class BasePage$p1 implements Observer	// class@00177e
{
    public final BasePage b;

    public void BasePage$p1(BasePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       ViewGroup viewGroup1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$p1.class, "1")) {
       }else {
          ViewGroup viewGroup = null;
          boolean b = false;
          if (this.b.t0()) {
             b uob = this.b.e0().a();
             CleanType uCleanType = (uob != null)? uob.a(): viewGroup;
             if (uCleanType != CleanType.TYPE_ALL) {
                uob = this.b.e0().a();
                uCleanType = (uob != null)? uob.a(): viewGroup;
                if (uCleanType != CleanType.TYPE_PRESS_SPEED) {
                label_0049 :
                   c.a(this.b.c0().u());
                   viewGroup1 = this.b.c0().u();
                   int i = p0.b() ^ 1;
                   boolean b1 = (p0.a() && this.b.r0())? true: false;
                   c.d(viewGroup1, i, b1);
                }
             }
          }else {
             goto label_0049 ;
          }
          if (this.b.s0()) {
             c uoc = this.b.x();
             if (uoc != null) {
                viewGroup = uoc.u();
             }
             if (!this.b.t0()) {
                c.a(viewGroup);
                int i1 = p0.b() ^ 1;
                if (p0.a() && this.b.r0()) {
                   b = true;
                }
                c.d(viewGroup, i1, b);
             }
          }else if(!this.b.t0()){
             c.a(this.b.N().u());
             viewGroup1 = this.b.N().u();
             int i2 = p0.b() ^ 1;
             if (p0.a() && this.b.r0()) {
                b = true;
             }
             c.d(viewGroup1, i2, b);
          }
       }
       return;
    }
}
