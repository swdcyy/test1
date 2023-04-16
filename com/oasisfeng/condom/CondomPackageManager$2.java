package com.oasisfeng.condom.CondomPackageManager$2;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomPackageManager;
import android.content.Intent;
import java.lang.Object;
import java.util.List;
import com.oasisfeng.condom.OutboundType;
import java.lang.String;
import android.content.pm.ResolveInfo;
import com.oasisfeng.condom.CondomCore;

public class CondomPackageManager$2 implements CondomCore$WrappedValueProcedure	// class@000a81
{
    public final Intent a;
    public final int b;
    public final int c;
    public final CondomPackageManager d;

    public void CondomPackageManager$2(CondomPackageManager p0,Intent p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object a(){
       List list = CondomPackageManager.b(this.d, this.a, this.b);
       this.d.a.filterCandidates(OutboundType.QUERY_SERVICES, this.a.setFlags(this.c), list, this.d.b, true);
       return list;
    }
}
