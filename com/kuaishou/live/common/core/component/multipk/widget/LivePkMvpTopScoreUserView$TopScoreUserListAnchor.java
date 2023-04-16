package com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView$TopScoreUserListAnchor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePkMvpTopScoreUserView$TopScoreUserListAnchor extends Enum	// class@0016ab
{
    public int value;
    public static final LivePkMvpTopScoreUserView$TopScoreUserListAnchor[] $VALUES;
    public static final LivePkMvpTopScoreUserView$TopScoreUserListAnchor OPPONENT;
    public static final LivePkMvpTopScoreUserView$TopScoreUserListAnchor SELF;

    static {
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor topScoreUser = new LivePkMvpTopScoreUserView$TopScoreUserListAnchor("SELF", 0, 0);
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor.SELF = topScoreUser;
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor topScoreUser1 = new LivePkMvpTopScoreUserView$TopScoreUserListAnchor("OPPONENT", 1, 1);
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT = topScoreUser1;
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor[] topScoreUser2 = new LivePkMvpTopScoreUserView$TopScoreUserListAnchor[]{topScoreUser,topScoreUser1};
       LivePkMvpTopScoreUserView$TopScoreUserListAnchor.$VALUES = topScoreUser2;
    }
    public void LivePkMvpTopScoreUserView$TopScoreUserListAnchor(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LivePkMvpTopScoreUserView$TopScoreUserListAnchor valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePkMvpTopScoreUserView$TopScoreUserListAnchor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePkMvpTopScoreUserView$TopScoreUserListAnchor.class, p0);
    }
    public static LivePkMvpTopScoreUserView$TopScoreUserListAnchor[] values(){
       Object obj = PatchProxy.apply(null, null, LivePkMvpTopScoreUserView$TopScoreUserListAnchor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePkMvpTopScoreUserView$TopScoreUserListAnchor.$VALUES.clone();
    }
}
