package com.yxcorp.gifshow.growth.pad.PadRequestPresenter$slidePlayViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.pad.PadRequestPresenter;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public final class PadRequestPresenter$slidePlayViewModel$2 extends Lambda implements a	// class@001472
{
    public final PadRequestPresenter this$0;

    public void PadRequestPresenter$slidePlayViewModel$2(PadRequestPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final SlidePlayViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, PadRequestPresenter$slidePlayViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayViewModel.B0(this.this$0.q);
    }
    public Object invoke(){
       return this.invoke();
    }
}
