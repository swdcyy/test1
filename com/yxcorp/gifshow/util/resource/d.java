package com.yxcorp.gifshow.util.resource.d;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import android.net.Uri;
import ekd.w0;
import qfc.a;
import q87.c;
import wkd.b;
import c0d.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.util.Iterator;
import c0d.d;
import com.yxcorp.gifshow.util.resource.d$a;
import android.net.Uri$Builder;
import java.util.Locale;
import java.lang.Integer;

public class d	// class@000ce1
{
    public final List a;
    public int b;
    public static boolean c;

    public void d(String p0){
       int i1;
       Uri uri;
       String host;
       super();
       int i = 0;
       this.b = i;
       this.a = new ArrayList();
       try{
          i1 = 0;
          uri = w0.f(p0);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[true];
          objArray[e0] = p0;
          a.C().s("ks://httpdns", "parse uri error", objArray);
          uri = i1;
       }
       if (uri != null) {
          host = uri.getHost();
       }
       a uoa = b.a(0x1a7467ca);
       if (uoa != null && (uri != null && (("http").equals(uri.getScheme()) && !TextUtils.x(host)))) {
          i = 1;
       }
    label_004a :
       if (!d.c && i) {
          Iterator iterator = uoa.a(host).iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (TextUtils.x(uod.c)) {
                continue ;
             }
             d$a uoa1 = new d$a(p0, uri);
             uoa1.c = uri.buildUpon().authority(uod.c).build().toString();
             uoa1.d = uod;
             this.a.add(uoa1);
          }
       }
       d$a uoa2 = new d$a(p0, uri);
       uoa2.c = p0;
       this.a.add(uoa2);
       return;
    }
    public d$a a(){
       d tb = this.b;
       d$a uoa = (tb > null && tb <= this.a.size())? this.a.get((this.b - 1)): null;
       return uoa;
    }
    public boolean b(){
       boolean b = (this.b < this.a.size())? true: false;
       return b;
    }
    public String toString(){
       d$a uoa = this.a();
       Locale uS = Locale.US;
       Object[] objArray = new Object[3];
       objArray[0] = Integer.valueOf(this.a.size());
       objArray[1] = Integer.valueOf(this.b);
       String str = (uoa != null)? uoa.toString(): null;
       objArray[2] = str;
       return String.format(uS, "size=%d, index=%d, current=%s", objArray);
    }
}
