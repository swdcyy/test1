package com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import c79.c$a;
import c79.c;
import java.lang.Integer;
import java.lang.Float;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.imageloader.CompatImageView$a;
import com.yxcorp.gifshow.album.imageloader.CompatImageView$a$a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import java.util.Objects;
import android.content.res.Resources;
import android.widget.ImageView$ScaleType;

public class CompatImageView extends KwaiImageView	// class@001a1f
{
    public c x;
    public HashMap y;

    public void CompatImageView(Context p0){
       a.q(p0, "context");
       super(p0);
       this.r(p0, null);
    }
    public void CompatImageView(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
       this.r(p0, p1);
    }
    public void CompatImageView(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       super(p0, p1, p2);
       this.r(p0, p1);
    }
    private final void r(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CompatImageView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W);
          a.h(typedArray, "context.obtainStyledAttr¡­tyleable.CompatImageView\)");
          c$a uoa = new c$a();
          uoa.h(typedArray.getInt(0, -1));
          uoa.g(typedArray.getDrawable(3));
          uoa.b(typedArray.getInt(2, -1));
          uoa.c(typedArray.getDimension(1, 0));
          this.x = uoa.a();
          typedArray.recycle();
       }
       return;
    }
    public final c getXmlParams(){
       return this.x;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, CompatImageView.class, "5")) {
          return;
       }
       if (this.x == null) {
          this.x = new c$a().a();
       }
       return;
    }
    public final void q0(int p0,float p1){
       a hierarchy;
       if (PatchProxy.isSupport(CompatImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, CompatImageView.class, "6")) {
          return;
       }
       this.setBackgroundColor(0);
       CompatImageView$a$a e = CompatImageView$a.e;
       if (p0 == e.b()) {
          hierarchy = this.getHierarchy();
          a.h(hierarchy, "hierarchy");
          hierarchy.u(t$b.e);
       }else {
          Objects.requireNonNull(e);
          if (p0 == CompatImageView$a.b) {
             if (p1 - (float)1 > 0) {
                hierarchy = this.getHierarchy();
                a.h(hierarchy, "hierarchy");
                hierarchy.u(t$b.e);
                this.setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f060b22));
             }else {
                hierarchy = this.getHierarchy();
                a.h(hierarchy, "hierarchy");
                hierarchy.u(t$b.i);
             }
          }else {
             Objects.requireNonNull(e);
             if (p0 == CompatImageView$a.c) {
                if (p1 - (float)0 > 0 && p1 - (float)1 < 0) {
                   hierarchy = this.getHierarchy();
                   a.h(hierarchy, "hierarchy");
                   hierarchy.u(t$b.e);
                   this.setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f060b22));
                }else {
                   hierarchy = this.getHierarchy();
                   a.h(hierarchy, "hierarchy");
                   hierarchy.u(t$b.i);
                }
             }else {
                Objects.requireNonNull(e);
                if (!p0) {
                   hierarchy = this.getHierarchy();
                   a.h(hierarchy, "hierarchy");
                   hierarchy.u(t$b.i);
                }else if(p0 == e.a()){
                   hierarchy = this.getHierarchy();
                   a.h(hierarchy, "hierarchy");
                   hierarchy.u(t$b.h);
                }else {
                   hierarchy = this.getHierarchy();
                   a.h(hierarchy, "hierarchy");
                   hierarchy.u(t$b.i);
                }
             }
          }
       }
       this.r0();
       return;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, CompatImageView.class, "8")) {
          return;
       }
       a hierarchy = this.getHierarchy();
       a.h(hierarchy, "hierarchy");
       t$b uob = hierarchy.l();
       if (a.g(uob, t$b.e)) {
          this.setScaleType(ImageView$ScaleType.FIT_CENTER);
       }else if(a.g(uob, t$b.i)){
          this.setScaleType(ImageView$ScaleType.CENTER_CROP);
       }else if(a.g(uob, t$b.h)){
          this.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       }
       return;
    }
    public final void setActualImageScaleType(int p0){
       a hierarchy;
       if (PatchProxy.isSupport(CompatImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CompatImageView.class, "7")) {
          return;
       }
       CompatImageView$a$a e = CompatImageView$a.e;
       if (p0 == e.b()) {
          hierarchy = this.getHierarchy();
          a.h(hierarchy, "hierarchy");
          hierarchy.u(t$b.e);
       }else {
          Objects.requireNonNull(e);
          if (!p0) {
             hierarchy = this.getHierarchy();
             a.h(hierarchy, "hierarchy");
             hierarchy.u(t$b.i);
          }else if(p0 == e.a()){
             hierarchy = this.getHierarchy();
             a.h(hierarchy, "hierarchy");
             hierarchy.u(t$b.h);
          }
       }
       this.r0();
       return;
    }
    public final void setActualScaleType(int p0){
       if (PatchProxy.isSupport(CompatImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CompatImageView.class, "3")) {
          return;
       }
       this.p0();
       CompatImageView tx = this.x;
       if (tx != null) {
          tx.v(p0);
       }
       return;
    }
    public final void setCornerRadius(float p0){
       if (PatchProxy.isSupport(CompatImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CompatImageView.class, "4")) {
          return;
       }
       this.p0();
       CompatImageView tx = this.x;
       if (tx != null) {
          tx.q(p0);
       }
       return;
    }
    public final void setPlaceholder(int p0){
       if (PatchProxy.isSupport(CompatImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CompatImageView.class, "2")) {
          return;
       }
       this.p0();
       CompatImageView tx = this.x;
       if (tx != null) {
          Resources resources = this.getResources();
          Drawable drawable = (resources != null)? resources.getDrawable(p0): null;
          tx.u(drawable);
       }
       return;
    }
}
