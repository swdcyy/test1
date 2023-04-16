package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import nl9.b0;
import com.kwai.framework.model.feed.BaseFeed;
import g99.i;
import p1a.a;
import p1a.a$a;
import lnc.i3;
import g99.j;
import tl8.g;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import java.lang.Runnable;
import ekd.k1;

public final class b implements Observer	// class@001ba6
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoc, "4")) {
       }else {
          c uoc1 = 3;
          AvatarInfoResponse mType = (p0 != null)? p0.mType: 3;
          Object obj = null;
          if (mType != true) {
             tb.v.set(obj);
             if (!PatchProxy.applyVoid(obj, tb, uoc, "7") && tb.G == null) {
                tb.G = true;
                if (tb.D == null) {
                   tb.D = tb.B.inflate();
                }
                p0 = tb.s;
                int i = 0x7f0809a9;
                if (p0.mVerifiedDetail != null) {
                   tb.D.setVisibility(0);
                   p0 = tb.s.mVerifiedDetail.mIconType;
                   if (p0 != true) {
                      if (p0 != 2) {
                         if (p0 == uoc1) {
                            tb.D.setImageResource(R.drawable.arg_RES_7f0809aa);
                            tb.R8();
                         }
                      }else {
                         tb.D.setImageResource(i);
                         tb.R8();
                      }
                   }else {
                      tb.D.setImageResource(R.drawable.arg_RES_7f0809ab);
                      tb.R8();
                   }
                }else if(p0.isVerified()){
                   tb.R8();
                   tb.D.setVisibility(0);
                   p0 = tb.D;
                   if (!tb.s.isBlueVerifiedType()) {
                      i = 0x7f0809ab;
                   }
                   p0.setImageResource(i);
                }else {
                   tb.D.setVisibility(8);
                }
             }
          }else if(!tb.r.useLive()){
             AvatarInfoResponse mPhoto = p0.mPhoto;
             if (mPhoto != null) {
                d.a(0x37593069).dH(tb.r.mEntity, mPhoto.mEntity);
                tb.v.set(new i(tb, mPhoto, p0));
                a$a uoa = a$a.s(319, "live");
                i3 oi3 = i3.f();
                oi3.d("LIVE_TYPE", tb.P8(p0));
                uoa.m(oi3.e());
                uoa.h(new j(mPhoto));
                uoa.r(true);
                tb.t.get().b(uoa);
                tb.H = true;
                if (!PatchProxy.applyVoid(obj, tb, uoc, "9")) {
                   p0 = tb.C;
                   if (tb.E == null) {
                      p0 = p0.inflate();
                      tb.E = p0;
                      p0.setAlpha(0);
                   }
                   tb.z.setVisibility(0);
                }
                if (!PatchProxy.applyVoid(obj, tb, uoc, "11")) {
                   tb.S8();
                   k1.r(tb.L, 415);
                }
             }
          }
       }
    label_0142 :
       return;
    }
}
