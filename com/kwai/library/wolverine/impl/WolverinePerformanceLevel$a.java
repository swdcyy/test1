package com.kwai.library.wolverine.impl.WolverinePerformanceLevel$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import kotlin.jvm.internal.a;

public final class WolverinePerformanceLevel$a	// class@000ac4
{

    public void WolverinePerformanceLevel$a(){
       super();
    }
    public void WolverinePerformanceLevel$a(u p0){
       super();
    }
    public final WolverinePerformanceLevel a(String p0,WolverinePerformanceLevel p1){
       a.p(p1, "default");
       WolverinePerformanceLevel wolverinePer = this.b(p0);
       if (wolverinePer != null) {
          p1 = wolverinePer;
       }
       return p1;
    }
    public final WolverinePerformanceLevel b(String p0){
       WolverinePerformanceLevel wolverinePer;
       if (p0 == null) {
       }else {
          switch (p0.hashCode()){
              case 0x3b7bc1b9:
                if (p0.equals("GRADE_A")) {
                   wolverinePer = WolverinePerformanceLevel.GRADE_A;
                label_0043 :
                   return wolverinePer;
                }
                break;
              case 0x3b7bc1ba:
                if (p0.equals("GRADE_B")) {
                   wolverinePer = WolverinePerformanceLevel.GRADE_B;
                   goto label_0043 ;
                }
                break;
              case 0x3b7bc1bb:
                if (p0.equals("GRADE_C")) {
                   wolverinePer = WolverinePerformanceLevel.GRADE_C;
                   goto label_0043 ;
                }
                break;
              case 0x3b7bc1bc:
                if (p0.equals("GRADE_D")) {
                   wolverinePer = WolverinePerformanceLevel.GRADE_D;
                   goto label_0043 ;
                }
                break;
              case 0x3b7bc1bd:
                if (p0.equals("GRADE_E")) {
                   wolverinePer = WolverinePerformanceLevel.GRADE_E;
                   goto label_0043 ;
                }
                break;
              default:
          }
       }
       wolverinePer = null;
       goto label_0043 ;
    }
}
