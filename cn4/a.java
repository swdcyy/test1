package cn4.a;
import com.kuaishou.merchant.basic.model.MerchantTrilateralUrlWhiteListModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.w0;
import n04.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import ekd.p0;

public class a	// class@000495
{
    public List a;
    public List b;
    public static String c = "alipays";
    public static String d = "weixin";
    public static String e = "kwai";
    public static String f = "com.tencent.mm";
    public static String g = "http";
    public static String h = "https";
    public static String i = "alipay";
    public static String j = "tenpay";

    public void a(MerchantTrilateralUrlWhiteListModel p0){
       super();
       if (p0 != null) {
          this.a = p0.mHostWhiteList;
          this.b = p0.mSchemeWhiteList;
       }
       return;
    }
    public final String a(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          obj = w0.f(p0).getScheme();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.C().A("MerchantTrilateralUrlFilterHelper", "get url scheme error:"+p0, objArray);
       }
       return e0;
    }
    public boolean b(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = this.a(p0);
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (TextUtils.equals(p0, a.d) || TextUtils.equals(p0, a.c)) {
          return true;
       }
       if (q.f(this.b)) {
          return true;
       }
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (TextUtils.equals(obj.next(), p0)) {
             break ;
          }
       }
       return true;
    }
    public boolean c(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       obj = null;
       try{
          obj = p0.n(p0);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[false];
          a.C().A("MerchantTrilateralUrlFilterHelper", "get url host error:"+p0, objArray);
       }
       if (TextUtils.isEmpty(e0)) {
          return false;
       }
       if (e0.contains(a.i) || e0.contains(a.j)) {
          return true;
       }
       if (q.f(this.a)) {
          return true;
       }
       Iterator iterator = this.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          String str = iterator.next();
          if (!TextUtils.isEmpty(str) && e0.contains(str)) {
             break ;
          }
       }
       return true;
    }
    public boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       p0 = this.a(p0);
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (TextUtils.equals(p0, a.g) || TextUtils.equals(p0, a.h)) {
          return false;
       }
       return true;
    }
}
