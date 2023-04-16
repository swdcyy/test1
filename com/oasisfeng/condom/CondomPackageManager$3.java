package com.oasisfeng.condom.CondomPackageManager$3;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomPackageManager;
import android.content.Intent;
import java.lang.Object;
import com.oasisfeng.condom.CondomCore;
import android.content.pm.ResolveInfo;
import java.util.List;
import com.oasisfeng.condom.OutboundType;
import java.lang.String;

public class CondomPackageManager$3 implements CondomCore$WrappedValueProcedure	// class@000a82
{
    public final Intent a;
    public final int b;
    public final int c;
    public final CondomPackageManager d;

    public void CondomPackageManager$3(CondomPackageManager p0,Intent p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object a(){
       ResolveInfo resolveInfo;
       CondomPackageManager$3 td = this.d;
       CondomPackageManager a = td.a;
       if (a.mExcludeBackgroundServices == null && a.mOutboundJudge == null) {
          resolveInfo = CondomPackageManager.c(td, this.a, this.b);
       }else {
          td = this.d;
          resolveInfo = td.a.filterCandidates(OutboundType.QUERY_SERVICES, this.a.setFlags(this.c), CondomPackageManager.d(td, this.a, this.b), td.b, false);
       }
       return resolveInfo;
    }
}
