package akd.d;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import zjd.g;
import bkd.b;
import android.content.SharedPreferences;
import akd.b0;
import android.content.SharedPreferences$Editor;
import java.lang.System;
import java.lang.String;
import oe6.g;

public final class d implements Runnable	// class@00004f
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       tb.b = 2;
       Iterator iterator = new ArrayList(tb.i).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(true);
       }
       a e = tb.e;
       if (e != null) {
          e.e();
       }
       e = tb.c;
       if (e.q == true) {
          SharedPreferences$Editor uEditor = b0.a().edit();
          uEditor.putLong("last_show_upgrade_time", System.currentTimeMillis());
          g.a(uEditor);
          tb.j(19);
       }else if(e.b == null){
          tb.j(0);
       }
       return;
    }
}
