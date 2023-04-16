package fia.n0$h;
import e17.i$e;
import fia.n0;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.follow.common.data.FollowFeatureGuideSnackBarResponse;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import android.app.Application;
import o56.a;
import android.content.Context;
import lnc.i5;
import com.yxcorp.utility.n;
import fia.a;
import fia.n0$h$a;
import android.view.View$OnClickListener;

public final class n0$h implements i$e	// class@00292e
{
    public final n0 a;
    public final Ref$IntRef b;
    public final FollowFeatureGuideSnackBarResponse c;

    public void n0$h(n0 p0,Ref$IntRef p1,FollowFeatureGuideSnackBarResponse p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(View p0,i$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n0$h.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       int i = i5.a(a.b());
       Ref$IntRef element = this.b.element;
       if (element > null) {
          layoutParams.bottomMargin = element;
       }else if(!i){
          i = n.c(a.b(), 26.00f);
       }
       layoutParams.bottomMargin = i;
       p0.setLayoutParams(layoutParams);
       this.a.P8(this.c, p0);
       this.a.R8(this.c, p0);
       this.a.S8(this.c, p0);
       p0.setOnClickListener(new n0$h$a(this));
       return;
    }
}
