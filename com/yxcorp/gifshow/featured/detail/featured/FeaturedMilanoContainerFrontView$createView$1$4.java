package com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.detail.featured.FeaturedMilanoContainerFrontView$createView$1;
import java.lang.Object;
import android.widget.TextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import android.content.Context;
import android.graphics.Typeface;
import lnc.a1;
import java.lang.CharSequence;

public final class FeaturedMilanoContainerFrontView$createView$1$4 extends Lambda implements l	// class@000eff
{
    public final FeaturedMilanoContainerFrontView$createView$1 this$0;

    public void FeaturedMilanoContainerFrontView$createView$1$4(FeaturedMilanoContainerFrontView$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedMilanoContainerFrontView$createView$1$4.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       this.this$0.this$0.P(p0);
       p0.setGravity(17);
       p0.setTextAppearance(p0.getContext(), R.style.arg_RES_7f1103d3);
       p0.setTypeface(Typeface.DEFAULT, 1);
       p0.setText(a1.p(R.string.arg_RES_7f103059));
       return;
    }
}
