package led.d;
import led.f;
import y8c.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.plugin.search.result.SubTabItem;
import android.widget.TextView;
import com.yxcorp.plugin.search.utils.j0;
import nfd.t0;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import k06.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import led.c;
import android.view.View$OnClickListener;
import ucd.n;

public class d extends f	// class@001c1c
{
    public KwaiImageView x;
    public View y;

    public void d(g p0){
       super(p0);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          ViewGroup$LayoutParams layoutParams = this.x.getLayoutParams();
          int i = (int)j0.r(this.p, this.q.mKeyword) + t0.q;
          int o0 = t0.o0;
          if (i <= o0) {
             o0 = t0.Y;
             if (i >= o0) {
             label_0037 :
                layoutParams.width = i;
                this.x.setLayoutParams(layoutParams);
                if (!q.f(this.q.mCoverUrls)) {
                   this.x.P(this.q.mCoverUrls);
                }
             }
          }
          i = o0;
          goto label_0037 ;
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       a uoa = new a();
       uoa.f((float)t0.f);
       uoa.k(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060751));
       uoa = uoa.h(this.getContext(), R.color.arg_RES_7f062057);
       uoa.m(t0.c);
       this.y.setBackground(uoa.a());
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.height = t0.I;
       f tp = this.p;
       tp.setPadding(t0.i, tp.getPaddingTop(), t0.i, this.p.getPaddingBottom());
       this.p.setLayoutParams(layoutParams);
       this.p.setTextSize(2, 14.00f);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       a uoa = new a();
       uoa.f((float)t0.f);
       uoa.k(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f062057));
       uoa = uoa.h(this.getContext(), R.color.arg_RES_7f062057);
       uoa.m(t0.c);
       this.y.setBackground(uoa.a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a3bcb);
       p0 = m1.f(p0, R.id.rl_image_tab);
       this.y = p0;
       this.P8(p0, new c(this));
       return;
    }
}
