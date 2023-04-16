package j79.h0;
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
import j79.h0$a;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import o79.q;
import android.graphics.Typeface;
import android.widget.TextView;
import android.os.Bundle;
import java.lang.CharSequence;
import o79.d;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public final class h0 extends a	// class@002778
{
    public final f e;
    public final l0 f;
    public final AbsPreviewFragmentViewBinder g;
    public HashMap h;
    public static final n[] i;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(m0.d(h0.class), "currentMediaChangedObservable", "getCurrentMediaChangedObservable\(\)Ljava/lang/Object;"))};
       h0.i = onArray;
    }
    public void h0(l0 p0,MediaPreviewFragment p1,AbsPreviewFragmentViewBinder p2){
       a.q(p0, "mManager");
       a.q(p1, "host");
       a.q(p2, "viewBinder");
       super(p1);
       this.f = p0;
       this.g = p2;
       this.e = new h0$a(new Object(), new Object(), this);
    }
    public void b(ViewModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "4")) {
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
       this.i();
       return;
    }
    public final void h(){
       String str;
       if (PatchProxy.applyVoid(null, this, h0.class, "9")) {
          return;
       }
       Bundle uBundle = this.f.x0();
       if (uBundle != null) {
          str = uBundle.getString("album_custom_param_page_name");
          if (str != null) {
          label_001f :
             a.h(str, "mManager.extra?.getStrin\x20\x02OM_PARAM_PAGE_NAME\) ?: \"\"\x00");
             int i = (str.length() > 0)? 1: 0;
             if (i) {
                d.p(str);
             }
             this.f.M0();
             this.i();
             return;
          }
       }
       str = "";
       goto label_001f ;
    }
    public final void i(){
       TextView textView;
       if (PatchProxy.applyVoid(null, this, h0.class, "7")) {
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
       Object obj = PatchProxy.apply(null, this, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().getView();
    }
}
