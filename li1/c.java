package li1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002f75
{
    public final int currentStageType;
    public final boolean gameOver;
    public final int nextStageType;

    public final int a(){
       return this.currentStageType;
    }
    public final int b(){
       return this.nextStageType;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof c && (this.gameOver == p0.gameOver && (this.currentStageType == p0.currentStageType && this.nextStageType == p0.nextStageType)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.gameOver;
       if (obj != null) {
          i = 1;
       }
       return ((((i * 31) + this.currentStageType) * 31) + this.nextStageType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRechargeGiftEffectSdkMessage\(gameOver="+this.gameOver+", currentStageType="+this.currentStageType+", nextStageType="+this.nextStageType+"\)";
    }
}
