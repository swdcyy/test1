package com.kwai.lib.adapter.SpAdapterImpl;
import gv6.e;
import java.lang.Object;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import com.kwai.android.common.ext.SharePreferenceExtKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public final class SpAdapterImpl implements e	// class@000cfe
{
    public final SharedPreferences kwaiSp;

    public void SpAdapterImpl(){
       super();
       SharedPreferences sharedPrefer = b.c(ContextProvider.getContext(), "push_sdk_v3", 0);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­3\", Context.MODE_PRIVATE\)");
       this.kwaiSp = sharedPrefer;
    }
    public void apply(){
       g.a(this.kwaiSp.edit());
    }
    public SharedPreferences$Editor clear(){
       g.b(this.kwaiSp.edit().clear());
       return this;
    }
    public boolean commit(){
       return g.b(this.kwaiSp.edit());
    }
    public boolean contains(String p0){
       return this.kwaiSp.contains(p0);
    }
    public SharedPreferences$Editor edit(){
       return this;
    }
    public Map getAll(){
       return new LinkedHashMap();
    }
    public boolean getBoolean(String p0,boolean p1){
       return this.kwaiSp.getBoolean(p0, p1);
    }
    public float getFloat(String p0,float p1){
       return this.kwaiSp.getFloat(p0, p1);
    }
    public int getInt(String p0,int p1){
       return this.kwaiSp.getInt(p0, p1);
    }
    public long getLong(String p0,long p1){
       return this.kwaiSp.getLong(p0, p1);
    }
    public String getString(String p0,String p1){
       return this.kwaiSp.getString(p0, p1);
    }
    public Set getStringSet(String p0,Set p1){
       return this.kwaiSp.getStringSet(p0, p1);
    }
    public SharedPreferences$Editor putBoolean(String p0,boolean p1){
       SharePreferenceExtKt.put(this.kwaiSp, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putFloat(String p0,float p1){
       SharePreferenceExtKt.put(this.kwaiSp, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putInt(String p0,int p1){
       SharePreferenceExtKt.put(this.kwaiSp, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putLong(String p0,long p1){
       SharePreferenceExtKt.put(this.kwaiSp, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putString(String p0,String p1){
       SharePreferenceExtKt.put(this.kwaiSp, p0, p1);
       return this;
    }
    public SharedPreferences$Editor putStringSet(String p0,Set p1){
       SpAdapterImpl tkwaiSp = this.kwaiSp;
       List list = (p1 != null)? CollectionsKt___CollectionsKt.J5(p1): null;
       SharePreferenceExtKt.put(tkwaiSp, p0, list);
       return this;
    }
    public void registerOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
    }
    public SharedPreferences$Editor remove(String p0){
       SharePreferenceExtKt.remove(this.kwaiSp, p0);
       return this;
    }
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences$OnSharedPreferenceChangeListener p0){
    }
}
