package com.yxcorp.gifshow.share.h;
import ohc.f;
import com.yxcorp.gifshow.share.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.i$a;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import ohc.l;
import mhc.n1;
import com.yxcorp.gifshow.share.i$b;
import ohc.h;

public class h extends f	// class@001b98
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public void b(QPhoto p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "3")) {
          return;
       }
       super.b(p0, p1);
       i e = this.b.e;
       if (e != null) {
          e.a(p0, p1);
       }
       return;
    }
    public void n(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
       }else {
          super.n(p0, p1);
          i e = this.b.e;
          if (e != null) {
             e.c(p0, p1);
          }
       }
       return;
    }
    public void r(l p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       super.r(p0, p1);
       i e = this.b.e;
       if (e != null) {
          e.b(p0, p1);
       }
       return;
    }
}
