package com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper$JvmtiInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class AnrWithJvmtiHelper$JvmtiInfo implements Serializable	// class@001207
{
    public String[] classLoadInfo;
    public int classLoadInfoCount;
    public long costCpu1;
    public long costCpu2;
    public long costWall1;
    public long costWall2;
    public String[] gcInfo;
    public int gcInfoCount;

    public void AnrWithJvmtiHelper$JvmtiInfo(){
       super();
       this.gcInfoCount = 0;
       this.classLoadInfoCount = 0;
       this.costWall1 = 0;
       this.costCpu1 = 0;
       this.costWall2 = 0;
       this.costCpu2 = 0;
    }
    public String toString(){
       StringBuilder str = "JvmtiInfo{gcInfo\(";
       AnrWithJvmtiHelper$JvmtiInfo tgcInfo = this.gcInfo;
       int i = -1;
       int len = (tgcInfo != null)? tgcInfo.length: -1;
       String str1 = "/";
       str = str+len+str1+this.gcInfoCount+"\), classLoadInfo\(";
       AnrWithJvmtiHelper$JvmtiInfo tclassLoadIn = this.classLoadInfo;
       if (tclassLoadIn != null) {
          i = tclassLoadIn.length;
       }
       return str+i+str1+this.classLoadInfoCount+"\), wall="+(this.costWall1 + this.costWall2)+", cpu="+(this.costCpu1 + this.costCpu2)+"}";
    }
    public String toStringFull(){
       return "JvmtiInfo{costWall1="+this.costWall1+", costCpu1="+this.costCpu1+", costWall2="+this.costWall2+", costCpu2="+this.costCpu2+", gcInfoCount="+this.gcInfoCount+", classLoadInfoCount="+this.classLoadInfoCount+", gcInfo="+Arrays.toString(this.gcInfo)+", classLoadInfo="+Arrays.toString(this.classLoadInfo)+'}';
    }
}
