package k3.m;
import java.lang.Object;
import android.content.Context;
import l3.i;
import ig6.c;
import k3.a;
import java.lang.String;
import androidx.work.ExistingWorkPolicy;
import java.util.List;
import k3.l;
import k3.i;
import java.util.UUID;
import android.app.PendingIntent;
import androidx.work.e;
import java.util.Collections;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.c;
import xk.d;
import androidx.lifecycle.LiveData;
import androidx.work.d;

public abstract class m	// class@00247f
{

    public void m(){
       super();
    }
    public static m l(Context p0){
       return c.b(p0);
    }
    public static void w(Context p0,a p1){
       i.w(p0, p1);
    }
    public abstract l a(String p0,ExistingWorkPolicy p1,List p2);
    public abstract l b(List p0);
    public abstract i c();
    public abstract i d(String p0);
    public abstract i e(String p0);
    public abstract i f(UUID p0);
    public abstract PendingIntent g(UUID p0);
    public final i h(e p0){
       return this.i(Collections.singletonList(p0));
    }
    public abstract i i(List p0);
    public abstract i j(String p0,ExistingPeriodicWorkPolicy p1,c p2);
    public abstract i k(String p0,ExistingWorkPolicy p1,List p2);
    public abstract d m();
    public abstract LiveData n();
    public abstract d o(UUID p0);
    public abstract LiveData p(UUID p0);
    public abstract d q(d p0);
    public abstract d r(String p0);
    public abstract LiveData s(String p0);
    public abstract d t(String p0);
    public abstract LiveData u(String p0);
    public abstract LiveData v(d p0);
    public abstract i x();
}
