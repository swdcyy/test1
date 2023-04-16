package com.oasisfeng.condom.CondomPackageManager$5;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomPackageManager;
import java.lang.String;
import java.lang.Object;
import android.content.pm.PackageInfo;

public class CondomPackageManager$5 implements CondomCore$WrappedValueProcedureThrows	// class@000a84
{
    public final String a;
    public final int b;
    public final CondomPackageManager c;

    public void CondomPackageManager$5(CondomPackageManager p0,String p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object a(){
       return CondomPackageManager.f(this.c, this.a, this.b);
    }
}
