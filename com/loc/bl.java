package com.loc.bl;
import java.lang.Object;
import com.loc.bl$a;
import com.loc.bl$b;
import java.util.Map;
import java.lang.String;
import java.lang.Throwable;
import com.loc.ak;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.ag;
import com.loc.bl$c;
import java.net.Proxy;
import com.loc.bg;
import com.loc.bj;
import java.lang.StringBuffer;
import com.loc.bg$a;
import com.loc.bh;

public abstract class bl	// class@0013a0
{
    public boolean a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public Proxy f;
    public bg$a g;
    public String h;
    public boolean i;
    public boolean j;
    public bl$a k;
    public bl$b l;

    public void bl(){
       super();
       this.d = 0x4e20;
       this.e = 0x4e20;
       this.f = null;
       this.a = false;
       this.b = 0x4e20;
       this.c = true;
       this.k = bl$a.a;
       this.l = bl$b.a;
    }
    public static String a(Map p0){
       String str = null;
       if (p0 == null) {
          return str;
       }
       if (p0.containsKey("platinfo")) {
          str = bl.c(p0.get("platinfo"));
       }
       return str;
    }
    public static String c(String p0){
       object oobject;
       String str = "=";
       String str1 = "";
       if (!TextUtils.isEmpty(p0)) {
          String[] stringArray = p0.split("&");
          if (stringArray.length > 1) {
             int len = stringArray.length;
             int i = 0;
             String str2 = str1;
             while (true) {
                if (i < len) {
                   oobject = stringArray[i];
                   if (oobject.contains("sdkversion")) {
                      str2 = oobject;
                   }
                   if (oobject.contains("product")) {
                   label_0031 :
                      if (!TextUtils.isEmpty(oobject)) {
                         stringArray = oobject.split(str);
                         if (stringArray.length > 1) {
                            str1 = (stringArray[1]).trim();
                            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(ag.a(str1))) {
                               stringArray = str2.split(str);
                               if (stringArray.length > 1) {
                                  ag.a(str1, (stringArray[1]).trim());
                                  break ;
                               }
                            }
                         }
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = str1;
                   goto label_0031 ;
                }
             }
          }
       }
    label_006d :
       return str1;
    }
    public abstract Map a();
    public final void a(int p0){
       this.d = p0;
    }
    public final void a(bl$a p0){
       this.k = p0;
    }
    public final void a(bl$b p0){
       this.l = p0;
    }
    public final void a(bl$c p0){
       boolean b = (p0 == bl$c.b)? true: false;
       this.j = b;
       return;
    }
    public final void a(String p0){
       this.h = p0;
    }
    public final void a(Proxy p0){
       this.f = p0;
    }
    public final void a(boolean p0){
       this.i = p0;
    }
    public abstract String b();
    public final String b(String p0){
       byte[] uobyteArray = this.e();
       if (uobyteArray != null && uobyteArray.length) {
          Map map = this.d();
          HashMap e = bg.e;
          if (e != null) {
             if (map != null) {
                map.putAll(e);
             }else {
                map = e;
             }
          }
          if (map == null) {
             return p0;
          }else {
             p0 = p0+"?"+bj.a(map);
          }
       }
       return p0;
    }
    public final void b(int p0){
       this.e = p0;
    }
    public String c(){
       return this.b();
    }
    public final void c(int p0){
       this.b = p0;
    }
    public boolean c_(){
       return this.c;
    }
    public abstract Map d();
    public byte[] e(){
       return null;
    }
    public String g(){
       return "";
    }
    public String h(){
       return "";
    }
    public final String l(){
       return this.b(this.b());
    }
    public final String m(){
       return this.b(this.c());
    }
    public final int n(){
       return this.d;
    }
    public final Proxy o(){
       return this.f;
    }
    public final bl$a p(){
       return this.k;
    }
    public final boolean q(){
       return this.a;
    }
    public final void r(){
       this.a = true;
    }
    public final boolean s(){
       return this.j;
    }
    public final bg$a t(){
       return this.g;
    }
    public final bl$b u(){
       return this.l;
    }
    public final int v(){
       return this.b;
    }
    public final void w(){
       this.c = false;
    }
    public final String x(){
       return this.h;
    }
    public final boolean y(){
       return this.i;
    }
    public final String z(){
       String str = this.h();
       if (TextUtils.isEmpty(str)) {
          str = (this.a != null)? bl.c(this.j()): bl.a(this.a());
       }
    label_002f :
       return str;
    }
}
