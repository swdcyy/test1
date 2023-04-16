package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor extends Enum	// class@00162e
{
    public int value;
    public static final LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor[] $VALUES;
    public static final LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor OPPONENT;
    public static final LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor SELF;

    static {
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor topScoreUser = new LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor("SELF", 0, 0);
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.SELF = topScoreUser;
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor topScoreUser1 = new LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor("OPPONENT", 1, 1);
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.OPPONENT = topScoreUser1;
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor[] topScoreUser2 = new LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor[]{topScoreUser,topScoreUser1};
       LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.$VALUES = topScoreUser2;
    }
    public void LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.class, p0);
    }
    public static LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkMvpTopScoreUserView$TopScoreUserListAnchor.$VALUES.clone();
    }
}
