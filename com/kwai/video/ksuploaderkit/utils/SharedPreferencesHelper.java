package com.kwai.video.ksuploaderkit.utils.SharedPreferencesHelper;
import zk.d;
import com.google.gson.Gson;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Double;

public class SharedPreferencesHelper	// class@0009e5
{
    public String mFileName;
    public SharedPreferences$Editor mSharedEditor;
    public SharedPreferences mSharedPreference;
    public static Gson gson;

    static {
       SharedPreferencesHelper.gson = new d().b();
    }
    public void SharedPreferencesHelper(Context p0,String p1){
       super();
       this.mFileName = p1;
       SharedPreferences sharedPrefer = o.c(p0, p1, 0);
       this.mSharedPreference = sharedPrefer;
       this.mSharedEditor = sharedPrefer.edit();
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, SharedPreferencesHelper.class, "4")) {
          return;
       }
       this.mSharedEditor.clear();
       g.b(this.mSharedEditor);
       return;
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SharedPreferencesHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mSharedPreference.contains(p0);
    }
    public Object get(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SharedPreferencesHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.contains(p0)) {
          return null;
       }
       p0 = this.mSharedPreference.getString(p0, String.valueOf(p1));
       if (p1 instanceof String) {
          return p0;
       }
       if (p1 instanceof Integer) {
          return Integer.valueOf(p0);
       }
       if (p1 instanceof Boolean) {
          return Boolean.valueOf(p0);
       }
       if (p1 instanceof Float) {
          return Float.valueOf(p0);
       }
       if (p1 instanceof Long) {
          return Long.valueOf(p0);
       }
       if (p1 instanceof Double) {
          return Double.valueOf(p0);
       }
       return new Gson().h(p0, p1.getClass());
    }
    public void put(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SharedPreferencesHelper.class, "1")) {
          return;
       }
       if (!p1 instanceof String && (!p1 instanceof Integer && (!p1 instanceof Boolean && (!p1 instanceof Float && (p1 instanceof Long || p1 instanceof Double))))) {
          this.mSharedEditor.putString(p0, String.valueOf(p1));
       }else {
          this.mSharedEditor.putString(p0, new Gson().q(p1));
       }
       g.b(this.mSharedEditor);
       return;
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharedPreferencesHelper.class, "3")) {
          return;
       }
       if (this.contains(p0)) {
          this.mSharedEditor.remove(p0);
          g.b(this.mSharedEditor);
       }
       return;
    }
}
