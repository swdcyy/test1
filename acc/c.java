package acc.c;
import erd.g;
import com.yxcorp.gifshow.relation.user.activity.UserListActivity;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import crd.b;
import lnc.b9;

public final class c implements g	// class@0000ed
{
    public final UserListActivity b;

    public void c(UserListActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       e uoe = tb.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, p0);
       uoe.m();
       b9.a(tb.A);
    }
}
