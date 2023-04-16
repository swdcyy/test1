package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup;
import java.lang.Object;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class InterestLabelsGroup$a implements InterestItemView$b	// class@00173b
{
    public final InterestLabelsGroup a;

    public void InterestLabelsGroup$a(InterestLabelsGroup p0){
       this.a = p0;
       super();
    }
    public void a(int p0,InterestManagementV3Meta$InterestV3Entity p1){
       if (PatchProxy.isSupport2(InterestLabelsGroup$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, InterestLabelsGroup$a.class, "1")) {
          return;
       }
       a.p(p1, "entity");
       InterestLabelsGroup c = this.a.c;
       if (c != null) {
          c.a(p0, p1);
       }
       PatchProxy.onMethodExit(InterestLabelsGroup$a.class, "1");
       return;
    }
}
