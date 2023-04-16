package id9.y;
import erd.g;
import id9.z;
import java.lang.Object;
import java.lang.String;
import xb.s;
import android.graphics.drawable.BitmapDrawable;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import xb.t$b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import pi9.e;
import android.view.View;
import lnc.f5;
import android.widget.ImageView;
import lnc.s6;
import com.yxcorp.utility.n;

public final class y implements g	// class@0027ff
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       if (tb.z != null) {
          tb.o.setImageDrawable(new s(new BitmapDrawable(a.a().a().getResources(), tb.z), t$b.g));
       }
       if (e.e()) {
          f5.c(tb.o, tb.q, tb.r, true, false);
       }else {
          tb.o.setPadding(z.B, z.B, z.B, z.B);
          tb.h2(false);
          if (s6.m()) {
             n.Y(tb.q, false, false);
          }
       }
       return;
    }
}
