package fsa.e;
import n3d.a;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;

public final class e implements a	// class@0029e4
{
    public final TabLayout$f b;

    public void e(TabLayout$f p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       e tb = this.b;
       if (QCurrentUser.me().isLogined()) {
          tb.h();
       }
       return;
    }
}
