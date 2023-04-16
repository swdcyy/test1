package com.kwai.library.slide.base.widget.SlidePlayVerticalRelativeLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class SlidePlayVerticalRelativeLayout$LayoutParams extends RelativeLayout$LayoutParams	// class@0008f2
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public void SlidePlayVerticalRelativeLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.e = false;
    }
    public void SlidePlayVerticalRelativeLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = false;
       this.e = p0.obtainStyledAttributes(p1, c$b.h5, false, false).getBoolean(1, false);
    }
    public void SlidePlayVerticalRelativeLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.e = false;
    }
    public void SlidePlayVerticalRelativeLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.e = false;
    }
    public void SlidePlayVerticalRelativeLayout$LayoutParams(RelativeLayout$LayoutParams p0){
       super(p0);
       this.e = false;
    }
    public void SlidePlayVerticalRelativeLayout$LayoutParams(SlidePlayVerticalRelativeLayout$LayoutParams p0){
       super(p0);
       this.e = false;
       this.a = p0.a;
       this.c = p0.c;
       this.b = p0.b;
       this.d = p0.d;
    }
    public static int a(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1){
       int i = p0.a + p1;
       p0.a = i;
       return i;
    }
    public static int b(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1){
       int i = p0.c + p1;
       p0.c = i;
       return i;
    }
    public static int c(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1){
       int i = p0.d + p1;
       p0.d = i;
       return i;
    }
    public static int d(SlidePlayVerticalRelativeLayout$LayoutParams p0,int p1){
       int i = p0.b + p1;
       p0.b = i;
       return i;
    }
    public void addRule(int p0,int p1){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout$LayoutParams.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SlidePlayVerticalRelativeLayout$LayoutParams.class, "2")) {
          return;
       }
       super.addRule(p0, p1);
       return;
    }
    public int[] e(int p0){
       if (PatchProxy.isSupport(SlidePlayVerticalRelativeLayout$LayoutParams.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SlidePlayVerticalRelativeLayout$LayoutParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.resolveLayoutDirection(p0);
       return this.getRules();
    }
}
