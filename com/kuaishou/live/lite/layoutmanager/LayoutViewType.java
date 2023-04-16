package com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LayoutViewType extends Enum implements p	// class@0009e4
{
    public static final LayoutViewType[] $VALUES;
    public static final LayoutViewType AnchorInfoBar;
    public static final LayoutViewType BottomBar;
    public static final LayoutViewType BottomBubble;
    public static final LayoutViewType ComboComment;
    public static final LayoutViewType CommentAreaAnimation;
    public static final LayoutViewType CommentList;
    public static final LayoutViewType DebugContainerView;
    public static final LayoutViewType EnterRoomMessage;
    public static final LayoutViewType FullscreenLikeEffect;
    public static final LayoutViewType GiftEffect;
    public static final LayoutViewType GiftSlot;
    public static final LayoutViewType LikeEffect;
    public static final LayoutViewType MultiChat;
    public static final LayoutViewType MultiChatV2;
    public static final LayoutViewType MultiLine;
    public static final LayoutViewType PK;
    public static final LayoutViewType PlayerDebugInfo;
    public static final LayoutViewType PlayerViewBackground;
    public static final LayoutViewType PlayerViewMask;
    public static final LayoutViewType RecommendAnchorInfoBar;
    public static final LayoutViewType RightBottomBar;
    public static final LayoutViewType SquareNoticeArea;
    public static final LayoutViewType TempPlayArea;
    public static final LayoutViewType TreasureBox;
    public static final LayoutViewType VoicePartyBackground;
    public static final LayoutViewType VoicePartyContent;

    static {
       LayoutViewType[] layoutViewTy = new LayoutViewType[26];
       LayoutViewType layoutViewTy1 = new LayoutViewType("RightBottomBar", 0);
       LayoutViewType.RightBottomBar = layoutViewTy1;
       layoutViewTy[0] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("BottomBar", 1);
       LayoutViewType.BottomBar = layoutViewTy1;
       layoutViewTy[1] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("CommentList", 2);
       LayoutViewType.CommentList = layoutViewTy1;
       layoutViewTy[2] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("CommentAreaAnimation", 3);
       LayoutViewType.CommentAreaAnimation = layoutViewTy1;
       layoutViewTy[3] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("AnchorInfoBar", 4);
       LayoutViewType.AnchorInfoBar = layoutViewTy1;
       layoutViewTy[4] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("RecommendAnchorInfoBar", 5);
       LayoutViewType.RecommendAnchorInfoBar = layoutViewTy1;
       layoutViewTy[5] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("SquareNoticeArea", 6);
       LayoutViewType.SquareNoticeArea = layoutViewTy1;
       layoutViewTy[6] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("GiftSlot", 7);
       LayoutViewType.GiftSlot = layoutViewTy1;
       layoutViewTy[7] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("GiftEffect", 8);
       LayoutViewType.GiftEffect = layoutViewTy1;
       layoutViewTy[8] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("LikeEffect", 9);
       LayoutViewType.LikeEffect = layoutViewTy1;
       layoutViewTy[9] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("FullscreenLikeEffect", 10);
       LayoutViewType.FullscreenLikeEffect = layoutViewTy1;
       layoutViewTy[10] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("MultiChat", 11);
       LayoutViewType.MultiChat = layoutViewTy1;
       layoutViewTy[11] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("MultiChatV2", 12);
       LayoutViewType.MultiChatV2 = layoutViewTy1;
       layoutViewTy[12] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("MultiLine", 13);
       LayoutViewType.MultiLine = layoutViewTy1;
       layoutViewTy[13] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("PK", 14);
       LayoutViewType.PK = layoutViewTy1;
       layoutViewTy[14] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("PlayerViewMask", 15);
       LayoutViewType.PlayerViewMask = layoutViewTy1;
       layoutViewTy[15] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("PlayerViewBackground", 16);
       LayoutViewType.PlayerViewBackground = layoutViewTy1;
       layoutViewTy[16] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("EnterRoomMessage", 17);
       LayoutViewType.EnterRoomMessage = layoutViewTy1;
       layoutViewTy[17] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("TempPlayArea", 18);
       LayoutViewType.TempPlayArea = layoutViewTy1;
       layoutViewTy[18] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("VoicePartyBackground", 19);
       LayoutViewType.VoicePartyBackground = layoutViewTy1;
       layoutViewTy[19] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("VoicePartyContent", 20);
       LayoutViewType.VoicePartyContent = layoutViewTy1;
       layoutViewTy[20] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("PlayerDebugInfo", 21);
       LayoutViewType.PlayerDebugInfo = layoutViewTy1;
       layoutViewTy[21] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("TreasureBox", 22);
       LayoutViewType.TreasureBox = layoutViewTy1;
       layoutViewTy[22] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("BottomBubble", 23);
       LayoutViewType.BottomBubble = layoutViewTy1;
       layoutViewTy[23] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("ComboComment", 24);
       LayoutViewType.ComboComment = layoutViewTy1;
       layoutViewTy[24] = layoutViewTy1;
       layoutViewTy1 = new LayoutViewType("DebugContainerView", 25);
       LayoutViewType.DebugContainerView = layoutViewTy1;
       layoutViewTy[25] = layoutViewTy1;
       LayoutViewType.$VALUES = layoutViewTy;
    }
    public void LayoutViewType(String p0,int p1){
       super(p0, p1);
    }
    public static LayoutViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LayoutViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LayoutViewType.class, p0);
    }
    public static LayoutViewType[] values(){
       Object obj = PatchProxy.apply(null, null, LayoutViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LayoutViewType.$VALUES.clone();
    }
}
