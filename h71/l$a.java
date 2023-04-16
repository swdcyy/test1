package h71.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class l$a	// class@00263a
{
    public final long ksCoinNum;
    public final long ksShell;
    public final long ksYellowDiamond;

    public void l$a(long p0,long p1,long p2){
       super();
       this.ksCoinNum = p0;
       this.ksYellowDiamond = p1;
       this.ksShell = p2;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof l$a && (!this.ksCoinNum - p0.ksCoinNum && (!this.ksYellowDiamond - p0.ksYellowDiamond && !this.ksShell - p0.ksShell)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       l$a obj = PatchProxy.apply(null, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ksCoinNum;
       l$a tksYellowDia = this.ksYellowDiamond;
       tksYellowDia = this.ksShell;
       return (((((int)(obj ^ (obj >> 32)) * 31) + (int)(tksYellowDia ^ (tksYellowDia >> 32))) * 31) + (int)(tksYellowDia ^ (tksYellowDia >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(ksCoinNum="+this.ksCoinNum+", ksYellowDiamond="+this.ksYellowDiamond+", ksShell="+this.ksShell+"\)";
    }
}
