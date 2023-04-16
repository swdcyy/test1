package com.kwai.statechart.PlantUmlStateDiagramVisitor$visitStateEvents$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class PlantUmlStateDiagramVisitor$visitStateEvents$1 extends Lambda implements l	// class@0018e4
{
    public static final PlantUmlStateDiagramVisitor$visitStateEvents$1 INSTANCE;

    static {
       PlantUmlStateDiagramVisitor$visitStateEvents$1.INSTANCE = new PlantUmlStateDiagramVisitor$visitStateEvents$1();
    }
    public void PlantUmlStateDiagramVisitor$visitStateEvents$1(){
       super(1);
    }
    public final CharSequence invoke(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlantUmlStateDiagramVisitor$visitStateEvents$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return '<'+p0.getSimpleName()+'>';
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
