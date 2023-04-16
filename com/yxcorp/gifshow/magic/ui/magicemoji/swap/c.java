package com.yxcorp.gifshow.magic.ui.magicemoji.swap.c;
import m4b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.c$a;
import java.lang.Object;
import m4b.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import android.view.View;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import android.content.Intent;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import k4b.a;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.EffectHint;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.b;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public class c implements e	// class@001c38
{
    public final int b;
    public final String c;
    public c$a d;
    public String e;

    public void c(c$a p0){
       super();
       this.b = 145;
       this.c = "SelectImageHandler";
       this.d = p0;
    }
    public void G(){
       d.e(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f104b62);
       return;
    }
    public void doBindView(View p0){
       d.b(this, p0);
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
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.d.p(null);
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       this.e = null;
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (this.d.I0() && (p0 != null && (!TextUtils.x(this.d.e()) && (TextUtils.n(this.d.e(), p0.getFaceImagePath()) && !p0.getFaceImageFaceDetected())))) {
          this.a();
       }
    label_003a :
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
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.d.p(new b(this));
       if (!TextUtils.x(this.e)) {
          Object[] objArray = new Object[0];
          b.D().w("SelectImageHandler", "reopen setPickedFaceImage "+this.e, objArray);
          this.d.u(this.e);
       }
       return;
    }
    public void y1(){
       d.c(this);
    }
}
