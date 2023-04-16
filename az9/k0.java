package az9.k0;
import vv6.h;
import az9.i0;
import xv6.b;
import com.kwai.library.feedback.FeedbackDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xv6.a;
import java.lang.Boolean;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import az6.a;

public class k0 extends h	// class@000330
{
    public final i0 a;

    public void k0(i0 p0){
       this.a = p0;
       super();
    }
    public void b(b p0,FeedbackDialogFragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k0.class, "1")) {
          return;
       }
       super.b(p0, p1);
       this.a.o0();
       return;
    }
    public void c(boolean p0,a p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ok0, "2")) {
          return;
       }
       ok0 = this.a;
       d uod = new d(ok0.u, ok0.v);
       String str = null;
       CharSequence uCharSequenc = (p1 == null)? str: p1.b();
       if (TextUtils.x(uCharSequenc)) {
          uCharSequenc = "COVER";
       }
       a mSource = this.a.w.mSource;
       if (p1 != null) {
          str = p1.a();
       }
       uod.b(mSource, str, uCharSequenc);
       return;
    }
}
