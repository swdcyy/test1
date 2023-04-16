package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$mTipsBottomMargin$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import lnc.a1;
import uh5.e;
import java.lang.Integer;

public final class NasaProfileSideCollectPresenter$mTipsBottomMargin$2 extends Lambda implements a	// class@001916
{
    public final NasaProfileSideCollectPresenter this$0;

    public void NasaProfileSideCollectPresenter$mTipsBottomMargin$2(NasaProfileSideCollectPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NasaProfileSideCollectPresenter$mTipsBottomMargin$2 obj = PatchProxy.apply(objArray, this, NasaProfileSideCollectPresenter$mTipsBottomMargin$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, NasaProfileSideCollectPresenter.class, "5");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): (Edge2EdgeHelper.c(obj.getActivity()) + a1.d(0x7f07034b)) + e.c();
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
