package com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus extends Enum	// class@001697
{
    public static final SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus[] $VALUES;
    public static final SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus CURRENT_POSITION_DISABLE;
    public static final SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus ENABLE;
    public static final SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus USER_DISABLE;

    static {
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus uAutoPlayNex = new SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus("ENABLE", 0);
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE = uAutoPlayNex;
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus uAutoPlayNex1 = new SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus("USER_DISABLE", 1);
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.USER_DISABLE = uAutoPlayNex1;
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus uAutoPlayNex2 = new SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus("CURRENT_POSITION_DISABLE", 2);
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE = uAutoPlayNex2;
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus[] uAutoPlayNex3 = new SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus[]{uAutoPlayNex,uAutoPlayNex1,uAutoPlayNex2};
       SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.$VALUES = uAutoPlayNex3;
    }
    public void SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus(String p0,int p1){
       super(p0, p1);
    }
    public static SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.class, p0);
    }
    public static SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus[] values(){
       Object obj = PatchProxy.apply(null, null, SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.$VALUES.clone();
    }
}
