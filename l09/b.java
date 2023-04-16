package l09.b;
import l09.b$a;
import nsd.u;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import nx8.l;
import mrd.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.component.TransparentBgDialogFragment;
import l09.b$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class b	// class@002c61
{
    public TransparentBgDialogFragment a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
    }
    public void b(){
       super();
    }
    public final void a(FragmentActivity p0,l p1,c p2,BaseFeed p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "1")) {
          return;
       }
       a.p(p0, "fragmentActivity");
       a.p(p1, "consumer");
       a.p(p3, "baseFeed");
       TransparentBgDialogFragment transparentB = new TransparentBgDialogFragment();
       this.a = transparentB;
       transparentB.zh(true);
       b ta = this.a;
       if (ta != null) {
          b$b uob = new b$b(ta, this, p2, p3, p1, p0);
          ta.yh(v1);
          ta.Cb(p0.getSupportFragmentManager(), "PopShowFragment");
          View view = ta.getView();
          if (view != null) {
             view = view.findViewById(R.id.content_fragment);
             if (view != null) {
                view.setVisibility(0);
             }
          }
          view = ta.getView();
          if (view != null) {
             view = view.findViewById(R.id.loading);
             if (view != null) {
                view.setVisibility(8);
             }
          }
       }
    label_006d :
       return;
    }
}
