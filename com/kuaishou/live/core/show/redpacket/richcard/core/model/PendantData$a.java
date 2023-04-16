package com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData$a;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData$PendantBuildException;
import java.lang.StringBuilder;
import java.util.Objects;

public final class PendantData$a	// class@000f73
{
    public final PendantData a;

    public void PendantData$a(){
       super(null, 1, null);
    }
    public void PendantData$a(PendantData p0){
       a.p(p0, "pendantData");
       super();
       this.a = p0;
    }
    public void PendantData$a(PendantData p0,int p1,u p2){
       u ou = null;
       if (p1 & 0x01) {
          ou = new PendantData(ou);
       }
       super(ou);
       return;
    }
    public final PendantData a(){
       boolean b;
       PendantData$a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantData$a uoa = PendantData$a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uoa, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if((this.a.b()).length() > 0){
          uoa1 = 1;
       }else {
          uoa1 = null;
       }
       if (uoa1) {
          uoa1 = ((this.a.c()).length() > 0)? 1: 0;
          if (uoa1) {
             b = true;
          }
       }
       b = false;
       if (b) {
          return this.a;
       }else {
          throw new PendantData$PendantBuildException("请确认 "+this.a.getClass().getCanonicalName()+" 正确配置了 "+"pendantMainPartImageUrl和willTransitionNextRoomImageUrl");
       }
    }
    public final PendantData$a b(String p0){
       PendantData$a obj = PatchProxy.applyOneRefs(p0, this, PendantData$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clickUrl");
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, PendantData.class, "3")) {
          a.p(p0, "<set-?>");
          obj.f = p0;
       }
       return this;
    }
    public final PendantData$a c(String p0){
       PendantData$a obj = PatchProxy.applyOneRefs(p0, this, PendantData$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "logParams");
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, PendantData.class, "4")) {
          a.p(p0, "<set-?>");
          obj.g = p0;
       }
       return this;
    }
    public final PendantData$a d(String p0){
       PendantData$a obj = PatchProxy.applyOneRefs(p0, this, PendantData$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pendantMainPartImageUrl");
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, PendantData.class, "1")) {
          a.p(p0, "<set-?>");
          obj.d = p0;
       }
       return this;
    }
    public final PendantData$a e(String p0){
       PendantData$a obj = PatchProxy.applyOneRefs(p0, this, PendantData$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "willTransitionNextRoomImageUrl");
       obj = this.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, PendantData.class, "2")) {
          a.p(p0, "<set-?>");
          obj.e = p0;
       }
       return this;
    }
}
