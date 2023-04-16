package com.yxcorp.gifshow.detail.fragments.milano.profile.l$d;
import jta.c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.ViewGroup;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import k2b.e0;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.d0;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z0a.f0;
import p1a.a$a;
import i0a.d;
import c95.c;
import jta.b;

public class l$d implements c	// class@001557
{
    public final l a;

    public void l$d(l p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       l$d uod = l$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (!p0 - null && this.a.p.getChildCount() > 0) {
          l$d ta = this.a;
          l d = ta.D;
          if (d != null) {
             Objects.requireNonNull(ta);
             l ol = l.class;
             if (!PatchProxy.applyVoidOneRefs(d, ta, ol, "10") && (!d.isShowed() && ta.B.t() instanceof e0)) {
                boolean b = true;
                d.setShowed(b);
                if (!PatchProxy.applyVoidOneRefs(d, ta, ol, "12")) {
                   d.setPosition(0);
                   k2 ok2 = b.a(0x4b316083).Q();
                   String str = null;
                   if (ok2 != null) {
                      ClientEvent$UrlPackage urlPackage = ok2.e(b);
                      if (!TextUtils.x(urlPackage.entryPageSource)) {
                         str = TextUtils.I(urlPackage.entryPageSource);
                      }
                   }
                   c0.q().n(d0.g(d.mEntity, 4, str, b.a(0xe0ff4fb).c(ta.u), false, false, 2));
                }
                f0 uof0 = new f0(ta, 0, 804, "show_photo", d);
                d.b(ta.B.t(), ta.m8(), d, v8);
             }
          }
       }
       l$d ta1 = this.a;
       if (ta1.z.n != null) {
          ta1.S8();
       }
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
    }
    public void d(float p0){
       l$d uod = l$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "1")) {
          return;
       }
       l$d ta = this.a;
       if (ta.F != null) {
          ta.V8(ta.D);
       }
       return;
    }
}
