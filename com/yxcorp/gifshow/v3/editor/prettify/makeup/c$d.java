package com.yxcorp.gifshow.v3.editor.prettify.makeup.c$d;
import i1c.c;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import java.lang.Float;
import k2b.e0;
import f1c.f0;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import i1c.b;
import android.view.View;
import java.lang.Integer;
import k2b.s$b;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import k2b.s$e;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import k2b.s$a;

public class c$d implements c	// class@001194
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void I1(MakeupSuite p0,MakeupPart p1,MakeupMaterial p2,boolean p3){
       if (PatchProxy.isSupport(c$d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, c$d.class, "1")) {
          return;
       }
       this.b.W8(p0, p3);
       return;
    }
    public void N1(float p0,float p1,MakeupGroup$a p2,MakeupSuite p3,MakeupPart p4,MakeupMaterial p5){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
             return;
          }
       }
       if (p3.isReco()) {
          f0.k(this.b.v, p0, p1, p3);
       }else {
          f0.h(this.b.v, p0, p1, false, p2, p3, p4, p5);
       }
       return;
    }
    public void P(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "2")) {
          return;
       }
       List parts = p0.getParts();
       if (q.f(parts)) {
          return;
       }
       Iterator iterator = parts.iterator();
       while (iterator.hasNext()) {
          MakeupMaterial selectMateri = iterator.next().getSelectMaterial();
          if (selectMateri.isEmpty()) {
             continue ;
          }else {
             float f = p0.getIntensity() * selectMateri.getRecommendIntensity();
             selectMateri.setUserIntensity(Float.valueOf(f));
          }
       }
       this.b.W8(p0, true);
       return;
    }
    public void a(){
       b.a(this);
    }
    public void j0(){
       b.b(this);
    }
    public void z0(View p0,int p1,MakeupSuite p2){
       if (PatchProxy.isSupport(c$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c$d.class, "3")) {
          return;
       }
       if (this.b.R8() != null && this.b.p.rh()) {
          this.b.R8().f(true);
          this.b.R8().g(p0, new s$e(p2.mId, p1));
       }
       return;
    }
}
