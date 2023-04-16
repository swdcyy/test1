package com.kuaishou.merchant.basic.widget.AutoFitIconView;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import com.kuaishou.merchant.basic.util.d;
import android.text.SpannableStringBuilder;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel$Style;
import ekd.j;

public class AutoFitIconView extends AutoFitRowsView	// class@0015ea
{
    public List o;
    public List p;

    public void AutoFitIconView(Context p0){
       super(p0, null);
    }
    public void AutoFitIconView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void AutoFitIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = new ArrayList();
       this.p = new ArrayList();
    }
    public final int f(TextView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AutoFitIconView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && !TextUtils.x(p1)) {
          return (int)p0.getPaint().measureText(p1);
       }
       return 0;
    }
    public final TextView getTextView(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, AutoFitIconView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.p)) {
          objArray = this.p.remove(0);
       }
       if (objArray == null) {
          objArray = this.getTextViewWithStyle();
       }
       this.addView(objArray, new ViewGroup$LayoutParams(-2, -1));
       this.o.add(objArray);
       return objArray;
    }
    public final TextView getTextViewWithStyle(){
       TextView obj = PatchProxy.apply(null, this, AutoFitIconView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(this.getContext());
       obj.setTextSize(1, 12.00f);
       obj.setSingleLine(1);
       obj.setIncludeFontPadding(false);
       obj.setGravity(16);
       obj.setTextColor(a1.a(R.color.arg_RES_7f061a83));
       return obj;
    }
    public void setTagView(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoFitIconView.class, "2")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          TextView textView = iterator.next();
          this.removeView(textView);
          this.p.add(textView);
       }
       this.o.clear();
       int i = 0;
       while (i < p0.size()) {
          Commodity$IconLabel iconLabel = p0.get(i);
          if (!PatchProxy.applyVoidOneRefs(iconLabel, this, AutoFitIconView.class, "8") && iconLabel != null) {
             TextView textView1 = (q.f(this.p))? null: this.p.remove(0);
             int i1 = 1;
             if (textView1 != null) {
                Commodity$IconLabel[] iconLabelArr = new Commodity$IconLabel[i1];
                iconLabelArr[0] = iconLabel;
                textView1.setText(d.m(iconLabelArr));
             }else {
                textView1 = PatchProxy.applyOneRefs(iconLabel, this, AutoFitIconView.class, "9");
                if (textView1 != PatchProxyResult.class) {
                }else {
                   textView1 = new TextView(this.getContext());
                   SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                   textView1.setGravity(17);
                   textView1.setIncludeFontPadding(0);
                   Commodity$IconLabel[] iconLabelArr1 = new Commodity$IconLabel[i1];
                   iconLabelArr1[0] = iconLabel;
                   spannableStr.append(d.m(iconLabelArr1));
                   textView1.setText(spannableStr);
                   iconLabel = iconLabel.mStyle;
                   if (iconLabel != null) {
                      Commodity$IconLabel$Style mTagHeight = iconLabel.mTagHeight;
                      if (mTagHeight != null) {
                         textView1.setTextSize(i1, (float)mTagHeight);
                      }
                   }
                }
             }
             this.addView(textView1, new ViewGroup$LayoutParams(-2, -1));
             this.o.add(textView1);
          }
          i = i + 1;
       }
       return;
    }
    public void setTagView(Commodity$IconLabel[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AutoFitIconView.class, "1")) {
          return;
       }
       if (j.h(p0)) {
          return;
       }
       this.setTagView(j.a(p0));
       return;
    }
}
