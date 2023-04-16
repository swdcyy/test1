package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$a;
import java.lang.Object;
import nsd.u;
import f14.g;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import f08.b;
import f08.b$a;
import java.util.Map;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import kotlin.jvm.internal.Ref$IntRef;
import f08.f;
import java.lang.StringBuilder;
import f08.f$a;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$a$a;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Throwable;
import java.lang.Boolean;

public final class BottomBubbleMountDelegate$a	// class@00169f
{

    public void BottomBubbleMountDelegate$a(){
       super();
    }
    public void BottomBubbleMountDelegate$a(u p0){
       super();
    }
    public final void a(g p0,PendantMountInfo p1){
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, BottomBubbleMountDelegate$a.class, "1")) {
          return;
       }
       View view = p0.f();
       if (view == null) {
          b$a.e(b.a, "Bubble onAnimationEnd bubbleView null", null, 2, null);
          return;
       }else {
          String str = PendantUtil.a.d(view, p1.getMaterialId(), false);
          Ref$IntRef intRef = new Ref$IntRef();
          intRef.element = obj.b(view, 0x7f0a0c69, "getBubbleConfigWidthFromTag");
          Ref$IntRef intRef1 = new Ref$IntRef();
          intRef1.element = obj.b(view, 0x7f0a0c67, "getBubbleConfigHeightFromTag");
          int i = obj.b(view, R.id.dynamic_pendant_config_marginTop, "getBubbleConfigMarginTopFromTag");
          f$a.t(f.a, p1.getLiveId(), str, "Bubble onAnimationEnd,configWidth:"+intRef.element+" configHeight:"+intRef1.element+' '+"oriWidth:"+view.getMeasuredWidth()+" oriHeight:"+view.getMeasuredHeight(), null, false, false, 56, null);
          if (intRef.element > null || intRef1.element > null) {
             int i1 = (p1.getDelayUpdateBubbleAreaSizeMills() > 0)? p1.getDelayUpdateBubbleAreaSizeMills(): 100;
             BottomBubbleMountDelegate$a$a uoa$a = new BottomBubbleMountDelegate$a$a(intRef, view, intRef1, p0, i, p1, str);
             view.postDelayed(v12, (long)i1);
          }
          return;
       }
    }
    public final int b(View p0,int p1,String p2){
       if (PatchProxy.isSupport(BottomBubbleMountDelegate$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, BottomBubbleMountDelegate$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Map map = null;
       try{
          p0 = p0.getTag(p1);
          if (p0 instanceof Number) {
             return p0.intValue();
          }else {
             b$a.e(b.a, p2+" tag:"+p0, map, 2, map);
             return 0;
          }
       }catch(java.lang.Exception e8){
          b$a.b(b.a, p2+" error", e8, null, 4, null);
          return 0;
       }
    }
    public final boolean c(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomBubbleMountDelegate$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Map map = null;
       try{
          p0 = p0.b;
          Map tag = (p0 != null)? p0.getTag(R.id.dynamic_pendant_config_animatorSwitch): map;
          if (tag instanceof Boolean) {
             return tag.booleanValue();
          }else {
             b$a.e(b.a, "isBubbleViewAnimatorSwitchFromTag tag not boolean:"+tag, map, 2, map);
             return false;
          }
       }catch(java.lang.Exception e8){
          b$a.b(b.a, "isBubbleViewAnimatorSwitchFromTag error", e8, null, 4, null);
          return false;
       }
    }
}
