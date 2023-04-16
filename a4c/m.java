package a4c.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xl8.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import a4c.l;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import s1c.r0;

public class m extends PresenterV2	// class@000078
{
    public b p;
    public View q;
    public r0 r;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       String str = this.p.a();
       if (!TextUtils.x(str) && this.getActivity() != null) {
          this.q.setOnClickListener(new l(this, str));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1496);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("PROFILE_MUSICIAN_STATUS_SUBJECT");
       this.r = this.q8(r0.class);
       return;
    }
}
