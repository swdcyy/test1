package ib1.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment$c;

public final class e implements View$OnClickListener	// class@002887
{
    public final LiveUserListFragment b;

    public void e(LiveUserListFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       tb.dismiss();
       LiveUserListFragment n = tb.N;
       if (n != null) {
          n.onDismiss();
       }
       return;
    }
}
