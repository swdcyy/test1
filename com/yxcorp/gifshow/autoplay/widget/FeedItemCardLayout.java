package com.yxcorp.gifshow.autoplay.widget.FeedItemCardLayout;
import s99.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import com.google.common.collect.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import s99.f;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;

public class FeedItemCardLayout extends FrameLayout implements b	// class@001c42
{
    public final Set b;
    public boolean c;
    public float d;

    public void FeedItemCardLayout(Context p0){
       super(p0, null);
    }
    public void FeedItemCardLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void FeedItemCardLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = o.h();
       this.d = 0xbf800000;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FeedItemCardLayout.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FeedItemCardLayout.class, "2")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(FeedItemCardLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, FeedItemCardLayout.class, "5")) {
             return;
          }
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, FeedItemCardLayout.class, "4")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public boolean g(){
       return this.c;
    }
    public float getItemWeight(){
       return this.d;
    }
    public ViewGroup getParentView(){
       Object obj = PatchProxy.apply(null, this, FeedItemCardLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getParent();
    }
    public View getView(){
       return this;
    }
    public void j(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedItemCardLayout.class, "8")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(FeedItemCardLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FeedItemCardLayout.class, "6")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onScrollStateChanged(p0);
       }
       return;
    }
    public void r(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedItemCardLayout.class, "9")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void setItemWeight(float p0){
       this.d = p0;
    }
    public void setVisionFocus(boolean p0){
       this.c = p0;
    }
    public boolean t(RecyclerView p0,int p1,int p2,int p3,boolean p4){
       Iterator obj;
       if (PatchProxy.isSupport(FeedItemCardLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, FeedItemCardLayout.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 0;
          }
          if (obj.next().t(p0, p1, p2, p3, p4)) {
             break ;
          }
       }
       return 1;
    }
}
