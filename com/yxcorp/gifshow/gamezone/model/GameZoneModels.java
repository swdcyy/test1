package com.yxcorp.gifshow.gamezone.model.GameZoneModels;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.gamezone.model.a;
import yp.x$a;
import yp.x;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import tma.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo;
import fa6.c;
import fa6.e;
import fa6.b;

public class GameZoneModels implements Serializable	// class@0012c9
{
    public int mAutoPlayPriority;
    public GameZoneModels$GzoneLiveCornerMarker mCornerMarker;
    public GameZoneModels$GameInfo mGameInfo;
    public int mMMUCornerMark;
    public CDNUrl[] mRevenueRankWinnerIcon;
    public String mTopRightCornerMark;
    public static final String PART_FIELD = "gameZoneModels";
    public static final long serialVersionUID = 0x5f7533468a1e41cf;

    public void GameZoneModels(){
       super();
    }
    public static void addLiveStreamPackageParamHandler(){
       if (PatchProxy.applyVoid(null, null, GameZoneModels.class, "2")) {
          return;
       }
       x.c(a.a);
       return;
    }
    public static void lambda$addLiveStreamPackageParamHandler$0(LiveStreamFeed p0,ClientContent$LiveStreamPackage p1){
       GameZoneModels$GameInfo gameInfo = a.a.b(p0);
       if (gameInfo != null) {
          p1.gameId = gameInfo.mGameId;
          p1.gameName = gameInfo.mGameName;
       }
       return;
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, GameZoneModels.class, "1")) {
          return;
       }
       e uoe = new e(GameZoneModels.class, "", "gameZoneModels");
       uoe.a(null);
       c.a.e(LiveStreamFeed.class, uoe);
       return;
    }
}
