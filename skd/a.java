package skd.a;
import android.content.SharedPreferences;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.StringBuilder;
import ekd.e0;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public class a implements SharedPreferences	// class@00243c
{
    public SharedPreferences a;

    public void a(SharedPreferences p0){
       super();
       this.a = p0;
    }
    public static a b(Context p0,String p1){
       return new a(e0.a(p0, "pref_id_"+p1, 0));
    }
    public a$a a(){
       return new a$a(this.a.edit());
    }
    public boolean contains(String p0){
       return this.a.contains(p0);
    }
    public SharedPreferences$Editor edit(){
       return this.a();
    }
    public Map getAll(){
       return this.a.getAll();
    }
    public boolean getBoolean(String p0,boolean p1){
       return this.a.getBoolean(p0, p1);
    }
    public float getFloat(String p0,float p1){
       return this.a.getFloat(p0, p1);
    }
    public int getInt(String p0,int p1){
       return this.a.getInt(p0, p1);
    }
    public long getLong(String p0,long p1){
       return this.a.getLong(p0, p1);
    }
    public String getString(String p0,String p1){
       return this.a.getString(p0, p1);
    }
    public Set getStringSet(String p0,Set p1){
       return this.a.getStringSet(p0, p1);
    }
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a.registerOnSharedPreferenceChangeListener(p0);
    }
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a.unregisterOnSharedPreferenceChangeListener(p0);
    }
}
