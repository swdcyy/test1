package com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType$EditElement;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.String;
import nsd.u;
import wba.h0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wba.k0;
import java.lang.Enum;

public final class StickerTextValueType$EditElement extends StickerTextValueType	// class@001b6b
{

    public void StickerTextValueType$EditElement(String p0,int p1){
       super(p0, p1, null);
    }
    public h0 convertToCommonData(h0 p0,StickerTextValueType p1){
       float f2;
       float f3;
       float f4;
       float f5;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StickerTextValueType$EditElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stickerTextCommonData");
       a.p(p1, "stickerTextValueType");
       float f = p0.g();
       float f1 = p0.h();
       int i = k0.a[p1.ordinal()];
       if (i != Float.MIN_VALUE) {
          if (i != 0.00f) {
             return p0.a();
          }else {
             f2 = p0.i();
             f3 = f;
             f4 = f1;
             f5 = p0.j();
          }
       }else {
          f2 = p0.i();
          f3 = p0.g() * 100.00f;
          f5 = 100.00f * p0.j();
          f4 = p0.h() * 100.00f;
       }
       h0 oh0 = new h0(f3, f4, f5, f2, p1, p0.d(), p0.c(), p0.e());
       return f;
    }
}
