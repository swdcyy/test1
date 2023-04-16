package com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper$RecreationClickActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecreationHotAreaHelper$RecreationClickActionType extends Enum	// class@001860
{
    public final int mValue;
    public static final RecreationHotAreaHelper$RecreationClickActionType[] $VALUES;
    public static final RecreationHotAreaHelper$RecreationClickActionType PHOTO_DETAIL;
    public static final RecreationHotAreaHelper$RecreationClickActionType PROFILE;
    public static final RecreationHotAreaHelper$RecreationClickActionType UNKNOWN;

    static {
       RecreationHotAreaHelper$RecreationClickActionType recreationCl = new RecreationHotAreaHelper$RecreationClickActionType("UNKNOWN", 0, 0);
       RecreationHotAreaHelper$RecreationClickActionType.UNKNOWN = recreationCl;
       RecreationHotAreaHelper$RecreationClickActionType recreationCl1 = new RecreationHotAreaHelper$RecreationClickActionType("PHOTO_DETAIL", 1, 1);
       RecreationHotAreaHelper$RecreationClickActionType.PHOTO_DETAIL = recreationCl1;
       RecreationHotAreaHelper$RecreationClickActionType recreationCl2 = new RecreationHotAreaHelper$RecreationClickActionType("PROFILE", 2, 2);
       RecreationHotAreaHelper$RecreationClickActionType.PROFILE = recreationCl2;
       RecreationHotAreaHelper$RecreationClickActionType[] recreationCl3 = new RecreationHotAreaHelper$RecreationClickActionType[]{recreationCl,recreationCl1,recreationCl2};
       RecreationHotAreaHelper$RecreationClickActionType.$VALUES = recreationCl3;
    }
    public void RecreationHotAreaHelper$RecreationClickActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static RecreationHotAreaHelper$RecreationClickActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RecreationHotAreaHelper$RecreationClickActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RecreationHotAreaHelper$RecreationClickActionType.class, p0);
    }
    public static RecreationHotAreaHelper$RecreationClickActionType[] values(){
       Object obj = PatchProxy.apply(null, null, RecreationHotAreaHelper$RecreationClickActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecreationHotAreaHelper$RecreationClickActionType.$VALUES.clone();
    }
}
