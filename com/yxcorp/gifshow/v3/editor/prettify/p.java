package com.yxcorp.gifshow.v3.editor.prettify.p;
import com.yxcorp.gifshow.v3.editor.prettify.q;
import boc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import boc.e;
import im8.f;
import x59.g;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import x59.f;
import java.lang.Runnable;
import t45.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class p extends q	// class@00119d
{
    public f q;

    public void p(){
       super();
    }
    public void P8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       if (p0 == e.c) {
          p tq = this.q;
          if (tq != null) {
             g og = tq.get();
             _monitor_enter(og);
             if (PatchProxy.applyVoid(null, og, g.class, "6")) {
                _monitor_exit(og);
             }else {
                Object[] objArray = new Object[0];
                a.D().w("BitmapFilterRendererManager", "reload mStatus:"+og.a, objArray);
                og.d();
                if (og.a == null) {
                   c.a(new f(og));
                }
                _monitor_exit(og);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.q = this.x8("BITMAP_FILTER_RENDERER_MANAGER");
       return;
    }
}
