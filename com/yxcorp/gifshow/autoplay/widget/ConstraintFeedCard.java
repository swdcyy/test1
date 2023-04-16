package com.yxcorp.gifshow.autoplay.widget.ConstraintFeedCard;
import s99.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import s99.f;
import java.lang.Integer;
import s99.e;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.View;
import java.lang.Boolean;
import s99.g;
import androidx.recyclerview.widget.RecyclerView;

public class ConstraintFeedCard extends ConstraintLayout implements b	// class@001c41
{
    public List B;
    public List C;
    public boolean D;
    public float E;

    public void ConstraintFeedCard(Context p0){
       super(p0, null);
    }
    public void ConstraintFeedCard(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void ConstraintFeedCard(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = new ArrayList();
       this.C = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ConstraintFeedCard.class, "10")) {
          return;
       }
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ConstraintFeedCard.class, "11")) {
          return;
       }
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(ConstraintFeedCard.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, ConstraintFeedCard.class, "1")) {
             return;
          }
       }
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void f(){
       e.e(this);
    }
    public boolean g(){
       return this.D;
    }
    public float getItemWeight(){
       return this.E;
    }
    public ViewGroup getParentView(){
       Object obj = PatchProxy.apply(null, this, ConstraintFeedCard.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getParent();
    }
    public View getView(){
       return this.getView();
    }
    public ConstraintLayout getView(){
       return this;
    }
    public void j(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintFeedCard.class, "5")) {
          return;
       }
       this.B.add(p0);
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(ConstraintFeedCard.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ConstraintFeedCard.class, "2")) {
          return;
       }
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().onScrollStateChanged(p0);
       }
       return;
    }
    public void r(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintFeedCard.class, "6")) {
          return;
       }
       this.B.remove(p0);
       return;
    }
    public void setItemWeight(float p0){
       this.E = p0;
    }
    public void setVisionFocus(boolean p0){
       if (PatchProxy.isSupport(ConstraintFeedCard.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ConstraintFeedCard.class, "9")) {
          return;
       }
       if (this.D != p0) {
          this.D = p0;
          Iterator iterator = this.C.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
    public boolean t(RecyclerView p0,int p1,int p2,int p3,boolean p4){
       Iterator obj;
       if (PatchProxy.isSupport(ConstraintFeedCard.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, ConstraintFeedCard.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.B.iterator();
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
