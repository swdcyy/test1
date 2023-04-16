package acc.a;
import n3d.a;
import com.yxcorp.gifshow.relation.user.activity.UserListActivity;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@0000eb
{
    public final UserListActivity b;

    public void a(UserListActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a tb = this.b;
       if (p1 == -1) {
          tb.z3();
       }else {
          tb.finish();
       }
       return;
    }
}
