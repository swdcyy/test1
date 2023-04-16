package as1.b;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@000297
{
    public final LivePuzzleUserInfo a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public void b(LivePuzzleUserInfo p0,int p1,int p2,int p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final int a(){
       return this.b;
    }
    public final int b(){
       return this.d;
    }
    public final LivePuzzleUserInfo c(){
       return this.a;
    }
    public final int d(){
       return this.c;
    }
    public final boolean e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
       b te = this.e;
       if (te != null) {
          te = 1;
       }
       return (i + te);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLinePuzzleParticipantInfoModel\(puzzleUserInfo="+this.a+", puzzleRoleType="+this.b+", selfAnchorPuzzleRoleType="+this.c+", puzzleStatus="+this.d+", isAllQuestionAnswered="+this.e+"\)";
    }
}
