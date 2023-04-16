package a2.l0;
import android.view.ViewParent;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import a2.v;
import a2.w;
import android.view.accessibility.AccessibilityEvent;

public final class l0	// class@000088
{
    public static int[] a;

    public static boolean a(ViewParent p0,View p1,float p2,float p3,boolean p4){
       try{
          return p0.onNestedFling(p1, p2, p3, p4);
       }catch(java.lang.AbstractMethodError e0){
          e0.toString();
          return false;
       }
    }
    public static boolean b(ViewParent p0,View p1,float p2,float p3){
       try{
          return p0.onNestedPreFling(p1, p2, p3);
       }catch(java.lang.AbstractMethodError e0){
          e0.toString();
          return false;
       }
    }
    public static void c(ViewParent p0,View p1,int p2,int p3,int[] p4,int p5){
       if (p0 instanceof v) {
          p0.onNestedPreScroll(p1, p2, p3, p4, p5);
       }else if(!p5){
          try{
             p0.onNestedPreScroll(p1, p2, p3, p4);
          }catch(java.lang.AbstractMethodError e0){
             p0.toString();
          }
       }
    }
    public static void d(ViewParent p0,View p1,int p2,int p3,int p4,int p5,int p6,int[] p7){
       w ow = p0;
       if (ow instanceof w) {
          ow.onNestedScroll(p1, p2, p3, p4, p5, p6, p7);
       }else {
          p7[0] = p7[0] + p4;
          p7[1] = p7[1] + p5;
          if (ow instanceof v) {
             ow.onNestedScroll(p1, p2, p3, p4, p5, p6);
          }else if(!p6){
             try{
                p0.onNestedScroll(p1, p2, p3, p4, p5);
             }catch(java.lang.AbstractMethodError e0){
                p0.toString();
             }
          }
       }
    }
    public static void e(ViewParent p0,View p1,View p2,int p3,int p4){
       if (p0 instanceof v) {
          p0.onNestedScrollAccepted(p1, p2, p3, p4);
       }else if(!p4){
          try{
             p0.onNestedScrollAccepted(p1, p2, p3);
          }catch(java.lang.AbstractMethodError e0){
             p0.toString();
          }
       }
    }
    public static boolean f(ViewParent p0,View p1,View p2,int p3,int p4){
       if (p0 instanceof v) {
          return p0.onStartNestedScroll(p1, p2, p3, p4);
       }
       if (!p4) {
          return p0.onStartNestedScroll(p1, p2, p3);
       }
    }
    public static void g(ViewParent p0,View p1,int p2){
       if (p0 instanceof v) {
          p0.onStopNestedScroll(p1, p2);
       }else if(!p2){
          try{
             p0.onStopNestedScroll(p1);
          }catch(java.lang.AbstractMethodError e0){
             p0.toString();
          }
       }
    }
    public static boolean h(ViewParent p0,View p1,AccessibilityEvent p2){
       return p0.requestSendAccessibilityEvent(p1, p2);
    }
}
