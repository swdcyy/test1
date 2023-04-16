package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import lnc.a1;
import java.lang.reflect.Type;

public final class ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2 extends Lambda implements a	// class@001434
{
    public static final ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2 INSTANCE;

    static {
       ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2.INSTANCE = new ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2();
    }
    public void ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, ReEditAfterDeleteOperator$reEditAfterDeleteDialogTitle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("reeditAfterDeleteDialogTitle", String.class, a1.q(0x7f10421e, (int)ReEditAfterDeleteOperator.d.k()));
    }
}
