package com.yxcorp.gifshow.growth.home.pymk.f$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.growth.home.pymk.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k6a.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import android.content.Context;
import java.lang.StringBuilder;
import android.net.Uri;
import java.lang.Exception;

public class f$c extends m	// class@0013a3
{
    public final f c;

    public void f$c(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       try{
          f$c tc = this.c;
          String photoId = tc.F.getPhotoId();
          User mId = this.c.E.mId;
          Objects.requireNonNull(tc);
          if (PatchProxy.applyVoidTwoRefs(photoId, mId, tc, f.class, "19") || (!TextUtils.x(photoId) && tc.getActivity() != null)) {
             f m = tc.M;
             u ou = u.class;
             if (!PatchProxy.applyVoidTwoRefsWithListener(m, photoId, null, ou, "21")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PHOTO_RECOMMEND_PYMK_CARD";
                i3 oi3 = i3.f();
                oi3.d("photo_id", photoId);
                uElementPack.params = oi3.e();
                u1.M(null, m, 1, uElementPack, null, null);
                PatchProxy.onMethodExit(ou, "21");
             }
             Intent intent = new Intent(tc.getActivity(), PhotoDetailActivity.y3(null));
             StringBuilder str = "kwai://work/"+photoId;
             if (!TextUtils.x(mId)) {
                str = str+"?userId="+mId;
             }
             intent.setData(Uri.parse(str));
             intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100e5);
             if (tc.getActivity() != null) {
                tc.getActivity().startActivityForResult(intent, 1025);
             }
          }
       }catch(java.lang.Exception e12){
          e12.printStackTrace();
       }
    label_00b5 :
       return;
    }
}
