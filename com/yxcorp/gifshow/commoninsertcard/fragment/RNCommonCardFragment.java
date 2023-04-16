package com.yxcorp.gifshow.commoninsertcard.fragment.RNCommonCardFragment;
import com.yxcorp.gifshow.commoninsertcard.fragment.ReactCommonCardFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xm9.d;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;

public class RNCommonCardFragment extends ReactCommonCardFragment	// class@0011ac
{

    public void RNCommonCardFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, RNCommonCardFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       ReactCommonCardFragment tG = this.G;
       if (tG != null) {
          objArray = tG.mCommonInsertCardFeedMeta;
       }
       obj.U7(new d(this, objArray));
       PatchProxy.onMethodExit(RNCommonCardFragment.class, "1");
       return obj;
    }
}
