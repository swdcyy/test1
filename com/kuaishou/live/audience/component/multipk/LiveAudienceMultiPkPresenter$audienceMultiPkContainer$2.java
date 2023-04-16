package com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import i21.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;

public final class LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2 extends Lambda implements a	// class@000bb5
{
    public final LiveAudienceMultiPkPresenter this$0;

    public void LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2(LiveAudienceMultiPkPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$audienceMultiPkContainer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Activity activity = this.this$0.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       View view = this.this$0.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       return new c(activity, view);
    }
    public Object invoke(){
       return this.invoke();
    }
}
