package com.kwai.locallife.live.widget.model.MountArea;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MountArea extends Enum	// class@000ebe
{
    public static final MountArea[] $VALUES;
    public static final MountArea ATMOSPHERE_AREA;
    public static final MountArea BOTTOM_BUBBLE;
    public static final MountArea CENTER_MSG_BARRAGE;
    public static final MountArea COMMENT_TOP_BARRAGE;
    public static final MountArea GOODS_MESSAGE;
    public static final MountArea LIVE_TOP;
    public static final MountArea LIVE_WATCH_AVATAR;
    public static final MountArea MERCHANT_LEFT_TOP;
    public static final MountArea RIGHT_BOTTOM;
    public static final MountArea RIGHT_BOTTOM_SLIDE;
    public static final MountArea RIGHT_CENTER;
    public static final MountArea TEMP_ENHANCE_MESSAGE;

    static {
       MountArea[] mountAreaArr = new MountArea[12];
       MountArea mountArea = new MountArea("RIGHT_BOTTOM", 0);
       MountArea.RIGHT_BOTTOM = mountArea;
       mountAreaArr[0] = mountArea;
       mountArea = new MountArea("RIGHT_BOTTOM_SLIDE", 1);
       MountArea.RIGHT_BOTTOM_SLIDE = mountArea;
       mountAreaArr[1] = mountArea;
       mountArea = new MountArea("LIVE_TOP", 2);
       MountArea.LIVE_TOP = mountArea;
       mountAreaArr[2] = mountArea;
       mountArea = new MountArea("MERCHANT_LEFT_TOP", 3);
       MountArea.MERCHANT_LEFT_TOP = mountArea;
       mountAreaArr[3] = mountArea;
       mountArea = new MountArea("GOODS_MESSAGE", 4);
       MountArea.GOODS_MESSAGE = mountArea;
       mountAreaArr[4] = mountArea;
       mountArea = new MountArea("BOTTOM_BUBBLE", 5);
       MountArea.BOTTOM_BUBBLE = mountArea;
       mountAreaArr[5] = mountArea;
       mountArea = new MountArea("RIGHT_CENTER", 6);
       MountArea.RIGHT_CENTER = mountArea;
       mountAreaArr[6] = mountArea;
       mountArea = new MountArea("COMMENT_TOP_BARRAGE", 7);
       MountArea.COMMENT_TOP_BARRAGE = mountArea;
       mountAreaArr[7] = mountArea;
       mountArea = new MountArea("CENTER_MSG_BARRAGE", 8);
       MountArea.CENTER_MSG_BARRAGE = mountArea;
       mountAreaArr[8] = mountArea;
       mountArea = new MountArea("LIVE_WATCH_AVATAR", 9);
       MountArea.LIVE_WATCH_AVATAR = mountArea;
       mountAreaArr[9] = mountArea;
       mountArea = new MountArea("ATMOSPHERE_AREA", 10);
       MountArea.ATMOSPHERE_AREA = mountArea;
       mountAreaArr[10] = mountArea;
       mountArea = new MountArea("TEMP_ENHANCE_MESSAGE", 11);
       MountArea.TEMP_ENHANCE_MESSAGE = mountArea;
       mountAreaArr[11] = mountArea;
       MountArea.$VALUES = mountAreaArr;
    }
    public void MountArea(String p0,int p1){
       super(p0, p1);
    }
    public static MountArea valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MountArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MountArea.class, p0);
    }
    public static MountArea[] values(){
       Object obj = PatchProxy.apply(null, null, MountArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MountArea.$VALUES.clone();
    }
}
