package com.kwai.feature.component.searchhistory.b;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import skd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.feature.component.searchhistory.b$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import fg6.a;
import com.kwai.feature.component.searchhistory.b$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.component.searchhistory.b$c;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import g06.i;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.feature.component.searchhistory.b$d;

public class b	// class@0012a0
{
    public final a a;

    public void b(){
       super();
       this.a = a.b(a.a().a(), "search_history");
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a$a uoa = this.a.a();
       uoa.putString(p0, null);
       g.a(uoa);
       RxBus.f.b(new b$b(p0));
       return;
    }
    public final int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (("live_bgm_anchor_music").equals(p0)) {
          return 10;
       }
       if (("tube").equals(p0)) {
          return 9;
       }
       return 50;
    }
    public synchronized List c(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       obj = this.a.getString(p0, str);
       if (TextUtils.isEmpty(obj)) {
          return new ArrayList();
       }
       try{
          Gson a = a.a;
          List list = a.i(obj, new b$a(this).getType());
          int i = this.b(p0);
          Collections.sort(list, new b$c(str));
          if (list.size() > i) {
             ArrayList uArrayList = new ArrayList(list.subList(0, i));
             a$a uoa = this.a.a();
             uoa.putString(p0, a.q(uArrayList));
             g.a(uoa);
             list = uArrayList;
          }
          return list;
       }catch(java.lang.Exception e0){
          return new ArrayList();
       }
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       List list = this.c(p0);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          if (p1.equals(iterator.next().mSearchWord)) {
             iterator.remove();
             a$a uoa = this.a.a();
             uoa.putString(p0, a.a.q(list));
             g.a(uoa);
             break ;
          }
       }
       return;
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       c.k(new i(this, p0, p1));
       RxBus.f.b(new b$d(p0, p1));
       return;
    }
}
