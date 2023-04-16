package j89.o;
import d0d.b;
import okhttp3.Call;
import aegon.chrome.net.n$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Date;
import wkd.b;
import com.yxcorp.gifshow.w;
import android.os.SystemClock;
import com.kwai.robust.PatchProxyResult;
import j89.m;
import o56.d;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t06.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import w1.k;
import java.lang.Long;
import java.lang.Number;
import java.lang.System;

public class o extends b	// class@0027b8
{
    public boolean a;
    public String b;
    public static final int c;

    public void o(){
       super();
    }
    public void c(Call p0,n$b p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "3")) {
          return;
       }
       if (this.a != null && p1 != null) {
          o oo = -1;
          long time = (p1.d() != null)? p1.d().getTime(): oo;
          if (!time - oo && p1.b() != null) {
             time = p1.b().getTime();
          }
          if (!time - oo && p1.l() != null) {
             time = p1.l().getTime();
          }
          int i = -1343064608;
          b.a(i).k0(this.b, this.e(time));
          if (p1.h() != null) {
             b.a(i).V(this.b, this.e(p1.h().getTime()));
          }
       }
    label_007a :
       return;
    }
    public void callEnd(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "4")) {
          return;
       }
       if (this.a != null) {
          b.a(-1343064608).i(this.b, SystemClock.elapsedRealtime());
       }
       return;
    }
    public void callStart(Call p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, str)) {
          return;
       }
       if (!d.a && (p0 != null && p0.request() != null)) {
          String str1 = p0.request().url().toString();
          Object obj = PatchProxy.applyOneRefs(str1, null, om, str);
          String str2 = "n/feed/myfollow";
          String str3 = "/feed/hot";
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!TextUtils.x(str1)){
             Object[] objArray = new Object[0];
             b.C().s("PerfApmUtil", "path is "+str1, objArray);
             if (!str1.contains("/feed/selection") && (!str1.contains(str3) && (str1.contains("n/feed/nearby") || str1.contains(str2)))) {
                b = true;
             }
          }
          b = false;
          this.a = b;
          if (b) {
             if (str1.contains(str3)) {
                this.b = "hot";
                b.a(-1343064608).q(this.b);
             }else if(str1.contains("/feed/selection")){
                this.b = "featured";
                b.a(-1343064608).q(this.b);
             }else if(str1.contains(str2)){
                this.b = "following";
                b.a(-1343064608).q(this.b);
             }else if(str1.contains("n/feed/nearby")){
                this.b = "local";
                b.a(-1343064608).q(this.b);
             }
          }
          if (SystemUtil.P() && !TextUtils.x(str1)) {
             String str4 = PatchProxy.applyOneRefs(str1, null, om, "3");
             if (str4 != patchProxyRe) {
             }else {
                int i = 127;
                if (str1.length() > i) {
                   str1 = str1.substring(0, i);
                }
                str4 = str1;
             }
             k.a(str4);
             k.b();
          }
       }
    label_0105 :
       return;
    }
    public final long e(long p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, oo, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return (SystemClock.elapsedRealtime() - (System.currentTimeMillis() - p0));
    }
}
