package hm2.a$a;
import hm2.a$b;
import hm2.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import mrd.a;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import androidx.fragment.app.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.LiveWealthGradeDetailContainerFragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.util.Objects;

public class a$a implements a$b	// class@002dcb
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void Id(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.b.q = p0;
       }
       return;
    }
    public void Mh(boolean p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.b.r.onNext(Boolean.valueOf(p0));
       return;
    }
    public boolean Nj(){
       Boolean obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.r.i();
       if (obj == null) {
          obj = Boolean.FALSE;
       }
       return obj.booleanValue();
    }
    public String Xa(){
       return this.b.q;
    }
    public void Y7(a0 p0,String p1,c p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a$a.class, "5")) {
          return;
       }
       if (p1 != null) {
          a$a tb = this.b;
          tb.s.r4(p1, tb.getContext());
       }else {
          LiveWealthGradeDetailContainerFragment.Eh(p0, 0, 0, null).Cb(p2, p3);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void ek(LiveWealthGradeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.b);
       LiveWealthGradeInfo u = a.u;
       if (u != null) {
          LiveWealthGradeInfo mCurrentGrad = p0.mCurrentGrade;
          LiveWealthGradeInfo mCurrentGrad1 = u.mCurrentGrade;
          if (mCurrentGrad <= mCurrentGrad1 && (mCurrentGrad != mCurrentGrad1 || p0.mCurrentScore - u.mCurrentScore < 0)) {
          label_0026 :
             return;
          }
       }
       a.u = p0;
       goto label_0026 ;
    }
    public LiveWealthGradeInfo yb(){
       return a.u;
    }
}
