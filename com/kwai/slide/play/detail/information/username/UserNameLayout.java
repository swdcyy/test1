package com.kwai.slide.play.detail.information.username.UserNameLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import java.util.Map;
import android.widget.TextView;
import android.view.ContextThemeWrapper;
import qrd.l1;
import android.text.TextUtils$TruncateAt;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import rnc.i;
import java.lang.StringBuilder;

public final class UserNameLayout extends LinearLayout	// class@001828
{
    public int[] b;
    public LinkedHashMap c;
    public final TextView d;
    public ImageView e;
    public KwaiImageView f;
    public AppCompatTextView g;
    public AppCompatTextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public HashMap m;

    public void UserNameLayout(Context p0){
       super(p0, null, 2, null);
    }
    public void UserNameLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       int[] ointArray = new int[0];
       this.b = ointArray;
       this.c = new LinkedHashMap();
       this.setId(R.id.username_group);
       this.setGravity(16);
       this.setOrientation(0);
       this.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       this.c.put(Integer.valueOf(R.id.user_name_text_view), null);
       this.c.put(Integer.valueOf(R.id.vip_badge), null);
       this.c.put(Integer.valueOf(R.id.activity_user_icon), null);
       this.c.put(Integer.valueOf(R.id.co_create_text), null);
       this.c.put(Integer.valueOf(R.id.pic_text), null);
       this.c.put(Integer.valueOf(R.id.divide_dot_tv_visible), null);
       this.c.put(Integer.valueOf(R.id.video_visible_limit_tv), null);
       this.c.put(Integer.valueOf(R.id.divide_dot_tv_time), null);
       this.c.put(Integer.valueOf(R.id.create_date_tv), null);
       TextView textView = new TextView(new ContextThemeWrapper(p0, 0x7f040057));
       textView.setId(R.id.user_name_text_view);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 16;
       textView.setLayoutParams(layoutParams);
       textView.setEllipsize(TextUtils$TruncateAt.END);
       textView.setGravity(16);
       textView.setIncludeFontPadding(0);
       textView.setMaxEms(13);
       textView.setSingleLine();
       textView.setTextColor(ContextCompat.getColorStateList(p0, R.color.arg_RES_7f061c32));
       textView.setTextSize(18.00f);
       this.a(textView);
       this.d = textView;
    }
    public void UserNameLayout(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameLayout.class, "13")) {
          return;
       }
       int i = 0;
       Iterator iterator = this.c.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey().intValue() == p0.getId()) {
             break ;
          }else if(uEntry.getValue() != null){
             i = i + 1;
          }
       }
       this.addView(p0, i);
       this.c.put(Integer.valueOf(p0.getId()), p0);
       return;
    }
    public final int b(int p0){
       if (PatchProxy.isSupport(UserNameLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, UserNameLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a1.e((float)p0);
    }
    public final void c(View p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(UserNameLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, UserNameLayout.class, "16")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       p0.measure(View$MeasureSpec.makeMeasureSpec(Math.max(0, ((p1 - layoutParams.leftMargin) - layoutParams.rightMargin)), 0x40000000), LinearLayout.getChildMeasureSpec(p2, ((((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin) + p3), layoutParams.height));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, UserNameLayout.class, "5")) {
          return;
       }
       UserNameLayout tf = this.f;
       if (tf == null) {
          tf = new KwaiImageView(this.getContext());
          tf.setId(R.id.activity_user_icon);
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.d(0x7f070295), a1.d(0x7f070295));
          layoutParams.gravity = 16;
          layoutParams.setMarginStart(a1.e(4.00f));
          tf.setLayoutParams(layoutParams);
          tf.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
          tf.setVisibility(8);
          this.a(tf);
       }
       this.f = tf;
       return;
    }
    public void measureChildWithMargins(View p0,int p1,int p2,int p3,int p4){
       int i = 1;
       if (PatchProxy.isSupport(UserNameLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, UserNameLayout.class, "15")) {
             return;
          }
       }
       a.p(p0, "child");
       UserNameLayout tb = this.b;
       if (tb.length) {
          i = 0;
       }
       if (i) {
          super.measureChildWithMargins(p0, p1, p2, p3, p4);
          return;
       }else {
          this.c(p0, tb[this.indexOfChild(p0)], p3, p4);
          if (a.g(p0, this.d)) {
             Layout layout = this.d.getLayout();
             if (layout != null) {
                CharSequence text = layout.getText();
                if (text != null && !TextUtils.equals(text, this.d.getTag(0x7f0a2f43))) {
                   this.c(p0, (int)this.d.getPaint().measureText(text.toString()), p3, p4);
                }
             }
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       int i3;
       UserNameLayout tb3;
       if (PatchProxy.isSupport(UserNameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, UserNameLayout.class, "14")) {
          return;
       }
       int childCount = this.getChildCount();
       if (this.b.length != childCount) {
          int[] ointArray = new int[childCount];
          this.b = ointArray;
       }
       int i = 0;
       int i1 = 0;
       int i2 = -1;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt != null && childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
             LinearLayout$LayoutParams width = layoutParams.width;
             i3 = -2;
             if (width != i3) {
                i2 = (width != i2)? View$MeasureSpec.makeMeasureSpec(width, 0x40000000): View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(p1), i);
             }else {
                i2 = LinearLayout.getChildMeasureSpec(p0, i, i3);
             }
             childAt.measure(i2, i2);
             i2 = childAt.getMeasuredWidth() + layoutParams.leftMargin;
             i2 = i2 + layoutParams.rightMargin;
             this.b[i1] = i2;
          }else {
             this.b[i1] = i;
          }
          i1 = i1 + 1;
       }
       UserNameLayout tb = this.b;
       i1 = tb.length;
       int i5 = 0;
       for (int i4 = 0; i4 < i1; i4 = i4 + 1) {
          i5 = i5 + tb[i4];
       }
       childCount = (View$MeasureSpec.getSize(p0) - this.getPaddingLeft()) - this.getPaddingRight();
       if (i5 > childCount) {
          if (this.d.getText() != null) {
             i4 = 0x7f0a2f43;
             if (this.d.getTag(i4) != null) {
                String tag = this.d.getTag(i4);
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.CharSequence");
                String str = "бн";
                i3 = 2;
                if (tag.length() > i3 && i.e(tag.charAt(1))) {
                   tag = i.j(this.d.getText()).subSequence(i, 3).toString()+str;
                }else if(tag.length() > i3 && !i.e(tag.charAt(1))){
                   tag = i.j(this.d.getText()).subSequence(i, i3).toString()+str;
                }else {
                   tag = "";
                }
                i5 = i5 - childCount;
                childCount = this.indexOfChild(this.d);
                UserNameLayout tb1 = this.b;
                if ((tb1[childCount] - (int)this.d.getPaint().measureText(tag)) > i5) {
                   tb1[childCount] = tb1[childCount] - i5;
                }else {
                   i1 = this.indexOfChild(this.i);
                   i4 = this.indexOfChild(this.j);
                   if (i1 != i2) {
                      UserNameLayout tb2 = this.b;
                      i5 = i5 - tb2[i1];
                      tb2[i1] = i;
                   }
                   if (i4 != i2) {
                      tb3 = this.b;
                      i5 = i5 - tb3[i4];
                      tb3[i4] = i;
                   }
                   tb3 = this.b;
                   tb3[childCount] = Math.max((tb3[childCount] - i5), i);
                }
             }
          }
          super.onMeasure(p0, p1);
          return;
       }
       super.onMeasure(p0, p1);
       return;
    }
}
