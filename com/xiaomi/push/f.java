package com.xiaomi.push.f;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import ws8.n5;
import com.xiaomi.push.f$a;
import java.util.Iterator;
import java.lang.StringBuilder;
import ws8.q5;
import java.util.Collections;

public class f	// class@001106
{
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public List f;

    public void f(int p0,String p1,String p2,String p3,String p4,List p5){
       super();
       this.f = null;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
       this.f = p5;
    }
    public void f(Bundle p0){
       super();
       this.f = null;
       this.a = p0.getInt("ext_err_code");
       String str = "ext_err_type";
       if (p0.containsKey(str)) {
          this.b = p0.getString(str);
       }
       this.c = p0.getString("ext_err_cond");
       this.d = p0.getString("ext_err_reason");
       this.e = p0.getString("ext_err_msg");
       Parcelable[] parcelableAr = p0.getParcelableArray("ext_exts");
       if (parcelableAr != null) {
          this.f = new ArrayList(parcelableAr.length);
          int len = parcelableAr.length;
          for (int i = 0; i < len; i = i + 1) {
             this.f.add(n5.e(parcelableAr[i]));
          }
       }
       return;
    }
    public void f(f$a p0){
       super();
       this.f = null;
       this.d(p0);
       this.e = null;
    }
    public Bundle a(){
       Bundle uBundle = new Bundle();
       f tb = this.b;
       if (tb != null) {
          uBundle.putString("ext_err_type", tb);
       }
       uBundle.putInt("ext_err_code", this.a);
       tb = this.d;
       if (tb != null) {
          uBundle.putString("ext_err_reason", tb);
       }
       tb = this.c;
       if (tb != null) {
          uBundle.putString("ext_err_cond", tb);
       }
       tb = this.e;
       if (tb != null) {
          uBundle.putString("ext_err_msg", tb);
       }
       tb = this.f;
       if (tb != null) {
          Bundle[] uBundleArray = new Bundle[tb.size()];
          int i = 0;
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             uBundleArray[i] = iterator.next().a();
             i = i1;
          }
          uBundle.putParcelableArray("ext_exts", uBundleArray);
       }
       return uBundle;
    }
    public String b(){
       String str = "\"";
       StringBuilder str1 = "<error code=\""+this.a+str;
       if (this.b != null) {
          str1 = str1+" type=\""+this.b+str;
       }
       if (this.d != null) {
          str1 = str1+" reason=\""+this.d+str;
       }
       str1 = str1+">";
       if (this.c != null) {
          str1 = str1+"<"+this.c+" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>";
       }
       if (this.e != null) {
          str1 = str1+"<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">"+this.e+"</text>";
       }
       Iterator iterator = this.c().iterator();
       while (iterator.hasNext()) {
          str1 = str1+iterator.next().d();
       }
       return str1+"</error>";
    }
    public synchronized List c(){
       f tf = this.f;
       if (tf == null) {
          return Collections.emptyList();
       }
       return Collections.unmodifiableList(tf);
    }
    public final void d(f$a p0){
       this.c = f$a.a(p0);
    }
    public String toString(){
       StringBuilder str = "";
       f tc = this.c;
       if (tc != null) {
          str = str+tc;
       }
       str = str+"\("+this.a+"\)";
       if (this.e != null) {
          str = str+" "+this.e;
       }
       return str;
    }
}
