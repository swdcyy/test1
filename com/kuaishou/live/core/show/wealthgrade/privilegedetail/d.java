package com.kuaishou.live.core.show.wealthgrade.privilegedetail.d;
import y8c.g;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.i$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;
import java.util.List;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.c;
import ml8.c;

public class d extends g	// class@00126d
{

    public void d(i$a p0){
       super();
       this.n1("WealthGradeUpgradeService", p0);
    }
    public int f0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       LiveWealthGradePrivilegeItemInfo liveWealthGr = this.N0(p0);
       liveWealthGr = (liveWealthGr != null && liveWealthGr.mPrivilegeType == 3)? 0: 1;
       return liveWealthGr;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Q0().size();
    }
    public f h1(ViewGroup p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          return new f(a.i(p0, 0x7f0d0e84), new c());
       }else {
          return new f(a.i(p0, 0x7f0d0e85), new c());
       }
    }
}
