package com.kwai.tokenshare.presenter.k;
import android.view.View$OnClickListener;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantLotteryDialogPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
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
import fu7.u;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class k implements View$OnClickListener	// class@001947
{
    public final KwaiTokenMerchantLotteryDialogPresenter b;

    public void k(KwaiTokenMerchantLotteryDialogPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       KwaiTokenMerchantLotteryDialogPresenter kwaiTokenMer = KwaiTokenMerchantLotteryDialogPresenter.class;
       if (PatchProxy.applyVoid(null, tb, kwaiTokenMer, "7")) {
       }else {
          BigPictureDialogInfo mActionButto = tb.x.mActionButtonTargetUrl;
          if (!TextUtils.x(mActionButto)) {
             if (!PatchProxy.applyVoid(null, tb, kwaiTokenMer, "11")) {
                u1.u(1, tb.P8("VIEW_SHARED_PHOTO_FROM_KWAI_TOKEN"), null);
             }
             if (!QCurrentUser.ME.isLogined()) {
                d.a(-1712118428).ne(tb.getActivity(), "", "", 0, "", null, null, null, new u(tb, mActionButto)).h();
             }else {
                tb.V8(mActionButto);
             }
          }
       }
       return;
    }
}
