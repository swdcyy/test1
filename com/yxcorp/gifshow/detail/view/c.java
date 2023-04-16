package com.yxcorp.gifshow.detail.view.c;
import e17.i$e;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;
import android.app.Activity;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
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
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import lnc.a1;
import uh5.e;
import com.yxcorp.gifshow.detail.view.InterestSnackBar;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.detail.view.c$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import java.lang.CharSequence;
import com.yxcorp.gifshow.detail.view.c$a;

public final class c implements i$e	// class@001a74
{
    public final InterestSnackBar$b a;
    public final Activity b;
    public final InterestManageSnackBarInfo c;

    public void c(InterestSnackBar$b p0,Activity p1,InterestManageSnackBarInfo p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(View p0,i$b p1){
       TextView textView;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       a.p(p1, "<anonymous parameter 1>");
       this.a.show();
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.bottomMargin = (Edge2EdgeHelper.c(this.b) + a1.d(0x7f07034b)) + e.c();
       p0.setLayoutParams(layoutParams);
       layoutParams.c = this.a;
       ImageView imageView = p0.findViewById(R.id.interest_notify_close);
       imageView.setImageDrawable(j.j(R.drawable.common_base_close_24, 1));
       imageView.setOnClickListener(new c$b(this));
       p0.findViewById(R.id.interest_notify_icon).L(this.c.mIconUrl);
       InterestManageSnackBarInfo mActionInfo = this.c.mActionInfo;
       if (mActionInfo != null) {
          textView.setText(mActionInfo.mDescription);
          textView.setOnClickListener(new c$a(this, p0));
       }
       return;
    }
}
