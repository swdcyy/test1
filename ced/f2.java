package ced.f2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import android.view.ViewStub;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.widget.ImageView;

public class f2 extends PresenterV2	// class@000554
{
    public HashMap p;

    public void f2(){
       super();
       this.p = new HashMap();
    }
    public View P8(ViewStub p0){
       View obj = PatchProxy.applyOneRefs(p0, this, f2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p.get(p0);
       if (obj == null) {
          obj = p0.inflate();
          this.p.put(p0, obj);
       }
       return obj;
    }
    public void R8(ViewStub p0,int p1){
       f2 uof2 = f2.class;
       if (PatchProxy.isSupport(uof2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof2, "3")) {
          return;
       }
       View view = this.P8(p0);
       view.setVisibility(0);
       view.findViewById(R.id.tag_icon_mark).setImageResource(p1);
       return;
    }
    public void S8(ViewStub p0,int p1){
       f2 uof2 = f2.class;
       if (PatchProxy.isSupport(uof2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof2, "1")) {
          return;
       }
       View view = this.p.get(p0);
       if (p1) {
          if (p1 == 8 && view != null) {
             view.setVisibility(p1);
          }
       }else if(view == null){
          view = p0.inflate();
          this.p.put(p0, view);
       }
       view.setVisibility(p1);
       return;
    }
}
