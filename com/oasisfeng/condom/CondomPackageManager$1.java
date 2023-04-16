package com.oasisfeng.condom.CondomPackageManager$1;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomPackageManager;
import android.content.Intent;
import java.lang.Object;
import java.util.List;

public class CondomPackageManager$1 implements CondomCore$WrappedValueProcedure	// class@000a80
{
    public final Intent a;
    public final int b;
    public final CondomPackageManager c;

    public void CondomPackageManager$1(CondomPackageManager p0,Intent p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object a(){
       return CondomPackageManager.a(this.c, this.a, this.b);
    }
}
