package mh1.b;
import im8.g;
import a51.c;
import mh1.b$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import mh1.e;
import java.util.Map;
import java.util.HashMap;
import p91.m;
import ug1.u;
import mk1.h;
import ug1.p;

public class b extends c implements g	// class@003176
{
    public a A;
    public p B;
    public m v;
    public u w;
    public h x;
    public p y;
    public ViewGroup z;
    public static String sLivePresenterClassName = "LiveGiftDetailHintPresenter";

    public void b(){
       super();
       this.B = new b$a(this);
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "3")) {
          this.z = new RelativeLayout(this.getContext());
          this.z.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          this.z.setClickable(true);
          this.z.setFocusable(true);
          this.z.requestLayout();
          this.z.setVisibility(8);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.q8(m.class);
       this.w = this.q8(u.class);
       this.x = this.s8(h.class);
       this.y = this.s8(p.class);
       return;
    }
}
