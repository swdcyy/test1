package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$d;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter$c;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableWinnerListPresenter;
import java.lang.Object;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableType;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntableWinner;

public class LiveGzoneTurntableWinnerListPresenter$d implements LiveGzoneTurntableWinnerListPresenter$c	// class@000e58
{
    public final LiveGzoneTurntableWinnerListPresenter a;

    public void LiveGzoneTurntableWinnerListPresenter$d(LiveGzoneTurntableWinnerListPresenter p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneTurntablePrize p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneTurntableWinnerListPresenter$d.class, "2")) {
          return;
       }
       if (p0.mType == LiveGzoneTurntablePrize$TurntableType.EMPTY) {
          return;
       }
       this.a.P8(new LiveGzoneTurntableWinner(p0, p1));
       return;
    }
    public void b(LiveGzoneTurntableWinner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableWinnerListPresenter$d.class, "1")) {
          return;
       }
       if (p0 != null) {
          LiveGzoneTurntableWinner mPrize = p0.mPrize;
          if (mPrize != null && mPrize.mType != LiveGzoneTurntablePrize$TurntableType.EMPTY) {
             this.a.P8(p0);
          }
       }
       return;
    }
}
