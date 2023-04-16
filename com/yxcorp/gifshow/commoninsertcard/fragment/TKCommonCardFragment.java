package com.yxcorp.gifshow.commoninsertcard.fragment.TKCommonCardFragment;
import com.yxcorp.gifshow.commoninsertcard.fragment.ReactCommonCardFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xm9.m;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import xm9.o;
import android.os.Bundle;
import um9.f;
import java.util.List;
import im8.c;

public class TKCommonCardFragment extends ReactCommonCardFragment	// class@0011ae
{
    public f I;

    public void TKCommonCardFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, TKCommonCardFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new m(this.G));
       obj.U7(new o());
       PatchProxy.onMethodExit(TKCommonCardFragment.class, "2");
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCommonCardFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.I == null) {
          this.I = new f();
       }
       return;
    }
    public void yh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCommonCardFragment.class, "3")) {
          return;
       }
       p0.add(new c("COMMON_CARD_TK_HELPER", this.I));
       return;
    }
}
