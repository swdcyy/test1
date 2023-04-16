package com.yxcorp.gifshow.hot.spot.adapter.BaseViewHolder$mainPresenter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseViewHolder$mainPresenter$2 extends Lambda implements a	// class@00181b
{
    public static final BaseViewHolder$mainPresenter$2 INSTANCE;

    static {
       BaseViewHolder$mainPresenter$2.INSTANCE = new BaseViewHolder$mainPresenter$2();
    }
    public void BaseViewHolder$mainPresenter$2(){
       super(0);
    }
    public final PresenterV2 invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, BaseViewHolder$mainPresenter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(BaseViewHolder$mainPresenter$2.class, "1");
       return new PresenterV2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
