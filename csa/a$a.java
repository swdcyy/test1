package csa.a$a;
import fr6.i;
import csa.a;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.kcube.TabIdentifier;

public final class a$a implements i	// class@0023a2
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "tab");
       View view = this.a.m8();
       a.o(view, "rootView");
       int i = (a.g("ato_operate", p0.M2().getType()) || a.g("ato_mall", p0.M2().getType()))? 8: 0;
       view.setVisibility(i);
       return;
    }
}
