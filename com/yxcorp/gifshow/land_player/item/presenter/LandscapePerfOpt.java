package com.yxcorp.gifshow.land_player.item.presenter.LandscapePerfOpt;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LandscapePerfOpt extends Enum	// class@001a21
{
    public final String presenterName;
    public static final LandscapePerfOpt[] $VALUES;
    public static final LandscapePerfOpt DOUBLE_TAP_LIKE;
    public static final LandscapePerfOpt LIKE;
    public static final LandscapePerfOpt LOCK_BTN;
    public static final LandscapePerfOpt MORE_BTN;
    public static final LandscapePerfOpt QUALITY_BTN;
    public static final LandscapePerfOpt SHARE;
    public static final LandscapePerfOpt SHARE_IMAGE;
    public static final LandscapePerfOpt SPEED_BTN;
    public static final LandscapePerfOpt TITLE;

    static {
       LandscapePerfOpt[] landscapePer = new LandscapePerfOpt[9];
       LandscapePerfOpt landscapePer1 = new LandscapePerfOpt("TITLE", 0, "title");
       LandscapePerfOpt.TITLE = landscapePer1;
       landscapePer[0] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("LIKE", 1, "like");
       LandscapePerfOpt.LIKE = landscapePer1;
       landscapePer[1] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("DOUBLE_TAP_LIKE", 2, "doubleTapLike");
       LandscapePerfOpt.DOUBLE_TAP_LIKE = landscapePer1;
       landscapePer[2] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("SHARE", 3, "share");
       LandscapePerfOpt.SHARE = landscapePer1;
       landscapePer[3] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("SHARE_IMAGE", 4, "shareImage");
       LandscapePerfOpt.SHARE_IMAGE = landscapePer1;
       landscapePer[4] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("MORE_BTN", 5, "moreBtn");
       LandscapePerfOpt.MORE_BTN = landscapePer1;
       landscapePer[5] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("QUALITY_BTN", 6, "qualityBtn");
       LandscapePerfOpt.QUALITY_BTN = landscapePer1;
       landscapePer[6] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("SPEED_BTN", 7, "speedBtn");
       LandscapePerfOpt.SPEED_BTN = landscapePer1;
       landscapePer[7] = landscapePer1;
       landscapePer1 = new LandscapePerfOpt("LOCK_BTN", 8, "lockBtn");
       LandscapePerfOpt.LOCK_BTN = landscapePer1;
       landscapePer[8] = landscapePer1;
       LandscapePerfOpt.$VALUES = landscapePer;
    }
    public void LandscapePerfOpt(String p0,int p1,String p2){
       super(p0, p1);
       this.presenterName = p2;
    }
    public static LandscapePerfOpt valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LandscapePerfOpt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LandscapePerfOpt.class, p0);
    }
    public static LandscapePerfOpt[] values(){
       Object obj = PatchProxy.apply(null, null, LandscapePerfOpt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LandscapePerfOpt.$VALUES.clone();
    }
    public final String getPresenterName(){
       return this.presenterName;
    }
}
