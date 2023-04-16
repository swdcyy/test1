package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProvider;
import mn9.b;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.style.data.ColorDataProvider$colorDataManager$2;
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
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import java.util.Collection;
import brd.g;
import mn9.a;
import java.lang.Boolean;
import java.lang.Integer;

public final class ColorDataProvider implements b	// class@000bb2
{
    public final p a;

    public void ColorDataProvider(){
       super();
       this.a = s.c(ColorDataProvider$colorDataManager$2.INSTANCE);
    }
    public List a(List p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ColorDataProvider.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       return b$a.f(this, p0, p1);
    }
    public void b(v p0){
       ColorDataProvider uColorDataPr = ColorDataProvider.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uColorDataPr, "2")) {
          return;
       }
       a.p(p0, "emitter");
       TextStyleDataManager textStyleDat = PatchProxy.apply(null, this, uColorDataPr, "1");
       if (textStyleDat == PatchProxyResult.class) {
          textStyleDat = this.a.getValue();
       }
       p0.onNext(new ArrayList(textStyleDat.a()));
       p0.onComplete();
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorDataProvider.class, "9")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ColorDataProvider.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return true;
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ColorDataProvider.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return b$a.b(this, p0, p1);
    }
    public void f(a p0,v p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ColorDataProvider.class, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "emitter");
       p1.onNext(Integer.valueOf(100));
       p1.onComplete();
       return;
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ColorDataProvider.class, "5")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ColorDataProvider.class, "6")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ColorDataProvider.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
