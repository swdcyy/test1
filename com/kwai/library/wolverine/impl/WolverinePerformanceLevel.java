package com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import java.lang.Enum;
import java.lang.String;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel$a;
import nsd.u;
import java.lang.Class;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class WolverinePerformanceLevel extends Enum implements WolverinePerformanceLevelInterface	// class@000ac5
{
    public static final WolverinePerformanceLevel[] $VALUES;
    public static final WolverinePerformanceLevel$a Companion;
    public static final WolverinePerformanceLevel GRADE_A;
    public static final WolverinePerformanceLevel GRADE_B;
    public static final WolverinePerformanceLevel GRADE_C;
    public static final WolverinePerformanceLevel GRADE_D;
    public static final WolverinePerformanceLevel GRADE_E;

    static {
       WolverinePerformanceLevel wolverinePer1;
       WolverinePerformanceLevel[] wolverinePer = new WolverinePerformanceLevel[]{wolverinePer1,wolverinePer1,wolverinePer1,wolverinePer1,wolverinePer1};
       wolverinePer1 = new WolverinePerformanceLevel("GRADE_E", 0);
       WolverinePerformanceLevel.GRADE_E = wolverinePer1;
       wolverinePer1 = new WolverinePerformanceLevel("GRADE_D", 1);
       WolverinePerformanceLevel.GRADE_D = wolverinePer1;
       wolverinePer1 = new WolverinePerformanceLevel("GRADE_C", 2);
       WolverinePerformanceLevel.GRADE_C = wolverinePer1;
       wolverinePer1 = new WolverinePerformanceLevel("GRADE_B", 3);
       WolverinePerformanceLevel.GRADE_B = wolverinePer1;
       wolverinePer1 = new WolverinePerformanceLevel("GRADE_A", 4);
       WolverinePerformanceLevel.GRADE_A = wolverinePer1;
       WolverinePerformanceLevel.$VALUES = wolverinePer;
       WolverinePerformanceLevel.Companion = new WolverinePerformanceLevel$a(null);
    }
    public void WolverinePerformanceLevel(String p0,int p1){
       super(p0, p1);
    }
    public static final WolverinePerformanceLevel create(String p0,WolverinePerformanceLevel p1){
       return WolverinePerformanceLevel.Companion.a(p0, p1);
    }
    public static final WolverinePerformanceLevel createOrNull(String p0){
       return WolverinePerformanceLevel.Companion.b(p0);
    }
    public static WolverinePerformanceLevel valueOf(String p0){
       return Enum.valueOf(WolverinePerformanceLevel.class, p0);
    }
    public static WolverinePerformanceLevel[] values(){
       return WolverinePerformanceLevel.$VALUES.clone();
    }
    public boolean equal(WolverinePerformanceLevel p0){
       boolean b = false;
       if (p0 != null && !this.compareTo(p0)) {
          b = true;
       }
       return b;
    }
    public boolean equal(Object p0){
       return this.equal(p0);
    }
    public boolean higherThan(WolverinePerformanceLevel p0){
       a.p(p0, "target");
       boolean b = (this.compareTo(p0) > 0)? true: false;
       return b;
    }
    public boolean higherThan(Object p0){
       return this.higherThan(p0);
    }
    public boolean isAtLeast(WolverinePerformanceLevel p0){
       a.p(p0, "target");
       boolean b = (this.compareTo(p0) >= 0)? true: false;
       return b;
    }
    public boolean isAtLeast(Object p0){
       return this.isAtLeast(p0);
    }
    public boolean isAtMost(WolverinePerformanceLevel p0){
       a.p(p0, "target");
       boolean b = (this.compareTo(p0) <= 0)? true: false;
       return b;
    }
    public boolean isAtMost(Object p0){
       return this.isAtMost(p0);
    }
    public boolean lowerThan(WolverinePerformanceLevel p0){
       a.p(p0, "target");
       boolean b = (this.compareTo(p0) < 0)? true: false;
       return b;
    }
    public boolean lowerThan(Object p0){
       return this.lowerThan(p0);
    }
}
