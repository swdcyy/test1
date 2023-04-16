package bbc.d;
import erd.g;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.model.IntimateProposeResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.d;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import eda.s;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import lnc.a1;

public final class d implements g	// class@00042a
{
    public final IntimateRelationDialogParams b;
    public final g c;

    public void d(IntimateRelationDialogParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       RxBus f = RxBus.f;
       f.b(new d(tb.mTargetId, true));
       if (!TextUtils.x(tb.mTargetId)) {
          f.b(s.b(tb.mTargetId, "INTIMATE_RELATION", 1000));
       }
       if (tc != null) {
          tc.accept(p0);
       }
       if (p0.mShowMessageToast != null && tb.mToIM != null) {
          i.k(tb.mTargetId);
       }else {
          i.l(a1.p(R.string.arg_RES_7f101774));
       }
       return;
    }
}
