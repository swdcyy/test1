package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import tkd.b;
import tkd.d;
import os5.d;
import android.widget.FrameLayout;

public final class LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2 extends Lambda implements a	// class@000974
{
    public final LiveAudienceAdNeoPendantPresenter this$0;

    public void LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2(LiveAudienceAdNeoPendantPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveAdNeoPendantBaseView invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2 obj = PatchProxy.apply(objArray, this, LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, LiveAudienceAdNeoPendantPresenter.class, "2");
       if (view != patchProxyRe) {
       }else {
          View view1 = a.d(obj.getContext(), R.layout.arg_RES_7f0d09c2, obj.m8(), false);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView");
          view = view1;
          view.setBackgroundResource(d.a(-2004767397).Rg(3));
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
