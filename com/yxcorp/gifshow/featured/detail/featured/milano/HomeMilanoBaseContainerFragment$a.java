package com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment$a;
import com.yxcorp.gifshow.w$b;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ko5.d;
import ko5.c;
import wq6.l;
import kda.e;
import java.lang.StringBuilder;
import java.lang.String;
import wq6.g;
import wq6.e;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import q87.c;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import android.app.Activity;
import uv8.o1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import tda.b0;
import tda.a0;

public class HomeMilanoBaseContainerFragment$a implements w$b	// class@000f17
{
    public final HomeMilanoBaseContainerFragment a;

    public void HomeMilanoBaseContainerFragment$a(HomeMilanoBaseContainerFragment p0){
       this.a = p0;
       super();
    }
    public static void f(HomeMilanoBaseContainerFragment$a p0){
       p0.g();
    }
    private void g(){
       Object[] objArray1;
       if (this.a.getActivity() == null) {
          return;
       }
       l ol = c.a(this.a.requireActivity()).d();
       Object[] objArray = new Object[0];
       e.C().w("bindPresenter", "current tab "+ol.k().N().M2().getType(), objArray);
       if ((ol.k().N().M2().getType()).equals("ato_operate")) {
          objArray1 = new Object[0];
          e.C().w("bindPresenter", "TTI runnable", objArray1);
          e.d(this.a.W, "bindPresenter");
       }else {
          objArray1 = new Object[0];
          e.C().w("bindPresenter", "normal runnable", objArray1);
          this.a.qh();
       }
       return;
    }
    public void a(Activity p0){
    }
    public void b(){
       o1.a(this);
    }
    public void c(int p0,String p1){
       o1.d(this, p0, p1);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment$a.class, "1")) {
          return;
       }
       this.h();
       return;
    }
    public void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment$a.class, "2")) {
          return;
       }
       this.h();
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaSlide", "on launch finish", objArray);
       HomeMilanoBaseContainerFragment$a ta = this.a;
       HomeMilanoBaseContainerFragment v = ta.V;
       if (v != null) {
          ta.X.removeCallbacks(v);
       }
       ta = this.a;
       ta.W = new b0(this);
       a0 uoa0 = new a0(this);
       ta.V = uoa0;
       ta.X.post(uoa0);
       return;
    }
}
