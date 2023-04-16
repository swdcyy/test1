package com.yxcorp.gifshow.detail.presenter.landscape.entity.SerialOpLandscapeEntrance;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SerialOpLandscapeEntrance extends Enum	// class@0016ee
{
    public static final SerialOpLandscapeEntrance[] $VALUES;
    public static final SerialOpLandscapeEntrance COLLECTION_DETAIL_PAGE;
    public static final SerialOpLandscapeEntrance SELECTED_TAB;
    public static final SerialOpLandscapeEntrance UNKNOWN;

    static {
       SerialOpLandscapeEntrance serialOpLand = new SerialOpLandscapeEntrance("UNKNOWN", 0);
       SerialOpLandscapeEntrance.UNKNOWN = serialOpLand;
       SerialOpLandscapeEntrance serialOpLand1 = new SerialOpLandscapeEntrance("SELECTED_TAB", 1);
       SerialOpLandscapeEntrance.SELECTED_TAB = serialOpLand1;
       SerialOpLandscapeEntrance serialOpLand2 = new SerialOpLandscapeEntrance("COLLECTION_DETAIL_PAGE", 2);
       SerialOpLandscapeEntrance.COLLECTION_DETAIL_PAGE = serialOpLand2;
       SerialOpLandscapeEntrance[] serialOpLand3 = new SerialOpLandscapeEntrance[]{serialOpLand,serialOpLand1,serialOpLand2};
       SerialOpLandscapeEntrance.$VALUES = serialOpLand3;
    }
    public void SerialOpLandscapeEntrance(String p0,int p1){
       super(p0, p1);
    }
    public static SerialOpLandscapeEntrance valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SerialOpLandscapeEntrance.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SerialOpLandscapeEntrance.class, p0);
    }
    public static SerialOpLandscapeEntrance[] values(){
       Object obj = PatchProxy.apply(null, null, SerialOpLandscapeEntrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SerialOpLandscapeEntrance.$VALUES.clone();
    }
}
