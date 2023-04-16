package com.loc.q;
import java.lang.Object;
import com.loc.q$b;
import com.loc.av;
import java.lang.String;
import com.loc.q$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import android.net.Uri$Builder;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import com.loc.y;

public final class q	// class@001462
{
    public q$b a;
    public av b;

    public void q(){
       super();
       this.a = new q$b(0);
       this.b = new av("HttpsDecisionUtil");
    }
    public static q a(){
       return q$a.a;
    }
    public static String a(String p0){
       if (!TextUtils.isEmpty(p0)) {
          String str = "https";
          if (!p0.startsWith(str)) {
             Uri$Builder uBuilder = Uri.parse(p0).buildUpon();
             uBuilder.scheme(str);
             p0 = uBuilder.build().toString();
          }
       }
       return p0;
    }
    public static void b(Context p0){
       q.b(p0, true);
    }
    public static void b(Context p0,boolean p1){
       SharedPreferences$Editor uEditor = av.a(p0, "open_common");
       av.a(uEditor, "a3", p1);
       av.a(uEditor);
    }
    public static boolean c(){
       return false;
    }
    public final void a(Context p0){
       if (this.a == null) {
          this.a = new q$b(0);
       }
       this.a.a(av.a(p0, "open_common", "a3", true));
       this.a.a(p0);
       y.a(p0).a();
       return;
    }
    public final void a(Context p0,boolean p1){
       if (this.a == null) {
          this.a = new q$b(0);
       }
       q.b(p0, p1);
       this.a.a(p1);
       return;
    }
    public final boolean a(boolean p0){
       if (q.c()) {
          return false;
       }
       if (p0 || this.b()) {
          return true;
       }
       return false;
    }
    public final boolean b(){
       if (this.a == null) {
          this.a = new q$b(0);
       }
       return this.a.a();
    }
}
