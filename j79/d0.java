package j79.d0;
import s79.a;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import vsd.h;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import j79.l0;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import rsd.a;
import j79.d0$a;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import o79.q;
import android.graphics.Typeface;
import android.widget.TextView;
import q79.d;
import r79.a;
import j79.a;
import java.util.Objects;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.lang.CharSequence;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public final class d0 extends a	// class@00276f
{
    public final f e;
    public final l0 f;
    public final AbsPreviewFragmentViewBinder g;
    public final boolean h;
    public HashMap i;
    public static final n[] j;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(m0.d(d0.class), "currentMediaChangedObservable", "getCurrentMediaChangedObservable\(\)Ljava/lang/Object;"))};
       d0.j = onArray;
    }
    public void d0(l0 p0,MediaPreviewFragment p1,AbsPreviewFragmentViewBinder p2,boolean p3){
       a.q(p0, "mManager");
       a.q(p1, "host");
       a.q(p2, "viewBinder");
       super(p1);
       this.f = p0;
       this.g = p2;
       this.h = p3;
       this.e = new d0$a(new Object(), new Object(), this);
    }
    public void b(ViewModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "4")) {
          return;
       }
       super.b(p0);
       Typeface typeface = q.a.h();
       if (typeface != null) {
          TextView textView = this.g.j();
          if (textView != null) {
             textView.setTypeface(typeface);
          }
       }
       if (p0 instanceof d && p0.s0().i().a() != -1) {
          TextView textView1 = this.g.j();
          if (textView1 != null) {
             textView1.setBackgroundResource(p0.s0().i().a());
          }
       }
       this.i();
       return;
    }
    public final void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0.class, "9")) {
          return;
       }
       if (this.h != null) {
          d0 tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(objArray, tf, l0.class, "4")) {
             tf.M0();
             if (tf.k.isSelected()) {
                tf.K0(false);
             }
          }
       }else {
          this.f.M0();
       }
       this.i();
       return;
    }
    public final void i(){
       TextView textView;
       if (PatchProxy.applyVoid(null, this, d0.class, "7")) {
          return;
       }
       if (!this.f.H0()) {
          textView = this.g.j();
          if (textView != null) {
             textView.setText("");
          }
          textView = this.g.j();
          if (textView != null) {
             textView.setVisibility(4);
          }
       }else {
          textView = this.g.j();
          if (textView != null) {
             textView.setText(String.valueOf((this.f.v0() + 1)));
          }
          textView = this.g.j();
          if (textView != null) {
             textView.setVisibility(0);
          }
       }
       return;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().getView();
    }
}
