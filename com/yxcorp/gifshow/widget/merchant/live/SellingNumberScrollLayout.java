package com.yxcorp.gifshow.widget.merchant.live.SellingNumberScrollLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.merchant.live.TextLoopSwitcher;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import hzc.a;
import android.widget.ViewSwitcher$ViewFactory;
import android.widget.TextSwitcher;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Boolean;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.yxcorp.utility.TextUtils;
import lnc.o5;

public class SellingNumberScrollLayout extends LinearLayout	// class@001997
{
    public Context b;
    public int c;
    public boolean d;
    public long e;
    public int f;

    public void SellingNumberScrollLayout(Context p0){
       super(p0, null);
    }
    public void SellingNumberScrollLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SellingNumberScrollLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x7f0d0153;
       this.d = true;
       this.e = 250;
       this.b = p0;
       if (PatchProxy.applyVoidOneRefs(p0, this, SellingNumberScrollLayout.class, "1")) {
       }else {
          this.setOrientation(0);
          this.f = this.getAnimDurationMillisDivisor();
       }
       return;
    }
    public final TextLoopSwitcher b(int p0){
       TextLoopSwitcher obj;
       if (PatchProxy.isSupport(SellingNumberScrollLayout.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SellingNumberScrollLayout.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new TextLoopSwitcher(this.b);
       obj.setAnimDurationMillisDivisor(this.f);
       obj.setFactory(new a(this, p0));
       return obj;
    }
    public void c(TextView p0){
    }
    public void e(CharSequence p0,long p1,boolean p2,int p3,boolean p4){
       int i2;
       long l1;
       if (PatchProxy.isSupport(SellingNumberScrollLayout.class)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SellingNumberScrollLayout.class, "5")) {
             return;
          }
       }
       if (this.getChildCount() < p0.length()) {
          for (int childCount = this.getChildCount(); childCount < p0.length(); childCount++) {
             TextLoopSwitcher textLoopSwit = this.b(p3);
             long l = p1 / 2;
             textLoopSwit.a(l, p2);
             textLoopSwit.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
             this.addView(textLoopSwit, 0);
          }
       }else if(this.getChildCount() > p0.length() && p4){
          for (p3 = this.getChildCount() - p0.length(); p3; p3--) {
             this.removeViewAt(0);
          }
       }
       p3 = 0;
       while (p3 < p0.length()) {
          TextLoopSwitcher childAt = this.getChildAt(p3);
          TextView currentView = childAt.getCurrentView();
          if (TextUtils.x(currentView.getText())) {
             childAt.a(p1, p2);
             childAt.setText(String.valueOf(p0.charAt(p3)));
          }else {
             int i = o5.b((currentView.getText().toString()).trim(), 0);
             int i1 = o5.b(String.valueOf(p0.charAt(p3)), 0);
             if (i1 > i) {
                i2 = i1 - i;
                l1 = p1 / (long)i2;
                l1 = l1 / (long)this.f;
                childAt.b(i, i1, l1);
             }else if(i1 < i){
                i2 = i1 + 10;
                i2 = i2 - i;
                l1 = p1 / (long)i2;
                l1 = l1 / (long)this.f;
                childAt.b(i, i1, l1);
             }
          }
          p3++;
       }
       return;
    }
    public long getAnimDurationMillis(){
       return this.e;
    }
    public int getAnimDurationMillisDivisor(){
       return 2;
    }
    public int getTextViewResId(){
       return this.c;
    }
    public void setAnimDurationMillis(long p0){
       this.e = p0;
    }
    public void setCurrentText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SellingNumberScrollLayout.class, "7")) {
          return;
       }
       SellingNumberScrollLayout tc = this.c;
       if (!PatchProxy.isSupport(SellingNumberScrollLayout.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), this, SellingNumberScrollLayout.class, "6")) {
          int i = 0;
          if (this.getChildCount() < p0.length()) {
             for (int childCount = this.getChildCount(); childCount < p0.length(); childCount = childCount + 1) {
                TextLoopSwitcher textLoopSwit = this.b(tc);
                textLoopSwit.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
                this.addView(textLoopSwit, i);
             }
          }
          while (i < p0.length()) {
             this.getChildAt(i).setCurrentText(String.valueOf(p0.charAt(i)));
             i = i + 1;
          }
       }
       return;
    }
    public void setIsDownToUp(boolean p0){
       this.d = p0;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SellingNumberScrollLayout.class, "2")) {
          return;
       }
       this.e(p0, this.e, this.d, this.c, false);
       return;
    }
    public void setTextViewResId(int p0){
       this.c = p0;
    }
}
