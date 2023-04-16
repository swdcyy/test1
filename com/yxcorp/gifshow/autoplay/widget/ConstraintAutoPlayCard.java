package com.yxcorp.gifshow.autoplay.widget.ConstraintAutoPlayCard;
import ba9.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.autoplay.widget.ConstraintAutoPlayCard$a;
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

public final class ConstraintAutoPlayCard extends ConstraintLayout implements a	// class@001c40
{
    public final List B;
    public boolean C;
    public boolean D;
    public float E;
    public int F;
    public g G;
    public final List H;
    public static final ConstraintAutoPlayCard$a I;

    static {
       ConstraintAutoPlayCard.I = new ConstraintAutoPlayCard$a(null);
    }
    public void ConstraintAutoPlayCard(Context p0){
       a.p(p0, "context");
       super(p0);
       this.B = new ArrayList();
       this.E = 0xbf800000;
       this.H = new ArrayList();
    }
    public void ConstraintAutoPlayCard(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.B = new ArrayList();
       this.E = 0xbf800000;
       this.H = new ArrayList();
    }
    public void ConstraintAutoPlayCard(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.B = new ArrayList();
       this.E = 0xbf800000;
       this.H = new ArrayList();
    }
    public void A(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "5")) {
          return;
       }
       ConstraintAutoPlayCard tB = this.B;
       Objects.requireNonNull(tB, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(tB).remove(p0);
       return;
    }
    public void B(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "8")) {
          return;
       }
       a.p(p0, "interceptor");
       this.H.add(p0);
       return;
    }
    public void E(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       a$a.a(this, p0);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ConstraintAutoPlayCard.class, "1")) {
          return;
       }
       d.d("ConstraintAutoPlayCard", "onAttached");
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ConstraintAutoPlayCard.class, "2")) {
          return;
       }
       d.d("ConstraintAutoPlayCard", "onDetached");
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public boolean g(){
       return this.C;
    }
    public g getAutoPlayModule(){
       return this.G;
    }
    public float getItemWeight(){
       return this.E;
    }
    public List getListeners(){
       return this.B;
    }
    public List getMCardVisionFocusListeners(){
       Object obj = PatchProxy.apply(null, this, ConstraintAutoPlayCard.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.b(this);
    }
    public ViewGroup getParentView(){
       ViewParent obj = PatchProxy.apply(null, this, ConstraintAutoPlayCard.class, "3");
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
    public ConstraintAutoPlayCard getView(){
       return this;
    }
    public int getVisibleIndex(){
       return this.F;
    }
    public boolean k(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ConstraintAutoPlayCard.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.H.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          a.m(p0);
          if (obj.next().a(p0)) {
             break ;
          }
       }
       d.g("ConstraintAutoPlayCard", "canStartAutoPlayCard", "intercept", p0);
       return false;
    }
    public boolean l(){
       return this.D;
    }
    public void o(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       a$a.c(this, p0);
       return;
    }
    public void q(){
       this.G = null;
    }
    public void setAutoPlayModule(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "7")) {
          return;
       }
       a.p(p0, "player");
       this.G = p0;
       return;
    }
    public void setBizVisionFocus(boolean p0){
       this.D = p0;
    }
    public void setItemWeight(float p0){
       this.E = p0;
    }
    public void setVisibleIndex(int p0){
       this.F = p0;
    }
    public void setVisionFocus(boolean p0){
       if (PatchProxy.isSupport(ConstraintAutoPlayCard.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ConstraintAutoPlayCard.class, "6")) {
          return;
       }
       if (this.C != p0) {
          this.C = p0;
          Iterator iterator = this.getMCardVisionFocusListeners().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
    public void v(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "9")) {
          return;
       }
       ConstraintAutoPlayCard tH = this.H;
       Objects.requireNonNull(tH, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(tH).remove(p0);
       return;
    }
    public void y(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintAutoPlayCard.class, "4")) {
          return;
       }
       a.p(p0, "autoPlayCardListener");
       this.B.add(p0);
       return;
    }
}
