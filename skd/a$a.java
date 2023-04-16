package skd.a$a;
import android.content.SharedPreferences$Editor;
import java.lang.Object;
import oe6.g;
import java.lang.String;
import java.util.Set;

public class a$a implements SharedPreferences$Editor	// class@00243b
{
    public SharedPreferences$Editor a;

    public void a$a(SharedPreferences$Editor p0){
       super();
       this.a = p0;
    }
    public void apply(){
       g.a(this.a);
    }
    public SharedPreferences$Editor clear(){
       this.a.clear();
       return this;
    }
    public boolean commit(){
       return g.b(this.a);
    }
    public SharedPreferences$Editor putBoolean(String p0,boolean p1){
       this.a.putBoolean(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putFloat(String p0,float p1){
       this.a.putFloat(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putInt(String p0,int p1){
       this.a.putInt(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putLong(String p0,long p1){
       this.a.putLong(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putString(String p0,String p1){
       this.a.putString(p0, p1);
       return this;
    }
    public SharedPreferences$Editor putStringSet(String p0,Set p1){
       this.a.putStringSet(p0, p1);
       return this;
    }
    public SharedPreferences$Editor remove(String p0){
       this.a.remove(p0);
       return this;
    }
}
