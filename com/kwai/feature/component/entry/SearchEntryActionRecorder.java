package com.kwai.feature.component.entry.SearchEntryActionRecorder;
import java.lang.Object;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.util.DateUtils;
import iy5.d;
import q87.c;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Boolean;
import java.lang.System;
import oe6.g;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$a;
import java.lang.Enum;

public class SearchEntryActionRecorder	// class@001203
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void SearchEntryActionRecorder(){
       super();
       SharedPreferences sharedPrefer = b.c("searchEntrySignal", 0);
       this.a = sharedPrefer;
       if (sharedPrefer != null) {
          this.b = sharedPrefer.edit();
       }
       return;
    }
    public String a(String p0){
       String str;
       String str1;
       String str2;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, SearchEntryActionRecorder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!DateUtils.J(this.b(QCurrentUser.ME.getId()+"_time"))) {
          obj = new Object[i];
          d.C().w("SearchEntryActionRecorder", "time has expire", obj);
          return null;
       }else if(!QCurrentUser.ME.isLogined()){
          obj = new Object[i];
          d.C().w("SearchEntryActionRecorder", "is not login", obj);
          return null;
       }else {
          JsonObject jsonObject = new JsonObject();
          if (TextUtils.n("search_entrance_searchbox_bottom_v3", p0)) {
             str = "user_vv_1d_cnt";
             str1 = "user_bubble_show_1d_cnt";
             str2 = "user_bubble_click_1d_cnt";
          }else if(this.c(p0)){
             str = "user_searchbar_show_1d_cnt";
             str1 = "user_keyword_show_1d_cnt";
             str2 = "user_keyword_click_1d_cnt";
          }else if(TextUtils.n("search_entrance_findrs", p0)){
             str1 = "user_feedrs_show_1d_cnt";
             str2 = "user_feedrs_click_1d_cnt";
             str = null;
          }else {
             obj = new Object[i];
             d.C().w("SearchEntryActionRecorder", "entrySource is wrong $entrySource", obj);
             return null;
          }
          long l = this.b(this.f(p0, SearchEntryActionRecorder$SignalType.USER_VV_COUNT));
          if (!TextUtils.x(str) && l >= 0) {
             jsonObject.a0(str, Long.valueOf(l));
          }
          l = this.b(this.f(p0, SearchEntryActionRecorder$SignalType.USER_SHOW_COUNT));
          if (!TextUtils.x(str1) && l >= 0) {
             jsonObject.a0(str1, Long.valueOf(l));
          }
          long l1 = this.b(this.f(p0, SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT));
          if (!TextUtils.x(str2) && l1 >= 0) {
             jsonObject.a0(str2, Long.valueOf(l1));
          }
          try{
             Object[] objArray = new Object[i];
             d.C().w("SearchEntryActionRecorder", "actionParams"+jsonObject, objArray);
             return jsonObject.toString();
          }catch(java.lang.Exception e0){
             return v3;
          }
       }
    }
    public final long b(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, SearchEntryActionRecorder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.a != null && !TextUtils.x(p0)) {
          return this.a.getLong(p0, 0);
       }
       obj = new Object[0];
       d.C().w("SearchEntryActionRecorder", "getEntrySignalCount is wrong, Key is $key, preferences is $mPreferences", obj);
       return -1;
    }
    public final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryActionRecorder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.contains("search_entrance_detail_placeholderKeywordV1") && (p0.contains("search_entrance_detail_placeholderBarV1") || p0.contains("search_entrance_detail_barV1")))? true: false;
       return b;
    }
    public final String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEntryActionRecorder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.n("search_entrance_searchbox_bottom_v3", p0)) {
          return "bubble";
       }
       if (this.c(p0)) {
          return "detail";
       }
       if (TextUtils.n("search_entrance_findrs", p0)) {
          return "feedRs";
       }
       return "unknown";
    }
    public void e(String p0,SearchEntryActionRecorder$SignalType p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchEntryActionRecorder.class, "1")) {
          return;
       }
       int i = 0;
       String str = "SearchEntryActionRecorder";
       if (!QCurrentUser.ME.isLogined()) {
          objArray = new Object[i];
          d.C().w(str, "is not login", objArray);
          return;
       }else if(this.b == null){
          objArray = new Object[i];
          d.C().w(str, "preferencesEditor is null", objArray);
          return;
       }else {
          long l = this.b(QCurrentUser.ME.getId()+"_time");
          if (l > 0 && !DateUtils.J(l)) {
             this.b.clear();
          }
          p0 = this.f(p0, p1);
          if (TextUtils.x(p0) || p0.contains("unknown")) {
             objArray = new Object[i];
             d.C().w(str, "Key is wrong $key", objArray);
             return;
          }else {
             this.b.putLong(QCurrentUser.ME.getId()+"_time", System.currentTimeMillis());
             this.b.putLong(p0, (this.b(p0) + 1));
             g.a(this.b);
             return;
          }
       }
    }
    public final String f(String p0,SearchEntryActionRecorder$SignalType p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, SearchEntryActionRecorder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.ME.getId();
       int i = SearchEntryActionRecorder$a.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                Object[] objArray = new Object[0];
                d.C().w("SearchEntryActionRecorder", "signalType: $signalType", objArray);
                return null;
             }else {
                p0 = obj+"_"+this.d(p0)+"_show";
             }
          }else {
             p0 = obj+"_"+this.d(p0)+"_click";
          }
       }else {
          p0 = obj+"_"+this.d(p0)+"_vv";
       }
       return p0;
    }
}
