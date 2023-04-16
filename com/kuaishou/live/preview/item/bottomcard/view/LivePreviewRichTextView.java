package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewRichTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import bc.b;
import java.lang.CharSequence;

public class LivePreviewRichTextView extends FastTextView	// class@000da5
{
    public b o;
    public boolean p;

    public void LivePreviewRichTextView(Context p0){
       super(p0, null);
    }
    public void LivePreviewRichTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewRichTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = false;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRichTextView.class, "7")) {
          return;
       }
       LivePreviewRichTextView to = this.o;
       if (to != null) {
          to.a(this);
       }
       this.o = null;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRichTextView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.p = true;
       LivePreviewRichTextView to = this.o;
       if (to != null) {
          to.b(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRichTextView.class, "3")) {
          return;
       }
       this.p = false;
       LivePreviewRichTextView to = this.o;
       if (to != null) {
          to.a(this);
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRichTextView.class, "2")) {
          return;
       }
       super.onFinishTemporaryDetach();
       this.p = true;
       LivePreviewRichTextView to = this.o;
       if (to != null) {
          to.b(this);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRichTextView.class, "4")) {
          return;
       }
       this.p = false;
       LivePreviewRichTextView to = this.o;
       if (to != null) {
          to.a(this);
       }
       super.onStartTemporaryDetach();
       return;
    }
    public final void setDraweeSpanStringBuilder(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewRichTextView.class, "5")) {
          return;
       }
       if (this.o != p0) {
          this.m();
       }
       this.o = p0;
       if (p0 != null && this.p != null) {
          p0.b(this);
       }
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewRichTextView.class, "6")) {
          return;
       }
       super.setText(p0);
       if (p0 instanceof b) {
          this.setDraweeSpanStringBuilder(p0);
       }else {
          this.m();
       }
       return;
    }
}
