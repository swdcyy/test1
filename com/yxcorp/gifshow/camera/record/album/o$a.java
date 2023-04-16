package com.yxcorp.gifshow.camera.record.album.o$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.album.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import com.yxcorp.gifshow.camera.record.base.d;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Objects;
import zb9.k;
import zb9.k$a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sb9.r0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ed9.a;
import jg9.a1;
import jg9.a1$a;
import sb9.l0;

public class o$a extends m	// class@001cbe
{
    public final o c;

    public void o$a(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       PostCommonFunnel.b.b(p0, "camera_album_btn");
       p0 op0 = this.c.d.d(p0.j.a());
       if (op0.c() && (!op0.e() && (!op0.b() && !op0.d()))) {
          return;
       }
       o$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, o.class, "28")) {
          k ok = tc.d.d(k.l.a());
          String str = CameraLogger.b(ok.d(), ok.a(), ok.c(), ok.b(), ok.f(), ok.i());
          d e = tc.e;
          if (TextUtils.x(str)) {
             str = null;
          }
          if (!PatchProxy.applyVoidTwoRefs(e, str, null, r0.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 406;
             uElementPack.action2 = "RECORD_PRODUCTION_MAKE_OPERATION";
             uElementPack.name = "click_photo_picker";
             uElementPack.status = 2;
             uElementPack.params = TextUtils.k(str);
             u1.M("", e, 1, uElementPack, null, null);
          }
       }
       this.c.d.m(new a());
       if (this.c.d.d(a1.j.a()).d()) {
          return;
       }else {
          this.c.p2(null);
          return;
       }
    }
}
