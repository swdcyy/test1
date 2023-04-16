package ar8.e;
import android.view.ViewGroup;
import android.view.View;
import ar8.c;
import android.view.ViewParent;
import android.graphics.Rect;
import java.lang.IllegalArgumentException;
import ar8.a;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import java.lang.Math;

public class e	// class@000315
{

    public static c a(ViewGroup p0,View p1){
       float f;
       c uoc = null;
       if (p1.getParent() == null) {
          return uoc;
       }
       Rect rect = new Rect();
       try{
          p1.getDrawingRect(rect);
          p0.offsetDescendantRectToMyCoords(p1, rect);
          f = (float)rect.left;
          return new c(f, (float)rect.top, (float)p1.getWidth(), (float)p1.getHeight());
       }catch(java.lang.IllegalArgumentException e3){
          e3.printStackTrace();
          return f;
       }
    }
    public static a b(View p0){
       if (Build$VERSION.SDK_INT >= 23) {
          WindowInsets rootWindowIn = p0.getRootWindowInsets();
          if (rootWindowIn == null) {
             return null;
          }
          return new a((float)rootWindowIn.getSystemWindowInsetTop(), (float)rootWindowIn.getSystemWindowInsetRight(), (float)rootWindowIn.getStableInsetBottom(), (float)rootWindowIn.getSystemWindowInsetLeft());
       }else {
          Rect rect = new Rect();
          p0.getWindowVisibleDisplayFrame(rect);
          return new a((float)rect.top, (float)(p0.getWidth() - rect.right), (float)(p0.getHeight() - rect.bottom), (float)rect.left);
       }
    }
    public static a c(View p0){
       a uoa = null;
       if (!p0.getHeight()) {
          return uoa;
       }
       View rootView = p0.getRootView();
       a uoa1 = e.b(rootView);
       if (uoa1 == null) {
          return uoa;
       }
       Rect rect = new Rect();
       p0.getGlobalVisibleRect(rect);
       uoa1.a = Math.max((uoa1.a - (float)rect.top), 0);
       uoa1.d = Math.max((uoa1.d - (float)rect.left), 0);
       uoa1.c = Math.max((((float)(rect.top + p0.getHeight()) + uoa1.c) - (float)rootView.getHeight()), 0);
       uoa1.b = Math.max((((float)(rect.left + p0.getWidth()) + uoa1.b) - (float)rootView.getWidth()), 0);
       return uoa1;
    }
}
