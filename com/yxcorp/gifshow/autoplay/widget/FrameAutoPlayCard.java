package com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import ba9.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.util.AttributeSet;
import s99.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;
import s99.d;
import java.util.List;
import s99.g;
import ba9.a$a;
import u99.d;
import java.util.Iterator;
import w99.g;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View;
import java.lang.Boolean;

public final class FrameAutoPlayCard extends FrameLayout implements a	// class@001c45
{
    public final List b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public g g;
    public final List h;
    public static final FrameAutoPlayCard$a i;

    static {
       FrameAutoPlayCard.i = new FrameAutoPlayCard$a(null);
    }
    public void FrameAutoPlayCard(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = new ArrayList();
       this.e = 0xbf800000;
       this.h = new ArrayList();
    }
    public void FrameAutoPlayCard(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = new ArrayList();
       this.e = 0xbf800000;
       this.h = new ArrayList();
    }
    public void FrameAutoPlayCard(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.e = 0xbf800000;
       this.h = new ArrayList();
    }
    public void A(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "5")) {
          return;
       }
       FrameAutoPlayCard tb = this.b;
       Objects.requireNonNull(tb, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(tb).remove(p0);
       return;
    }
    public void B(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "8")) {
          return;
       }
       a.p(p0, "interceptor");
       this.h.add(p0);
       return;
    }
    public void E(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       a$a.a(this, p0);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FrameAutoPlayCard.class, "1")) {
          return;
       }
       d.d("FrameAutoPlayCard", "onAttached");
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FrameAutoPlayCard.class, "2")) {
          return;
       }
       d.d("FrameAutoPlayCard", "onDetached");
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public boolean g(){
       return this.c;
    }
    public g getAutoPlayModule(){
       return this.g;
    }
    public float getItemWeight(){
       return this.e;
    }
    public List getListeners(){
       return this.b;
    }
    public List getMCardVisionFocusListeners(){
       Object obj = PatchProxy.apply(null, this, FrameAutoPlayCard.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.b(this);
    }
    public ViewGroup getParentView(){
       ViewParent obj = PatchProxy.apply(null, this, FrameAutoPlayCard.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParent();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public View getView(){
       return this.getView();
    }
    public FrameAutoPlayCard getView(){
       return this;
    }
    public int getVisibleIndex(){
       return this.f;
    }
    public boolean k(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, FrameAutoPlayCard.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          a.m(p0);
          if (obj.next().a(p0)) {
             break ;
          }
       }
       d.g("FrameAutoPlayCard", "canStartAutoPlayCard", "intercept", p0);
       return false;
    }
    public boolean l(){
       return this.d;
    }
    public void o(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       a$a.c(this, p0);
       return;
    }
    public void q(){
       this.g = null;
    }
    public void setAutoPlayModule(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "7")) {
          return;
       }
       a.p(p0, "player");
       this.g = p0;
       return;
    }
    public void setBizVisionFocus(boolean p0){
       this.d = p0;
    }
    public void setItemWeight(float p0){
       this.e = p0;
    }
    public void setVisibleIndex(int p0){
       this.f = p0;
    }
    public void setVisionFocus(boolean p0){
       if (PatchProxy.isSupport(FrameAutoPlayCard.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FrameAutoPlayCard.class, "6")) {
          return;
       }
       if (this.c != p0) {
          this.c = p0;
          Iterator iterator = this.getMCardVisionFocusListeners().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
    public void v(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "9")) {
          return;
       }
       FrameAutoPlayCard th = this.h;
       Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(th).remove(p0);
       return;
    }
    public void y(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrameAutoPlayCard.class, "4")) {
          return;
       }
       a.p(p0, "autoPlayCardListener");
       this.b.add(p0);
       return;
    }
}
