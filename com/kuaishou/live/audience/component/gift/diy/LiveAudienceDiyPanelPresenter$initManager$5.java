package com.kuaishou.live.audience.component.gift.diy.LiveAudienceDiyPanelPresenter$initManager$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zy0.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;

public final class LiveAudienceDiyPanelPresenter$initManager$5 extends Lambda implements a	// class@000ae2
{
    public final c this$0;

    public void LiveAudienceDiyPanelPresenter$initManager$5(c p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceDiyPanelPresenter$initManager$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return y.d(this.this$0.getActivity());
    }
}
