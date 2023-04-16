package akd.e;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import bkd.b;
import zjd.d;
import akd.p;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public final class e implements Runnable	// class@000050
{
    public final a b;
    public final int c;

    public void e(a p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       tb.b = 0;
       Iterator iterator = new ArrayList(tb.i).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(0);
       }
       if (tb.c.b == null) {
          if (tc == 2) {
             tb.j(16);
          }else if(tc == 3){
             tb.j(17);
          }else {
             tb.j(18);
          }
          Activity uActivity = p.c().c();
          if (uActivity != null) {
             Toast.makeText(uActivity, uActivity.getResources().getString(R.string.arg_RES_7f100209), 0).show();
          }
       }
       return;
    }
}
