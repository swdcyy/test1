package ofd.a$a;
import joc.o;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import k2b.u1;
import ecd.b;
import java.util.List;
import android.view.View;

public class a$a extends o	// class@001f14
{
    public Activity a;
    public SwipeLayout b;
    public Fragment c;
    public Fragment d;

    public void a$a(Activity p0,SwipeLayout p1,Fragment p2){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       a$a ta = this.a;
       if (ta == null) {
          return;
       }
       if (ta.w3() == null) {
          return;
       }
       if (this.c != null) {
          Fragment parentFragme = this.d.getParentFragment();
          if (parentFragme != null && !parentFragme.isDetached()) {
             c childFragmen = parentFragme.getChildFragmentManager();
             if (childFragmen == null) {
                return;
             }else {
                e uoe = childFragmen.beginTransaction();
                uoe.s(this.c);
                uoe.o();
             }
          }
       }
       return;
    }
    public void b(){
       PatchProxy.applyVoid(null, this, a$a.class, "1");
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "3")) {
          return;
       }
       this.f();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "6")) {
          return;
       }
       u1.K0(3);
       a$a ta = this.a;
       if (ta != null) {
          ta.onBackPressed();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "4")) {
          return;
       }
       this.f();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "5")) {
          return;
       }
       if (this.a != null) {
          a$a td = this.d;
          if (td instanceof b) {
             Fragment parentFragme = td.getParentFragment();
             if (parentFragme == null) {
                return;
             }else {
                c childFragmen = parentFragme.getChildFragmentManager();
                if (childFragmen == null) {
                   return;
                }else {
                   List fragments = childFragmen.getFragments();
                   if (this.c == null && (this.d != null && fragments != null)) {
                      int i = 1;
                      if (fragments.size() > i) {
                         int i1 = fragments.indexOf(this.d) - i;
                         while (i1 >= 0) {
                            Fragment uFragment = fragments.get(i1);
                            if (uFragment != null && uFragment.getView() != null) {
                               this.c = uFragment;
                               break ;
                            }
                            i1 = i1 - 1;
                         }
                      }
                   }
                   if (this.c != null) {
                      e uoe = childFragmen.beginTransaction();
                      uoe.E(this.c);
                      uoe.o();
                   }
                }
             }
          }
       }
       return;
    }
}
