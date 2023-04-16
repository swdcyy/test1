package com.yxcorp.gifshow.comment.a;
import erd.g;
import ek9.e;
import com.kwai.emotionsdk.bean.EmotionInfo;
import yk9.d;
import k2b.e0;
import android.app.Activity;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lk9.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ek9.b;
import io.reactivex.a;
import brd.a;
import t45.d;
import brd.z;
import ek9.c;
import ek9.d;
import erd.a;
import lnc.a1;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class a implements g	// class@001099
{
    public final e b;
    public final EmotionInfo c;
    public final d d;
    public final e0 e;
    public final Activity f;

    public void a(e p0,EmotionInfo p1,d p2,e0 p3,Activity p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          if (!PatchProxy.applyVoidThreeRefs(tc, td, te, tb, e.class, "3")) {
             p0 = tb.a;
             if (p0 == null || p0.isDisposed()) {
                if (tc != null) {
                   p0 = "add_to_album";
                   if (td == null) {
                      Object obj = null;
                      if (!PatchProxy.applyVoidTwoRefs(tc, p0, obj, g.class, "4")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "EMOTICON_OPERATION_PREVIEW";
                         i3 oi3 = i3.f();
                         oi3.d("emo_id", tc.mId);
                         oi3.c("emotion_biz_type", Integer.valueOf(tc.mBizType));
                         oi3.d("operation_type", p0);
                         uElementPack.params = oi3.e();
                         u1.u(1, uElementPack, obj);
                      }
                   }else {
                      td.o(tc, p0, te);
                   }
                }
                tb.a = a.k(new b(tb, tc)).w(d.c).s(d.a).u(new c(tb), new d(tb));
             }
          }
       }else {
          PermissionUtils.o(tf, a1.p(R.string.arg_RES_7f104ab5));
       }
       return;
    }
}
