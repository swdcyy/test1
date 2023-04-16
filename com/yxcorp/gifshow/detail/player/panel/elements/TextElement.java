package com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import j3a.a;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement$clickChecker$1;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.z;
import msd.p;
import kotlin.jvm.internal.a;

public final class TextElement extends a	// class@00162e
{
    public String e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public p j;
    public l k;

    public void TextElement(){
       super();
       this.e = "";
       this.k = TextElement$clickChecker$1.INSTANCE;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, TextElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z();
    }
    public final boolean g(){
       return this.f;
    }
    public final void h(p p0){
       this.j = p0;
    }
    public final void i(int p0){
       this.i = p0;
    }
    public final void j(int p0){
       this.h = p0;
    }
    public final void k(boolean p0){
       this.f = p0;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElement.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
}
