package bbc.c;
import erd.g;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import bda.a$b;
import lnc.a1;
import bda.a;

public final class c implements g	// class@000429
{
    public final IntimateRelationDialogParams b;
    public final g c;

    public void c(IntimateRelationDialogParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       int i = 1;
       tb.setRelationStatus(i);
       if (PatchProxy.applyVoidOneRefs(tb, null, i.class, "6")) {
       }else if(TextUtils.x(tb.mBizDataId)){
          a$b uob = new a$b();
          uob.e(a1.p(R.string.arg_RES_7f1001c6));
          uob.d(i);
          uob.c(i);
          uob.b(tb.mBizType);
          uob.d = tb.mBizDataId;
          RxBus.f.b(uob.a());
       }
       if (tc != null) {
          tc.accept(tb);
       }
       return;
    }
}
