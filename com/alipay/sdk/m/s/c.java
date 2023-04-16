package com.alipay.sdk.m.s.c;
import android.widget.FrameLayout;
import android.app.Activity;
import java.lang.String;
import android.content.Context;
import com.kuaishou.webkit.WebView;
import java.lang.Object;

public abstract class c extends FrameLayout	// class@000ea1
{
    public Activity b;
    public final String c;

    public void c(Activity p0,String p1){
       super(p0);
       this.b = p0;
       this.c = p1;
    }
    public static void j(WebView p0){
       if (p0 != null) {
          p0.resumeTimers();
       }
       return;
    }
    public abstract void k(String p0);
    public boolean l(){
       return ("v1").equals(this.c);
    }
    public abstract boolean m();
    public abstract void n();
}
