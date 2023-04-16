package c.t.m.g.r;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Observable;
import java.lang.String;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import java.lang.StringBuilder;
import c.t.m.g.q;
import java.util.Observer;
import java.lang.Object;

public class r extends Observable implements SharedPreferences$OnSharedPreferenceChangeListener	// class@000ca4
{
    public static String a = "cc_c_t_m_l_";
    public static r b;
    public static SharedPreferences c;

    public void r(){
       super();
       r.c = ca.a(r.a);
    }
    public static synchronized r a(){
       _monitor_enter(r.class);
       if (r.b == null) {
          r or = r.class;
          _monitor_enter(or);
          r.b = new r();
          _monitor_exit(or);
       }
       _monitor_exit(r.class);
       return r.b;
    }
    public static void a(String p0){
       r.a = "cc_c_t_m_l_"+p0;
    }
    public synchronized SharedPreferences b(){
       if (r.c == null) {
          r.c = ca.a(r.a);
       }
       return r.c;
    }
    public synchronized void c(){
       if (r.c != null) {
          this.addObserver(q.a());
          r.c.registerOnSharedPreferenceChangeListener(this);
       }
       return;
    }
    public synchronized void d(){
       if (r.c != null) {
          r.c.unregisterOnSharedPreferenceChangeListener(this);
          this.deleteObserver(q.a());
       }
       return;
    }
    public void onSharedPreferenceChanged(SharedPreferences p0,String p1){
       this.setChanged();
       this.notifyObservers(p1);
    }
}
