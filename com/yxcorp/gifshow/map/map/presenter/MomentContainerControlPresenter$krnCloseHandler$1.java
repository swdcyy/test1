package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$krnCloseHandler$1;
import ik0.a;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$krnCloseHandler$1$handleClose$1;
import msd.a;
import tb7.b;

public final class MomentContainerControlPresenter$krnCloseHandler$1 implements a	// class@001cbd
{
    public final MomentContainerControlPresenter b;

    public void MomentContainerControlPresenter$krnCloseHandler$1(MomentContainerControlPresenter p0){
       this.b = p0;
       super();
    }
    public boolean Wc(boolean p0){
       MomentContainerControlPresenter$krnCloseHandler$1 okrnCloseHan = MomentContainerControlPresenter$krnCloseHandler$1.class;
       if (PatchProxy.isSupport(okrnCloseHan)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, okrnCloseHan, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b.j(new MomentContainerControlPresenter$krnCloseHandler$1$handleClose$1(this));
       return true;
    }
}
