package com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadingStateTrack$LoadType extends Enum	// class@000904
{
    public static final LoadingStateTrack$LoadType[] $VALUES;
    public static final LoadingStateTrack$LoadType NORMAL_BUSINESS_BUNDLE;
    public static final LoadingStateTrack$LoadType PRE_BASIC_BUNDLE;
    public static final LoadingStateTrack$LoadType PRE_BUSINESS_BUNDLE;

    static {
       LoadingStateTrack$LoadType loadType = new LoadingStateTrack$LoadType("PRE_BASIC_BUNDLE", 0);
       LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE = loadType;
       LoadingStateTrack$LoadType loadType1 = new LoadingStateTrack$LoadType("PRE_BUSINESS_BUNDLE", 1);
       LoadingStateTrack$LoadType.PRE_BUSINESS_BUNDLE = loadType1;
       LoadingStateTrack$LoadType loadType2 = new LoadingStateTrack$LoadType("NORMAL_BUSINESS_BUNDLE", 2);
       LoadingStateTrack$LoadType.NORMAL_BUSINESS_BUNDLE = loadType2;
       LoadingStateTrack$LoadType[] loadTypeArra = new LoadingStateTrack$LoadType[]{loadType,loadType1,loadType2};
       LoadingStateTrack$LoadType.$VALUES = loadTypeArra;
    }
    public void LoadingStateTrack$LoadType(String p0,int p1){
       super(p0, p1);
    }
    public static LoadingStateTrack$LoadType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadingStateTrack$LoadType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadingStateTrack$LoadType.class, p0);
    }
    public static LoadingStateTrack$LoadType[] values(){
       Object obj = PatchProxy.apply(null, null, LoadingStateTrack$LoadType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadingStateTrack$LoadType.$VALUES.clone();
    }
}
