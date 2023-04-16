package com.kwai.live.gzone.emotion.e;
import u07.u;
import com.kwai.live.gzone.emotion.f$a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x57.e;
import x57.a;
import com.kwai.live.gzone.emotion.f;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import android.app.Activity;
import d61.y;
import a57.a;
import u07.t$a;
import u07.f;
import y47.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import b57.c;
import b57.b;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import y47.f;
import com.kwai.live.gzone.emotion.h;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class e implements u	// class@000cdb
{
    public final f$a b;
    public final EmotionInfo c;

    public void e(f$a p0,EmotionInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, f$a.class, "5")) {
       }else if(a.a().c("LiveAnchorGzoneEmotionShopPopup", tb.u.l0()) - (long)tc.mPrice < 0){
          f x = tb.u.x;
          int i = 0;
          if (x != null) {
             x.q(i);
          }
          f$a u = tb.u;
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoid(null, u, f.class, "8")) {
             x = u.z;
             if (x != null) {
                a.d(x.a(), y.d(u.u()), i);
             }
             t$a uoa = new t$a(u.u());
             uoa.y0(R.string.arg_RES_7f102415);
             uoa.W0(R.string.arg_RES_7f102414);
             uoa.S0(R.string.arg_RES_7f1007e2);
             uoa.Q0(R.string.cancel);
             u.x = f.e(uoa).Y(new d(u));
          }
       }else {
          tb.X7(b.a().a(tb.u.y, tc.mEmotionPackageId, tc.mId).throttleFirst(2, TimeUnit.SECONDS).map(new e()).subscribe(new f(tb, tc), new h(tb)));
       }
       return;
    }
}
