package androidx.fragment.app.FragmentManagerImpl$l;
import androidx.fragment.app.FragmentManagerImpl$k;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public class FragmentManagerImpl$l implements FragmentManagerImpl$k	// class@00078f
{
    public final String a;
    public final int b;
    public final int c;
    public final FragmentManagerImpl d;

    public void FragmentManagerImpl$l(FragmentManagerImpl p0,String p1,int p2,int p3){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public boolean e(ArrayList p0,ArrayList p1){
       FragmentManagerImpl mPrimaryNav = this.d.mPrimaryNav;
       if (mPrimaryNav != null && (this.b < null && (this.a == null && mPrimaryNav.getChildFragmentManager().popBackStackImmediate()))) {
          return false;
       }
       return this.d.popBackStackState(p0, p1, this.a, this.b, this.c);
    }
}
