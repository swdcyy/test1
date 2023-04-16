package com.kwai.plugin.dva.repository.store.a;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import oj7.d;
import java.lang.Object;
import java.util.HashSet;
import android.app.Application;
import oj7.c;
import com.google.gson.Gson;
import rj7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.repository.model.ComponentInfo;
import java.net.URLEncoder;
import android.content.SharedPreferences;
import org.json.JSONObject;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collections;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Exception;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@000eb4
{
    public final Context a;
    public final Gson b;
    public final d c;
    public SharedPreferences d;
    public final Set e;
    public static final AtomicReference f;

    static {
       a.f = new AtomicReference();
    }
    public void a(Context p0,d p1){
       super();
       this.e = new HashSet();
       if (p0 instanceof Application) {
       }else {
          p0 = p0.getApplicationContext();
       }
       this.a = p0;
       this.c = (p1 == null)? new c(this): p1;
       this.b = a.a();
       return;
    }
    public static a c(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.f.get();
    }
    public ComponentInfo a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.h().getString(URLEncoder.encode(p0), null);
       if (p0 != null) {
          return this.b.h(p0, ComponentInfo.class);
       }
       return null;
    }
    public Gson b(){
       return this.b;
    }
    public final PluginConfig d(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.optString("n");
       int i = p0.optInt("v");
       String str1 = p0.optString("l");
       String str2 = p0.optString("m", null);
       int i1 = p0.optInt("t");
       ArrayList uArrayList = new ArrayList();
       JSONArray jSONArray = p0.optJSONArray("deps");
       if (jSONArray != null) {
          for (int i2 = 0; i2 < jSONArray.length(); i2 = i2 + 1) {
             try{
                uArrayList.add(jSONArray.getString(i2));
             }catch(org.json.JSONException e10){
                e10.printStackTrace();
                return null;
             }
          }
       }
       PluginConfig pluginConfig = new PluginConfig(str, i, str1, str2, uArrayList, i1);
       return jSONArray;
    }
    public List e(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h().getString("plugin_configs", objArray);
       if (TextUtils.isEmpty(obj)) {
          return new ArrayList();
       }
       return this.f(obj);
    }
    public List f(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isEmpty()) {
          return Collections.emptyList();
       }
       obj = new ArrayList();
       JSONArray jSONArray = new JSONArray(p0);
       int i = 0;
       while (i < jSONArray.length()) {
          PluginConfig pluginConfig = this.d(jSONArray.getJSONObject(i));
          if (pluginConfig != null) {
             obj.add(pluginConfig);
          }
          i++;
       }
       return obj;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h().getString("plugin_configs", null);
    }
    public final SharedPreferences h(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          _monitor_enter(this);
          if (this.d == null) {
             this.d = this.c.a(this.a, "dva", 0);
          }
          _monitor_exit(this);
       }
       return this.d;
    }
    public String i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h().getString(p0, null);
    }
    public final boolean j(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          PluginConfig pluginConfig = iterator.next();
          if (p0 != null && p0.equals(pluginConfig.name)) {
             iterator.remove();
             b = true;
             break ;
          }
       }
       return b;
    }
    public boolean k(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.c().e();
       boolean b = this.j(p0, obj);
       if (b) {
          a.c().n(obj);
       }
       return b;
    }
    public boolean l(List p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.c().e();
       boolean b = false;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (this.j(iterator.next(), obj)) {
             b = true;
          }
       }
       if (b) {
          a.c().n(obj);
       }
       return b;
    }
    public boolean m(PluginConfig p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          obj = this.e();
          this.q(p0, obj);
          return this.n(obj);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return false;
       }
    }
    public boolean n(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       g.b(this.h().edit().putString("plugin_configs", this.b.q(p0)));
       return true;
    }
    public boolean o(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return g.b(this.h().edit().putString(p0, p1));
    }
    public boolean p(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       try{
          List list = this.e();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             this.q(iterator.next(), list);
          }
          return this.n(list);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return false;
       }
    }
    public final void q(PluginConfig p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "19")) {
          return;
       }
       int i = p1.size();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i) {
          if ((p1.get(i2).name).equals(p0.name)) {
             p1.set(i2, p0);
             i1 = 1;
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       if (!i1) {
          p1.add(p0);
       }
       return;
    }
}
