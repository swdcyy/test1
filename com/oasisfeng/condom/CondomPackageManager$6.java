package com.oasisfeng.condom.CondomPackageManager$6;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomPackageManager;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Arrays;

public class CondomPackageManager$6 implements CondomCore$WrappedValueProcedure	// class@000a85
{
    public final int a;
    public final CondomPackageManager b;

    public void CondomPackageManager$6(CondomPackageManager p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(){
       String[] stringArray = CondomPackageManager.g(this.b, this.a);
       List list = (stringArray != null)? Arrays.asList(stringArray): null;
       return list;
    }
}
