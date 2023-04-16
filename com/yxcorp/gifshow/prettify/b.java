package com.yxcorp.gifshow.prettify.b;
import erd.g;
import com.yxcorp.gifshow.prettify.e;
import java.lang.Object;
import g16.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import j8c.a;
import q87.c;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import java.util.List;
import oc9.q;
import java.util.Iterator;
import oc9.t;
import l0c.f;
import com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import l0c.a0;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.prettify.a;
import com.yxcorp.gifshow.camera.bubble.b$d;
import l0c.e0;
import com.yxcorp.gifshow.camera.bubble.b$c;
import l0c.b0;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class b implements g	// class@0010e8
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       boolean b1;
       b tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "14")) {
       }else {
          p0 = p0.mGuideInfo;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          e obj = PatchProxy.applyOneRefs(p0, tb, uoe, "18");
          boolean b = true;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!tb.e.isFinishing() && (tb.e.isDestroyed() || p0 == null)){
             if (tb.x != null) {
                objArray = new Object[0];
                a.D().s("PrettifyController", "ignore guide info, btn clicked", objArray);
             }else if(tb.a2()){
                objArray = new Object[0];
                a.D().s("PrettifyController", "ignore guide info, has record", objArray);
             }else {
                obj = tb.s;
                if (obj != null && (!obj.isShown() || !tb.s.isEnabled())) {
                   objArray = new Object[0];
                   a.D().s("PrettifyController", "ignore guide info, btn not show/enable", objArray);
                }else if(!tb.e.b3() || !tb.f.isAdded()){
                   objArray = new Object[0];
                   a.D().s("PrettifyController", "ignore guide info, fragment not show", objArray);
                }else {
                   Iterator obj1 = PatchProxy.applyOneRefs(p0, tb, uoe, "19");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      obj1 = tb.getChildren().iterator();
                      while (true) {
                         if (obj1.hasNext()) {
                            t ot = obj1.next();
                            if (ot instanceof f && (!ot.C() && ot.a0(p0))) {
                               b1 = true;
                            }
                         }else {
                            b1 = false;
                         }
                      }
                   }
                   if (!b1) {
                      objArray = new Object[0];
                      a.D().s("PrettifyController", "ignore guide info, no child handle", objArray);
                   }else if(tb.E != null){
                      objArray = new Object[0];
                      a.D().s("PrettifyController", "ignore guide info, some panel is showing", objArray);
                   }else {
                      b = false;
                   }
                }
             }
          }
          if (!b) {
             objArray = new Object[0];
             a.D().s("PrettifyController", "Got guide info", objArray);
             c uoc = tb.d.b().V7();
             if (uoc != null) {
                b uob = new b(RecordBubbleItem.PRETTIFY_GUIDE).n(tb.s);
                uob.B(p0.c());
                uob.s(R.layout.arg_RES_7f0d11a4);
                uob = uob.z(new a0(tb, p0));
                uob.w(new a(tb, p0));
                uob.v(new e0(tb, p0));
                uob.u(new b0(tb, p0));
                uoc.n(uob);
             }
          }
       }
       return;
    }
}
