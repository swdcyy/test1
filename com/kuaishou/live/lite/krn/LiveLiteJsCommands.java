package com.kuaishou.live.lite.krn.LiveLiteJsCommands;
import o63.k;
import java.lang.Enum;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$1;
import java.lang.String;
import msd.a;
import o63.r;
import nsd.u;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$2;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$3;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$4;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$5;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$6;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$7;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$8;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$9;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$10;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$11;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$12;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$13;
import com.kuaishou.live.lite.krn.LiveLiteJsCommands$a;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteJsCommands extends Enum implements k	// class@0009dc
{
    public final String commandName;
    public final a commandProvider;
    public final String nameSpace;
    public final r supportedScene;
    public static final LiveLiteJsCommands[] $VALUES;
    public static final LiveLiteJsCommands BatchFetchResourcePath;
    public static final LiveLiteJsCommands BatchQueryFollowStatus;
    public static final LiveLiteJsCommands ClosePage;
    public static final LiveLiteJsCommands$a Companion;
    public static final LiveLiteJsCommands DispatchLiveRouter;
    public static final LiveLiteJsCommands FollowUser;
    public static final LiveLiteJsCommands GetLiveRoomInfo;
    public static final LiveLiteJsCommands LiveEncourageTreasureShowResultDialog;
    public static final LiveLiteJsCommands LiveEncourageTreasureTimerQuery;
    public static final LiveLiteJsCommands LiveMerchantBridgeRouter;
    public static final LiveLiteJsCommands LiveMerchantPendant;
    public static final LiveLiteJsCommands LiveRouter;
    public static final LiveLiteJsCommands Logger;
    public static final LiveLiteJsCommands NavigateToH5;
    public static final Collection allCommandIds;
    public static final Map mapping;

    static {
       LiveLiteJsCommands[] liveLiteJsCo = new LiveLiteJsCommands[13];
       LiveLiteJsCommands.LiveRouter = v10;
       int i = 0;
       liveLiteJsCo[i] = v10;
       LiveLiteJsCommands liveLiteJsCo2 = new LiveLiteJsCommands("GetLiveRoomInfo", 1, "getLiveRoomInfo", LiveLiteJsCommands$2.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.GetLiveRoomInfo = v2;
       liveLiteJsCo[1] = v2;
       LiveLiteJsCommands liveLiteJsCo3 = new LiveLiteJsCommands("DispatchLiveRouter", 2, "dispatchLiveRouter", LiveLiteJsCommands$3.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.DispatchLiveRouter = v2;
       liveLiteJsCo[2] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("ClosePage", 3, "closePage", LiveLiteJsCommands$4.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.ClosePage = v2;
       liveLiteJsCo[3] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("NavigateToH5", 4, "navigateToH5", LiveLiteJsCommands$5.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.NavigateToH5 = v2;
       liveLiteJsCo[4] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("BatchFetchResourcePath", 5, "batchFetchResourcePath", LiveLiteJsCommands$6.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.BatchFetchResourcePath = v2;
       liveLiteJsCo[5] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("BatchQueryFollowStatus", 6, "batchQueryFollowStatus", LiveLiteJsCommands$7.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.BatchQueryFollowStatus = v2;
       liveLiteJsCo[6] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("Logger", 7, "logger", LiveLiteJsCommands$8.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.Logger = v2;
       liveLiteJsCo[7] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("FollowUser", 8, "followUser", LiveLiteJsCommands$9.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.FollowUser = v2;
       liveLiteJsCo[8] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("LiveMerchantBridgeRouter", 9, "liveMerchantBridgeCommand", LiveLiteJsCommands$10.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.LiveMerchantBridgeRouter = v2;
       liveLiteJsCo[9] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("LiveMerchantPendant", 10, "liveMerchantPendant", LiveLiteJsCommands$11.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.LiveMerchantPendant = v2;
       liveLiteJsCo[10] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("LiveEncourageTreasureShowResultDialog", 11, "LiveEncourageTreasureShowResultDialog", LiveLiteJsCommands$12.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.LiveEncourageTreasureShowResultDialog = v2;
       liveLiteJsCo[11] = v2;
       liveLiteJsCo3 = new LiveLiteJsCommands("LiveEncourageTreasureTimerQuery", 12, "LiveEncourageTreasureTimerQuery", LiveLiteJsCommands$13.INSTANCE, null, null, 12, null);
       LiveLiteJsCommands.LiveEncourageTreasureTimerQuery = v2;
       liveLiteJsCo[12] = v2;
       LiveLiteJsCommands.$VALUES = liveLiteJsCo;
       LiveLiteJsCommands.Companion = new LiveLiteJsCommands$a(null);
       liveLiteJsCo = LiveLiteJsCommands.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveLiteJsCo.length), 16));
       int len = liveLiteJsCo.length;
       for (LiveLiteJsCommands liveLiteJsCo1 = new LiveLiteJsCommands("LiveRouter", 0, "liveRouter", LiveLiteJsCommands$1.INSTANCE, null, null, 12, null); i < len; i = i + 1) {
          object oobject = liveLiteJsCo[i];
          linkedHashMa.put(oobject.getCommandName(), oobject);
       }
       LiveLiteJsCommands.mapping = linkedHashMa;
       LiveLiteJsCommands.allCommandIds = linkedHashMa.values();
    }
    public void LiveLiteJsCommands(String p0,int p1,String p2,a p3,r p4,String p5){
       super(p0, p1);
       this.commandName = p2;
       this.commandProvider = p3;
       this.supportedScene = p4;
       this.nameSpace = p5;
    }
    public void LiveLiteJsCommands(String p0,int p1,String p2,a p3,r p4,String p5,int p6,u p7){
       if (p6 & 0x04) {
          p4 = r.h;
       }
       r or = p4;
       if (p6 & 0x08) {
          p5 = "KwaiLive";
       }
       super(p0, p1, p2, p3, or, p5);
       return;
    }
    public static final Collection getAllCommandIds(){
       return LiveLiteJsCommands.allCommandIds;
    }
    public static LiveLiteJsCommands valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteJsCommands.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteJsCommands.class, p0);
    }
    public static LiveLiteJsCommands[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteJsCommands.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteJsCommands.$VALUES.clone();
    }
    public String getCommandName(){
       return this.commandName;
    }
    public a getCommandProvider(){
       return this.commandProvider;
    }
    public String getNameSpace(){
       return this.nameSpace;
    }
    public r getSupportedScene(){
       return this.supportedScene;
    }
}
