package l69.i;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams;
import l69.i$a;
import android.content.Context;
import n3d.a;

public final class i implements Runnable	// class@002c9c
{
    public final Activity b;
    public final boolean c;
    public final String d;

    public void i(Activity p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       d.a(-1712118428).x00(this.b, 0, new LoginParams(), new i$a(this));
       return;
    }
}
