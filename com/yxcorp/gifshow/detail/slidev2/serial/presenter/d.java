package com.yxcorp.gifshow.detail.slidev2.serial.presenter.d;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import fm5.a;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.yxcorp.gifshow.tube.SerialPhoto;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.Boolean;
import e17.i;
import e17.i$b;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.c;
import t8a.o;
import e17.i$e;

public final class d implements g	// class@0019e9
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "5")) {
       }else if(!TextUtils.n(p0, tb.t.getPhotoId()) || tb.p == null){
          p0 = tb.t;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "6")) {
             p0 = a.t(p0);
             if (p0 != null) {
                StandardSerialInfo mSerialInfo = p0.mSerialInfo;
                if (mSerialInfo != null) {
                   p0 = p0.mSerialPhoto;
                   if (p0 != null) {
                      SerialInfo mTitle = mSerialInfo.mTitle;
                      p0 = a1.q(R.string.arg_RES_7f104675, p0.episodeNumber);
                      String str = mTitle+" "+p0;
                      if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb, uoe, "7")) {
                         uoe = tb.u;
                         if (uoe != null) {
                            uoe.i();
                            tb.u.h();
                         }
                      }
                      i$b uob = new i$b();
                      uob.o(500);
                      uob.y(mTitle);
                      uob.s(R.layout.arg_RES_7f0d1082);
                      uob.r(b.a);
                      uob.u(c.a);
                      uob.A(new o(tb, str, mTitle, p0));
                      tb.u = i.z(uob);
                   }
                }
             }
          }
       }
       return;
    }
}
