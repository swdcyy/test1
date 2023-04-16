package cl2.a;
import n3d.a;
import cl2.c;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class a implements a	// class@00054f
{
    public final c b;
    public final Activity c;
    public final QPhoto d;
    public final String e;
    public final String f;

    public void a(c p0,Activity p1,QPhoto p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.F(tc, td, te, tf);
       }
       return;
    }
}
