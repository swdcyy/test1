package com.kwai.statechart.PlantUmlStateDiagramVisitor$visitTransitions$3$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ut7.n;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class PlantUmlStateDiagramVisitor$visitTransitions$3$1 extends Lambda implements l	// class@0018e5
{
    public static final PlantUmlStateDiagramVisitor$visitTransitions$3$1 INSTANCE;

    static {
       PlantUmlStateDiagramVisitor$visitTransitions$3$1.INSTANCE = new PlantUmlStateDiagramVisitor$visitTransitions$3$1();
    }
    public void PlantUmlStateDiagramVisitor$visitTransitions$3$1(){
       super(1);
    }
    public final CharSequence invoke(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlantUmlStateDiagramVisitor$visitTransitions$3$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0.b()+"\\n<"+p0.d.getSimpleName()+'>';
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
