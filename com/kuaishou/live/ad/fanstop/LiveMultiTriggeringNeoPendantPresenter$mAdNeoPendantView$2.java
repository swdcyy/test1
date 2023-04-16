package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
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
import pl0.d1;
import android.view.View$OnClickListener;

public final class LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2 extends Lambda implements a	// class@00098d
{
    public final LiveMultiTriggeringNeoPendantPresenter this$0;

    public void LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2(LiveMultiTriggeringNeoPendantPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveAdNeoEnhancePendantView invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveMultiTriggeringNeoPendantPresenter obj = PatchProxy.apply(objArray, this, LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       obj = LiveMultiTriggeringNeoPendantPresenter.class;
       View view = PatchProxy.apply(objArray, tthis$0, obj, "5");
       if (view != patchProxyRe) {
       }else {
          View view1 = a.d(tthis$0.getContext(), R.layout.arg_RES_7f0d09c2, tthis$0.m8(), false);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView");
          view1.setBackgroundResource(d.a(-2004767397).Rg(3));
          if (!PatchProxy.applyVoidOneRefs(view1, tthis$0, obj, "10")) {
             d1 uod1 = new d1(tthis$0, view1, false, 2000);
             view1.setOnClickListener(obj);
          }
          view = view1;
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
