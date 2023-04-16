package chc.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import chc.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ehc.h;
import ehc.a;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import android.content.Context;
import android.widget.TextView;
import android.content.res.Resources;
import cw9.c;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b extends PresenterV2	// class@0005a2
{
    public TextView p;
    public BaseFragment q;
    public a r;
    public final Observer s;

    public void b(){
       super();
       this.s = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          h oh = tr.i();
          if (oh != null) {
             LiveData liveData = oh.f();
             if (liveData != null) {
                b tq = this.q;
                if (tq == null) {
                   a.S("fragment");
                }
                liveData.observe(tq.getViewLifecycleOwner(), this.s);
             }
          }
          b tp = this.p;
          String str = "title";
          if (tp == null) {
             a.S(str);
          }
          b tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          Context context = tp1.getContext();
          a.o(context, "title.context");
          tp.setCompoundDrawablePadding(c.b(context.getResources(), tr.e()));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          h oh = tr.i();
          if (oh != null) {
             LiveData liveData = oh.f();
             if (liveData != null) {
                liveData.removeObserver(this.s);
             }
          }
       }
       this.P8(false);
       return;
    }
    public final void P8(boolean p0){
       b tp;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       String str = "title";
       if (!p0) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          return;
       }else {
          tp = this.r;
          if (tp != null) {
             b tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             tp1.setCompoundDrawablesWithIntrinsicBounds(0, 0, tp.j(), 0);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.item_title);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.item_title\)");
       this.p = p0;
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.m8().getTag(R.id.item_view_bind_data);
       if (obj instanceof a) {
          objArray = obj;
       }
       this.r = objArray;
       return;
    }
}
