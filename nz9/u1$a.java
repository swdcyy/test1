package nz9.u1$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import nz9.u1;
import android.view.View;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.os.Handler;
import nz9.t1;
import java.lang.Runnable;
import java.lang.Boolean;
import im8.f;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import nz9.u1$b;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import o07.o;

public class u1$a implements PopupInterface$h	// class@00324b
{
    public final View b;
    public final u1 c;

    public void u1$a(u1 p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1$a.class, "1")) {
          return;
       }
       u1$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, u1.class, "4") && !TextUtils.x(tc.i)) {
          TextView textView = p0.z().findViewById(R.id.thanos_new_ui_follow_guide_bubble_text);
          if (textView != null) {
             textView.setText(tc.i);
          }
       }
       this.c.a.removeCallbacksAndMessages(null);
       this.c.a.postDelayed(new t1(this), 666);
       this.c.d();
       u1$a tc1 = this.c;
       tc1.d = false;
       tc1.g.set(Boolean.FALSE);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowSlidePlayBottomFollowHint", false);
       g.a(uEditor);
       u1 j = this.c.j;
       if (j != null) {
          j.onShow();
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(u1$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1$a.class, "3")) {
          return;
       }
       this.c.b();
       this.b.getViewTreeObserver().removeOnScrollChangedListener(this.c.l);
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1$a.class, "4")) {
          return;
       }
       u1 j = this.c.j;
       if (j != null) {
          j.a();
       }
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1$a.class, "2")) {
          return;
       }
       u1 j = this.c.j;
       if (j != null) {
          j.b();
       }
       return;
    }
}
