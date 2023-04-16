package kx8.c;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import isa.a;
import my7.o;
import com.yxcorp.gifshow.webview.yoda.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import android.view.View;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import pyc.c;
import qyc.c;
import dz7.q;
import qyc.d;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import uv8.g0;
import wo5.b;

public class c extends c	// class@002c39
{
    public final KwaiYodaWebViewFragment l;
    public c m;
    public int n;
    public a o;

    public void c(KwaiYodaWebViewFragment p0,int p1,a p2){
       super(p0);
       this.n = 0;
       this.l = p0;
       this.n = p1;
       this.o = p2;
    }
    public o b(){
       return this.g();
    }
    public c g(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          obj = this.e().getView();
          if (obj != null) {
             objArray = obj.findViewById(0x7f0a2921);
          }
          this.m = new c(this.l, this.e().getView(), new c(objArray), new c(this.l, this.e().getView(), false));
       }
       return this.m;
    }
    public int getTitleBarHeight(){
       return this.n;
    }
    public void loadUrl(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.loadUrl();
       g0.o0(this.l.getActivity()).p0(this.o.m()).d();
       return;
    }
}
