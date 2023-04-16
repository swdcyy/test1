package xb7.a;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public abstract class a implements SharedPreferences	// class@0027de
{

    public void a(){
       super();
    }
    public static void d(a p0,String p1,String p2,boolean p3,int p4,Object p5){
       int i = 0;
       if (p4 & 0x04) {
          p3 = false;
       }
       Objects.requireNonNull(p0);
       a.q(p1, "key");
       a.q(p2, "value");
       if (!p1.length()) {
          i = 1;
       }
       if (i) {
          p0.c("The store received null or empty key.");
       }else {
          SharedPreferences$Editor uEditor = p0.a().edit();
          if (p3) {
             g.b(uEditor.putString(p1, p2));
          }else {
             g.a(uEditor.putString(p1, p2));
          }
       }
       return;
    }
    public abstract SharedPreferences a();
    public String b(String p0){
       a.q(p0, "key");
       String str = "";
       p0 = this.a().getString(p0, str);
       if (p0 != null) {
          str = p0;
       }
       return str;
    }
    public abstract void c(String p0);
    public boolean contains(String p0){
       return this.a().contains(p0);
    }
    public abstract void e(Context p0);
    public SharedPreferences$Editor edit(){
       SharedPreferences$Editor uEditor = this.a().edit();
       a.h(uEditor, "getStore\(\).edit\(\)");
       return uEditor;
    }
    public Map getAll(){
       Map all = this.a().getAll();
       a.h(all, "getStore\(\).all");
       return all;
    }
    public boolean getBoolean(String p0,boolean p1){
       return this.a().getBoolean(p0, p1);
    }
    public float getFloat(String p0,float p1){
       return this.a().getFloat(p0, p1);
    }
    public int getInt(String p0,int p1){
       return this.a().getInt(p0, p1);
    }
    public long getLong(String p0,long p1){
       return this.a().getLong(p0, p1);
    }
    public String getString(String p0,String p1){
       return this.a().getString(p0, p1);
    }
    public Set getStringSet(String p0,Set p1){
       return this.a().getStringSet(p0, p1);
    }
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a().registerOnSharedPreferenceChangeListener(p0);
    }
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a().unregisterOnSharedPreferenceChangeListener(p0);
    }
}
