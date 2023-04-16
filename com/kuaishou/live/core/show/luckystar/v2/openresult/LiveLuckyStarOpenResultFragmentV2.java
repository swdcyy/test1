package com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultFragmentV2;
import com.kuaishou.live.core.show.luckystar.v2.LiveLuckyStarBaseDialogFragmentV2;
import lnc.a1;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import mrd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yb2.i;
import p91.m;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import h02.b;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2;
import jc2.s;
import brd.t;
import jc2.t;
import java.lang.Runnable;
import brd.y;

public class LiveLuckyStarOpenResultFragmentV2 extends LiveLuckyStarBaseDialogFragmentV2	// class@000d09
{
    public i B;
    public LiveLuckyStarOpenResultPanelState C;
    public PresenterV2 D;
    public s E;
    public final c F;
    public static final int G;

    static {
       LiveLuckyStarOpenResultFragmentV2.G = a1.e(388.00f);
    }
    public void LiveLuckyStarOpenResultFragmentV2(){
       super();
       this.C = LiveLuckyStarOpenResultPanelState.EMPTY;
       this.F = a.g();
    }
    public int Lh(){
       return LiveLuckyStarOpenResultFragmentV2.G;
    }
    public int Mh(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarOpenResultFragmentV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.B.a.e()) {
          return 0x7f0d04d7;
       }
       return 0x7f0d04df;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarOpenResultFragmentV2.class, "4")) {
          return;
       }
       super.onDestroyView();
       LiveLuckyStarOpenResultFragmentV2 tD = this.D;
       if (tD != null) {
          tD.unbind();
          this.D.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarOpenResultFragmentV2.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.D = new PresenterV2();
       if (this.B.a.e()) {
          this.D.U7(d.a(-204054297).U30());
       }else {
          this.D.U7(new LiveAudienceLuckyStarOpenResultPresenterV2());
       }
       this.D.f(p0);
       s os = new s(this.B, this.F.hide(), new t(this), this);
       this.E = os;
       Object[] objArray = new Object[]{os};
       this.D.i(objArray);
       this.F.onNext(this.C);
       return;
    }
}
