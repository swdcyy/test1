package com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter$PersonalizedTabState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ThanosSplashPresenter$PersonalizedTabState extends Enum	// class@0017d9
{
    public static final ThanosSplashPresenter$PersonalizedTabState[] $VALUES;
    public static final ThanosSplashPresenter$PersonalizedTabState NO_NEED;
    public static final ThanosSplashPresenter$PersonalizedTabState WAITING_DATA_END;
    public static final ThanosSplashPresenter$PersonalizedTabState WAITING_TAB_SWITCH;

    static {
       ThanosSplashPresenter$PersonalizedTabState personalized = new ThanosSplashPresenter$PersonalizedTabState("NO_NEED", 0);
       ThanosSplashPresenter$PersonalizedTabState.NO_NEED = personalized;
       ThanosSplashPresenter$PersonalizedTabState personalized1 = new ThanosSplashPresenter$PersonalizedTabState("WAITING_DATA_END", 1);
       ThanosSplashPresenter$PersonalizedTabState.WAITING_DATA_END = personalized1;
       ThanosSplashPresenter$PersonalizedTabState personalized2 = new ThanosSplashPresenter$PersonalizedTabState("WAITING_TAB_SWITCH", 2);
       ThanosSplashPresenter$PersonalizedTabState.WAITING_TAB_SWITCH = personalized2;
       ThanosSplashPresenter$PersonalizedTabState[] personalized3 = new ThanosSplashPresenter$PersonalizedTabState[]{personalized,personalized1,personalized2};
       ThanosSplashPresenter$PersonalizedTabState.$VALUES = personalized3;
    }
    public void ThanosSplashPresenter$PersonalizedTabState(String p0,int p1){
       super(p0, p1);
    }
    public static ThanosSplashPresenter$PersonalizedTabState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThanosSplashPresenter$PersonalizedTabState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ThanosSplashPresenter$PersonalizedTabState.class, p0);
    }
    public static ThanosSplashPresenter$PersonalizedTabState[] values(){
       Object obj = PatchProxy.apply(null, null, ThanosSplashPresenter$PersonalizedTabState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ThanosSplashPresenter$PersonalizedTabState.$VALUES.clone();
    }
}
