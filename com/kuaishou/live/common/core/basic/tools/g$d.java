package com.kuaishou.live.common.core.basic.tools.g$d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import java.util.Arrays;

public class g$d	// class@000ef3
{
    public boolean a;
    public String[] b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public DownloadTask$DownloadTaskType h;
    public boolean i;
    public boolean j;

    public void g$d(){
       super();
       this.g = -1;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, g$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c+File.separator+this.d;
    }
    public boolean b(){
       int i = 1;
       if ((this.g + i) < this.b.length) {
       }else {
          i = false;
       }
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskInfo{mIsZip="+this.a+", bizType="+this.f+", mUrls="+Arrays.toString(this.b)+", mTargetDirPath=\'"+this.c+'''+", mTargetFileName=\'"+this.d+'''+", mMD5=\'"+this.e+'''+", mCurrentIndex="+this.g+", downloadTaskType="+this.h+", mIsSkipLimitSpeed="+this.i+'}';
    }
}
