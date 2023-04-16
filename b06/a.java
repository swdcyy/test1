package b06.a;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;
import b06.b;

public final class a implements a	// class@0003dc
{
    public final GifshowActivity b;
    public final QPhoto c;
    public final boolean d;
    public final String e;
    public final String f;

    public void a(GifshowActivity p0,QPhoto p1,boolean p2,String p3,String p4){
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
       if (QCurrentUser.ME.isLogined()) {
          b.a(tb, tc, td, te, tf);
       }
       return;
    }
}
