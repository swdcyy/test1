package g99.a0;
import java.lang.Object;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import java.util.HashSet;
import b3a.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.Float;
import java.util.Iterator;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.b5;
import ekd.i;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarScrollStatus;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import g99.w;
import androidx.lifecycle.ViewModel;
import g99.a0$a;
import java.lang.Enum;

public class a0	// class@002439
{
    public View a;
    public View b;
    public View c;
    public View d;
    public Fragment e;
    public ToolbarStyle f;
    public ToolbarScrollStatus g;
    public boolean h;
    public final Set i;
    public int j;

    public void a0(){
       super();
       this.f = ToolbarStyle.SCROLL_SENSITIVE;
       this.g = null;
       this.i = new HashSet(12);
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "3")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public final void b(float p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa0, "13")) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public final void c(boolean p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "11")) {
          return;
       }
       this.h = p0;
       FragmentActivity activity = this.e.getActivity();
       if (activity != null && !b5.a(activity)) {
          i.h(activity, 0, p0);
       }
       return;
    }
    public final void d(boolean p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "12")) {
          return;
       }
       FragmentActivity activity = this.e.getActivity();
       if (activity == null) {
          return;
       }
       if (p0) {
          if (this.a.getVisibility()) {
             p0.height = n.A(activity);
             this.a.setVisibility(0);
          }
       }else if(this.a.getVisibility() != 8){
          this.a.setVisibility(8);
       }
       return;
    }
    public final void e(ToolbarScrollStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "9")) {
          return;
       }
       if (this.g != p0) {
          this.g = p0;
          w ow = ViewModelProviders.of(this.e).get(w.class);
          int i = a0$a.a[p0.ordinal()];
          int i1 = 8;
          boolean b = true;
          if (i != b) {
             if (i != 2) {
                if (i == 3) {
                   this.d.setVisibility(i1);
                   ow.t0(false);
                }
             }else {
                this.d.setVisibility(false);
                this.b.setBackgroundColor(false);
                this.b(0);
                ow.t0(false);
             }
          }else {
             this.d.setVisibility(i1);
             this.b.setBackgroundColor(this.j);
             this.b(0x3f800000);
             ow.t0(b);
          }
       }
       return;
    }
}
