package com.oasisfeng.condom.CondomApplication$1;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import com.oasisfeng.condom.CondomApplication;
import android.content.Intent;
import android.content.ServiceConnection;
import java.lang.Object;
import android.content.Context;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Boolean;

public class CondomApplication$1 implements CondomCore$WrappedValueProcedure	// class@000a53
{
    public final Intent a;
    public final ServiceConnection b;
    public final int c;
    public final CondomApplication d;

    public void CondomApplication$1(CondomApplication p0,Intent p1,ServiceConnection p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object a(){
       return Boolean.valueOf(a.a(this.d.c, this.a, this.b, this.c));
    }
}
