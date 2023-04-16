package com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$SizerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HomeLocalSizerView$SizerState extends Enum	// class@001ace
{
    public static final HomeLocalSizerView$SizerState[] $VALUES;
    public static final HomeLocalSizerView$SizerState LOCATING;
    public static final HomeLocalSizerView$SizerState NORMAL;
    public static final HomeLocalSizerView$SizerState NO_PERMISSION;

    static {
       HomeLocalSizerView$SizerState sizerState = new HomeLocalSizerView$SizerState("NORMAL", 0);
       HomeLocalSizerView$SizerState.NORMAL = sizerState;
       HomeLocalSizerView$SizerState sizerState1 = new HomeLocalSizerView$SizerState("NO_PERMISSION", 1);
       HomeLocalSizerView$SizerState.NO_PERMISSION = sizerState1;
       HomeLocalSizerView$SizerState sizerState2 = new HomeLocalSizerView$SizerState("LOCATING", 2);
       HomeLocalSizerView$SizerState.LOCATING = sizerState2;
       HomeLocalSizerView$SizerState[] sizerStateAr = new HomeLocalSizerView$SizerState[]{sizerState,sizerState1,sizerState2};
       HomeLocalSizerView$SizerState.$VALUES = sizerStateAr;
    }
    public void HomeLocalSizerView$SizerState(String p0,int p1){
       super(p0, p1);
    }
    public static HomeLocalSizerView$SizerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeLocalSizerView$SizerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HomeLocalSizerView$SizerState.class, p0);
    }
    public static HomeLocalSizerView$SizerState[] values(){
       Object obj = PatchProxy.apply(null, null, HomeLocalSizerView$SizerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeLocalSizerView$SizerState.$VALUES.clone();
    }
}
