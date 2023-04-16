package com.yxcorp.gifshow.detail.slidev2.presenter.e0$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy6.h;
import uy6.b;
import ekd.k1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kwai.framework.model.user.User;
import lu7.f;
import android.widget.TextView;
import com.kuaishou.android.model.mix.PhotoMeta;
import bt7.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import b8a.m2;
import java.lang.Runnable;

public class e0$a extends a	// class@0018fc
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, e0$a.class, "3")) {
          return;
       }
       if (h.a.q != null) {
          k1.n(this);
       }
       return;
    }
    public void i2(){
       e0 uoe0 = e0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e0$a.class, "1")) {
          return;
       }
       e0$a tb = this.b;
       e0 x = tb.x;
       Objects.requireNonNull(tb);
       String str = PatchProxy.apply(objArray, tb, uoe0, "13");
       if (str != PatchProxyResult.class) {
       }else if(k.B(tb.z) != null){
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.THIRD_PLATFORM};
          if (k.B(tb.z).isAdGroup(uAdGroupArra)) {
             str = tb.z.getUserName();
          }
       }
       str = f.a(tb.z.getUser());
       x.setText(str);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(objArray, tb, uoe0, "8") || (!e0.T && tb.z.getPhotoMeta() != null)) {
          uoe0 = tb.M;
          if (uoe0 == null) {
             tb.M = new a(tb.getActivity(), tb.y, tb.z.getPhotoMeta().mActivityUserIconMode);
          }else {
             uoe0.b(tb.z.getPhotoMeta().mActivityUserIconMode);
          }
          tb.M.a();
       }
    label_0097 :
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, e0$a.class, "2")) {
          return;
       }
       if (h.a.q != null) {
          k1.p(new m2(this), this);
       }else {
          this.b.S8();
       }
       return;
    }
}
