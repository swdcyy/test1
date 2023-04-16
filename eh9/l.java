package eh9.l;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import eh9.n;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import lnc.a1;
import org.json.JSONObject;
import lnc.d7;
import j8c.a;
import q87.c;
import java.lang.StringBuilder;

public class l	// class@002153
{
    public static String a = "CameraTabHelper";
    public static int b = 100;
    public static List c;
    public static List d;
    public static int e;
    public static int f;
    public static boolean g;
    public static boolean h;
    public static int i;
    public static String j;
    public static String k;
    public static PosterActivityTabInfo l;

    static {
       l.c = new CopyOnWriteArrayList();
       l.d = new CopyOnWriteArrayList();
       l.e = l.b;
       l.f = 1;
       l.g = false;
       l.h = false;
       l.i = 0;
       l.k(false);
    }
    public void l(){
       super();
    }
    public static List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = l.c.iterator();
       while (iterator.hasNext()) {
          n on = iterator.next();
          if (p0.contains(on)) {
             obj.add(on);
          }
       }
       return obj;
    }
    public static List b(){
       ArrayList obj = PatchProxy.apply(null, null, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = l.c.iterator();
       while (iterator.hasNext()) {
          n on = iterator.next();
          if (on.isDefaultHide()) {
             continue ;
          }else if(on == CameraTab.CAMERA_TAB_TOOLBOX){
             obj.add(on);
          }else if(on == CameraTab.CAMERA_TAB_MOOD){
             obj.add(on);
          }else if(on == CameraTab.CAMERA_TAB_SNAPSHOT){
             if (!l.h) {
                obj.add(on);
             }
          }else {
             obj.add(on);
          }
       }
       return obj;
    }
    public static n c(int p0){
       Iterator obj;
       n on;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ol, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = l.c.iterator();
       while (true) {
          if (obj.hasNext()) {
             on = obj.next();
             if (on.getTextViewId() == p0) {
                return on;
             }
             continue ;
          }else {
             obj = l.d.iterator();
             while (true) {
                if (obj.hasNext()) {
                   on = obj.next();
                   if (on.getTextViewId() == p0) {
                   }else {
                      continue ;
                   }
                }else {
                }
             }
             return on;
          }
       }
       return null;
    }
    public static n d(int p0){
       Iterator obj;
       n on;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ol, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = l.c.iterator();
       while (true) {
          if (obj.hasNext()) {
             on = obj.next();
             if (on.getTabId() == p0) {
                return on;
             }
             continue ;
          }else {
             obj = l.d.iterator();
             while (true) {
                if (obj.hasNext()) {
                   on = obj.next();
                   if (on.getTabId() == p0) {
                   }else {
                      continue ;
                   }
                }else {
                }
             }
             return on;
          }
       }
       return null;
    }
    public static List e(List p0){
       Integer obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, l.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (q.f(p0)) {
          return obj;
       }
       obj1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj == null) {
             continue ;
          }else {
             n on = l.d(obj.intValue());
             if (on != null) {
                obj1.add(on);
             }
          }
       }
       return obj1;
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (l.f == 1) {
          l.f = l.g();
       }
       return l.f;
    }
    public static int g(){
       int i = (l.h)? 1: 12;
       return i;
    }
    public static List h(Object p0){
       ArrayList uArrayList = null;
       Object obj = PatchProxy.applyOneRefs(p0, uArrayList, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof List) {
          uArrayList = new ArrayList();
          int i = 0;
          while (i < p0.size()) {
             if (p0.get(i) instanceof Integer) {
                int i1 = p0.get(i).intValue();
                uArrayList.add(Integer.valueOf(i1));
                if (i1 == 1 && !l.h) {
                   uArrayList.add(Integer.valueOf(12));
                }
             }
             i = i + 1;
          }
       }
       return uArrayList;
    }
    public static PosterActivityTabInfo i(){
       return l.l;
    }
    public static List j(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = l.d.iterator();
       while (iterator.hasNext()) {
          n on = iterator.next();
          if (!q.f(p0)) {
             if (p0.contains(on)) {
                obj.add(on);
             }
          }else {
             obj.add(on);
          }
       }
       return obj;
    }
    public static void k(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, ol, "1")) {
          return;
       }
       l.c.clear();
       l.d.clear();
       CameraTab cAMERA_TAB_A = CameraTab.CAMERA_TAB_ACTIVITY;
       if (!TextUtils.x(l.j)) {
          cAMERA_TAB_A = CameraTab.CAMERA_TAB_HTML_ACTIVITY;
       }
       if (l.i == 2) {
          l.c.add(cAMERA_TAB_A);
       }
       int i = PostExperimentUtils.k0();
       if (i == 3) {
          l.c.add(CameraTab.CAMERA_TAB_DRAFT);
       }
       if (i == 1) {
          l.c.add(CameraTab.CAMERA_TAB_PICTURE_ALBUM);
       }
       if (!p0) {
          l.d.add(CameraTab.CAMERA_TAB_PHOTO);
          CameraTab cAMERA_TAB_S = CameraTab.CAMERA_TAB_SNAPSHOT;
          l.d.add(cAMERA_TAB_S);
          l.d.add(CameraTab.CAMERA_TAB_MOOD);
          if (l.i == 1) {
             l.c.add(cAMERA_TAB_A);
          }
          l.c.add(CameraTab.CAMERA_TAB_VIDEO);
          l.c.add(cAMERA_TAB_S);
       }else {
          l.c.add(CameraTab.CAMERA_TAB_MOOD);
          l.c.add(CameraTab.CAMERA_TAB_PHOTO);
          l.c.add(CameraTab.CAMERA_TAB_VIDEO);
       }
       if (i == 2) {
          l.c.add(CameraTab.CAMERA_TAB_PICTURE_ALBUM);
       }
       l.c.add(CameraTab.CAMERA_TAB_TOOLBOX);
       l.c.add(CameraTab.CAMERA_TAB_LIVE);
       l.c.add(CameraTab.CAMERA_TAB_IM_MIX);
       l.c.add(CameraTab.CAMERA_TAB_WHATS_UP);
       return;
    }
    public static boolean l(int p0){
       Iterator obj;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ol, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (l.h) {
          return false;
       }else {
          obj = l.d.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return false;
             }
             if (p0 == obj.next().getTabId()) {
                break ;
             }
          }
          return true;
       }
    }
    public static void m(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, ol, "2")) {
          return;
       }
       if (l.h == p0) {
          return;
       }
       l.h = p0;
       l.k(p0);
       return;
    }
    public static void n(String p0,PosterActivityTabInfo p1){
       PosterActivityTabInfo posterActivi1;
       l ol = l.class;
       PosterActivityTabInfo posterActivi = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, posterActivi, ol, "3")) {
          return;
       }
       String str = "";
       if (p1 != null) {
          posterActivi1 = p1;
       }else {
          posterActivi1 = PosterActivityTabInfo.class;
          String str1 = a.a.getString("posterActivityTabInfo", "null");
          posterActivi1 = (str1 == null || str1 == str)? posterActivi: b.a(str1, posterActivi1);
       }
       int i = 1;
       boolean b = (p1 != null)? true: false;
       if (PatchProxy.isSupport(ol)) {
          Object[] obj = PatchProxy.applyThreeRefs(posterActivi1, p0, Boolean.valueOf(b), null, l.class, "14");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(posterActivi1 != null && (TextUtils.x(posterActivi1.mActivityId) || (a1.o(posterActivi1.mExpireTime) > 0 && !b))){
             Object[] objArray = new Object[0];
             a.D().w(l.a, "getActivityTabPosition: NONE, tabInfo:"+posterActivi1, objArray);
          }else if(!TextUtils.x(p0)){
             try{
                str = new JSONObject(p0).optString("activityId", str);
             }catch(org.json.JSONException e0){
             }
          }
          i = 0;
       }else {
          goto label_0053 ;
       }
       l.l = posterActivi1;
       if (posterActivi1 != null) {
          posterActivi = posterActivi1.mHtmlUrl;
       }
       if (posterActivi1 != null) {
          CameraTab.CAMERA_TAB_ACTIVITY.setTabText(posterActivi1.mTabName);
          CameraTab.CAMERA_TAB_HTML_ACTIVITY.setTabText(posterActivi1.mTabName);
       }
       l.l = posterActivi1;
       if (l.i == i && TextUtils.n(posterActivi, l.j)) {
          return;
       }else {
          l.j = posterActivi;
          if (!TextUtils.x(posterActivi)) {
             l.k = posterActivi;
          }
          l.i = i;
          l.k(l.h);
          return;
       }
    }
}
