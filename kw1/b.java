package kw1.b;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kw1.d$b;
import kw1.d;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.util.Map;
import ekd.q;
import java.lang.Number;
import d61.k;
import w51.a;
import xf6.l;
import wg3.a;
import android.content.SharedPreferences;
import kw1.d$a;

public class b	// class@002e0a
{
    public Map a;
    public Map b;
    public static boolean c;
    public static Map d;
    public static Map e;
    public static final Map f;
    public static final Map g;
    public static final Map h;

    static {
       b.f = new HashMap();
       b.g = new HashMap();
       b.h = new HashMap();
    }
    public void b(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public static boolean a(){
       d$b obj = PatchProxy.apply(null, null, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.a();
       if (obj == null) {
          return false;
       }
       return b.b(obj.b, 1);
    }
    public static boolean b(String p0,int p1){
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 2;
       if (p1 == 1) {
          str = b.f();
       }else if(p1 == i){
          str = b.c();
       }else {
          str = "";
       }
       if (TextUtils.x(p0)) {
          b.Z(LiveLogTag.PK_SKIN, "[checkSkinPackValid] requiredResourcePackId is empty");
          return false;
       }else if(p1 == i && !TextUtils.n(str, p0)){
          LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2);
       }
       if (p1 == 1 && !TextUtils.n(str, p0)) {
          LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2);
       }
       if (!TextUtils.n(str, p0)) {
          b.e0(LiveLogTag.PK_SKIN, "[checkSkinPackValid] id not valid", "localSkinPackId", TextUtils.k(str), "requiredSkinPackId", TextUtils.k(p0), "skinResourceType", Integer.valueOf(p1));
          return false;
       }else {
          return 1;
       }
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.h(b.d)) {
          return "";
       }
       return b.d.get("live_pk_skin_theme_id");
    }
    public static int d(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return b.e(p0, p1, 0);
    }
    public static int e(String p0,int p1,int p2){
       Map obj;
       String str;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, b.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       if (b.i(p2)) {
          str = b.g.get(p0);
       }
       if (TextUtils.x(str) && b.h(p2)) {
          str = b.g.get(p0);
       }
       if (TextUtils.x(str) && b.g()) {
          str = b.f.get(p0);
       }
       if (TextUtils.x(str)) {
          str = b.h.get(p0);
       }
       b.d0(LiveLogTag.PK_SKIN, "get pk color skin", "key", p0, "colorStr", str);
       if (!TextUtils.x(str)) {
          return k.b(str);
       }else {
          return p1;
       }
    }
    public static String f(){
       Object obj = PatchProxy.apply(null, null, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.h(b.e)) {
          return "";
       }
       return b.e.get("live_pk_skin_theme_id");
    }
    public static boolean g(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, b.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(null, null, a.class, "86");
          b = (obj != patchProxyRe)? obj.intValue(): l.e("live_pk_custom_skin", false);
          if (!b) {
             b = a.a.getBoolean("enablePkOverallSkinTheme", false);
          }else if(b == 1){
             b = true;
          }else {
             b = false;
          }
       }
       if (!b) {
          return false;
       }else {
          d$b uob = d.a();
          if (uob == null) {
             return false;
          }else {
             return b.b(uob.a, 2);
          }
       }
    }
    public static boolean h(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = false;
       if (!d.b()) {
          return b;
       }else if(!b.a()){
          return b;
       }else if(d.b() && (p0 == 2 || !p0)){
          b = true;
       }
       return b;
    }
    public static boolean i(int p0){
       Object obj;
       boolean b;
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "14");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = PatchProxy.apply(null, null, d.class, "4");
       b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(null, null, a.class, "87");
          b1 = (obj != patchProxyRe)? obj.intValue(): l.e("live_pk_skin_self_honor", b);
          if (!b1) {
             d$a uoa = d.a.get(d.c);
             if (uoa != null && uoa.a != null) {
             label_005e :
                b1 = true;
             }
          }else if(b1 == 1){
             goto label_005e ;
          }
          b1 = false;
       }
       if (!b1) {
          return b;
       }else if(!b.a()){
          return b;
       }else if(p0 == 1 || !p0){
          b = true;
       }
       return b;
    }
}
