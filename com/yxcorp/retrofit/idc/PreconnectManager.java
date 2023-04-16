package com.yxcorp.retrofit.idc.PreconnectManager;
import java.util.ArrayList;
import java.util.Random;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.List;
import java.util.HashMap;
import java.lang.String;
import mjd.a;
import com.yxcorp.retrofit.idc.models.Host;
import fjd.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import jjd.a;
import jjd.b;
import java.lang.StringBuilder;
import com.kuaishou.aegon.Aegon;
import android.os.Handler;
import ekd.s1;
import fjd.a;
import java.lang.Runnable;
import java.util.HashSet;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.retrofit.idc.PreconnectManager$PreconnectModel;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class PreconnectManager	// class@0013cf
{
    public b a;
    public final Map b;
    public static final String c = "PreconnectManager";
    public static final List d;
    public static final Random e;
    public static final Gson f;

    static {
       ArrayList uArrayList = new ArrayList();
       PreconnectManager.d = uArrayList;
       PreconnectManager.e = new Random();
       PreconnectManager.f = new Gson();
       uArrayList.add("zhongtai");
       uArrayList.add("red_pack_rain");
       uArrayList.add("api");
       uArrayList.add("https");
       uArrayList.add("live");
       uArrayList.add("live_https");
       uArrayList.add("coures");
       uArrayList.add("pay_check");
       uArrayList.add("game_center");
       uArrayList.add("push");
       uArrayList.add("ulog");
       uArrayList.add("upload");
    }
    public void PreconnectManager(){
       super();
       this.b = new HashMap();
    }
    public void a(String p0,int p1){
       if (p0 == null) {
          a.c(PreconnectManager.c, "preconnectToHostByAegon, type == null");
          return;
       }else {
          _monitor_enter(this);
          PreconnectManager ta = this.a;
          if (ta == null) {
             a.c(PreconnectManager.c, "preconnectToHostByAegon, router == null");
             _monitor_exit(this);
             return;
          }else {
             Host host = ta.c(p0);
             if (host == null || TextUtils.isEmpty(host.mHost)) {
                a.c(PreconnectManager.c, "preconnectToHostByAegon, host == null || TextUtils.isEmpty\(host.mHost\)");
                _monitor_exit(this);
                return;
             }else {
                a uoa = this.b.get(p0);
                int i = 1;
                String str = (uoa != null && uoa.c().isHttps())? 1: null;
                StringBuilder str1 = "";
                str = (str)? "https://": "http://";
                String[] stringArray = new String[i];
                stringArray[0] = str1+str+host.mHost;
                Aegon.l(p0, stringArray);
                _monitor_exit(this);
                if (PreconnectManager.e.nextFloat() - 0x3a83126f < 0) {
                   Handler handler = s1.c();
                   a uoa1 = new a(p0, host, p1);
                   long l = (!p1)? 5000: 0;
                   handler.postDelayed(uoa1, l);
                }
                return;
             }
          }
       }
    }
    public void b(){
       HashSet hashSet = new HashSet();
       ArrayList uArrayList = new ArrayList();
       PreconnectManager$PreconnectModel value = a.t().getValue("networkPreconnectRouteType1", PreconnectManager$PreconnectModel.class, null);
       if (value == null) {
          uArrayList.addAll(PreconnectManager.d);
          a.c(PreconnectManager.c, "Get pre-connect route types from local");
       }else {
          value = value.mPreconnectTypeList;
          if (q.f(value)) {
             a.c(PreconnectManager.c, "The pre-connect route types from kSwitch don\'t exist");
          }else {
             uArrayList.addAll(value);
             a.c(PreconnectManager.c, "Get pre-connect route types from kSwitch. "+value.toString());
          }
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str == null) {
             continue ;
          }
          hashSet.add(str);
       }
       Iterator iterator1 = hashSet.iterator();
       while (iterator1.hasNext()) {
          this.a(iterator1.next(), 0);
       }
       return;
    }
}
