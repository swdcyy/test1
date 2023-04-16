package com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import im8.g;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.HashSet;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$a;
import t36.f;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import voc.h;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Set;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.animation.Animation;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.animation.AnimationUtils;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$c;
import com.yxcorp.gifshow.util.resource.f;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import voc.c;
import t36.f$a;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import gka.g;
import java.util.List;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.util.resource.g;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.util.resource.c;

public abstract class BaseEditorFragment extends PostBaseFragment implements g	// class@000d95
{
    public FragmentActivity A;
    public EditorManager B;
    public y C;
    public g D;
    public f E;
    public boolean p;
    public View q;
    public boolean r;
    public BaseEditor$EditorShowMode s;
    public EditorDelegate t;
    public s$b u;
    public Set v;
    public Set w;
    public String x;
    public double y;
    public long z;
    public static final int F;

    public void BaseEditorFragment(){
       super();
       this.p = true;
       this.v = new HashSet();
       this.w = new LinkedHashSet();
       this.x = "";
       this.y = 0;
       this.z = -1;
       this.C = new BaseEditorFragment$a(this);
       this.E = new f();
    }
    public void eh(BaseEditorFragment$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "15")) {
          return;
       }
       this.E.d(p0);
       return;
    }
    public abstract void fh();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseEditorFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BaseEditorFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BaseEditorFragment.class, new h());
       }else {
          obj.put(BaseEditorFragment.class, null);
       }
       return obj;
    }
    public String getTitle(){
       return "";
    }
    public abstract void gh();
    public BaseEditorFragment$d hh(){
       BaseEditorFragment$d obj = PatchProxy.apply(null, this, BaseEditorFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BaseEditorFragment$d(this);
       obj.b = this.w;
       obj.c = this.v;
       obj.d = this.x;
       obj.e = this.z;
       obj.f = this.t.N();
       obj.g = this.t;
       return obj;
    }
    public Set ih(){
       return this.v;
    }
    public FragmentActivity jh(){
       Object obj = PatchProxy.apply(null, this, BaseEditorFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() != null) {
          return this.getActivity();
       }
       if (ActivityContext.g().e() != null) {
          return ActivityContext.g().e();
       }
       return this.A;
    }
    public EditorDelegate kh(){
       return this.t;
    }
    public int lh(){
       return 0;
    }
    public View mh(){
       return this.q;
    }
    public BaseEditor$EditorShowMode nh(){
       return this.s;
    }
    public long oh(){
       return this.z;
    }
    public void onActivityPause(){
    }
    public void onActivityResume(){
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (p0 instanceof FragmentActivity) {
          this.A = p0;
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       if (p0 != null && !p0.getBoolean("pageIsHidden", false)) {
          this.getFragmentManager().beginTransaction().s(this).m();
       }
       if (this.sh()) {
          this.w.add(this.C);
       }
       return;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       Animation uAnimation;
       if (PatchProxy.isSupport(BaseEditorFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, BaseEditorFragment.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 && !p1) {
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          uAnimation.setDuration(300);
          uAnimation.setAnimationListener(new BaseEditorFragment$b(this));
          if (this.r != null) {
             uAnimation.setDuration(50);
             this.r = false;
          }
          return uAnimation;
       }else if(p1 && p2){
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          uAnimation.setDuration(300);
          uAnimation.setAnimationListener(new BaseEditorFragment$c(this));
          return uAnimation;
       }else {
          return super.onCreateAnimation(p0, p1, p2);
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "11")) {
          BaseEditorFragment tD = this.D;
          if (tD != null) {
             tD.dismiss();
             this.D = null;
          }
       }
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "3")) {
          return;
       }
       super.onDetach();
       this.A = null;
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(BaseEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseEditorFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (this.p != null && this.getView() != null) {
          this.getView().setVisibility(0);
       }
       if (p0) {
          this.gh();
       }else {
          this.fh();
       }
       if (this.E != null && (!PatchProxy.isSupport(BaseEditorFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseEditorFragment.class, "17"))) {
          this.E.s0(new c(p0));
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "5")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putBoolean("pageIsHidden", this.isHidden());
       return;
    }
    public String ph(){
       return this.x;
    }
    public Set qh(){
       return this.w;
    }
    public boolean rh(){
       View obj = PatchProxy.apply(null, this, BaseEditorFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s == BaseEditor$EditorShowMode.SHOW_BACKGROUND) {
          obj = this.getView();
          if (obj != null) {
             View parent = obj.getParent();
             if (parent != null) {
                boolean b = (this.isVisible() && (obj.getAlpha() > 0 && parent.getAlpha() > 0))? true: false;
                return b;
             }
          }
       }
       return this.isVisible();
    }
    public boolean sh(){
       return this instanceof VideoCoverEditorV3Fragment;
    }
    public void th(BaseEditorFragment$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "16")) {
          return;
       }
       this.E.c(p0);
       return;
    }
    public void uh(EditorDelegate p0,String p1){
       this.t = p0;
       this.x = p1;
    }
    public void vh(boolean p0){
       this.p = p0;
    }
    public void wh(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "1")) {
          return;
       }
       this.v.add(p0);
       return;
    }
    public void xh(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseEditorFragment.class, "10")) {
          return;
       }
       BaseEditorFragment tD = this.D;
       if (tD != null) {
          tD.dismiss();
       }
       Category fILTER_HOLDE = Category.FILTER_HOLDER;
       if (p0.contains(fILTER_HOLDE)) {
          p0.remove(fILTER_HOLDE);
          this.D = new g(this.getActivity(), p0, n.i(FilterVideoPlugin$FilterEntranceType.EDIT), d.a(-860154223));
       }else {
          this.D = new g(this.getActivity(), p0);
       }
       c.b(this.D, u1.k(), p1);
       this.D.show();
       return;
    }
}
