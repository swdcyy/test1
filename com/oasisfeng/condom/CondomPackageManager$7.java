package com.oasisfeng.condom.CondomPackageManager$7;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomPackageManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CondomPackageManager$7 implements CondomCore$WrappedValueProcedure	// class@000a86
{
    public final String a;
    public final String b;
    public final CondomPackageManager c;

    public void CondomPackageManager$7(CondomPackageManager p0,String p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object a(){
       return Integer.valueOf(CondomPackageManager.h(this.c, this.a, this.b));
    }
}
