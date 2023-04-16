package c19.e$b;
import erd.g;
import android.view.ViewGroup;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class e$b implements g	// class@0004c6
{
    public final ViewGroup b;

    public void e$b(ViewGroup p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
       }else {
          View view = this.b.findViewById(R.id.ad_ordered_app_label);
          if (p0.b != null) {
             if (view != null) {
                view.setVisibility(0);
             }
          }else if(view != null){
             view.setVisibility(4);
          }
       }
       return;
    }
}
