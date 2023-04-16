package com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.widget.adv.c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import uxb.p;
import uxb.l;
import uxb.u;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import java.lang.Number;
import java.lang.StringBuilder;

public class Action extends c	// class@001901
{
    public EditDecorationBaseDrawer i;

    public void Action(Action$Type p0,int p1,double p2,double p3,boolean p4){
       super(p0, p1, p2, p3);
       this.h = p4;
    }
    public void Action(Action$Type p0,int p1,EditDecorationBaseDrawer p2,double p3,double p4){
       super(p0, p1, p3, p4);
       this.i = p2;
    }
    public Object clone(){
       return this.i();
    }
    public void g(double p0){
       if (PatchProxy.isSupport(Action.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, Action.class, "2")) {
          return;
       }
       super.g(p0);
       Action ti = this.i;
       if (ti != null) {
          ti.setStartTime(p0);
       }
       return;
    }
    public void h(double p0){
       if (PatchProxy.isSupport(Action.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, Action.class, "4")) {
          return;
       }
       super.h(p0);
       Action ti = this.i;
       if (ti != null) {
          ti.setDuration(p0);
       }
       return;
    }
    public Action i(){
       Object obj = PatchProxy.apply(null, this, Action.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Action uAction = new Action(this.b, this.l(), this.c(), this.d(), this.h);
       uAction = this.i;
       if (uAction != null) {
          obj.i = (!uAction.getDecorationType())? l.m().I60(this.i): l.n().zv(this.i);
       }
    label_0049 :
       return obj;
    }
    public EditorSdk2V2$AnimatedSubAsset j(EditorSdk2V2$AnimatedSubAsset[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Action.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.j(p0, this.f);
    }
    public EditDecorationBaseDrawer k(){
       return this.i;
    }
    public int l(){
       Action obj = PatchProxy.apply(null, this, Action.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i;
       c tf = (obj == null)? this.f: obj.getLayerIndex();
       return tf;
    }
    public void m(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Action.class, "6")) {
          return;
       }
       this.i = p0;
       this.f = p0.getLayerIndex();
       this.d = p0.getStartTime();
       this.e = p0.getDuration();
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Action.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Action{mType="+this.b+", mDrawer="+this.i+", mStartPosition="+this.d+", mTimeLen="+this.e+", mLayerIndex="+this.f+", mCanRemoveFromTempShowEdit="+this.g+", mIsCanEdit="+this.h+'}';
    }
}
