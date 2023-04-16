package com.vivo.push.util.i;
import com.vivo.push.util.BaseNotifyLayoutAdapter;
import java.lang.Object;
import java.lang.String;
import android.content.res.Resources;
import com.vivo.push.util.j;
import com.vivo.push.util.z;
import java.lang.Integer;
import java.lang.Exception;
import android.graphics.Color;
import android.content.Context;

public final class i implements BaseNotifyLayoutAdapter	// class@0010b7
{
    public Resources a;
    public String b;

    public void i(){
       super();
    }
    public final int getNotificationLayout(){
       return this.a.getIdentifier("push_notify", "layout", this.b);
    }
    public final int getSuitIconId(){
       i ta;
       i tb;
       String str;
       if (j.c) {
          ta = this.a;
          tb = this.b;
          str = "notify_icon_rom30";
       }else if(j.b){
          ta = this.a;
          tb = this.b;
          str = "notify_icon_rom20";
       }else {
          ta = this.a;
          tb = this.b;
          str = "notify_icon";
       }
       return ta.getIdentifier(str, "id", tb);
    }
    public final int getTitleColor(){
       boolean i;
       try{
          i = z.a("com.android.internal.R$color", "vivo_notification_title_text_color").intValue();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          i = 0;
       }
       if (i > 0) {
          return this.a.getColor(i);
       }
       i = j.c;
       if (i) {
          return -1;
       }
       if (!j.b) {
          return 0xff000000;
       }
       if (i) {
          return Color.parseColor("#ff999999");
       }
       return -1;
    }
    public final void init(Context p0){
       this.b = p0.getPackageName();
       this.a = p0.getResources();
    }
}
