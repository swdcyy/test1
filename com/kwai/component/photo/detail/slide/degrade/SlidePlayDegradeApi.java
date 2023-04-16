package com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class SlidePlayDegradeApi extends Enum	// class@000a50
{
    public int mCurrDegradeCount;
    public final int mNeedDegradeCount;
    public static final SlidePlayDegradeApi[] $VALUES;
    public static final SlidePlayDegradeApi COMMENT_LIST;
    public static final SlidePlayDegradeApi PHOTO_START_UP;
    public static final SlidePlayDegradeApi USER_PROFILE;

    static {
       SlidePlayDegradeApi slidePlayDeg = new SlidePlayDegradeApi("COMMENT_LIST", 0, 2);
       SlidePlayDegradeApi.COMMENT_LIST = slidePlayDeg;
       SlidePlayDegradeApi slidePlayDeg1 = new SlidePlayDegradeApi("PHOTO_START_UP", 1, 1);
       SlidePlayDegradeApi.PHOTO_START_UP = slidePlayDeg1;
       SlidePlayDegradeApi slidePlayDeg2 = new SlidePlayDegradeApi("USER_PROFILE", 2, 1);
       SlidePlayDegradeApi.USER_PROFILE = slidePlayDeg2;
       SlidePlayDegradeApi[] slidePlayDeg3 = new SlidePlayDegradeApi[]{slidePlayDeg,slidePlayDeg1,slidePlayDeg2};
       SlidePlayDegradeApi.$VALUES = slidePlayDeg3;
    }
    public void SlidePlayDegradeApi(String p0,int p1,int p2){
       super(p0, p1);
       this.mNeedDegradeCount = p2;
    }
    public static void setNeedDegrade(boolean p0){
       SlidePlayDegradeApi slidePlayDeg = SlidePlayDegradeApi.class;
       if (PatchProxy.isSupport(slidePlayDeg) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, slidePlayDeg, "3")) {
          return;
       }
       SlidePlayDegradeApi[] slidePlayDeg1 = SlidePlayDegradeApi.values();
       int len = slidePlayDeg1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = slidePlayDeg1[i];
          SlidePlayDegradeApi mNeedDegrade = (p0)? oobject.mNeedDegradeCount: 0;
          oobject.setCurrDegradeCount(mNeedDegrade);
       }
       return;
    }
    public static SlidePlayDegradeApi valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayDegradeApi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SlidePlayDegradeApi.class, p0);
    }
    public static SlidePlayDegradeApi[] values(){
       Object obj = PatchProxy.apply(null, null, SlidePlayDegradeApi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayDegradeApi.$VALUES.clone();
    }
    public void setCurrDegradeCount(int p0){
       this.mCurrDegradeCount = p0;
    }
    public final boolean shouldDegrade(){
       SlidePlayDegradeApi tmCurrDegrad = this.mCurrDegradeCount;
       boolean b = (tmCurrDegrad > null)? true: false;
       if (b) {
          this.mCurrDegradeCount = tmCurrDegrad - 1;
       }
       return b;
    }
}
