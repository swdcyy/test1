package com.kwai.android.common.ext.SharePreferenceExtKt;
import android.content.SharedPreferences;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import com.kwai.android.common.ext.SharePreferenceExtKt$$special$$inlined$fromJson$1;
import java.lang.reflect.Type;
import el.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class SharePreferenceExtKt	// class@000993
{

    public static final List getStringList(SharedPreferences p0,String p1){
       a.p(p0, "$this$getStringList");
       String str = p0.getString(p1, null);
       if (str != null) {
          return CollectionsKt___CollectionsKt.J5(new Gson().i(str, new SharePreferenceExtKt$$special$$inlined$fromJson$1().getType()));
       }
       return new ArrayList();
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,float p2){
       a.p(p0, "$this$put");
       g.a(p0.edit().putFloat(p1, p2));
       return p0;
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,int p2){
       a.p(p0, "$this$put");
       g.a(p0.edit().putInt(p1, p2));
       return p0;
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,long p2){
       a.p(p0, "$this$put");
       g.a(p0.edit().putLong(p1, p2));
       return p0;
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,String p2){
       a.p(p0, "$this$put");
       g.a(p0.edit().putString(p1, p2));
       return p0;
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,List p2){
       a.p(p0, "$this$put");
       if (p2 == null || SharePreferenceExtKt.put(p0, p1, new Gson().q(p2)) == null) {
          SharePreferenceExtKt.remove(p0, p1);
       }
       return p0;
    }
    public static final SharedPreferences put(SharedPreferences p0,String p1,boolean p2){
       a.p(p0, "$this$put");
       g.a(p0.edit().putBoolean(p1, p2));
       return p0;
    }
    public static final SharedPreferences remove(SharedPreferences p0,String p1){
       a.p(p0, "$this$remove");
       g.a(p0.edit().remove(p1));
       return p0;
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,float p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,int p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,long p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,String p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,List p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
    public static final SharedPreferences set(SharedPreferences p0,String p1,boolean p2){
       a.p(p0, "$this$set");
       return SharePreferenceExtKt.put(p0, p1, p2);
    }
}
