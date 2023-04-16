package com.kwai.performance.overhead.battery.monitor.model.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.model.CpuException$ThreadCostInfo;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import java.lang.Integer;

public final class a implements Comparator	// class@001143
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       CpuException$ThreadCostInfo tree = p0.tree;
       int i = -1;
       if (tree == null || p1.tree != null) {
          if (tree != null || p1.tree == null) {
             if (tree == null) {
                tree = p1.cpuTime;
                p0 = p0.cpuTime;
             }else if(tree.samplingCount.intValue() > 0 && p1.tree.samplingCount.intValue() <= 0){
                if (p0.tree.samplingCount.intValue() > 0 || p1.tree.samplingCount.intValue() <= 0) {
                   tree = p1.cpuTime;
                   p0 = p0.cpuTime;
                }
             }
             i = (int)(tree - p0);
          }
          i = 1;
       }
       return i;
    }
}
