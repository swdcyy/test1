package com.vivo.push.util.h;
import com.vivo.push.util.BaseNotifyDataAdapter;
import java.lang.Object;
import java.lang.String;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.p;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.lang.Throwable;
import com.vivo.push.model.InsideNotificationItem;
import android.content.Context;
import com.vivo.push.util.j;

public final class h implements BaseNotifyDataAdapter	// class@0010b6
{
    public Resources a;
    public String b;
    public String c;
    public String d;
    public static int e;
    public static int f;

    public void h(){
       super();
    }
    public static boolean a(int p0){
       if (p0 != -1 && p0) {
          return true;
       }
       return false;
    }
    public static boolean a(String p0){
       if (Build$VERSION.SDK_INT < 26) {
          return false;
       }
       if (!TextUtils.isEmpty(p0)) {
          return true;
       }
       p.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
       return false;
    }
    public final int a(String p0,String p1){
       object oobject;
       try{
          if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
             String[] stringArray = p0.split("\\.");
             if (stringArray != null && stringArray.length > 0) {
                oobject = stringArray[0];
             }
             int i = Integer.parseInt(oobject);
             while (i > 0) {
                String str = "vivo_push_ard"+i+p1;
                p.c("DefaultNotifyDataAdapter", ("get notify icon : ").concat(String.valueOf(str)));
                int identifier = this.a.getIdentifier(str, "drawable", this.b);
                if (identifier > 0) {
                   p.c("DefaultNotifyDataAdapter", ("find notify icon : ").concat(String.valueOf(str)));
                   return identifier;
                }
                i--;
             }
          }
       }catch(java.lang.Exception e7){
          p.a("DefaultNotifyDataAdapter", e7);
       }
       return -1;
    }
    public final int getDefaultNotifyIcon(){
       int identifier;
       if (h.a(h.e)) {
          return h.e;
       }
       h td = this.d;
       String str = "_notifyicon";
       int i = (!h.a(td))? -1: this.a(td, str);
       h.e = i;
       if (h.a(i)) {
          return h.e;
       }else {
          td = this.c;
          while (true) {
             String str1 = "drawable";
             if (TextUtils.isEmpty(td)) {
                return this.a.getIdentifier("vivo_push_notifyicon", str1, this.b);
             }
             identifier = this.a.getIdentifier("vivo_push_rom"+td+str, str1, this.b);
             if (identifier > 0) {
                break ;
             }else {
                int i1 = td.length() - 1;
                String str2 = td.substring(0, i1);
             }
          }
          return identifier;
       }
    }
    public final int getDefaultSmallIconId(){
       int identifier;
       if (h.a(h.f)) {
          return h.f;
       }
       h td = this.d;
       String str = "_icon";
       int i = (!h.a(td))? -1: this.a(td, str);
       h.f = i;
       if (h.a(i)) {
          return h.f;
       }else {
          td = this.c;
          while (true) {
             String str1 = "drawable";
             if (TextUtils.isEmpty(td)) {
                return this.a.getIdentifier("vivo_push_icon", str1, this.b);
             }
             identifier = this.a.getIdentifier("vivo_push_rom"+td+str, str1, this.b);
             if (identifier > 0) {
                break ;
             }else {
                int i1 = td.length() - 1;
                String str2 = td.substring(0, i1);
             }
          }
          return identifier;
       }
    }
    public final int getNotifyMode(InsideNotificationItem p0){
       return 2;
    }
    public final void init(Context p0){
       this.b = p0.getPackageName();
       this.a = p0.getResources();
       this.c = j.a();
       this.d = Build$VERSION.RELEASE;
    }
}
