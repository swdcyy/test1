package pac.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.content.Context;

public abstract class a implements PopupInterface$f, f$d	// class@003be6
{
    public c b;
    public f c;

    public void a(){
       super();
    }
    public void A6(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.o();
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f(p1.getContext(), this.c(p0, p1, p2, p3));
       this.c = uof;
       uof.d(this);
       this.b = p0;
       return this.c.c();
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return;
    }
    public abstract View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3);
    public void p1(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.o();
       }
       return;
    }
}
