package com.kwai.performance.overhead.memory.monitor.pressure.MemoryPressureMonitor$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MemoryPressureMonitor$State extends Enum	// class@001164
{
    public static final MemoryPressureMonitor$State[] $VALUES;
    public static final MemoryPressureMonitor$State LOW_MEMORY;
    public static final MemoryPressureMonitor$State NORMAL_MEMORY;

    static {
       MemoryPressureMonitor$State state;
       MemoryPressureMonitor$State[] stateArray = new MemoryPressureMonitor$State[]{state,state};
       state = new MemoryPressureMonitor$State("NORMAL_MEMORY", 0);
       MemoryPressureMonitor$State.NORMAL_MEMORY = state;
       state = new MemoryPressureMonitor$State("LOW_MEMORY", 1);
       MemoryPressureMonitor$State.LOW_MEMORY = state;
       MemoryPressureMonitor$State.$VALUES = stateArray;
    }
    public void MemoryPressureMonitor$State(String p0,int p1){
       super(p0, p1);
    }
    public static MemoryPressureMonitor$State valueOf(String p0){
       return Enum.valueOf(MemoryPressureMonitor$State.class, p0);
    }
    public static MemoryPressureMonitor$State[] values(){
       return MemoryPressureMonitor$State.$VALUES.clone();
    }
}
