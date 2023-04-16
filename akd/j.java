package akd.j;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a$b;
import java.lang.Throwable;
import java.lang.Object;
import com.yxcorp.upgrade.impl.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import zjd.g;
import bkd.b;
import zjd.d;
import akd.p;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public final class j implements Runnable	// class@000055
{
    public final a$b b;
    public final Throwable c;

    public void j(a$b p0,Throwable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       tb.a.b = 0;
       Iterator iterator = new ArrayList(tb.a.i).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(0);
       }
       a e = tb.a.e;
       if (e != null) {
          e.i(tc);
       }
       a$b a = tb.a;
       if (a.c.b == null) {
          a.j(7);
          Activity uActivity = p.c().c();
          if (uActivity != null) {
             Toast.makeText(uActivity, uActivity.getResources().getString(R.string.arg_RES_7f100209), 0).show();
          }
       }
       return;
    }
}
