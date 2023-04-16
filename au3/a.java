package au3.a;
import o07.d$a;
import com.kuaishou.merchant.container.halfcontainer.BottomSheetDialogContainerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import lnc.a1;
import android.os.Handler;
import au3.a$a;
import java.lang.Runnable;

public class a implements d$a	// class@0002c7
{
    public final BottomSheetDialogContainerFragment b;

    public void a(BottomSheetDialogContainerFragment p0){
       this.b = p0;
       super();
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a tb = this.b;
       a tb1 = this.b;
       tb.Oh((int)(((float)n.j(tb.getActivity()) - tb1.I.b(tb1.getContext())) - (float)a1.d(R.dimen.arg_RES_7f070335)));
       return;
    }
    public void b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tb = this.b;
       if (tb.M == null) {
          tb.M = new Handler();
       }
       this.b.M.postDelayed(new a$a(this), 20);
       return;
    }
}
