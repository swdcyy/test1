package hu4.h;
import hu4.g;
import androidx.fragment.app.FragmentActivity;
import hu4.n;
import java.lang.Object;
import java.util.HashMap;
import hu4.k;
import hu4.l;
import java.lang.String;
import hu4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import yz7.e;
import java.lang.Exception;
import pv.a;
import nv.c;
import android.view.ViewGroup;
import android.view.View;
import hu4.c;
import hu4.f;
import java.lang.Boolean;
import android.os.Bundle;

public abstract class h implements g	// class@0023e5
{
    public FragmentActivity a;
    public n b;
    public String c;
    public Map d;
    public Map e;
    public l f;
    public f g;
    public c h;
    public List i;
    public Map j;
    public Map k;
    public c l;
    public Map m;
    public boolean n;
    public ViewGroup o;
    public String p;
    public String q;
    public boolean r;

    public void h(FragmentActivity p0,n p1){
       super();
       this.j = new HashMap();
       this.k = new HashMap();
       this.l = null;
       this.m = new HashMap();
       this.n = false;
       this.p = "";
       this.q = "";
       this.a = p0;
       this.b = p1;
       this.c = p1.a;
       this.d = p1.b;
       this.f = k.a().b();
       this.p = p1.d;
       this.q = p1.e;
       this.r = p1.c;
       this.h = p1.g;
       this.i = p1.h;
       this.g();
    }
    public void a(String p0,String p1){
    }
    public a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return this.m.get(p0);
    }
    public String c(){
       String obj = PatchProxy.apply(null, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       h td = this.d;
       if (td == null) {
          return obj;
       }
       try{
          obj = e.f(td);
       }catch(java.lang.Exception e1){
          String[] stringArray = new String[]{"msg"};
          String[] stringArray1 = new String[]{e1.getMessage()};
          c.d("tk get data error : ", a.a(stringArray, stringArray1));
       }
       return obj;
    }
    public ViewGroup d(){
       return this.o;
    }
    public String e(){
       h obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       String str = (obj != null && obj.containsKey("sessionId"))? this.d.get("sessionId"): "";
       return str;
    }
    public String f(){
       String obj = PatchProxy.apply(null, this, h.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       h te = this.e;
       if (te == null) {
          return obj;
       }
       try{
          obj = e.f(te);
       }catch(java.lang.Exception e1){
          String[] stringArray = new String[]{"msg"};
          String[] stringArray1 = new String[]{e1.getMessage()};
          c.d("tk get style error", a.a(stringArray, stringArray1));
       }
       return obj;
    }
    public abstract void g();
    public Object h(View p0,String p1,String p2){
       return null;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       this.n = true;
       h tj = this.j;
       if (tj != null) {
          tj.clear();
       }
       tj = this.k;
       if (tj != null) {
          tj.clear();
       }
       tj = this.m;
       if (tj != null) {
          tj.clear();
       }
       return;
    }
    public void j(c p0){
       this.l = p0;
    }
    public void k(f p0){
       this.g = p0;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          boolean b = false;
          if (this.d.containsKey("uploadEvent") && this.d.get("uploadEvent") != null) {
             b = this.d.get("uploadEvent").booleanValue();
          }
       label_0033 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public void m(Bundle p0){
    }
    public void n(View p0,Map[] p1){
       if (p1 == null) {
          return;
       }
       if (p1.length > 0) {
          this.d = p1[0];
       }
       if (p1.length > 1) {
          this.e = p1[1];
       }
       return;
    }
    public void o(Map p0){
       this.d = p0;
    }
    public void p(View p0,Map p1){
    }
}
