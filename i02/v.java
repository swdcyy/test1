package i02.v;
import n91.h;
import lp3.a;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Integer;
import java.lang.Float;
import d61.g;
import com.kuaishou.live.webview.context.LiveWebViewParam;

public class v extends a implements h	// class@0027ff
{
    public final Activity d;
    public final BaseFragment e;

    public void v(Activity p0,BaseFragment p1){
       super();
       this.d = p0;
       this.e = p1;
    }
    public boolean Mk(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e.getFragmentManager() == null) {
          return false;
       }
       a.c().g(p0, a.d(this.d, this.e.getFragmentManager(), this.Po()));
       return true;
    }
    public KwaiDialogFragment U9(String p0,String p1,String p2,int p3,String p4,int p5,float p6,boolean p7){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Integer.valueOf(p5),Float.valueOf(p6),Boolean.valueOf(p7)};
          p4 = PatchProxy.apply(objArray, this, ov, "1");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       if (g.h(this.d) || this.e.getFragmentManager() == null) {
          return null;
       }else {
          a uoa = a.d(this.d, this.e.getFragmentManager(), this.Po());
          uoa.g(p1);
          uoa.f(p2);
          uoa.b.setPortraitHeightPixel(p3).setLayoutType("3").setInOutAnimation(p5).setHideLeftTopBtn(p7).setDimAmount(p6);
          return a.c().h(p0, uoa);
       }
    }
}
