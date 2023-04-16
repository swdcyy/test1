package com.kwai.performance.overhead.battery.monitor.model.CpuException$ThreadCostInfo;
import java.io.Serializable;
import java.lang.Object;
import ag7.j;
import java.lang.Thread;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.StackTraceElement;
import java.util.Map;
import com.kwai.performance.overhead.battery.monitor.model.b;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class CpuException$ThreadCostInfo implements Serializable	// class@00113d
{
    public long cpuTime;
    public String name;
    public List relateTree;
    public long stm;
    public int threadMatchCount;
    public int tid;
    public StackTree tree;
    public long utm;

    public void CpuException$ThreadCostInfo(){
       super();
    }
    public void CpuException$ThreadCostInfo(j p0){
       super();
       this.tid = p0.a;
       this.name = p0.b;
    }
    public final StackTree a(Thread p0,List p1){
       StackTree stackTree = new StackTree();
       stackTree.threadId = Long.valueOf(p0.getId());
       stackTree.threadName = p0.getName();
       if (p1 == null) {
          stackTree.samplingCount = Integer.valueOf(-1);
          return stackTree;
       }else {
          stackTree.samplingCount = Integer.valueOf(p1.size());
          if (!p1.size()) {
             return stackTree;
          }
          Iterator iterator = p1.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             StackTraceElement[] stackTraceEl = iterator.next();
             int i1 = stackTraceEl.length - 1;
             StackTree stackTree1 = stackTree;
             StackTree stackTree2 = stackTree1;
             int i2 = 0;
             while (i1 >= 0) {
                String str = stackTraceEl[i1].toString();
                if (i2) {
                   if (stackTree1.children.containsKey(str)) {
                      stackTree2 = stackTree1.children.get(str);
                   }else {
                      stackTree2 = new StackTree();
                      i = i + 1;
                      stackTree1.children.put(str, stackTree2);
                   }
                }
                if (stackTree2 != null) {
                   stackTree2.stackFrame = str;
                   stackTree1 = stackTree2.count;
                   int i3 = (stackTree1 == null)? 0: stackTree1.intValue();
                   i3 = i3 + 1;
                   stackTree2.count = Integer.valueOf(i3);
                   stackTree2.level = Integer.valueOf(i2);
                   stackTree1 = stackTree2;
                }
                i1 = i1 - 1;
                i2 = i2 + 1;
             }
          }
          stackTree.childCount = Integer.valueOf(i);
          stackTree.depth = Integer.valueOf(stackTree.buildStack());
          return stackTree;
       }
    }
    public void checkRoot(){
       if (this.tree == null) {
          CpuException$ThreadCostInfo trelateTree = this.relateTree;
          if (trelateTree != null && trelateTree.size()) {
             Collections.sort(this.relateTree, b.b);
             this.tree = this.relateTree.get(0);
          }
       }
       return;
    }
    public void initRelateStack(Thread p0,List p1){
       if (this.relateTree == null) {
          this.relateTree = new ArrayList();
       }
       this.relateTree.add(this.a(p0, p1));
       return;
    }
    public void initStack(Thread p0,List p1){
       this.tree = this.a(p0, p1);
    }
}
