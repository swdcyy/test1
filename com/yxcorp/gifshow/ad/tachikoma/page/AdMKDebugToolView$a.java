package com.yxcorp.gifshow.ad.tachikoma.page.AdMKDebugToolView$a;
import androidx.customview.widget.ViewDragHelper$c;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKDebugToolView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.FrameLayout;
import java.lang.Math;
import java.lang.Boolean;

public class AdMKDebugToolView$a extends ViewDragHelper$c	// class@00182e
{
    public final AdMKDebugToolView a;

    public void AdMKDebugToolView$a(AdMKDebugToolView p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       if (PatchProxy.isSupport(AdMKDebugToolView$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdMKDebugToolView$a.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       AdMKDebugToolView$a ta = this.a;
       if (ta.c != null) {
          return Math.min(Math.max(p1, ta.getPaddingLeft()), (this.a.getWidth() - this.a.c.getWidth()));
       }else {
          return p1;
       }
    }
    public int b(View p0,int p1,int p2){
       if (PatchProxy.isSupport(AdMKDebugToolView$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdMKDebugToolView$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       AdMKDebugToolView$a ta = this.a;
       if (ta.c != null) {
          return Math.min(Math.max(p1, ta.getPaddingTop()), (this.a.getHeight() - this.a.c.getHeight()));
       }else {
          return p1;
       }
    }
    public int d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKDebugToolView$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getMeasuredWidth();
    }
    public int e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMKDebugToolView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getMeasuredWidthAndState();
    }
    public boolean m(View p0,int p1){
       Object obj;
       AdMKDebugToolView$a uoa = AdMKDebugToolView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj.c = p0;
       boolean b = (p0.getId() == 0x7f0a011d)? true: false;
       return b;
    }
}
