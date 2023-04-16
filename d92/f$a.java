package d92.f$a;
import d92.f$b;
import d92.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import joc.a0;
import java.util.List;
import java.util.Iterator;
import kp3.e;
import mrd.a;

public class f$a implements f$b	// class@0024a8
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), uoa, uof, "2") && uoa.getActivity() instanceof FragmentActivity)) {
          SwipeLayout swipeLayout = w9.c(uoa.getActivity());
          if (swipeLayout != null && swipeLayout.getTouchDetector() != null) {
             swipeLayout.setEnabled(p0);
             if (!p1) {
                swipeLayout.getTouchDetector().h((p0 ^ 0x01));
             }else if(swipeLayout.getTouchDetector() instanceof a0){
                Iterator iterator = swipeLayout.getTouchDetector().l().iterator();
                while (iterator.hasNext()) {
                   z oz = iterator.next();
                   if (oz instanceof e) {
                      continue ;
                   }
                   int i = p0 ^ 0x01;
                   oz.h(i);
                }
             }else if(!swipeLayout.getTouchDetector() instanceof e){
                swipeLayout.getTouchDetector().h((p0 ^ 0x01));
             }
          }
          uoa.p.onNext(Boolean.valueOf((p0 ^ 0x01)));
       }
       return;
    }
}
