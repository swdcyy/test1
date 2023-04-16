package com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIImage	// class@001153
{
    public final List cdnUrlList;
    public final boolean dynamic;
    public final float scaleRadio;

    public void UIImage(){
       super(null, 0, false, 7, null);
    }
    public void UIImage(List p0,float p1,boolean p2){
       a.p(p0, "cdnUrlList");
       super();
       this.cdnUrlList = p0;
       this.scaleRadio = p1;
       this.dynamic = p2;
    }
    public void UIImage(List p0,float p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       if (p3 & 0x02) {
          p1 = 0x3f800000;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final List a(){
       return this.cdnUrlList;
    }
    public final float b(){
       return this.scaleRadio;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIImage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIImage && (a.g(this.cdnUrlList, p0.cdnUrlList) && (!Float.compare(this.scaleRadio, p0.scaleRadio) && this.dynamic == p0.dynamic)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UIImage obj = PatchProxy.apply(null, this, UIImage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cdnUrlList;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((i * 31) + Float.floatToIntBits(this.scaleRadio)) * 31;
       UIImage tdynamic = this.dynamic;
       if (tdynamic != null) {
          tdynamic = 1;
       }
       return (i + tdynamic);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIImage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIImage\(cdnUrlList="+this.cdnUrlList+", scaleRadio="+this.scaleRadio+", dynamic="+this.dynamic+"\)";
    }
}
