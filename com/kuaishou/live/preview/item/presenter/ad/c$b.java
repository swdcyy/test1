package com.kuaishou.live.preview.item.presenter.ad.c$b;
import wk3.b;
import com.kuaishou.live.preview.item.presenter.ad.c;
import java.lang.Object;
import wk3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import tkd.b;
import tkd.d;
import nl9.r;
import mxb.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class c$b implements b	// class@000e0a
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void W4(){
       a.e(this);
    }
    public void X4(boolean p0){
       a.a(this, p0);
    }
    public void Y4(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "1")) {
          return;
       }
       int i = this.b.u.c();
       if (i == 1 || i == 2) {
          c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, c.class, "12")) {
             tb.w = 0;
             tb.x = 0;
             d.a(0x691527a8).Uw().b(tb.p, 2);
          }
       }
       return;
    }
    public void onPause(){
       a.b(this);
    }
    public void onResume(){
       a.c(this);
    }
    public void t4(LiveWillShowType p0){
       a.h(this, p0);
    }
    public void t7(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       this.b.R8(true);
       return;
    }
    public void x4(){
       a.g(this);
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       this.b.R8(true);
       return;
    }
}
