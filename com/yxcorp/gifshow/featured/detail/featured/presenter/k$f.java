package com.yxcorp.gifshow.featured.detail.featured.presenter.k$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.System;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import o07.o;

public class k$f implements PopupInterface$h	// class@000f7f
{
    public final k b;

    public void k$f(k p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$f.class, "1")) {
          return;
       }
       k$f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, k.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOAST_INFO_CARD";
          i3 oi3 = i3.f();
          oi3.d("toast_content", a1.p(R.string.arg_RES_7f104110));
          if (!TextUtils.x(tb.V8())) {
             oi3.d("page", tb.V8());
          }
          uElementPack.params = oi3.e();
          if (tb.q.getCurrentPhoto() != null) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.q.getCurrentPhoto().mEntity);
             u1.D0("", tb.p, 0, uElementPack, uContentPack, null);
          }
       }
       if (this.b.u != null) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putLong("lastRefreshWayBackTime", System.currentTimeMillis());
          g.a(uEditor);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
