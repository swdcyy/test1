package kx8.j;
import ps6.e;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.Fragment;

public class j implements e	// class@002c40
{
    public final LaunchModel a;
    public final OperateLazyLoadFragmentContainerNew b;

    public void j(OperateLazyLoadFragmentContainerNew p0,LaunchModel p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void o0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       String str = this.a.c();
       if (TextUtils.x(str)) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("OperateLazyLoadFragmentContainer", "KwaiRnTab onPageLoadFailed: replace url ="+str, objArray);
       j tb = this.b;
       tb.nh(tb.mh(str));
       return;
    }
}
