package com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.CharSequence;
import lnc.a1;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import java.util.List;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$a;
import android.view.View$OnClickListener;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import java.lang.Math;
import android.view.View$MeasureSpec;
import java.lang.Number;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$c;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.gzone.widget.a;
import android.text.TextPaint;

public class LiveGzoneProfileTagsView extends ViewGroup	// class@001cfb
{
    public Context b;
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public LiveGzoneProfileTagsView$c m;

    public void LiveGzoneProfileTagsView(Context p0){
       super(p0);
       this.b = p0;
    }
    public void LiveGzoneProfileTagsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = p0;
       this.c(p0, p1);
    }
    public void LiveGzoneProfileTagsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0;
       this.c(p0, p1);
    }
    public static void b(TextView p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveGzoneProfileTagsView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, LiveGzoneProfileTagsView.class, "10")) {
          return;
       }
       p0.setText(p1);
       a.d(ImageRequestBuilder.k(Uri.parse(p2)).a(), new LiveGzoneProfileTagsView$b(p3, a1.e(16.00f), p1, p0));
       return;
    }
    public final View a(List p0){
       Button obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneProfileTagsView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Button(this.b);
       obj.setLayoutParams(new ViewGroup$LayoutParams(a1.e(24.00f), a1.e(24.00f)));
       obj.setBackgroundResource(R.drawable.arg_RES_7f081284);
       if (this.l != null) {
          obj.setRotation(180.00f);
       }else {
          obj.setRotation(0);
       }
       obj.setOnClickListener(new LiveGzoneProfileTagsView$a(this, p0));
       return obj;
    }
    public final void c(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneProfileTagsView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D2);
          this.c = typedArray.getColor(3, this.getResources().getColor(0x7f061db2));
          this.d = typedArray.getDimension(1, (float)n.c(p0, 14.00f));
          this.f = typedArray.getDimensionPixelOffset(5, 0);
          this.g = typedArray.getDimensionPixelOffset(6, 0);
          this.h = typedArray.getDimensionPixelOffset(4, 0);
          this.j = typedArray.getDimensionPixelOffset(2, 0);
          this.i = typedArray.getDimensionPixelOffset(7, 0);
          this.e = typedArray.getResourceId(0, 0);
          typedArray.recycle();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveGzoneProfileTagsView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveGzoneProfileTagsView.class, "5")) {
             return;
          }
       }
       int paddingLeft = this.getPaddingLeft();
       p2 = this.getPaddingTop();
       p3 = p3 - p1;
       p1 = this.getChildCount();
       int i = 0;
       for (p4 = 0; p4 < p1; p4++) {
          View childAt = this.getChildAt(p4);
          int i1 = childAt.getMeasuredWidth() + paddingLeft;
          i1 = i1 + this.getPaddingRight();
          if (p3 < i1) {
             paddingLeft = this.getPaddingLeft();
             p2 = p2 + this.j;
             p2 = p2 + i;
             i = 0;
          }
          i1 = childAt.getMeasuredWidth() + paddingLeft;
          int i2 = childAt.getMeasuredHeight() + p2;
          childAt.layout(paddingLeft, p2, i1, i2);
          paddingLeft = paddingLeft + childAt.getMeasuredWidth();
          paddingLeft = paddingLeft + this.i;
          i = Math.max(i, childAt.getMeasuredHeight());
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveGzoneProfileTagsView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGzoneProfileTagsView.class, "2")) {
          return;
       }
       int childCount = this.getChildCount();
       int i = (View$MeasureSpec.getSize(p0) - this.getPaddingLeft()) - this.getPaddingRight();
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       LiveGzoneProfileTagsView liveGzonePro = 1;
       for (int i1 = 0; i1 < childCount; i1 = i1 + 1) {
          View childAt = this.getChildAt(i1);
          this.measureChild(childAt, p0, p1);
          int i6 = childAt.getMeasuredWidth() + i5;
          if (i < i6) {
             i2 = i2 + this.j;
             i2 = i2 + i3;
             i4 = Math.max(i4, i5);
             i3 = 0;
             i5 = 0;
             liveGzonePro = 1;
          }
          i3 = Math.max(i3, childAt.getMeasuredHeight());
          if (liveGzonePro == null) {
             i5 = i5 + this.i;
          }else {
             liveGzonePro = null;
          }
          i5 = i5 + childAt.getMeasuredWidth();
       }
       i2 = i2 + i3;
       childCount = Math.max(i4, i5);
       if (PatchProxy.isSupport(LiveGzoneProfileTagsView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(childCount), this, LiveGzoneProfileTagsView.class, "3");
          if (obj != patchProxyRe) {
             p0 = obj.intValue();
          label_00b8 :
             if (PatchProxy.isSupport(LiveGzoneProfileTagsView.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p1), Integer.valueOf(i2), this, LiveGzoneProfileTagsView.class, "4");
                if (obj1 != patchProxyRe) {
                   p1 = obj1.intValue();
                label_00fe :
                   this.setMeasuredDimension(p0, p1);
                   return;
                }
             }
             int mode = View$MeasureSpec.getMode(p1);
             p1 = View$MeasureSpec.getSize(p1);
             if (mode != 0x40000000) {
                i2 = (i2 + this.getPaddingTop()) + this.getPaddingBottom();
                p1 = (mode == Integer.MIN_VALUE)? Math.min(i2, p1): i2;
             }
          label_00f6 :
             p1 = Math.max(p1, this.getSuggestedMinimumHeight());
             goto label_00fe ;
          }
       }
       i = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       if (i != 0x40000000) {
          childCount = (childCount + this.getPaddingLeft()) + this.getPaddingRight();
          p0 = (i == Integer.MIN_VALUE)? Math.min(childCount, p0): childCount;
       }
    label_00b0 :
       p0 = Math.max(p0, this.getSuggestedMinimumWidth());
       goto label_00b8 ;
    }
    public void setLinkListener(LiveGzoneProfileTagsView$c p0){
       this.m = p0;
    }
    public void setTags(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneProfileTagsView.class, "6")) {
          return;
       }
       this.removeAllViews();
       if (p0 != null) {
          int i = p0.size();
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          while (i1 < i) {
             LiveGzoneAuthorAuthenticationTagResponse$Tag tag = p0.get(i1);
             TextView textView = PatchProxy.applyOneRefs(tag, this, LiveGzoneProfileTagsView.class, "8");
             if (textView != PatchProxyResult.class) {
             }else {
                LiveGzoneAuthorAuthenticationTagResponse$Tag mTitle = tag.mTitle;
                LiveGzoneAuthorAuthenticationTagResponse$Tag mIcon = tag.mIcon;
                TextView textView1 = new TextView(this.b);
                textView1.setPadding(this.f, 0, this.g, 0);
                textView1.setTextSize(0, this.d);
                textView1.setTextColor(this.c);
                textView1.setEllipsize(TextUtils$TruncateAt.END);
                textView1.setMaxLines(1);
                textView1.setMinHeight(this.h);
                textView1.setIncludeFontPadding(0);
                textView1.setGravity(17);
                LiveGzoneProfileTagsView te = this.e;
                if (te != null) {
                   textView1.setBackgroundResource(te);
                }
                LiveGzoneProfileTagsView.b(textView1, mTitle, mIcon, R.drawable.arg_RES_7f081292);
                if (!TextUtils.isEmpty(tag.mLink) && !PatchProxy.applyVoidTwoRefs(textView1, tag, this, LiveGzoneProfileTagsView.class, "9")) {
                   textView1.setCompoundDrawablesWithIntrinsicBounds(null, null, a1.f(R.drawable.arg_RES_7f081260), null);
                   textView1.setOnClickListener(new a(this, tag));
                }
                textView = textView1;
             }
             int i4 = textView.getPaddingLeft() + textView.getPaddingRight();
             float f = textView.getPaint().measureText(p0.get(i1).mTitle) + (float)i4;
             f = f + (float)a1.e(20.00f);
             float f1 = 24.00f;
             if (p0.size() > 1 && !i1) {
                LiveGzoneProfileTagsView tk = this.k;
                if (f - (float)tk > 0) {
                   i4 = tk - a1.e(f1);
                   i4 = i4 - this.i;
                   textView.setMaxWidth(i4);
                   this.addView(textView);
                   this.a(p0);
                   i3 = 1;
                label_0123 :
                   i1 = i1 + 1;
                }
             }
             float f2 = (float)i2;
             float f3 = f2 + f;
             if (f3 - (float)this.k > 0 && !i3) {
                View view = this.a(p0);
                if (this.getChildCount() >= 2) {
                   i2 = i2 + a1.e(f1);
                   if (i2 > this.k) {
                      i2 = this.getChildCount() - 1;
                      this.addView(view, i2);
                      if (this.l == null) {
                         i2 = this.getChildCount() - 1;
                         this.removeViewAt(i2);
                      }
                   }else {
                   label_0111 :
                      this.addView(view);
                   }
                }else {
                   goto label_0111 ;
                }
                if (this.l != null) {
                   i3 = 1;
                }
             }
             this.addView(textView);
             f = f + (float)this.i;
             f2 = f2 + f;
             i2 = (int)f2;
             goto label_0123 ;
          }
       }
       return;
    }
    public void setWidth(int p0){
       this.k = p0;
    }
}
