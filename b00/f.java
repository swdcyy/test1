package b00.f;
import oo8.p;
import java.lang.String;
import okhttp3.MediaType;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Map;
import crd.b;
import oo8.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import brd.t;
import b00.b;
import b00.c;
import erd.g;
import java.lang.StringBuilder;
import b00.e;
import b00.d;
import aegon.chrome.net.NetworkException;
import com.tachikoma.core.component.network.TKNetErrorInfo;
import com.tachikoma.core.component.network.TKNetErrorInfo$SubErrorInfo;
import java.io.IOException;
import okhttp3.Headers;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import okhttp3.RequestBody;
import b00.a;
import b00.g;
import okhttp3.MultipartBody$Part;
import ojd.e;
import java.lang.RuntimeException;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import com.tachikoma.core.component.network.TKNetResponse;
import com.yxcorp.utility.Log;
import njd.a;
import okhttp3.Response;
import java.lang.Boolean;

public class f implements p	// class@00022d
{
    public String a;
    public String b;
    public Map c;
    public Map d;
    public String e;
    public Map f;
    public int g;
    public String h;
    public boolean i;
    public b j;
    public boolean k;
    public String l;
    public Map m;
    public String n;
    public static final MediaType o;

    static {
       f.o = MediaType.parse("application/json;charset=utf-8");
    }
    public void f(){
       super();
       this.c = new HashMap();
       this.d = new HashMap();
       this.f = new HashMap();
       this.g = 10;
       this.i = true;
       this.j = null;
    }
    public static String q(int p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (SystemUtil.I() || a.a().c()) {
          return p1;
       }else if(-1004 == p0){
          return a.a().a().getString(0x7f1038e7);
       }else {
          return a.a().a().getString(0x7f1038e3);
       }
    }
    public void a(Map p0){
       this.c = p0;
    }
    public void b(Map p0){
       this.f = p0;
    }
    public void c(boolean p0){
       this.k = p0;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       f tj = this.j;
       if (tj != null && !tj.isDisposed()) {
          this.j.dispose();
       }
       return;
    }
    public void d(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       Throwable throwable = null;
       int i = -1002;
       if (TextUtils.isEmpty(this.a)) {
          this.u(p0, i, throwable, "request params can not be null");
          return;
       }else {
          t ot = this.s();
          if (ot == null) {
             this.u(p0, i, throwable, "request config is not support, check your request config");
             return;
          }else {
             this.j = ot.subscribe(new b(this, p0), new c(this, p0));
             return;
          }
       }
    }
    public void e(int p0){
       boolean b = (p0)? true: false;
       this.i = b;
       return;
    }
    public void f(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       Throwable throwable = null;
       int i = -1002;
       if (TextUtils.isEmpty(this.a)) {
          this.u(p0, i, throwable, "request params can not be null");
          return;
       }else {
          t ot = this.t();
          if (ot == null) {
             this.u(p0, i, throwable, "request config is not support, check your request config");
             return;
          }else {
             this.j = ot.subscribe(new e(this, p0), new d(this, p0));
             return;
          }
       }
    }
    public void g(String p0){
       this.a = p0;
    }
    public void h(int p0){
       this.g = p0;
    }
    public void i(String p0){
       this.h = p0;
    }
    public void j(Map p0){
       this.d = p0;
    }
    public void k(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "14")) {
          return;
       }
       this.m = p0;
       if (p0 == null) {
          this.m = new HashMap();
       }
       return;
    }
    public void l(String p0){
       this.e = p0;
    }
    public void m(String p0){
       this.l = p0;
    }
    public void n(String p0){
       this.n = p0;
    }
    public void o(String p0){
       this.b = p0;
    }
    public final TKNetErrorInfo p(Throwable p0,NetworkException p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int errorCode = p1.getErrorCode();
       if (errorCode == 6 || errorCode == 4) {
          errorCode = -1001;
       }else if(errorCode == 2){
          errorCode = -1004;
       }else {
          errorCode = -1000;
       }
       TKNetErrorInfo tKNetErrorIn = new TKNetErrorInfo(errorCode, f.q(errorCode, p0.getMessage()));
       TKNetErrorInfo$SubErrorInfo subErrorInfo = new TKNetErrorInfo$SubErrorInfo();
       subErrorInfo.code = p1.getErrorCode();
       subErrorInfo.message = p1.getMessage();
       tKNetErrorIn.apiErrorInfo = subErrorInfo;
       return tKNetErrorIn;
    }
    public final Map r(Headers p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       int i1 = p0.size();
       for (int i = 0; i < i1; i = i + 1) {
          String str = p0.name(i);
          List list = obj.get(str);
          if (list == null) {
             list = new ArrayList(2);
             obj.put(str, list);
          }
          list.add(p0.value(i));
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = obj.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          List list1 = obj.get(str1);
          if (list1 == null || list1.isEmpty()) {
             continue ;
          }else {
             hashMap.put(str1, TextUtils.join(",", list1));
          }
       }
       return hashMap;
    }
    public final t s(){
       HashMap hashMap;
       String str;
       t ot;
       String str1;
       String obj2;
       RequestBody requestBody;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, this, uof, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.k != null) {
          obj = new File(this.l);
          if (obj.exists()) {
             if (this.m == null) {
                this.m = new HashMap();
             }
             f tm = this.m;
             hashMap = PatchProxy.applyOneRefs(tm, objArray, uof, "13");
             if (hashMap != patchProxyRe) {
             }else {
                hashMap = new HashMap();
                Iterator iterator = tm.keySet().iterator();
                while (iterator.hasNext()) {
                   str1 = iterator.next();
                   obj2 = tm.get(str1);
                   MediaType mediaType = MediaType.get("text/plain");
                   obj2 = (obj2 == null)? "": obj2.toString();
                   hashMap.put(str1, RequestBody.create(mediaType, obj2));
                }
             }
             Object obj1 = hashMap;
             str = (TextUtils.isEmpty(this.n))? "file": this.n;
             this.n = str;
             if (this.w(this.a)) {
                ot = g.b(this.h, this.i, this.g).j(this.a, this.f, e.d(this.n, obj), obj1, this.d);
             }else {
                ot = g.b(this.h, this.i, this.g).f(this.a, this.f, e.d(this.n, obj), obj1, this.d);
             }
          }else {
             throw new RuntimeException("file not find: "+obj.getAbsolutePath());
          }
       }else if(("GET").equalsIgnoreCase(this.b)){
          f tc = this.c;
          if (!q.h(this.d)) {
             hashMap = new HashMap(tc);
             hashMap.putAll(this.d);
             tc = hashMap;
          }
          if (this.w(this.a)) {
             ot = g.b(this.h, this.i, this.g).a(this.a, this.f, tc);
          }else {
             ot = g.b(this.h, this.i, this.g).e(this.a, this.f, tc);
          }
       }else if(("POST").equalsIgnoreCase(this.b)){
          str = Headers.of(this.f).get("content-type");
          if (str != null) {
             str1 = str.toLowerCase();
          }
          uof = this.c;
          String str2 = "utf-8";
          String str3 = "charset";
          obj2 = "application/json";
          if (uof == null || (!uof.isEmpty() || TextUtils.isEmpty(this.e))) {
             if (objArray != null && objArray.contains(obj2)) {
                String str4 = a.a.q(this.c);
                MediaType o = f.o;
                if (objArray.contains(str3) && !objArray.contains(str2)) {
                   o = MediaType.parse(str);
                }
                requestBody = RequestBody.create(o, str4);
                if (this.w(this.a)) {
                   ot = g.b(this.h, this.i, this.g).d(this.a, this.f, requestBody, this.d);
                }else {
                   ot = g.b(this.h, this.i, this.g).h(this.a, this.f, requestBody, this.d);
                }
             }else if(this.w(this.a)){
                ot = g.b(this.h, this.i, this.g).b(this.a, this.f, this.c, this.d);
             }else {
                ot = g.b(this.h, this.i, this.g).g(this.a, this.f, this.c, this.d);
             }
          }else {
             MediaType o1 = f.o;
             if (objArray != null && (objArray.contains(obj2) && (objArray.contains(str3) && !objArray.contains(str2)))) {
                o1 = MediaType.parse(str);
             }
             requestBody = RequestBody.create(o1, this.e);
             if (this.w(this.a)) {
                ot = g.b(this.h, this.i, this.g).d(this.a, this.f, requestBody, this.d);
             }else {
                ot = g.b(this.h, this.i, this.g).h(this.a, this.f, requestBody, this.d);
             }
          }
       }else {
       label_0240 :
          return objArray;
       }
       objArray = ot;
       goto label_0240 ;
    }
    public final t t(){
       HashMap hashMap1;
       t ot;
       RequestBody requestBody;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("GET").equalsIgnoreCase(this.b)) {
          obj = this.c;
          if (!q.h(this.d)) {
             HashMap hashMap = new HashMap(obj);
             hashMap.putAll(this.d);
             hashMap1 = hashMap;
          }
          if (this.w(this.a)) {
             ot = g.b(this.h, this.i, this.g).l(this.a, this.f, hashMap1);
          }else {
             ot = g.b(this.h, this.i, this.g).n(this.a, this.f, hashMap1);
          }
       }else if(("POST").equalsIgnoreCase(this.b)){
          String str = Headers.of(this.f).get("content-type");
          if (str != null) {
             objArray = str.toLowerCase();
          }
          f tc = this.c;
          String str1 = "utf-8";
          String str2 = "charset";
          String str3 = "application/json";
          if (tc == null || (!tc.isEmpty() || TextUtils.isEmpty(this.e))) {
             if (objArray != null && objArray.contains(str3)) {
                String str4 = a.a.q(this.c);
                MediaType o = f.o;
                if (objArray.contains(str2) && !objArray.contains(str1)) {
                   o = MediaType.parse(str);
                }
                requestBody = RequestBody.create(o, str4);
                if (this.w(this.a)) {
                   ot = g.b(this.h, this.i, this.g).k(this.a, this.f, requestBody, this.d);
                }else {
                   ot = g.b(this.h, this.i, this.g).o(this.a, this.f, requestBody, this.d);
                }
             }else if(this.w(this.a)){
                ot = g.b(this.h, this.i, this.g).m(this.a, this.f, this.c, this.d);
             }else {
                ot = g.b(this.h, this.i, this.g).p(this.a, this.f, this.c, this.d);
             }
          }else {
             MediaType o1 = f.o;
             if (objArray != null && (objArray.contains(str3) && (objArray.contains(str2) && !objArray.contains(str1)))) {
                o1 = MediaType.parse(str);
             }
             requestBody = RequestBody.create(o1, this.e);
             if (this.w(this.a)) {
                ot = g.b(this.h, this.i, this.g).k(this.a, this.f, requestBody, this.d);
             }else {
                ot = g.b(this.h, this.i, this.g).o(this.a, this.f, requestBody, this.d);
             }
          }
       }else {
       label_0179 :
          return objArray;
       }
       objArray = ot;
       goto label_0179 ;
    }
    public final void u(o p0,int p1,Throwable p2,String p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, f.class, "4")) {
          return;
       }
       p0.a(null, new TKNetErrorInfo(p1, f.q(p1, p3)));
       Log.e("TKNetworkService", p3, p2);
       return;
    }
    public final void v(a p0,TKNetErrorInfo p1,o p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "3")) {
          return;
       }
       TKNetResponse tKNetRespons = new TKNetResponse();
       Response response = p0.n();
       if (response != null) {
          tKNetRespons.statusCode = response.code();
          tKNetRespons.headers = a.a.q(this.r(response.headers()));
       }
       String str = p0.a();
       if (str != null) {
          tKNetRespons.data = str;
          p2.a(tKNetRespons, p1);
       }else {
          this.u(p2, -1000, null, "response body is null");
       }
       return;
    }
    public final boolean w(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.toLowerCase();
          if (p0.startsWith("http://") || p0.startsWith("https://")) {
             b = true;
          }
       }
       return b;
    }
}
