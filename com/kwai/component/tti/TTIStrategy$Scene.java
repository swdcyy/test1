package com.kwai.component.tti.TTIStrategy$Scene;
import com.kwai.component.tti.TTIStrategy$Scene$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class TTIStrategy$Scene	// class@000bc3
{
    public static final Set a;
    public static String b;
    public static String c;
    public static String d;
    public static boolean e;
    public static boolean f;

    static {
       TTIStrategy$Scene.a = new TTIStrategy$Scene$1();
       TTIStrategy$Scene.e = false;
       TTIStrategy$Scene.f = false;
    }
    public void TTIStrategy$Scene(){
       super();
    }
    public static String a(){
       String obj = PatchProxy.apply(null, null, TTIStrategy$Scene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!TextUtils.isEmpty(TTIStrategy$Scene.c))? TTIStrategy$Scene.c: "HomeTabNoVideoPlayScene";
       return obj;
    }
    public static String b(){
       String obj = PatchProxy.apply(null, null, TTIStrategy$Scene.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (("FEATURED_PAGE_LOADING").equals(TTIStrategy$Scene.c))? "FEATURED_PAGE": TTIStrategy$Scene.a()+"_HomePageFunction_TTI";
       return obj;
    }
    public static boolean c(){
       return TTIStrategy$Scene.e;
    }
}
