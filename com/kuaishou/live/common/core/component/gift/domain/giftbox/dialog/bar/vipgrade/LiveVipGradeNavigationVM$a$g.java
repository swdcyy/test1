package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveVipGradeNavigationVM$a$g extends LiveVipGradeNavigationVM$a	// class@0011f2
{
    public final boolean a;

    public void LiveVipGradeNavigationVM$a$g(boolean p0){
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveVipGradeNavigationVM$a$g && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveVipGradeNavigationVM$a$g ta = this.a;
       if (ta != null) {
          ta = 1;
       }
       return ta;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVM$a$g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoginIntent\(isLogined="+this.a+"\)";
    }
}
