package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$eventListener$2$a;
import i1c.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig$eventListener$2;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import java.lang.Float;
import k2b.e0;
import f1c.f0;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import i1c.b;
import android.view.View;

public final class IMMakeupOptionConfig$eventListener$2$a implements c	// class@001dbd
{
    public final IMMakeupOptionConfig$eventListener$2 b;

    public void IMMakeupOptionConfig$eventListener$2$a(IMMakeupOptionConfig$eventListener$2 p0){
       this.b = p0;
       super();
    }
    public void I1(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3){
       if (PatchProxy.isSupport(IMMakeupOptionConfig$eventListener$2$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, IMMakeupOptionConfig$eventListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "suite");
       c.g("IMMakeupOptionConfig", "onItemSelect suite id "+p0.mId);
       this.b.this$0.c.h(p0, p1, p2, p3);
       return;
    }
    public void N1(float p0,float p1,MakeupGroup$a p2,MakeupSuite p3,MakeupPart p4,MakeupMaterial p5){
       IMMakeupOptionConfig$eventListener$2$a uoeventListe = IMMakeupOptionConfig$eventListener$2$a.class;
       if (PatchProxy.isSupport(uoeventListe)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoeventListe, "3")) {
             return;
          }
       }
       a.p(p3, "makeupSuite");
       f0.h(this.b.$prettifyFragment, p0, p1, false, p2, p3, p4, p5);
       return;
    }
    public void P(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMakeupOptionConfig$eventListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "suite");
       List parts = p0.getParts();
       if (parts != null) {
          Iterator iterator = parts.iterator();
          while (iterator.hasNext()) {
             MakeupPart makeupPart = iterator.next();
             a.o(makeupPart, "it");
             MakeupMaterial selectMateri = makeupPart.getSelectMaterial();
             a.o(selectMateri, "it.selectMaterial");
             MakeupMaterial selectMateri1 = makeupPart.getSelectMaterial();
             a.o(selectMateri1, "it.selectMaterial");
             if (!selectMateri1.isEmpty()) {
                float f = p0.getIntensity() * selectMateri.getRecommendIntensity();
                if (selectMateri.getIntensity() - f) {
                   selectMateri.setUserIntensity(Float.valueOf(f));
                   this.b.this$0.c.h(p0, makeupPart, selectMateri, true);
                }
             }
          }
       }
       return;
    }
    public void a(){
       b.a(this);
    }
    public void j0(){
       b.b(this);
    }
    public void z0(View p0,int p1,MakeupSuite p2){
       b.d(this, p0, p1, p2);
    }
}
