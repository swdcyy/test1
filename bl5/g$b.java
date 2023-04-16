package bl5.g$b;
import sl8.b;
import bl5.g;
import java.lang.Object;
import android.view.ViewGroup;
import sl8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import wk5.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import bl5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.widget.EditText;
import xk5.c;
import al5.g;
import java.util.Set;

public class g$b implements b	// class@0004d3
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public a a(ViewGroup p0,int p1){
       f uof;
       g$b ta;
       f uof1;
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uof != PatchProxyResult.class) {
          }else {
          label_0019 :
             boolean b = false;
             if (!p1) {
                ta = this.a;
                uof1 = new f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03d9, p0, b), new b(), ta.q, ta.p, ta.r);
             }else if(p1 == 1){
                ta = this.a;
                uof1 = new f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03e4, p0, b), new g(), ta.q, ta.p, ta.r);
             }else {
                uof = null;
             }
          }
       }else {
          goto label_0019 ;
       }
       return uof;
    }
    public Set b(){
       return null;
    }
}
