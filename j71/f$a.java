package j71.f$a;
import java.lang.String;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$a	// class@002a59
{
    public final Integer chatType;
    public final String extraInfo;
    public final LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee liveLineInvitee;
    public Boolean shouldKeepPKPanelShow;
    public final int sourceType;

    public final String a(){
       return this.extraInfo;
    }
    public final LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee b(){
       return this.liveLineInvitee;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a && (a.g(this.liveLineInvitee, p0.liveLineInvitee) && (this.sourceType == p0.sourceType && (a.g(this.chatType, p0.chatType) && (a.g(this.extraInfo, p0.extraInfo) && a.g(this.shouldKeepPKPanelShow, p0.shouldKeepPKPanelShow))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveLineInvitee;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.sourceType) * 31;
       f$a tchatType = this.chatType;
       int i2 = (tchatType != null)? tchatType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchatType = this.extraInfo;
       i2 = (tchatType != null)? tchatType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchatType = this.shouldKeepPKPanelShow;
       if (tchatType != null) {
          i = tchatType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(liveLineInvitee="+this.liveLineInvitee+", sourceType="+this.sourceType+", chatType="+this.chatType+", extraInfo="+this.extraInfo+", shouldKeepPKPanelShow="+this.shouldKeepPKPanelShow+"\)";
    }
}
