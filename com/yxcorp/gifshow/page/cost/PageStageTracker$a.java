package com.yxcorp.gifshow.page.cost.PageStageTracker$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PageStageTracker$a	// class@000e17
{
    public long a;
    public long b;

    public void PageStageTracker$a(){
       super();
    }
    public static boolean a(PageStageTracker$a p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       PageStageTracker$a a = p0.a;
       if (a > 0) {
          PageStageTracker$a b1 = p0.b;
          if (b1 > 0 && (b1 - a) > 0) {
             b = true;
          }
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PageStageTracker$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageStage{mStartTime="+this.a+", mEndTime="+this.b+'}';
    }
}
