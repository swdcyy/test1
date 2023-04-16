package com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$BoxListTipsStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TreasureBoxCommonModel$BoxListTipsStatus extends Enum	// class@001c75
{
    public static final TreasureBoxCommonModel$BoxListTipsStatus[] $VALUES;
    public static final TreasureBoxCommonModel$BoxListTipsStatus EMPTY;
    public static final TreasureBoxCommonModel$BoxListTipsStatus FAILED;
    public static final TreasureBoxCommonModel$BoxListTipsStatus LOADING;
    public static final TreasureBoxCommonModel$BoxListTipsStatus NONE;
    public static final TreasureBoxCommonModel$BoxListTipsStatus SUCCESS;
    public static final TreasureBoxCommonModel$BoxListTipsStatus UN_LOGIN;

    static {
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips = new TreasureBoxCommonModel$BoxListTipsStatus("LOADING", 0);
       TreasureBoxCommonModel$BoxListTipsStatus.LOADING = uBoxListTips;
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips1 = new TreasureBoxCommonModel$BoxListTipsStatus("EMPTY", 1);
       TreasureBoxCommonModel$BoxListTipsStatus.EMPTY = uBoxListTips1;
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips2 = new TreasureBoxCommonModel$BoxListTipsStatus("SUCCESS", 2);
       TreasureBoxCommonModel$BoxListTipsStatus.SUCCESS = uBoxListTips2;
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips3 = new TreasureBoxCommonModel$BoxListTipsStatus("FAILED", 3);
       TreasureBoxCommonModel$BoxListTipsStatus.FAILED = uBoxListTips3;
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips4 = new TreasureBoxCommonModel$BoxListTipsStatus("NONE", 4);
       TreasureBoxCommonModel$BoxListTipsStatus.NONE = uBoxListTips4;
       TreasureBoxCommonModel$BoxListTipsStatus uBoxListTips5 = new TreasureBoxCommonModel$BoxListTipsStatus("UN_LOGIN", 5);
       TreasureBoxCommonModel$BoxListTipsStatus.UN_LOGIN = uBoxListTips5;
       TreasureBoxCommonModel$BoxListTipsStatus[] uBoxListTips6 = new TreasureBoxCommonModel$BoxListTipsStatus[]{uBoxListTips,uBoxListTips1,uBoxListTips2,uBoxListTips3,uBoxListTips4,uBoxListTips5};
       TreasureBoxCommonModel$BoxListTipsStatus.$VALUES = uBoxListTips6;
    }
    public void TreasureBoxCommonModel$BoxListTipsStatus(String p0,int p1){
       super(p0, p1);
    }
    public static TreasureBoxCommonModel$BoxListTipsStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TreasureBoxCommonModel$BoxListTipsStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TreasureBoxCommonModel$BoxListTipsStatus.class, p0);
    }
    public static TreasureBoxCommonModel$BoxListTipsStatus[] values(){
       Object obj = PatchProxy.apply(null, null, TreasureBoxCommonModel$BoxListTipsStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TreasureBoxCommonModel$BoxListTipsStatus.$VALUES.clone();
    }
}
