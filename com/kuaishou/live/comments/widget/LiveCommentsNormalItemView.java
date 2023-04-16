package com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.content.res.Resources;
import android.view.View;
import qrd.l1;
import android.graphics.drawable.Drawable;
import r81.c;
import android.text.Layout;
import com.lsjwzh.widget.text.FastTextLayoutView;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.graphics.drawable.AnimationDrawable;
import java.util.Iterator;
import android.graphics.drawable.Drawable$Callback;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView$a;
import java.lang.Runnable;
import android.graphics.Canvas;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import k2b.u1;
import java.lang.Integer;
import r81.a;
import msd.a;
import k51.b;
import android.graphics.Rect;
import java.lang.Boolean;

public class LiveCommentsNormalItemView extends FastTextView	// class@000e51
{
    public final int o;
    public c p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Drawable t;
    public Rect u;

    public void LiveCommentsNormalItemView(Context p0){
       super(p0, null);
    }
    public void LiveCommentsNormalItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveCommentsNormalItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = a1.d(0x7f070614) * 2;
       this.q = false;
       this.r = false;
       this.s = false;
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "7")) {
       }else {
          this.getTextPaint().setColor(this.getResources().getColor(R.color.arg_RES_7f061fda));
          this.getTextPaint().setFakeBoldText(false);
       }
       return;
    }
    public static l1 m(LiveCommentsNormalItemView p0,int p1,int p2){
       super.onMeasure(p1, p2);
       if (p0.s == null && !PatchProxy.applyVoid(null, p0, LiveCommentsNormalItemView.class, "13")) {
          LiveCommentsNormalItemView p = p0.p;
          if (p == null || (p.k() != null && p0.p.l() != null)) {
             p = p0.getMeasuredHeight();
             Layout textLayout = p0.getTextLayout();
             LiveCommentsNormalItemView liveComments = (textLayout == null)? null: textLayout.getLineCount();
             if (p0.r != null && p0.p.d() != null) {
                p0.o(p0.p.d());
             }else if(liveComments == 1 && p < p0.o){
                if (p0.q != null && p0.p.l() != null) {
                   p0.o(p0.p.l());
                }else {
                   p0.o(p0.p.k());
                }
             }else {
                p0.o(p0.p.a());
             }
          }
       }
    label_007d :
       return l1.a;
    }
    public final List getTextAnimationDrawableList(){
       ArrayList obj = PatchProxy.apply(null, this, LiveCommentsNormalItemView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       CharSequence text = this.getText();
       if (text instanceof Spannable) {
          int i = 0;
          ImageSpan[] spans = text.getSpans(i, text.length(), ImageSpan.class);
          int len = spans.length;
          while (i < len) {
             Drawable drawable = spans[i].getDrawable();
             if (drawable instanceof AnimationDrawable) {
                obj.add(drawable);
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "8")) {
          return;
       }
       Iterator iterator = this.getTextAnimationDrawableList().iterator();
       while (iterator.hasNext()) {
          AnimationDrawable uAnimationDr = iterator.next();
          uAnimationDr.setCallback(this);
          uAnimationDr.start();
       }
       return;
    }
    public void o(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsNormalItemView.class, "14")) {
          return;
       }
       this.post(new LiveCommentsNormalItemView$a(this, p0));
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.n();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "9")) {
          Iterator iterator = this.getTextAnimationDrawableList().iterator();
          while (iterator.hasNext()) {
             AnimationDrawable uAnimationDr = iterator.next();
             uAnimationDr.stop();
             uAnimationDr.setCallback(null);
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsNormalItemView.class, "11")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e3){
          String str = "onDraw crashed: text = "+this.getText()+", reason = "+e3.getMessage();
          b.B(LiveLogTag.LIVE_EXCEPTION, str);
          u1.R("FastTextViewDrawCrash", str, 3);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveCommentsNormalItemView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveCommentsNormalItemView.class, "12")) {
          return;
       }
       b.b("LiveCommentsNormalItemView::onMeasure", new a(this, p0, p1));
       return;
    }
    public boolean p(boolean p0){
       this.s = p0;
       return p0;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView.class, "5")) {
          return;
       }
       this.setBackground(this.t);
       return;
    }
    public void setBackground(Drawable p0){
       LiveCommentsNormalItemView tu;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsNormalItemView.class, "15")) {
          return;
       }
       this.t = p0;
       if (p0 != null) {
          LiveCommentsNormalItemView tp = this.p;
          if (tp != null && (tp.g() && !this.p.j())) {
             if (this.u == null) {
                this.u = new Rect();
             }
             if (p0.getPadding(this.u)) {
                tu = this.u;
                this.setPadding(tu.left, tu.top, tu.right, tu.bottom);
             }
             tu = null;
          }
       }
       super.setBackground(tu);
       return;
    }
    public void setIs6DpPadding(boolean p0){
       this.r = p0;
    }
    public void setLastPadding2Dp(boolean p0){
       this.q = p0;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsNormalItemView.class, "3")) {
          return;
       }
       super.setText(p0);
       this.n();
       this.setTag(R.id.view_status_tag, "FinalFinish");
       return;
    }
    public void setViewStyle(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsNormalItemView.class, "4")) {
          return;
       }
       this.p = p0;
       this.setTextSize(p0.h());
       this.setClickable(p0.i());
       this.i(p0.e(), 0x3f800000);
       this.q();
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentsNormalItemView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.verifyDrawable(p0) || p0 instanceof AnimationDrawable)? true: false;
       return b;
    }
}
