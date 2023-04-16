package com.kuaishou.merchant.home2.main.predict.Predict$activeTaskAndSetup$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;

public final class Predict$activeTaskAndSetup$1 extends Lambda implements l	// class@001814
{
    public static final Predict$activeTaskAndSetup$1 INSTANCE;

    static {
       Predict$activeTaskAndSetup$1.INSTANCE = new Predict$activeTaskAndSetup$1();
    }
    public void Predict$activeTaskAndSetup$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, Predict$activeTaskAndSetup$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return String.valueOf(System.currentTimeMillis());
    }
}
