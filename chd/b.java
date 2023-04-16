package chd.b;
import n3d.a;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;

public final class b implements a	// class@00032a
{
    public final String b;
    public final FragmentActivity c;

    public void b(String p0,FragmentActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b tc = this.c;
       if (!(this.b).equals(QCurrentUser.me().getId())) {
          tc.finish();
       }
       return;
    }
}
