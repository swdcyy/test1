package acc.b;
import erd.g;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.relation.user.activity.UserListActivity;
import androidx.fragment.app.Fragment;

public final class b implements g	// class@0000ec
{
    public final Bundle b;

    public void b(Bundle p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0.setArguments(this.b);
    }
}
