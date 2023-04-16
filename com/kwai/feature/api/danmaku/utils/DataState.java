package com.kwai.feature.api.danmaku.utils.DataState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DataState extends Enum	// class@000e92
{
    public static final DataState[] $VALUES;
    public static final DataState FAILURE;
    public static final DataState LOADING;
    public static final DataState NONE;
    public static final DataState SUCCESS;

    static {
       DataState uDataState;
       DataState[] uDataStateAr = new DataState[]{uDataState,uDataState,uDataState,uDataState};
       uDataState = new DataState("NONE", 0);
       DataState.NONE = uDataState;
       uDataState = new DataState("LOADING", 1);
       DataState.LOADING = uDataState;
       uDataState = new DataState("SUCCESS", 2);
       DataState.SUCCESS = uDataState;
       uDataState = new DataState("FAILURE", 3);
       DataState.FAILURE = uDataState;
       DataState.$VALUES = uDataStateAr;
    }
    public void DataState(String p0,int p1){
       super(p0, p1);
    }
    public static DataState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataState.class, p0);
    }
    public static DataState[] values(){
       Object obj = PatchProxy.apply(null, null, DataState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataState.$VALUES.clone();
    }
}
