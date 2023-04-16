package ahc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehc.b;
import java.lang.CharSequence;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.content.res.Resources;
import ehc.d;
import cw9.c;
import androidx.core.content.ContextCompat;
import android.text.TextPaint;
import android.view.View;
import ekd.m1;
import ahc.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@00011f
{
    public Button p;
    public BaseFragment q;
    public d r;

    public void a(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          a tp = this.p;
          if (tp == null) {
             a.S("button");
          }
          tp.setText(tr.getTitle());
          tp = this.p;
          if (tp == null) {
             a.S("button");
          }
          ViewGroup$LayoutParams layoutParams = tp.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             tp = this.p;
             if (tp == null) {
                a.S("button");
             }
             Context context = tp.getContext();
             a.o(context, "button.context");
             objArray.bottomMargin = c.b(context.getResources(), tr.d());
          }
          a tp1 = this.p;
          if (tp1 == null) {
             a.S("button");
          }
          tp = this.p;
          if (tp == null) {
             a.S("button");
          }
          tp1.setTextColor(ContextCompat.getColor(tp.getContext(), tr.getTextColor()));
          tr = this.p;
          if (tr == null) {
             a.S("button");
          }
          TextPaint paint = tr.getPaint();
          a.o(paint, "button.paint");
          paint.setFakeBoldText(true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.button);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.button\)");
       this.p = view;
       p0.setOnClickListener(new a$a(this));
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.m8().getTag(R.id.item_view_bind_data);
       if (obj instanceof d) {
          objArray = obj;
       }
       this.r = objArray;
       return;
    }
}
