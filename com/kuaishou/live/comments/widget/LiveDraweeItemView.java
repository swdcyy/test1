package com.kuaishou.live.comments.widget.LiveDraweeItemView;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import bc.b;
import java.lang.CharSequence;

public class LiveDraweeItemView extends LiveCommentsNormalItemView	// class@000e52
{
    public b v;
    public boolean w;

    public void LiveDraweeItemView(Context p0){
       super(p0);
       this.w = false;
    }
    public void LiveDraweeItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = false;
    }
    public void LiveDraweeItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = false;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveDraweeItemView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.w = true;
       LiveDraweeItemView tv = this.v;
       if (tv != null) {
          tv.b(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveDraweeItemView.class, "3")) {
          return;
       }
       this.w = false;
       LiveDraweeItemView tv = this.v;
       if (tv != null) {
          tv.a(this);
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LiveDraweeItemView.class, "2")) {
          return;
       }
       super.onFinishTemporaryDetach();
       this.w = true;
       LiveDraweeItemView tv = this.v;
       if (tv != null) {
          tv.b(this);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LiveDraweeItemView.class, "4")) {
          return;
       }
       this.w = false;
       LiveDraweeItemView tv = this.v;
       if (tv != null) {
          tv.a(this);
       }
       super.onStartTemporaryDetach();
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveDraweeItemView.class, "7")) {
          return;
       }
       LiveDraweeItemView tv = this.v;
       if (tv != null) {
          tv.a(this);
       }
       this.v = null;
       return;
    }
    public final void setDraweeSpanStringBuilder(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDraweeItemView.class, "5")) {
          return;
       }
       if (this.v != p0) {
          this.r();
       }
       this.v = p0;
       if (p0 != null && this.w != null) {
          p0.b(this);
       }
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDraweeItemView.class, "6")) {
          return;
       }
       super.setText(p0);
       if (p0 instanceof b) {
          this.setDraweeSpanStringBuilder(p0);
       }else {
          this.r();
       }
       return;
    }
}
