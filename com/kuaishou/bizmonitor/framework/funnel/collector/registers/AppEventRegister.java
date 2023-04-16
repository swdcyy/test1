package com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister;
import qu.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister$Type;
import mn.c;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class AppEventRegister extends a	// class@001182
{
    public final AppEventRegister$Type c;
    public final String d;

    public void AppEventRegister(AppEventRegister$Type p0,c p1,c p2){
       super(p1, p2);
       this.c = p0;
       this.d = "onAppEvent."+p0;
    }
    public String b(){
       return this.d;
    }
}
