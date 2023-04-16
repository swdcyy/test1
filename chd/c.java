package chd.c;
import erd.g;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ap5.a;
import android.app.Activity;
import java.lang.String;
import eda.n$a;
import c97.d;
import q97.c;

public final class c implements g	// class@00032b
{
    public final FragmentActivity b;

    public void c(FragmentActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (p0.booleanValue()) {
          d.a(-2061018968).Wo();
          tb.finish();
          n$a.a("showLogoutDialog").b();
          d.a().f().i("帐号", "发送登出事件-Normal");
       }
       return;
    }
}
