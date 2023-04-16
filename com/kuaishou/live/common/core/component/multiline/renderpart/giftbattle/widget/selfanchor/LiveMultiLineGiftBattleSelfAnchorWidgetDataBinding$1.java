package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding;
import java.lang.Object;
import ya1.n0;
import java.lang.Number;
import pq1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import pq1.a;
import androidx.lifecycle.LiveData;
import j83.b;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.Objects;
import pq1.g;
import lnc.a1;

public final class LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1 extends Lambda implements p	// class@001580
{
    public final LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding this$0;

    public void LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final f invoke(n0 p0,int p1){
       a obj2;
       UserInfos$UserInfo sUserId;
       Object obj3;
       f uof;
       int i2;
       Object obj = this;
       LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1 obj1 = p0;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1.class)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$1.class, "1");
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       if (obj1 != null) {
          LiveData liveData = obj.this$0.b.d();
          if (liveData != null) {
             a value = liveData.getValue();
             if (value != null) {
                value = value.h;
                if (value != null) {
                   sUserId = value.sUserId;
                   if (sUserId != null) {
                   label_0042 :
                      obj2 = new a(sUserId, obj1);
                   }
                }
             }
          }
          sUserId = "";
          goto label_0042 ;
       }else {
          obj2 = null;
       }
       obj1 = obj.this$0;
       Objects.requireNonNull(obj1);
       if (PatchProxy.isSupport(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class)) {
          obj3 = PatchProxy.applyTwoRefs(obj2, Integer.valueOf(p1), obj1, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class, "3");
          if (obj3 != patchProxyRe) {
          label_0107 :
             return obj3;
          }
       }
       float f = 6.00f;
       int i1 = 2;
       if (i != i1) {
          uof = PatchProxy.applyOneRefs(obj2, obj1, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class, "4");
          if (uof != patchProxyRe) {
          }else {
             g og = new g(2, a1.e(16.00f), a1.e(12.00f), a1.e(11.00f), a1.e(20.00f), a1.e(f), a1.e(2.00f), a1.e(f), a1.e(f), 0, 0);
             uof = new f(i, obj2);
          }
       }else if(PatchProxy.isSupport(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class)){
          uof = PatchProxy.applyTwoRefs(obj2, Integer.valueOf(p1), obj1, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class, "5");
          if (uof != patchProxyRe) {
          }
       }
       if (i != 1) {
          i2 = (i != i1)? 4: 3;
       }else {
          i2 = 2;
       }
       g og1 = new g(i2, a1.e(12.00f), a1.e(10.00f), a1.e(9.00f), a1.e(16.00f), a1.e(4.00f), a1.e(2.00f), a1.e(4.00f), a1.e(f), 0, 0);
       uof = new f(i, obj2);
       obj3 = uof;
       goto label_0107 ;
    }
}
