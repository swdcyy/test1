package com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import java.lang.Comparable;
import java.lang.Object;

public interface abstract WolverinePerformanceLevelInterface implements Comparable	// class@000a9e
{

    boolean equal(Object p0);
    boolean higherThan(Object p0);
    boolean isAtLeast(Object p0);
    boolean isAtMost(Object p0);
    boolean lowerThan(Object p0);
}
