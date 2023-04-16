package djc.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import djc.s;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import android.view.View$OnClickListener;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import djc.w0;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewStub;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class x extends PresenterV2	// class@00222c
{
    public KwaiImageView p;
    public final s q;
    public final BottomSheetFragment r;
    public final View$OnClickListener s;
    public final ShareInitResponse$SharePanelElement t;
    public final w0 u;

    public void x(s p0,BottomSheetFragment p1,View$OnClickListener p2,ShareInitResponse$SharePanelElement p3,w0 p4,int p5,u p6){
       a.p(p0, "forwardBanner");
       a.p(p1, "fragment");
       super();
       this.q = p0;
       this.r = p1;
       this.s = null;
       this.t = null;
       this.u = null;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       x tp = this.p;
       if (tp != null) {
          if (tp != null) {
             tp.L(this.q.a);
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setColor(this.q.b);
             float f = (float)a1.d(0x7f070ca0);
             float[] uofloatArray = new float[]{f,f,f,f,0,0,0,0};
             gradientDraw.setCornerRadii(uofloatArray);
             tp.setBackground(gradientDraw);
             tp.setOnClickListener(this.s);
          }
          if (this.t != null) {
             tp = this.u;
             if (tp != null) {
                tp.a();
             }
          }
       }
    label_0062 :
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "1")) {
          return;
       }
       View view = this.r.getView();
       if (view != null) {
          view = view.findViewById(R.id.forward_banner);
          if (view != null) {
             if (view instanceof ViewStub) {
                view = view.inflate();
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.image.KwaiImageView");
             }else {
             }
             objArray = view;
          }
       }
       this.p = objArray;
       return;
    }
}
