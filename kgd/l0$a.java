package kgd.l0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kgd.l0;
import kgd.l0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.View$OnClickListener;

public class l0$a extends PresenterV2	// class@00179f
{
    public View$OnClickListener p;
    public final l0 q;

    public void l0$a(l0 p0){
       this.q = p0;
       super();
       this.p = new l0$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l0$a.class, "1")) {
          return;
       }
       this.m8().setOnClickListener(this.p);
       return;
    }
}
