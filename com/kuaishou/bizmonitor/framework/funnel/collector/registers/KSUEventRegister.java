package com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister$Type;
import mn.c;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class KSUEventRegister extends a	// class@001186
{
    public final KSUEventRegister$Type c;
    public final String d;

    public void KSUEventRegister(KSUEventRegister$Type p0,c p1,c p2){
       super(p1, p2);
       this.c = p0;
       this.d = "KSU."+p0;
    }
    public String b(){
       return this.d;
    }
}
