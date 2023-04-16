package com.kwai.plugin.dva.repository.store.PluginContentProvider;
import android.content.ContentProvider;
import android.content.UriMatcher;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import qj7.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import com.kwai.plugin.dva.repository.store.a;
import java.util.List;
import java.util.Objects;
import java.lang.Iterable;
import android.content.ContentValues;
import java.util.Set;
import java.lang.Boolean;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.RuntimeException;
import android.content.Context;
import ii7.a;
import android.database.Cursor;

public class PluginContentProvider extends ContentProvider	// class@00137d
{
    public final UriMatcher b;

    public void PluginContentProvider(){
       super();
       this.b = new UriMatcher(-1);
    }
    public int delete(Uri p0,String p1,String[] p2){
       String queryParamet;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PluginContentProvider.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       d.c("PluginContentProvider delete "+p0.toString());
       int i = this.b.match(p0);
       if (i != 2) {
          if (i == 3) {
             queryParamet = p0.getQueryParameter("name_list");
             if (!TextUtils.isEmpty(queryParamet)) {
                ArrayList uArrayList = new ArrayList();
                Collections.addAll(uArrayList, queryParamet.split(","));
                d.c("PluginContentProvider start delete "+queryParamet);
                if (a.c().l(uArrayList)) {
                   return 1;
                }else {
                   return 0;
                }
             }
          }
          return 0;
       }else {
          queryParamet = p0.getQueryParameter("name");
          d.c("PluginContentProvider start delete "+queryParamet);
          if (a.c().k(queryParamet)) {
             return 1;
          }
          return 0;
       }
    }
    public String getType(Uri p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, PluginContentProvider.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       d.c("PluginContentProvider getType "+p0.toString());
       int i = this.b.match(p0);
       if (i != 1) {
          if (i != 4) {
             return null;
          }
          a uoa = a.c();
          Objects.requireNonNull(uoa);
          obj = PatchProxy.apply(null, uoa, a.class, "23");
          if (obj != patchProxyRe) {
          }else {
             obj = TextUtils.join(";", uoa.e);
          }
          return obj;
       }else {
          d.c("\t get all configs "+a.c().g());
          return a.c().g();
       }
    }
    public Uri insert(Uri p0,ContentValues p1){
       String asString;
       a uoa1;
       PluginConfig obj1;
       Uri uri;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginContentProvider.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       d.c("PluginContentProvider insert "+p0.toString());
       int i = this.b.match(p0);
       if (i != 2) {
          if (i != 3) {
             if (i == 4 && p1 != null) {
                asString = p1.getAsString("plugin_name");
                d.c("\t insert installed plugin"+asString);
                uoa1 = a.c();
                Objects.requireNonNull(uoa1);
                if (!PatchProxy.applyVoidOneRefs(asString, uoa1, uoa, "25")) {
                   uoa1.e.add(asString);
                }
             }
          }else if(p1 != null){
             asString = p1.getAsString("config_list");
             d.c("\t insert config list"+asString);
             uoa1 = a.c();
             Objects.requireNonNull(uoa1);
             obj1 = PatchProxy.applyOneRefs(asString, uoa1, uoa, "16");
             if (obj1 != patchProxyRe) {
                obj1.booleanValue();
             }else {
                uoa1.p(uoa1.f(asString));
             }
          }
       }else if(p1 != null){
          asString = p1.getAsString("config");
          d.c("\t insert config "+asString);
          uoa1 = a.c();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(asString, uoa1, uoa, "15");
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             obj1 = PatchProxy.applyOneRefs(asString, uoa1, uoa, "13");
             if (obj1 != patchProxyRe) {
             }else if(asString == null || asString.isEmpty()){
                uri = null;
             }else {
                try{
                   uri = uoa1.d(new JSONObject(asString));
                }catch(org.json.JSONException e5){
                   e5.printStackTrace();
                   throw new RuntimeException(e5.getMessage());
                }
             }
             if (obj1 != null) {
                uoa1.m(obj1);
             }
          }
       }
       return null;
    }
    public boolean onCreate(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Context obj = PatchProxy.apply(objArray, this, PluginContentProvider.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.getContext();
       String str1 = PatchProxy.applyOneRefs(obj, objArray, a.class, str);
       if (str1 != patchProxyRe) {
       }else {
          str1 = obj.getPackageName()+".data.provider";
       }
       this.b.addURI(str1, "plugin/config/all", 1);
       this.b.addURI(str1, "plugin/config", 2);
       this.b.addURI(str1, "plugin/config/list", 3);
       this.b.addURI(str1, "plugin/installed", 4);
       return 1;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       return 0;
    }
}
