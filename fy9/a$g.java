package fy9.a$g;
import erd.g;
import fy9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;

public final class a$g implements g	// class@002382
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else if(p0.getTag(0x7f0a3c34) == null){
          a q = this.b.q;
          if (q != null) {
             FragmentActivity activity = q.getActivity();
             if (activity != null) {
                SwipeLayout swipeLayout = activity.findViewById(R.id.swipe);
                if (swipeLayout != null) {
                   swipeLayout.a(p0);
                   p0.setTag(R.id.swipe, swipeLayout);
                }
             }
          }
       }
       return;
    }
}
