package com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2$mSpanFullTextWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.photoreduce.AdReducePopupPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Integer;

public final class AdReducePopupPresenterV2$mSpanFullTextWidth$2 extends Lambda implements a	// class@00151b
{
    public final AdReducePopupPresenterV2 this$0;

    public void AdReducePopupPresenterV2$mSpanFullTextWidth$2(AdReducePopupPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Activity obj = PatchProxy.apply(null, this, AdReducePopupPresenterV2$mSpanFullTextWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getActivity();
       a.m(obj);
       return (((n.k(obj) - a1.e(72.00f)) / 2) - a1.e(16.00f));
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
