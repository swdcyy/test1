package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$onBind$$inlined$subscribeBy$1;
import erd.g;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.base.model.LiveSubscribeResponse$LiveSubscribeDialogInfo;
import k74.a;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.g;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$onBind$$inlined$subscribeBy$1$lambda$1;
import java.util.List;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public final class LiveSubscribePresenter$onBind$$inlined$subscribeBy$1 implements g	// class@001ada
{
    public final LiveSubscribePresenter b;

    public void LiveSubscribePresenter$onBind$$inlined$subscribeBy$1(LiveSubscribePresenter p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribePresenter$onBind$$inlined$subscribeBy$1.class, "1")) {
          return;
       }
       a uoa = new a(p0);
       boolean b = true;
       uoa.e(b);
       uoa.f = false;
       LiveSubscribePresenter$onBind$$inlined$subscribeBy$1$lambda$1 oonBind$$inl = new LiveSubscribePresenter$onBind$$inlined$subscribeBy$1$lambda$1(this);
       if (!PatchProxy.applyVoidOneRefs(oonBind$$inl, uoa, a.class, "5")) {
          uoa.i.add(oonBind$$inl);
       }
       LiveSubscribePresenter$onBind$$inlined$subscribeBy$1 tb = this.b;
       tb.r = b;
       Activity activity = tb.getActivity();
       a.m(activity);
       c uoc = new c(activity);
       uoc.L(uoa);
       uoc.A(b);
       uoc.B(b);
       uoc.v(false);
       uoc.b0().Z();
       return;
    }
}
