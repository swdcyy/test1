package com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager$2;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager;
import java.lang.Object;
import java.lang.reflect.Method;
import android.content.Intent;
import com.oasisfeng.condom.CondomCore;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import java.util.List;
import java.lang.IllegalStateException;
import java.lang.String;
import com.oasisfeng.condom.OutboundType;
import com.oasisfeng.condom.CondomProcess;

public class CondomProcess$CondomProcessPackageManager$2 implements CondomCore$WrappedValueProcedureThrows	// class@000a8f
{
    public final Object a;
    public final Method b;
    public final Object[] c;
    public final Intent d;
    public final int e;
    public final CondomProcess$CondomProcessPackageManager f;

    public void CondomProcess$CondomProcessPackageManager$2(CondomProcess$CondomProcessPackageManager p0,Object p1,Method p2,Object[] p3,Intent p4,int p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public Object a(){
       ResolveInfo resolveInfo;
       CondomProcess$CondomProcessPackageManager$2 tf = this.f;
       CondomProcess$CondomProcessPackageManager f = tf.f;
       if (f.mExcludeBackgroundServices == null) {
          resolveInfo = CondomProcess$CondomProcessPackageManager.a(tf, this.a, this.b, this.c);
       }else if(tf.g == null){
          f.mBase.getPackageManager().queryIntentServices(this.f.e, 0);
          if (this.f.g == null) {
             throw new IllegalStateException("Failed to capture IPackageManager.queryIntentServices\(\)");
          }
       }
       tf = this.f;
       List list = tf.c(CondomProcess$CondomProcessPackageManager.b(tf, this.a, tf.g, this.c));
       resolveInfo = this.f.f.filterCandidates(OutboundType.QUERY_SERVICES, this.d.setFlags(this.e), list, CondomProcess.FULL_TAG, false);
       return resolveInfo;
    }
}
