package c54.b;
import e17.i$e;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public final class b implements i$e	// class@0004b3
{
    public final int a;

    public void b(int p0){
       this.a = p0;
    }
    public final void a(View p0,i$b p1){
       b ta = this.a;
       p0 = p0.findViewById(R.id.cart_toast_container);
       if (p0 != null) {
          p0.getLayoutParams().topMargin = ta;
          ta = new b();
          ta.v(a1.a(R.color.arg_RES_7f061e52));
          ta.g(KwaiRadiusStyles.FULL);
          p0.setBackground(ta.a());
       }
       return;
    }
}
