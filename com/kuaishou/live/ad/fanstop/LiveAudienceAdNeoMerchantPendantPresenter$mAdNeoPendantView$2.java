package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
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
import pl0.j0;
import android.view.View$OnClickListener;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2 extends Lambda implements a	// class@00095c
{
    public final LiveAudienceAdNeoMerchantPendantPresenter this$0;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2(LiveAudienceAdNeoMerchantPendantPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveAdNeoMerchantPendantView invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2 obj = PatchProxy.apply(objArray, this, LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, LiveAudienceAdNeoMerchantPendantPresenter.class, "2");
       if (view != patchProxyRe) {
       }else {
          View view1 = a.d(obj.getContext(), R.layout.arg_RES_7f0d09c7, obj.m8(), false);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView");
          view = view1;
          view.setBackgroundResource(d.a(-2004767397).Rg(3));
          view.setOnClickListener(new j0());
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
