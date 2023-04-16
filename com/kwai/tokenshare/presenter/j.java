package com.kwai.tokenshare.presenter.j;
import android.view.View$OnClickListener;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantBrotherGroupDialogPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.google.gson.JsonObject;
import ekd.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fu7.s;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class j implements View$OnClickListener	// class@001946
{
    public final KwaiTokenMerchantBrotherGroupDialogPresenter b;

    public void j(KwaiTokenMerchantBrotherGroupDialogPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       KwaiTokenMerchantBrotherGroupDialogPresenter kwaiTokenMer = KwaiTokenMerchantBrotherGroupDialogPresenter.class;
       if (PatchProxy.applyVoid(null, tb, kwaiTokenMer, "7")) {
       }else {
          String str = k0.h(tb.x.mExtParams, "jumpUrl", "");
          if (!TextUtils.x(str)) {
             if (!PatchProxy.applyVoid(null, tb, kwaiTokenMer, "11")) {
                u1.u(1, tb.P8("VIEW_SHARED_PHOTO_FROM_KWAI_TOKEN"), null);
             }
             if (!QCurrentUser.ME.isLogined()) {
                d.a(-1712118428).ne(tb.getActivity(), "", "", 0, "", null, null, null, new s(tb, str)).h();
             }else {
                tb.S8(str);
             }
          }
       }
       return;
    }
}
