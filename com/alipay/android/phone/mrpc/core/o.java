package com.alipay.android.phone.mrpc.core.o;
import com.alipay.android.phone.mrpc.core.t;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import org.apache.http.Header;
import java.lang.Class;

public final class o extends t	// class@000e55
{
    public String b;
    public byte[] c;
    public String d;
    public ArrayList e;
    public Map f;
    public boolean g;

    public void o(String p0){
       super();
       this.b = p0;
       this.e = new ArrayList();
       this.f = new HashMap();
       this.d = "application/x-www-form-urlencoded";
    }
    public final String a(){
       return this.b;
    }
    public final void a(String p0){
       this.d = p0;
    }
    public final void a(String p0,String p1){
       if (this.f == null) {
          this.f = new HashMap();
       }
       this.f.put(p0, p1);
       return;
    }
    public final void a(Header p0){
       this.e.add(p0);
    }
    public final void a(boolean p0){
       this.g = p0;
    }
    public final void a(byte[] p0){
       this.c = p0;
    }
    public final String b(String p0){
       o tf = this.f;
       if (tf == null) {
          return null;
       }
       return tf.get(p0);
    }
    public final byte[] b(){
       return this.c;
    }
    public final String c(){
       return this.d;
    }
    public final ArrayList d(){
       return this.e;
    }
    public final boolean e(){
       return this.g;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (o.class != p0.getClass()) {
          return false;
       }
       o tc = this.c;
       if (tc == null) {
          if (p0.c != null) {
             return false;
          }
       }else if(!tc.equals(p0.c)){
          return false;
       }
       tc = this.b;
       p0 = p0.b;
       if (tc == null) {
          if (p0 != null) {
             return false;
          }
       }else if(!tc.equals(p0)){
          return false;
       }
       return true;
    }
    public final int hashCode(){
       int i;
       o tf = this.f;
       if (tf != null) {
          String str = "id";
          if (tf.containsKey(str)) {
             i = (this.f.get(str)).hashCode() + 31;
          label_001c :
             i = i * 31;
             o tb = this.b;
             int i1 = (tb == null)? 0: tb.hashCode();
             return (i + i1);
          }
       }
       i = 1;
       goto label_001c ;
    }
    public final String toString(){
       Object[] objArray = new Object[]{this.b,this.e};
       return String.format("Url : %s,HttpHeader: %s", objArray);
    }
}
