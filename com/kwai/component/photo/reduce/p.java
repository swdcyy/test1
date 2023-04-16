package com.kwai.component.photo.reduce.p;
import android.view.View$OnClickListener;
import com.kwai.component.photo.reduce.q;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import ag5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.mix.QRecoTag;
import brd.t;
import cg5.c;
import com.kwai.framework.logger.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import brd.x;
import cjd.e;
import erd.o;
import yf5.b3;
import sfc.a;
import erd.g;
import crd.b;
import wkd.b;
import l66.a;
import dda.i;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import gda.a;
import com.yxcorp.gifshow.action.c;
import androidx.fragment.app.KwaiDialogFragment;

public final class p implements View$OnClickListener	// class@000b01
{
    public final q b;

    public void p(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oq, "6")) {
       }else {
          String str = tb.q.getText().toString();
          q v = tb.v;
          q x = tb.x;
          if (!PatchProxy.applyVoidThreeRefs(v, x, str, null, c.class, "5")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "CLICK_ROAST_PUBLISH_BUTTON";
             i3 oi3 = c.b(v, x);
             oi3.d("content", TextUtils.I(str));
             uElementPack1.params = oi3.e();
             u1.u(1, uElementPack1, null);
          }
          t ot = c.g(tb.v, tb.w, 0, tb.x, null, str, tb.getActivity().getUrl());
          ClientEvent$ElementPackage uElementPack = PatchProxy.apply(null, tb, oq, "7");
          if (uElementPack != patchProxyRe) {
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_REDUCE_RESULT";
          }
          ClientContent$ContentPackage uContentPack = PatchProxy.apply(null, tb, oq, "8");
          if (uContentPack != patchProxyRe) {
          }else {
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.v.getEntity());
          }
          ot.compose(new a("PHOTO_REDUCE_RESULT", uElementPack, uContentPack)).map(new e()).subscribe(new b3(tb), new a());
          b.a(0x6d2a4fdd).b(new i(tb.v.mEntity, TextUtils.I(tb.x.mId)));
          RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
          uExtParams.mNegativeType = a.b(tb.x.mId, tb.v.mEntity);
          c.b(9, tb.v.mEntity, uExtParams);
          q y = tb.y;
          if (y != null) {
             y.onClick(p0);
          }
          tb.u.dismissAllowingStateLoss();
       }
       return;
    }
}
