package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading;
import java.lang.Enum;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading$STYLE;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneAccompanyLoading extends Enum	// class@000b5a
{
    public LiveGzoneAccompanyLoading$STYLE mStyle;
    public static final LiveGzoneAccompanyLoading[] $VALUES;
    public static final LiveGzoneAccompanyLoading BIND_ACCOUNT_REFRESH_LOADING;
    public static final LiveGzoneAccompanyLoading GET_ON_REFRESH_LOADING;
    public static final LiveGzoneAccompanyLoading INIT_LOADING;
    public static final LiveGzoneAccompanyLoading NON;
    public static final LiveGzoneAccompanyLoading NORMAL_LOADING;
    public static final LiveGzoneAccompanyLoading REFRESH_LOADING;
    public static final LiveGzoneAccompanyLoading UNBIND_ACCOUNT_REFRESH_LOADING;

    static {
       LiveGzoneAccompanyLoading liveGzoneAcc = new LiveGzoneAccompanyLoading("INIT_LOADING", 0, LiveGzoneAccompanyLoading$STYLE.INNER_LOADING);
       LiveGzoneAccompanyLoading.INIT_LOADING = liveGzoneAcc;
       LiveGzoneAccompanyLoading$STYLE fLOAT_LOADIN = LiveGzoneAccompanyLoading$STYLE.FLOAT_LOADING;
       LiveGzoneAccompanyLoading liveGzoneAcc1 = new LiveGzoneAccompanyLoading("NORMAL_LOADING", 1, fLOAT_LOADIN);
       LiveGzoneAccompanyLoading.NORMAL_LOADING = liveGzoneAcc1;
       LiveGzoneAccompanyLoading liveGzoneAcc2 = new LiveGzoneAccompanyLoading("REFRESH_LOADING", 2, fLOAT_LOADIN);
       LiveGzoneAccompanyLoading.REFRESH_LOADING = liveGzoneAcc2;
       LiveGzoneAccompanyLoading liveGzoneAcc3 = new LiveGzoneAccompanyLoading("GET_ON_REFRESH_LOADING", 3, fLOAT_LOADIN);
       LiveGzoneAccompanyLoading.GET_ON_REFRESH_LOADING = liveGzoneAcc3;
       LiveGzoneAccompanyLoading liveGzoneAcc4 = new LiveGzoneAccompanyLoading("BIND_ACCOUNT_REFRESH_LOADING", 4, fLOAT_LOADIN);
       LiveGzoneAccompanyLoading.BIND_ACCOUNT_REFRESH_LOADING = liveGzoneAcc4;
       LiveGzoneAccompanyLoading liveGzoneAcc5 = new LiveGzoneAccompanyLoading("UNBIND_ACCOUNT_REFRESH_LOADING", 5, fLOAT_LOADIN);
       LiveGzoneAccompanyLoading.UNBIND_ACCOUNT_REFRESH_LOADING = liveGzoneAcc5;
       LiveGzoneAccompanyLoading liveGzoneAcc6 = new LiveGzoneAccompanyLoading("NON", 6, LiveGzoneAccompanyLoading$STYLE.NON);
       LiveGzoneAccompanyLoading.NON = liveGzoneAcc6;
       LiveGzoneAccompanyLoading[] liveGzoneAcc7 = new LiveGzoneAccompanyLoading[]{liveGzoneAcc,liveGzoneAcc1,liveGzoneAcc2,liveGzoneAcc3,liveGzoneAcc4,liveGzoneAcc5,liveGzoneAcc6};
       LiveGzoneAccompanyLoading.$VALUES = liveGzoneAcc7;
    }
    public void LiveGzoneAccompanyLoading(String p0,int p1,LiveGzoneAccompanyLoading$STYLE p2){
       super(p0, p1);
       this.mStyle = p2;
    }
    public static LiveGzoneAccompanyLoading valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAccompanyLoading.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAccompanyLoading.class, p0);
    }
    public static LiveGzoneAccompanyLoading[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAccompanyLoading.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAccompanyLoading.$VALUES.clone();
    }
}
