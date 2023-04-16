package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$refreshObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;

public final class LiveVipGradeNavigationVM$refreshObserver$1 implements Model$a	// class@0011f4
{
    public final LiveVipGradeNavigationVM b;

    public void LiveVipGradeNavigationVM$refreshObserver$1(LiveVipGradeNavigationVM p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveVipGradeNavigationVM$refreshObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       LiveVipGradeNavigationVM$refreshObserver$1 tb;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveVipGradeNavigationVM$refreshObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             tb = this.b;
             tb.r0(tb.v0()).setValue(Integer.valueOf(0));
             tb = this.b;
             tb.r0(tb.w0()).setValue(p2);
             tb = this.b;
             tb.r0(tb.u0()).setValue(Integer.valueOf((int)p2.mVipGradeScores));
          }else {
             tb = this.b;
             MutableLiveData mutableLiveD = tb.r0(tb.v0());
             p1 = QCurrentUser.me();
             a.o(p1, "QCurrentUser.me\(\)");
             p1 = (p1.isLogined())? Integer.valueOf(2): Integer.valueOf(1);
             mutableLiveD.setValue(p1);
          }
       }
       return;
    }
}
