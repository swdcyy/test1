package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$d;
import gq1.n;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Integer;
import lq1.c;
import mq1.b;
import kotlin.jvm.internal.a;
import mq1.a;
import java.lang.Boolean;
import nq1.d;
import nh3.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import f02.a;

public final class LiveAudienceMultiLineEntryController$d implements n	// class@0014f8
{
    public final LiveAudienceMultiLineEntryController a;

    public void LiveAudienceMultiLineEntryController$d(LiveAudienceMultiLineEntryController p0){
       this.a = p0;
       super();
    }
    public int A3(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceMultiLineEntryController obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$d.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a.s;
       int i = -1;
       if (!obj instanceof LiveAudienceMultiLineGiftBattleController) {
          return i;
       }
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController");
       Object obj1 = PatchProxy.apply(objArray, obj, LiveAudienceMultiLineGiftBattleController.class, "5");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          Integer integer = obj.V2().T();
          if (integer != null) {
             i = integer.intValue();
          }
          i1 = i;
       }
       return i1;
    }
    public int Q(){
       Integer obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.j.S();
       int i = (obj != null)? obj.intValue(): -1;
       return i;
    }
    public void V(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineEntryController$d.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       LiveAudienceMultiLineEntryController.V2(this.a).h(p0);
       return;
    }
    public boolean o0(){
       InteractiveChatLayoutConfig interactiveC;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveAudienceMultiLineEntryController.W2(this.a);
       if (obj != null) {
          b uob = obj.i();
          if (uob != null) {
             interactiveC = uob.e();
          label_0028 :
             if (interactiveC == null) {
                return false;
             }else {
                uob = LiveAudienceMultiLineEntryController.W2(this.a).i();
                if (uob != null) {
                   objArray = uob.e();
                }
                return a.a(objArray);
             }
          }
       }
       interactiveC = objArray;
       goto label_0028 ;
    }
    public String p0(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j.Y();
    }
    public void x0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineEntryController$d.class, "6")) {
          return;
       }
       a.p(p0, "observer");
       LiveAudienceMultiLineEntryController.V2(this.a).B(p0);
       return;
    }
}
