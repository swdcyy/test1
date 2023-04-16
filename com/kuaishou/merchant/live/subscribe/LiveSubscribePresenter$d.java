package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$d;
import erd.r;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter;
import java.lang.Object;
import com.kuaishou.merchant.live.base.model.LiveSubscribeResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.live.base.model.LiveSubscribeResponse$LiveSubscribeDialogInfo;
import java.util.Collection;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uo5.a;

public final class LiveSubscribePresenter$d implements r	// class@001ad7
{
    public final LiveSubscribePresenter b;

    public void LiveSubscribePresenter$d(LiveSubscribePresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribePresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          p0 = p0.mDialogInfo;
          if (p0 != null) {
             p0 = p0.mReservationInfoList;
             p0 = (p0 == null || p0.isEmpty())? 1: null;
             if (!p0) {
                p0 = this.b.p;
                if (p0 == null) {
                   a.S("mFragment");
                }
                if (p0.Vg().a() && (!a.a(this.b.getActivity()) && this.b.r == null)) {
                   b = true;
                }
             }
          }
       label_0054 :
          b = false;
       }
       return b;
    }
}
