package m$b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class m$b	// class@002596
{
    public final SharedPreferences a;
    public final SharedPreferences$Editor b;

    public void m$b(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "kste_sp_config", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public String a(String p0,String p1){
       return this.a.getString(p0, p1);
    }
    public void b(String p0,int p1){
       this.b.putInt(p0, p1);
       g.b(this.b);
    }
    public void c(String p0,String p1){
       this.b.putString(p0, p1);
       g.b(this.b);
    }
}
