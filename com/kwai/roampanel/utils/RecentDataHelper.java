package com.kwai.roampanel.utils.RecentDataHelper;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.j;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.roampanel.utils.RecentDataHelper$addRecentVisitCity$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Collection;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import nm7.c;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;
import fm7.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.roampanel.utils.RecentDataHelper$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Thread;

public final class RecentDataHelper	// class@0013e1
{

    public static final void a(CityInfo p0){
       RecentDataHelper recentDataHe = RecentDataHelper.class;
       Object[] obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, recentDataHe, "2")) {
          return;
       }
       a.p(p0, "cityInfo");
       j oj = new j(4);
       SequencesKt___SequencesKt.T2(SequencesKt___SequencesKt.R2(SequencesKt___SequencesKt.i0(CollectionsKt___CollectionsKt.l1(RecentDataHelper.b()), new RecentDataHelper$addRecentVisitCity$1(p0)), 3), oj);
       oj.addFirst(p0);
       if (!PatchProxy.applyVoidOneRefs(oj, obj, recentDataHe, "3")) {
          try{
             g.a(n.b().edit().putString("key_recent_visit_city_V3_1"+c.d.a, a.a.q(oj)));
          }catch(java.lang.Exception e5){
             obj = new Object[0];
             a.C().t("RecentDataHelper", "保存最近访问城市发生异常 e = "+e5+", info = "+oj, obj);
          }
       }
    }
    public static final List b(){
       List list;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, objArray, RecentDataHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.d;
       String str = 1;
       int i = (obj.c != null && obj.b == null)? 1: obj.a;
       String str1 = n.b().getString("key_recent_visit_city_V3_1"+i, objArray);
       if (TextUtils.x(str1) && i == str) {
          str1 = n.b().getString("key_recent_visit_city_V3_1", objArray);
       }
       if (TextUtils.x(str1)) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          try{
             list = a.a.i(str1, new RecentDataHelper$a().getType());
             a.o(list, "Gsons.KWAI_GSON.fromJson…ist<CityInfo>>\(\) {}.type\)");
          }catch(java.lang.Exception e0){
             Object[] objArray1 = new Object[0];
             a.C().w("RoamPanelRecentVisitedCities", "获取最近访问城市发生异常 cities = "+str1+"，currentThread = "+Thread.currentThread(), objArray1);
             list = CollectionsKt__CollectionsKt.E();
          }
       }
    }
}
