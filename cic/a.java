package cic.a;
import uo7.b0;
import java.lang.Object;
import uo7.k;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uo7.b0$a;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class a implements b0	// class@0005a3
{

    public void a(){
       super();
    }
    public void a(k p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "it");
       b0$a.b(this, p0, p1);
       return;
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       b0$a.c(this, p0, p1);
       return;
    }
    public void c(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       a.p(p2, "it");
       b0$a.a(this, p0, p1, p2);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10474b));
       return;
    }
}
