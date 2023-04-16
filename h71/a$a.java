package h71.a$a;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@002629
{
    public final int type;
    public final LiveAudienceWishDetail wishBarrageCommentInfo;

    public final LiveAudienceWishDetail a(){
       return this.wishBarrageCommentInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (this.type == p0.type && a.g(this.wishBarrageCommentInfo, p0.wishBarrageCommentInfo)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       a$a twishBarrage = this.wishBarrageCommentInfo;
       int i1 = (twishBarrage != null)? twishBarrage.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(type="+this.type+", wishBarrageCommentInfo="+this.wishBarrageCommentInfo+"\)";
    }
}
