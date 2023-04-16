package com.yxcorp.gifshow.relation.intimate.a;
import qh7.b;
import com.yxcorp.gifshow.relation.intimate.IntimateRouterActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Object;
import yh7.a;
import java.util.Objects;
import zac.h;
import java.lang.Runnable;
import ekd.k1;

public final class a implements b	// class@0018de
{
    public final IntimateRouterActivity a;
    public final IntimateRelationDialogParams b;

    public void a(IntimateRouterActivity p0,IntimateRelationDialogParams p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(a p0){
       p0 = this.a;
       Objects.requireNonNull(p0);
       k1.r(new h(p0, this.b), 1000);
    }
}
