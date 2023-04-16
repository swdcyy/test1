package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter$mBackPressable$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;

public final class ThanosDislikeBackPressedPresenter$mBackPressable$1 extends Lambda implements a	// class@001749
{
    public final ThanosDislikeBackPressedPresenter this$0;

    public void ThanosDislikeBackPressedPresenter$mBackPressable$1(ThanosDislikeBackPressedPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, ThanosDislikeBackPressedPresenter$mBackPressable$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.this$0.P8().h != null) {
          this.this$0.P8().f();
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
