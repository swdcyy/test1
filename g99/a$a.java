package g99.a$a;
import androidx.lifecycle.Observer;
import g99.a;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Number;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import android.view.ViewGroup$MarginLayoutParams;

public final class a$a implements Observer	// class@002437
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       a r;
       ViewGroup$LayoutParams layoutParams;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(p0, tb, uoa, "5");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
             a.p(p0, "avatarInfoResponse");
             p0 = p0.mType;
          }
          int i1 = 1;
          if (i == i1) {
             i = a1.d(R.dimen.arg_RES_7f070283);
             r = this.b.r;
             if (r != null) {
                layoutParams = r.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.width = a1.d(0x7f07031b);
                }
             }
          }else {
             i = a1.d(R.dimen.arg_RES_7f07025d);
             r = this.b.r;
             if (r != null) {
                layoutParams = r.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.width = a1.d(0x7f070253);
                }
             }
          }
          a$a tb1 = this.b;
          a s = tb1.s;
          if (s == null) {
             a.S("mUser");
          }
          Object obj1 = PatchProxy.applyOneRefs(s, tb1, uoa, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(s != null && (s.mVerifiedDetail != null || s.isVerified())){
             i1 = 0;
          }
       label_0096 :
          b = i1;
          if (b) {
             i = a1.d(R.dimen.arg_RES_7f070283);
          }
          a p = this.b.p;
          ViewGroup$LayoutParams layoutParams1 = (p != null)? p.getLayoutParams(): null;
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams1.leftMargin = i;
          i = this.b.p;
          if (i != null) {
             i.requestLayout();
          }
       }
       return;
    }
}
