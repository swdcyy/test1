package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProviderV3;
import mn9.b;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProviderV3$colorDataManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mn9.b$a;
import brd.v;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.model.a;
import java.util.Collection;
import brd.g;
import mn9.a;
import java.lang.Boolean;
import java.lang.Integer;

public final class ColorDataProviderV3 implements b	// class@000bb4
{
    public final p a;

    public void ColorDataProviderV3(){
       super();
       this.a = s.c(ColorDataProviderV3$colorDataManager$2.INSTANCE);
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ColorDataProviderV3.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       ColorDataProviderV3 uColorDataPr = ColorDataProviderV3.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uColorDataPr, "2")) {
          return;
       }
       a.p(p0, "emitter");
       a uoa = PatchProxy.apply(null, this, uColorDataPr, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.a.getValue();
       }
       p0.onNext(new ArrayList(uoa.a()));
       p0.onComplete();
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorDataProviderV3.class, "9")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ColorDataProviderV3.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return true;
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ColorDataProviderV3.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ColorDataProviderV3.class, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "emitter");
       p1.onNext(Integer.valueOf(100));
       p1.onComplete();
       return;
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ColorDataProviderV3.class, "5")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ColorDataProviderV3.class, "6")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ColorDataProviderV3.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
