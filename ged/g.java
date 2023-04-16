package ged.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import j06.c;
import nfd.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.reduce.presenter.a;
import java.util.List;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import hed.h;
import com.yxcorp.plugin.search.result.reduce.presenter.c;
import im8.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import nfd.g0;
import ged.m;
import java.util.Map;
import java.util.HashMap;

public class g implements PopupInterface$f, g	// class@002ac5
{
    public Rect b;
    public Rect c;
    public int d;
    public f0$c e;
    public SearchResultFragment f;
    public List g;
    public PresenterV2 h;
    public boolean i;
    public boolean j;

    public void g(){
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d144d, p2, b);
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       layoutParams.width = (c.a() > t0.A0)? t0.z0: -1;
       view.setLayoutParams(layoutParams);
       PresenterV2 presenterV2 = new PresenterV2();
       this.h = presenterV2;
       presenterV2.U7(new a(this.g, this.f));
       if (this.i != null) {
          this.h.U7(new h());
       }else {
          this.h.U7(new c(this.j));
       }
       this.h.f(view);
       Object[] objArray = new Object[]{this,new c("SEARCH_REDUCE_POPUP", p0)};
       this.h.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       g0.s0(this.f.getActivity()).H0("");
       this.h.destroy();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new m());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
}
