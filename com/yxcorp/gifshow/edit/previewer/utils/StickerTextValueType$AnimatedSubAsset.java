package com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.String;
import nsd.u;
import wba.h0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wba.i0;
import java.lang.Enum;

public final class StickerTextValueType$AnimatedSubAsset extends StickerTextValueType	// class@001b69
{

    public void StickerTextValueType$AnimatedSubAsset(String p0,int p1){
       super(p0, p1, null);
    }
    public h0 convertToCommonData(h0 p0,StickerTextValueType p1){
       float f1;
       float f2;
       float f3;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StickerTextValueType$AnimatedSubAsset.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stickerTextCommonData");
       a.p(p1, "stickerTextValueType");
       int i = i0.a[p1.ordinal()];
       float f = 100.00f;
       if (i != Float.MIN_VALUE) {
          if (i != 0.00f) {
             return p0.a();
          }else {
             f1 = p0.g() / f;
             f2 = p0.h() / f;
             f3 = p0.j() / f;
             f = p0.i();
          }
       }else {
          f1 = p0.g() / f;
          f2 = p0.h() / f;
          f3 = p0.j() / f;
          f = p0.i();
       }
       h0 oh0 = new h0(f1, f2, f3, f, p1, p0.d(), p0.c(), p0.e());
       return f1;
    }
}
