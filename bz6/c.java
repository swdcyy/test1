package bz6.c;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Integer;
import java.lang.Number;
import android.content.res.Resources;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import java.lang.IllegalStateException;

public final class c	// class@0004bc
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(ViewGroup p0,ViewGroup$LayoutParams p1){
       String resourceEntr;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "3")) {
          return;
       }
       a.p(p0, "parent");
       if (p1 instanceof RelativeLayout$LayoutParams) {
          StringBuilder str = "\n            error relativeParams: 添加RelativeLayout#LayoutParams到非RelativeLayout,\\n\n            ViewInfo: "+p0.getClass().getSimpleName()+' ';
          String str1 = PatchProxy.applyOneRefs(p0, this, uoc, "4");
          if (str1 != PatchProxyResult.class) {
          }else {
             Integer integer = Integer.valueOf(p0.getId());
             int i = (integer.intValue() != -1)? 1: 0;
             if (!i) {
                integer = null;
             }
             if (integer != null) {
                resourceEntr = p0.getResources().getResourceEntryName(integer.intValue());
                if (resourceEntr != null) {
                label_0064 :
                   str1 = resourceEntr;
                }
             }
             resourceEntr = "NO_ID";
             goto label_0064 ;
          }
          u1.R("XfErrorRelativeParams", str+str1+"\\n\n            stack: "+Log.f(new Throwable())+"\"\n        ", 14);
       }
       return;
    }
    public final ViewGroup$MarginLayoutParams b(ViewGroup p0,int p1,int p2){
       RelativeLayout$LayoutParams layoutParams;
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       if (p0 instanceof RelativeLayout) {
          layoutParams = new RelativeLayout$LayoutParams(p1, p2);
       }else if(p0 instanceof FrameLayout){
          layoutParams = new FrameLayout$LayoutParams(p1, p2);
       }else {
          throw new IllegalStateException("不支持的ViewGroup类型: "+p0.getClass().getSimpleName());
       }
       return layoutParams;
    }
    public final ViewGroup$MarginLayoutParams c(ViewGroup p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       ViewGroup$MarginLayoutParams marginLayout = this.b(p0, p1, p2);
       if (marginLayout instanceof RelativeLayout$LayoutParams) {
          marginLayout.addRule(12, -1);
       }else if(marginLayout instanceof FrameLayout$LayoutParams){
          p1.gravity = 80;
       }
       return marginLayout;
    }
}
