package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveVipGradeNavigationVM$a$b extends LiveVipGradeNavigationVM$a	// class@0011ed
{
    public final int a;

    public void LiveVipGradeNavigationVM$a$b(int p0){
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveVipGradeNavigationVM$a$b && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVM$a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveVipGradeNavigationVM$a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChangeCurrentScoreIntent\(newScore="+this.a+"\)";
    }
}