package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a;
import com.kwai.framework.model.user.UserInfo;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveVipGradeNavigationVM$a$a extends LiveVipGradeNavigationVM$a	// class@0011ec
{
    public final UserInfo a;

    public void LiveVipGradeNavigationVM$a$a(UserInfo p0){
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVipGradeNavigationVM$a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveVipGradeNavigationVM$a$a && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveVipGradeNavigationVM$a$a obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVM$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVM$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BindAnchorUser\(user="+this.a+"\)";
    }
}
