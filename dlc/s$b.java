package dlc.s$b;
import androidx.fragment.app.c$b;
import dlc.s;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import dlc.u;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$c;
import dlc.t;
import android.view.View$OnClickListener;
import dlc.v;
import java.lang.Runnable;
import ekd.k1;

public class s$b extends c$b	// class@00226d
{
    public final s a;

    public void s$b(s p0){
       this.a = p0;
       super();
    }
    public void m(c p0,Fragment p1,View p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, s$b.class, "1")) {
          return;
       }
       if (p1 == this.a.J && p2 != null) {
          NestedParentRelativeLayout nestedParent = p2.findViewById(R.id.more_trending_frame);
          if (nestedParent == null) {
             return;
          }else {
             nestedParent.setOnDragListener(new u(this));
             p2.findViewById(R.id.more_trending_header).setOnClickListener(new t(this));
             if (this.a.N != null) {
                k1.r(new v(this), 1000);
             }
          }
       }
       return;
    }
}
