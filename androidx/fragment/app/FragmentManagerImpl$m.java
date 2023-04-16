package androidx.fragment.app.FragmentManagerImpl$m;
import androidx.fragment.app.Fragment$e;
import androidx.fragment.app.a;
import java.lang.Object;
import androidx.fragment.app.FragmentManagerImpl;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;

public class FragmentManagerImpl$m implements Fragment$e	// class@000790
{
    public final boolean a;
    public final a b;
    public int c;

    public void FragmentManagerImpl$m(a p0,boolean p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public void a(){
       this.c = this.c + 1;
    }
    public void b(){
       int i = this.c - 1;
       this.c = i;
       if (i) {
          return;
       }
       this.b.s.scheduleCommit();
       return;
    }
    public void c(){
       FragmentManagerImpl$m tb = this.b;
       tb.s.completeExecute(tb, this.a, false, false);
    }
    public void d(){
       int i = 0;
       int i1 = (this.c > null)? 1: 0;
       a s = this.b.s;
       int i2 = s.mAdded.size();
       while (i < i2) {
          Fragment uFragment = s.mAdded.get(i);
          uFragment.setOnStartEnterTransitionListener(null);
          if (i1 && uFragment.isPostponed()) {
             uFragment.startPostponedEnterTransition();
          }
          i = i + 1;
       }
       FragmentManagerImpl$m tb = this.b;
       tb.s.completeExecute(tb, this.a, (i1 ^ 1), 1);
       return;
    }
    public boolean e(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
}
