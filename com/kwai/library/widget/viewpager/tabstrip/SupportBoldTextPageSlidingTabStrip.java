package com.kwai.library.widget.viewpager.tabstrip.SupportBoldTextPageSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.graphics.Typeface;
import android.text.TextPaint;

public final class SupportBoldTextPageSlidingTabStrip extends PagerSlidingTabStrip	// class@000a94
{

    public void SupportBoldTextPageSlidingTabStrip(Context p0){
       super(p0);
    }
    public void SupportBoldTextPageSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SupportBoldTextPageSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void A(int p0,int p1){
       if (PatchProxy.isSupport(SupportBoldTextPageSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SupportBoldTextPageSlidingTabStrip.class, "4")) {
          return;
       }
       super.A(p0, p1);
       this.E();
       return;
    }
    public final void E(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, SupportBoldTextPageSlidingTabStrip.class, "6")) {
          return;
       }
       int childCount = this.g.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.g.getChildAt(i);
          View view = PatchProxy.applyOneRefs(childAt, this, SupportBoldTextPageSlidingTabStrip.class, "7");
          if (view != PatchProxyResult.class) {
          }else if(childAt instanceof TextView){
             view = childAt;
          }else {
             int i1 = 0x7f0a3caa;
             try{
                view = childAt.findViewById(i1);
             }catch(java.lang.Exception e0){
                view = null;
             }
          }
          i = i + 1;
       }
       return;
    }
    public void setTabTextSize(int p0){
       if (PatchProxy.isSupport(SupportBoldTextPageSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SupportBoldTextPageSlidingTabStrip.class, "5")) {
          return;
       }
       super.setTabTextSize(p0);
       this.E();
       return;
    }
    public void setTabTypefaceStyle(int p0){
       if (PatchProxy.isSupport(SupportBoldTextPageSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SupportBoldTextPageSlidingTabStrip.class, "3")) {
          return;
       }
       super.setTabTypefaceStyle(p0);
       this.E();
       return;
    }
    public void setTextColor(int p0){
       if (PatchProxy.isSupport(SupportBoldTextPageSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SupportBoldTextPageSlidingTabStrip.class, "2")) {
          return;
       }
       super.setTextColor(p0);
       this.E();
       return;
    }
    public void u(int p0){
       if (PatchProxy.isSupport(SupportBoldTextPageSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SupportBoldTextPageSlidingTabStrip.class, "1")) {
          return;
       }
       super.u(p0);
       this.E();
       return;
    }
}
