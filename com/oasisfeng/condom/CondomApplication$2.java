package com.oasisfeng.condom.CondomApplication$2;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import java.lang.Object;
import android.content.Context;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;

public class CondomApplication$2 implements CondomCore$WrappedValueProcedure	// class@000a54
{
    public final Intent a;
    public final CondomApplication b;

    public void CondomApplication$2(CondomApplication p0,Intent p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(){
       return a.e(this.b.c, this.a);
    }
}
