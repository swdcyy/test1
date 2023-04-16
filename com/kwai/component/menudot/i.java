package com.kwai.component.menudot.i;
import ok.x;
import java.lang.Object;
import nc5.t;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class i implements x	// class@0009bf
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enablePaneInitOnlyWhenClick", false));
    }
}
