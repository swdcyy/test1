package com.kuaishou.bizmonitor.framework.funnel.collector.registers.KLogRegister;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KLogRegister$Type;
import java.lang.String;
import mn.c;
import java.lang.StringBuilder;
import java.lang.Object;

public class KLogRegister extends a	// class@001184
{
    public final KLogRegister$Type c;
    public final String d;
    public final int e;
    public final String f;

    public void KLogRegister(KLogRegister$Type p0,String p1,int p2,c p3,c p4){
       super(p3, p4);
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = "KLog."+p0+"."+p1;
    }
    public String b(){
       return this.f;
    }
}
