package com.yxcorp.gifshow.corona.common.utils.a;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import uq9.d;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.app.Activity;
import uq9.e;

public class a	// class@00126f
{

    public void a(){
       super();
    }
    public static void a(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       p0.getDecorView().setSystemUiVisibility(5894);
       p0.getDecorView().setOnSystemUiVisibilityChangeListener(new d(p0));
       return;
    }
    public static void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       Window window = p0.getWindow();
       window.clearFlags(2048);
       window.addFlags(1024);
       window.getDecorView().setSystemUiVisibility(5638);
       return;
    }
    public static void c(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       p0.getDecorView().setSystemUiVisibility(3076);
       p0.getDecorView().setOnSystemUiVisibilityChangeListener(new e(p0, 3076));
       return;
    }
}
