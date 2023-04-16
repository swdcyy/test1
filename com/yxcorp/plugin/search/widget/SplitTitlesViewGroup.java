package com.yxcorp.plugin.search.widget.SplitTitlesViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.widget.SplitTitlesViewGroup$a;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.lang.Boolean;
import android.text.Layout;
import java.util.List;
import android.view.ViewGroup$LayoutParams;

public final class SplitTitlesViewGroup extends LinearLayout	// class@0007f2
{
    public SplitTitlesViewGroup$a b;
    public SplitTitlesViewGroup$a c;

    public void SplitTitlesViewGroup(Context p0){
       super(p0, null);
    }
    public void SplitTitlesViewGroup(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SplitTitlesViewGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, 0);
    }
    public final Pair a(Context p0){
       SplitTitlesViewGroup obj = PatchProxy.applyOneRefs(p0, this, SplitTitlesViewGroup.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       Pair pair = (obj == null)? null: obj.createView(p0);
       return pair;
    }
    public final int b(String p0,int p1){
       if (PatchProxy.isSupport(SplitTitlesViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, SplitTitlesViewGroup.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!TextUtils.isEmpty(p0) && p1 < this.getChildCount()) {
          this.getChildAt(p1).setText(p0);
          p1++;
       }
       return p1;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SplitTitlesViewGroup.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SplitTitlesViewGroup.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       int i = this.getChildCount() - 1;
       while (i >= 1) {
          View childAt = this.getChildAt(i);
          p2 = i - 1;
          View childAt1 = this.getChildAt(p2);
          if (childAt instanceof TextView && !childAt.getVisibility()) {
             View view = childAt;
             p4 = view.getLayout().getEllipsisCount(0);
             CharSequence text = view.getText();
             if (p4 && text.length() == p4) {
                text = 8;
                childAt.setVisibility(text);
                childAt1.setVisibility(text);
             }
          }
          i = i - 2;
       }
       return;
    }
    public void setLineViewFactory(SplitTitlesViewGroup$a p0){
       this.c = p0;
    }
    public void setTextViewFactory(SplitTitlesViewGroup$a p0){
       this.b = p0;
    }
    public void setTexts(List p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplitTitlesViewGroup.class, "3")) {
          return;
       }
       if (p0.size() > 0) {
          Context context = this.getContext();
          if (!PatchProxy.applyVoidOneRefs(context, this, SplitTitlesViewGroup.class, "1") && this.getChildCount() <= 0) {
             Pair pair = this.a(context);
             if (pair != null) {
                this.addView(pair.first, pair.second);
             }
             SplitTitlesViewGroup obj = PatchProxy.applyOneRefs(context, this, SplitTitlesViewGroup.class, "6");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = this.c;
                obj = (obj == null)? null: obj.createView(context);
             }
             if (obj != null) {
                this.addView(obj.first, obj.second);
             }
             Pair pair1 = this.a(context);
             if (pair1 != null) {
                this.addView(pair1.first, pair1.second);
             }
          }
       }
       int i = 1;
       if (p0.size() == i) {
          i1 = this.b(p0.get(0), 0);
       }else {
          int i3 = 2;
          if (p0.size() >= i3) {
             String str = p0.get(i);
             if (!this.b(p0.get(0), 0)) {
                i3 = 0;
             }
             i1 = this.b(str, i3);
          }else {
             i1 = 0;
          }
       }
       for (int i2 = i1; i2 < this.getChildCount(); i2 = i2 + 1) {
          this.getChildAt(i2).setVisibility(8);
       }
       for (i2 = 0; i2 < i1; i2 = i2 + 1) {
          this.getChildAt(i2).setVisibility(0);
       }
       return;
    }
}
