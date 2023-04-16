package com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.content.Context;
import com.kuaishou.post.story.widget.StoryDecorationContainerView$a;
import android.util.AttributeSet;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.DecorationView;
import android.view.View;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.AdvEditUtil;
import erd.r;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.i1;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qq4.c;
import qq4.a;
import erd.g;
import qq4.b;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;

public class StoryDecorationContainerView extends DecorationContainerView	// class@000b8b
{
    public boolean s;
    public DecorationView t;
    public View u;
    public boolean v;
    public boolean w;
    public DecorationContainerView$e x;
    public static final int y;

    public void StoryDecorationContainerView(Context p0){
       super(p0);
       this.s = false;
       this.v = true;
       this.w = true;
       this.x = new StoryDecorationContainerView$a(this);
    }
    public void StoryDecorationContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = false;
       this.v = true;
       this.w = true;
       this.x = new StoryDecorationContainerView$a(this);
    }
    public void StoryDecorationContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.s = false;
       this.v = true;
       this.w = true;
       this.x = new StoryDecorationContainerView$a(this);
    }
    public boolean N(BaseDrawer p0){
       return this.c0(p0);
    }
    public boolean R(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, StoryDecorationContainerView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.v != null) {
          this.t.setDecorationDrawer(objArray);
          this.t.setVisibility(8);
       }
       return super.R();
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, StoryDecorationContainerView.class, "9")) {
          return;
       }
       super.T();
       this.t.invalidate();
       return;
    }
    public void U(BaseDrawer p0){
       this.e0(p0);
    }
    public boolean Y(DecorationDrawer p0,boolean p1,Object p2,boolean p3){
       if (PatchProxy.isSupport(StoryDecorationContainerView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, StoryDecorationContainerView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.c(p0, p1, p2, p3);
       if (b && (p1 && this.v != null)) {
          AdvEditUtil.k(this.t, null, 300, true);
       }
    label_003b :
       return b;
    }
    public void Z(DecorationDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView.class, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryDecorationContainerView.class, "4");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          obj = PatchProxy.applyOneRefs(p0, this, DecorationContainerView.class, "32");
          boolean b = (obj != patchProxyRe)? obj.booleanValue(): this.c(p0, true, null, true);
          if (b && this.v != null) {
             AdvEditUtil.k(this.t, null, 300, true);
          }
       }
       this.c0(p0);
       this.T();
       return;
    }
    public List a0(r p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, StoryDecorationContainerView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       while (i < this.l.size()) {
          try{
             if (p0.test(this.l.get(i))) {
                obj.add(this.l.get(i));
             }
          }catch(java.io.IOException e3){
             a.D().z("StoryDecorationContainerView", "findElementList IOException: ", e3);
             i1.c(e3);
          }catch(java.lang.Exception e3){
             PostUtils.D("StoryDecorationContainerView", "findElementList: ", e3);
             i1.c(e3);
          }
          i = i + 1;
       }
       return obj;
    }
    public void b0(StoryTextDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StoryDecorationContainerView", "onTextEditComplete text edit complete |||||||||| newStoryTextDrawer:"+p0+",mSelectedDrawer:"+this.k, objArray);
       this.e();
       if (p0 == this.k) {
          if (TextUtils.x(p0.mText)) {
             this.R();
             this.k();
          }else {
             p0.restoreToBeforeAnimation(this, new c(this, p0));
          }
       }else if(!TextUtils.x(p0.mText)){
          p0.addSelectWithAnimation(this);
       }
       this.f(new a(p0));
       if (!PatchProxy.applyVoid(null, this, StoryDecorationContainerView.class, "16") && this.w != null) {
          AdvEditUtil.k(this.u, null, 300, 0);
       }
       return;
    }
    public boolean c(BaseDrawer p0,boolean p1,Object p2,boolean p3){
       return this.Y(p0, p1, null, p3);
    }
    public boolean c0(DecorationDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryDecorationContainerView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.N(p0);
       if (b && this.v != null) {
          this.t.bringToFront();
          this.t.setVisibility(0);
          this.t.setDecorationDrawer(this.k);
       }
       return b;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, StoryDecorationContainerView.class, "15")) {
          return;
       }
       if (this.w != null) {
          this.u.bringToFront();
          AdvEditUtil.k(this.u, null, 300, true);
       }
       return;
    }
    public void e0(DecorationDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryDecorationContainerView.class, "10")) {
          return;
       }
       super.U(p0);
       this.t.invalidate();
       return;
    }
    public StoryTextDrawer getSelectStoryTextDrawer(){
       Object[] objArray = null;
       DecorationContainerView obj = PatchProxy.apply(objArray, this, StoryDecorationContainerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null || !obj instanceof StoryTextDrawer) {
          return objArray;
       }
       objArray = new Object[0];
       a.D().w("StoryDecorationContainerView", "getSelectStoryTextDrawer select drawer is text", objArray);
       return this.k;
    }
    public boolean o(boolean p0){
       if (PatchProxy.isSupport(StoryDecorationContainerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, StoryDecorationContainerView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.o(p0);
       if (b && (p0 && this.v != null)) {
          this.t.setVisibility(0);
          AdvEditUtil.k(this.t, new b(this), 300, 0);
       }
    label_003d :
       return b;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, StoryDecorationContainerView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.t = new DecorationView(this.getContext());
       int i = -1;
       this.t.setLayoutParams(new AbsoluteLayout$LayoutParams(i, i, 0, 0));
       this.addView(this.t);
       if (this.v == null) {
          this.t.setVisibility(8);
       }
       this.u = new View(this.getContext());
       this.u.setLayoutParams(new AbsoluteLayout$LayoutParams(i, i, 0, 0));
       this.u.setBackgroundResource(R.color.arg_RES_7f061c14);
       this.u.setAlpha(0);
       this.addView(this.u);
       if (this.w == null) {
          this.u.setVisibility(8);
       }
       this.d(this.x);
       return;
    }
    public void setEnableBackground(boolean p0){
       this.w = p0;
    }
    public void setEnableDecorationView(boolean p0){
       this.v = p0;
    }
}
