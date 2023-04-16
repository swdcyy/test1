package com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ld5.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nd5.b;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.b5;
import android.os.Build$VERSION;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import java.lang.Integer;
import ekd.i;
import com.yxcorp.utility.j;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.fragments.NormalDetailContainerFragment;
import o56.a;
import android.content.Context;
import ekd.l1;
import lnc.d2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import zf6.k;
import id5.v;
import java.lang.StringBuilder;
import android.content.res.Resources;
import q87.c;
import i2b.a;
import tkd.b;
import tkd.d;
import md5.a;
import kd5.a;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import nd5.a;
import id5.o;
import ok.x;
import nd5.f;
import nd5.e;

public abstract class DetailBaseContainerFragment extends BaseFragment	// class@000a1c
{
    public PresenterV2 j;
    public PhotoDetailParam k;
    public boolean l;
    public a m;
    public Integer n;
    public static final int o;

    public void DetailBaseContainerFragment(){
       super();
       this.m = this.dh();
    }
    public void ch(View p0){
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, DetailBaseContainerFragment.class, "10")) {
          return;
       }
       this.m.j.onNext(Boolean.TRUE);
       return;
    }
    public abstract SlidePlayLogger d1();
    public a dh(){
       Object obj = PatchProxy.apply(null, this, DetailBaseContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public abstract int eh();
    public final a fh(){
       return this.m;
    }
    public abstract QPhoto getCurrentPhoto();
    public abstract int getLayoutResId();
    public PresenterV2 gh(){
       Object obj = PatchProxy.applyWithListener(null, this, DetailBaseContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(DetailBaseContainerFragment.class, "11");
       return new b(this.l);
    }
    public final void hh(Configuration p0){
       WindowManager$LayoutParams attributes;
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailBaseContainerFragment.class, "7")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (b5.a(this.getActivity())) {
          return;
       }
       int i = 1024;
       if (p0.orientation != 2) {
          if (Build$VERSION.SDK_INT >= 28 && this.n != null) {
             attributes = this.getActivity().getWindow().getAttributes();
             attributes.layoutInDisplayCutoutMode = this.n.intValue();
             this.getActivity().getWindow().setAttributes(attributes);
          }
          this.getActivity().getWindow().clearFlags(i);
          if (this.kh()) {
             i.a(this.getActivity(), 0, 0);
          }else if(!b5.a(this.getActivity())){
             i.h(this.getActivity(), 0, true);
          }
       }else {
          this.getActivity().getWindow().clearFlags(2048);
          this.getActivity().getWindow().addFlags(i);
          View decorView = this.getActivity().getWindow().getDecorView();
          decorView.setSystemUiVisibility((decorView.getSystemUiVisibility() | j.f));
          if (Build$VERSION.SDK_INT >= 28) {
             attributes = this.getActivity().getWindow().getAttributes();
             this.n = Integer.valueOf(attributes.layoutInDisplayCutoutMode);
             attributes.layoutInDisplayCutoutMode = 1;
             this.getActivity().getWindow().setAttributes(attributes);
          }
       }
       return;
    }
    public abstract boolean ih(Intent p0,PhotoDetailParam p1);
    public abstract void jh();
    public abstract boolean kh();
    public boolean lh(){
       return this instanceof NormalDetailContainerFragment;
    }
    public boolean mh(){
       return true;
    }
    public abstract void nh(PresenterV2 p0);
    public void oh(PhotoDetailParam p0){
       this.k = p0;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailBaseContainerFragment.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       QPhoto currentPhoto = this.getCurrentPhoto();
       boolean b = false;
       if (currentPhoto != null) {
          if (currentPhoto.isLiveStream()) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, DetailBaseContainerFragment.class, "6") && (this.getActivity() != null && l1.a(a.B))) {
                if (p0.orientation == 2) {
                   this.getActivity().getWindow().clearFlags(2048);
                   this.getActivity().getWindow().addFlags(1024);
                }else {
                   this.getActivity().getWindow().clearFlags(1024);
                   if (this.kh()) {
                      i.a(this.getActivity(), b, b);
                   }
                }
             }
          }else if(currentPhoto.isVideoAndNotKtv()){
             this.hh(p0);
          }
       }
       if (p0.orientation != 2 && (d2.i(p0) || b5.a(this.getActivity()))) {
          d2.n();
          if (this.getView() != null) {
             this.getView().requestLayout();
          }
       }
       a f = this.m.f;
       if (p0.orientation == 2) {
          b = true;
       }
       f.onNext(Boolean.valueOf(b));
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailBaseContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (this.lh() && k.e())? 1: 0;
       Object[] objArray = new Object[0];
       v.C().w("DetailBaseContainerFrag", "THIS "+this+" "+this.getResources().getResourceName(this.getLayoutResId()), objArray);
       return a.h(p0, this.getLayoutResId(), p1, 0, i);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, DetailBaseContainerFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       DetailBaseContainerFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       if (this.mh()) {
          d.a(-399758437).cY(this.getActivity());
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(DetailBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DetailBaseContainerFragment.class, "8")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.m.h.onNext(Boolean.valueOf(p0));
       this.m.c = Boolean.valueOf(p0);
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
    }
    public final void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailBaseContainerFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       DetailBaseContainerFragment tm = this.m;
       tm.p = new a(this);
       tm.r = this;
       tm.q = this.getChildFragmentManager();
       int i = 0;
       Object[] objArray = new Object[i];
       v.C().w("DetailBaseContainerFrag", "LogFragment_"+this.getChildFragmentManager().toString(), objArray);
       tm.s = new FragmentCompositeLifecycleState(this);
       this.ch(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.j = presenterV2;
       presenterV2.U7(this.gh());
       this.j.U7(new a());
       Boolean uBoolean = PatchProxy.apply(null, null, o.class, "3");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = o.a.get();
       }
       if (!uBoolean.booleanValue()) {
          this.j.U7(new f());
       }
       this.j.U7(new e());
       this.nh(this.j);
       this.j.f(p0);
       Object[] objArray1 = new Object[]{this.k,this.m,this};
       this.j.i(objArray1);
       return;
    }
    public boolean ph(){
       return true;
    }
    public int r(){
       return 0;
    }
}
