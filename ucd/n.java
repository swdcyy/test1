package ucd.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ucd.n$a;
import java.lang.Integer;

public class n extends PresenterV2	// class@003e62
{

    public void n(){
       super();
    }
    public void P8(View p0,View$OnClickListener p1){
       n$a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p1 = (p1 == null)? null: new n$a(this, p1);
       p0.setOnClickListener(p1);
       return;
    }
    public void R8(View p0,View$OnClickListener p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, n.class, "2")) {
          return;
       }
       this.P8(p0.findViewById(p2), p1);
       return;
    }
    public void S8(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       this.P8(this.m8(), p0);
       return;
    }
}
