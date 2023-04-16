package e0b.j$d;
import android.view.View$OnClickListener;
import e0b.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import android.widget.ImageView;
import zf6.k;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.Button;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.widget.TextView;
import e0b.h$a;

public final class j$d implements View$OnClickListener	// class@0025ce
{
    public final j b;

    public void j$d(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$d.class, "1")) {
          return;
       }
       j$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, j.class, "3")) {
          j e = tb.E;
          int i = 8;
          if (e != null) {
             e.setVisibility(i);
          }
          e = tb.x;
          if (e == null) {
             a.S("mSearchDevicesLayout");
          }
          int i1 = 0;
          e.setVisibility(i1);
          e = tb.y;
          String str = "mSearchTipImageView";
          if (e == null) {
             a.S(str);
          }
          e.setVisibility(i1);
          e = tb.y;
          if (e == null) {
             a.S(str);
          }
          e.setImageResource(R.drawable.arg_RES_7f081683);
          e = tb.z;
          if (e == null) {
             a.S("mLoadingLottie");
          }
          e.setVisibility(i1);
          if (k.d()) {
             e = tb.z;
             if (e == null) {
                a.S("mLoadingLottie");
             }
             e.setAnimation(R.raw.arg_RES_7f0f0035);
          }else {
             e = tb.z;
             if (e == null) {
                a.S("mLoadingLottie");
             }
             e.setAnimation(R.raw.arg_RES_7f0f0036);
          }
          e = tb.z;
          if (e == null) {
             a.S("mLoadingLottie");
          }
          e.s();
          e = tb.C;
          if (e == null) {
             a.S("mReSearchButton");
          }
          e.setVisibility(i);
          e = tb.A;
          if (e == null) {
             a.S("mSearchTipTv");
          }
          Activity uActivity = tb.u();
          a.o(uActivity, "context");
          e.setText(uActivity.getResources().getText(R.string.arg_RES_7f1045e6));
       }
       j l = this.b.L;
       if (l != null) {
          l.f();
       }
       l = this.b.L;
       if (l != null) {
          l.a();
       }
       return;
    }
}
