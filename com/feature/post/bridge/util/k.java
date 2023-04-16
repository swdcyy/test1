package com.feature.post.bridge.util.k;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.jsmodel.JsShopVideoUploadParams;
import og.b1;
import java.lang.Object;
import w26.c;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.String;
import og.a1;
import og.t0;
import com.kwai.robust.PatchProxyResult;
import qm6.b$a;
import android.content.Context;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import o79.a;
import java.util.Objects;
import java.lang.Integer;
import java.util.Map;
import z36.d$a;
import qm6.b;
import android.content.Intent;
import og.l;
import q87.c;
import n3d.a;

public final class k implements g	// class@0014d5
{
    public final GifshowActivity b;
    public final JsShopVideoUploadParams c;
    public final b1 d;

    public void k(GifshowActivity p0,JsShopVideoUploadParams p1,b1 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       f uof = y6.r(f.class);
       RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
       if (tc == null) {
          a1.a("not valid params for uploadShopVideo", td);
       }else {
          t0 ot0 = new t0(td, p0);
          p0 = PatchProxyResult.class;
          b$a uoa = b$a.class;
          b$a uoa1 = new b$a(tb, 0);
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.FALSE, uoa1, uoa, "19");
             if (obj != p0) {
                uoa1 = obj;
             label_0046 :
                uoa1 = uoa1.Z(tc.generateWholeUploadParams()).j(a.d).i0(1).O(1).l(3).z(1);
                int i = 2;
                Objects.requireNonNull(uoa1);
                if (PatchProxy.isSupport(uoa)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), uoa1, uoa, "31");
                   if (obj1 != p0) {
                      uoa1 = obj1;
                   label_0082 :
                      uoa1 = uoa1.q(6);
                      Objects.requireNonNull(uoa1);
                      if (PatchProxy.isSupport(uoa)) {
                         Object obj2 = PatchProxy.applyOneRefs(Boolean.TRUE, uoa1, uoa, "49");
                         if (obj2 != p0) {
                            uoa1 = obj2;
                         label_00a0 :
                            Objects.requireNonNull(uoa1);
                            if (PatchProxy.isSupport(uoa)) {
                               obj2 = PatchProxy.applyOneRefs(Boolean.TRUE, uoa1, uoa, "50");
                               if (obj2 != p0) {
                                  boolean b = obj2;
                               label_00b9 :
                                  Objects.requireNonNull(b);
                                  if (PatchProxy.isSupport(uoa)) {
                                     Object[] obj3 = PatchProxy.applyOneRefs(Boolean.TRUE, b, uoa, "51");
                                     if (obj3 != p0) {
                                        b = obj3;
                                     label_00d2 :
                                        p0 = recordPostPl.NM(b.d(tc.mArgsMap).f());
                                        obj3 = new Object[]{"constructShopRecordIntent"};
                                        l.D().w("PostMediaHelper", "discardCurrentPostSession", obj3);
                                        p0.putExtra("discard_current_post_session", 1);
                                        tb.t1(p0, 19, ot0);
                                     }
                                  }
                                  b.J = true;
                                  goto label_00d2 ;
                               }
                            }
                            uoa1.I = true;
                            goto label_00b9 ;
                         }
                      }
                      uoa1.H = true;
                      goto label_00a0 ;
                   }
                }
                uoa1.b1 = i;
                goto label_0082 ;
             }
          }
          uoa1.Y = false;
          goto label_0046 ;
       }
       return;
    }
}
