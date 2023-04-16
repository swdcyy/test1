package lu1.p;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import lu1.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import lnc.a1;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;

public final class p implements Observer	// class@003048
{
    public final q b;

    public void p(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else if(p0 != null){
          ViewGroup$LayoutParams layoutParams = q.e3(this.b).getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.height = p0.d();
          int i = (p0.e() == 1)? 0x800035: 0x800033;
          layoutParams.gravity = i;
          q.e3(this.b).setLayoutParams(layoutParams);
          q.e3(this.b).setPadding(p0.g(), 0, p0.g(), 0);
          b uob = new b();
          uob.g(p0.b());
          uob.v(a1.a(R.color.arg_RES_7f060292));
          q.e3(this.b).setBackground(uob.a());
          q.e3(this.b).setAlpha(p0.c());
          q.e3(this.b).setTextSize(1, p0.h());
       }
       return;
    }
}
