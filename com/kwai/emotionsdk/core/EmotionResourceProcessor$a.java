package com.kwai.emotionsdk.core.EmotionResourceProcessor$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EmotionResourceProcessor$a	// class@000d8c
{
    public final int a;
    public boolean b;

    public void EmotionResourceProcessor$a(){
       super(-1, false);
    }
    public void EmotionResourceProcessor$a(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int a(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof EmotionResourceProcessor$a && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, EmotionResourceProcessor$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       EmotionResourceProcessor$a tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EmotionResourceProcessor$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadTaskState\(id="+this.a+", isHigherDownloadPriority="+this.b+"\)";
    }
}
