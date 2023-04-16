package com.yxcorp.gifshow.magic.ui.magicemoji.g;
import m4b.e;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicUserInfoListener;
import k4b.a;
import java.lang.Object;
import m4b.d;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import android.content.Intent;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectHint;
import com.kwai.framework.model.user.QCurrentUser;
import m4b.a1;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import m4b.z0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public class g implements e, FaceMagicController$FaceMagicUserInfoListener	// class@001bcd
{
    public a b;

    public void g(a p0){
       super();
       this.b = p0;
    }
    public void G(){
       d.e(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b.f(this);
       return;
    }
    public void e1(int p0){
       d.l(this, p0);
    }
    public void h(EffectDescription p0,EffectSlot p1){
       d.a(this, p0, p1);
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       d.d(this, p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.b.f(null);
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       d.j(this, p0, p1, p2);
    }
    public void onEffectHintUpdated(EffectHint p0){
       d.k(this, p0);
    }
    public void onGetUserInfo(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       if (QCurrentUser.me() != null) {
          t.fromCallable(new a1(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new z0(this), Functions.e);
       }
       return;
    }
    public void onResume(){
       d.m(this);
    }
    public void unbind(){
       d.n(this);
    }
    public void w(){
       d.f(this);
    }
    public void w1(Intent p0){
       d.h(this, p0);
    }
    public void x1(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.b.f(this);
       return;
    }
    public void y1(){
       d.c(this);
    }
}
