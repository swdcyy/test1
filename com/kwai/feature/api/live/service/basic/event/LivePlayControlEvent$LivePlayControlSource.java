package com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayControlEvent$LivePlayControlSource extends Enum	// class@001004
{
    public static final LivePlayControlEvent$LivePlayControlSource[] $VALUES;
    public static final LivePlayControlEvent$LivePlayControlSource AdDetailVMFragment;
    public static final LivePlayControlEvent$LivePlayControlSource HorizontalPhotosFragment;
    public static final LivePlayControlEvent$LivePlayControlSource LiveBridgeModuleImpl;
    public static final LivePlayControlEvent$LivePlayControlSource PhotoDetailFragment;
    public static final LivePlayControlEvent$LivePlayControlSource SearchResultFragment;
    public static final LivePlayControlEvent$LivePlayControlSource SearchVerticalPageSwitchPresenter;
    public static final LivePlayControlEvent$LivePlayControlSource SlidePlayHorizontalPhotosVMFragment;
    public static final LivePlayControlEvent$LivePlayControlSource SlidePlayPhotoDetailVMFragment;
    public static final LivePlayControlEvent$LivePlayControlSource SlidePlayVerticalPhotosVMFragment;
    public static final LivePlayControlEvent$LivePlayControlSource VerticalPhotosFragment;

    static {
       LivePlayControlEvent$LivePlayControlSource livePlayCont = new LivePlayControlEvent$LivePlayControlSource("PhotoDetailFragment", 0);
       LivePlayControlEvent$LivePlayControlSource.PhotoDetailFragment = livePlayCont;
       LivePlayControlEvent$LivePlayControlSource livePlayCont1 = new LivePlayControlEvent$LivePlayControlSource("AdDetailVMFragment", 1);
       LivePlayControlEvent$LivePlayControlSource.AdDetailVMFragment = livePlayCont1;
       LivePlayControlEvent$LivePlayControlSource livePlayCont2 = new LivePlayControlEvent$LivePlayControlSource("HorizontalPhotosFragment", 2);
       LivePlayControlEvent$LivePlayControlSource.HorizontalPhotosFragment = livePlayCont2;
       LivePlayControlEvent$LivePlayControlSource livePlayCont3 = new LivePlayControlEvent$LivePlayControlSource("VerticalPhotosFragment", 3);
       LivePlayControlEvent$LivePlayControlSource.VerticalPhotosFragment = livePlayCont3;
       LivePlayControlEvent$LivePlayControlSource livePlayCont4 = new LivePlayControlEvent$LivePlayControlSource("SlidePlayHorizontalPhotosVMFragment", 4);
       LivePlayControlEvent$LivePlayControlSource.SlidePlayHorizontalPhotosVMFragment = livePlayCont4;
       LivePlayControlEvent$LivePlayControlSource livePlayCont5 = new LivePlayControlEvent$LivePlayControlSource("SlidePlayPhotoDetailVMFragment", 5);
       LivePlayControlEvent$LivePlayControlSource.SlidePlayPhotoDetailVMFragment = livePlayCont5;
       LivePlayControlEvent$LivePlayControlSource livePlayCont6 = new LivePlayControlEvent$LivePlayControlSource("SlidePlayVerticalPhotosVMFragment", 6);
       LivePlayControlEvent$LivePlayControlSource.SlidePlayVerticalPhotosVMFragment = livePlayCont6;
       LivePlayControlEvent$LivePlayControlSource livePlayCont7 = new LivePlayControlEvent$LivePlayControlSource("LiveBridgeModuleImpl", 7);
       LivePlayControlEvent$LivePlayControlSource.LiveBridgeModuleImpl = livePlayCont7;
       LivePlayControlEvent$LivePlayControlSource livePlayCont8 = new LivePlayControlEvent$LivePlayControlSource("SearchVerticalPageSwitchPresenter", 8);
       LivePlayControlEvent$LivePlayControlSource.SearchVerticalPageSwitchPresenter = livePlayCont8;
       LivePlayControlEvent$LivePlayControlSource livePlayCont9 = new LivePlayControlEvent$LivePlayControlSource("SearchResultFragment", 9);
       LivePlayControlEvent$LivePlayControlSource.SearchResultFragment = livePlayCont9;
       LivePlayControlEvent$LivePlayControlSource[] livePlayCont10 = new LivePlayControlEvent$LivePlayControlSource[10];
       livePlayCont10[0] = livePlayCont;
       livePlayCont10[1] = livePlayCont1;
       livePlayCont10[2] = livePlayCont2;
       livePlayCont10[3] = livePlayCont3;
       livePlayCont10[4] = livePlayCont4;
       livePlayCont10[5] = livePlayCont5;
       livePlayCont10[6] = livePlayCont6;
       livePlayCont10[7] = livePlayCont7;
       livePlayCont10[8] = livePlayCont8;
       livePlayCont10[9] = livePlayCont9;
       LivePlayControlEvent$LivePlayControlSource.$VALUES = livePlayCont10;
    }
    public void LivePlayControlEvent$LivePlayControlSource(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlayControlEvent$LivePlayControlSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayControlEvent$LivePlayControlSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayControlEvent$LivePlayControlSource.class, p0);
    }
    public static LivePlayControlEvent$LivePlayControlSource[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayControlEvent$LivePlayControlSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayControlEvent$LivePlayControlSource.$VALUES.clone();
    }
}
