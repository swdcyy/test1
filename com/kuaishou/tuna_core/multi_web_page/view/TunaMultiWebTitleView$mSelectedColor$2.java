package com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView$mSelectedColor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.Integer;

public final class TunaMultiWebTitleView$mSelectedColor$2 extends Lambda implements a	// class@0010fc
{
    public final TunaMultiWebTitleView this$0;

    public void TunaMultiWebTitleView$mSelectedColor$2(TunaMultiWebTitleView p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebTitleView$mSelectedColor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.this$0.f().getResources().getColor(0x7f061d77);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
