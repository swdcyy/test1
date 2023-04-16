package com.kwai.lib.interfacies.SpAdapter;
import gv6.e;
import com.kwai.lib.interfacies.SpAdapter$INSTANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public final class SpAdapter implements e	// class@000d04
{
    public static final p a;
    public static final SpAdapter b;

    static {
       SpAdapter.b = new SpAdapter();
       SpAdapter.a = s.c(SpAdapter$INSTANCE$2.INSTANCE);
    }
    public void SpAdapter(){
       super();
    }
    public final e a(){
       return SpAdapter.a.getValue();
    }
    public void apply(){
       g.a(this.a());
    }
    public SharedPreferences$Editor clear(){
       SharedPreferences$Editor uEditor = this.a().clear();
       a.o(uEditor, "INSTANCE.clear\(\)");
       return uEditor;
    }
    public boolean commit(){
       return g.b(this.a());
    }
    public boolean contains(String p0){
       return this.a().contains(p0);
    }
    public SharedPreferences$Editor edit(){
       SharedPreferences$Editor uEditor = this.a().edit();
       a.o(uEditor, "INSTANCE.edit\(\)");
       return uEditor;
    }
    public Map getAll(){
       Map all = this.a().getAll();
       a.o(all, "INSTANCE.all");
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
    public SharedPreferences$Editor putBoolean(String p0,boolean p1){
       SharedPreferences$Editor uEditor = this.a().putBoolean(p0, p1);
       a.o(uEditor, "INSTANCE.putBoolean\(key, value\)");
       return uEditor;
    }
    public SharedPreferences$Editor putFloat(String p0,float p1){
       SharedPreferences$Editor uEditor = this.a().putFloat(p0, p1);
       a.o(uEditor, "INSTANCE.putFloat\(key, value\)");
       return uEditor;
    }
    public SharedPreferences$Editor putInt(String p0,int p1){
       SharedPreferences$Editor uEditor = this.a().putInt(p0, p1);
       a.o(uEditor, "INSTANCE.putInt\(key, value\)");
       return uEditor;
    }
    public SharedPreferences$Editor putLong(String p0,long p1){
       SharedPreferences$Editor uEditor = this.a().putLong(p0, p1);
       a.o(uEditor, "INSTANCE.putLong\(key, value\)");
       return uEditor;
    }
    public SharedPreferences$Editor putString(String p0,String p1){
       SharedPreferences$Editor uEditor = this.a().putString(p0, p1);
       a.o(uEditor, "INSTANCE.putString\(key, value\)");
       return uEditor;
    }
    public SharedPreferences$Editor putStringSet(String p0,Set p1){
       SharedPreferences$Editor uEditor = this.a().putStringSet(p0, p1);
       a.o(uEditor, "INSTANCE.putStringSet\(key, values\)");
       return uEditor;
    }
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a().registerOnSharedPreferenceChangeListener(p0);
    }
    public SharedPreferences$Editor remove(String p0){
       SharedPreferences$Editor uEditor = this.a().remove(p0);
       a.o(uEditor, "INSTANCE.remove\(key\)");
       return uEditor;
    }
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
       this.a().unregisterOnSharedPreferenceChangeListener(p0);
    }
}
