package e85.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Boolean;
import oe6.g;

public class a	// class@00151c
{
    public final String a;
    public final boolean b;
    public SharedPreferences c;

    public void a(String p0){
       super(p0, false);
    }
    public void a(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public long a(String p0,long p1){
       SharedPreferences obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = this.b();
       if (obj == null) {
          return p1;
       }else {
          return obj.getLong(p0, p1);
       }
    }
    public final SharedPreferences b(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj;
       }
       if (b.b() == null) {
          return objArray;
       }
       Context uContext = b.b();
       a ta = this.a;
       int i = (this.b != null)? 4: 0;
       SharedPreferences sharedPrefer = o.c(uContext, ta, i);
       this.c = sharedPrefer;
       return sharedPrefer;
    }
    public final SharedPreferences$Editor c(){
       SharedPreferences obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       if (obj == null) {
          return null;
       }
       return obj.edit();
    }
    public String d(String p0,String p1){
       SharedPreferences obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       if (obj == null) {
          return p1;
       }
       return obj.getString(p0, p1);
    }
    public void e(String p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Boolean.FALSE, this, a.class, "6")) {
          SharedPreferences$Editor uEditor = this.c();
          if (uEditor != null) {
             uEditor.putLong(p0, p1);
             g.a(uEditor);
          }
       }
       return;
    }
    public void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       this.g(p0, p1, false);
       return;
    }
    public void g(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "9")) {
          return;
       }
       SharedPreferences$Editor uEditor = this.c();
       if (uEditor == null) {
          return;
       }
       uEditor.putString(p0, p1);
       if (p2) {
          g.b(uEditor);
       }else {
          g.a(uEditor);
       }
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       SharedPreferences$Editor uEditor = this.c();
       if (uEditor == null) {
          return;
       }
       uEditor.remove(p0);
       g.a(uEditor);
       return;
    }
}
