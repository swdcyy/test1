package com.yxcorp.gifshow.model.PoiPhotoItem$PoiPhotoItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class PoiPhotoItem$PoiPhotoItemType extends Enum	// class@001e73
{
    public int mValue;
    public static final PoiPhotoItem$PoiPhotoItemType[] $VALUES;
    public static final PoiPhotoItem$PoiPhotoItemType EMPTY;
    public static final PoiPhotoItem$PoiPhotoItemType LABEL;
    public static final PoiPhotoItem$PoiPhotoItemType LIVE_STREAM;
    public static final PoiPhotoItem$PoiPhotoItemType MORE;
    public static final PoiPhotoItem$PoiPhotoItemType PHOTO;
    public static final PoiPhotoItem$PoiPhotoItemType UNKNOWN;

    static {
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem = new PoiPhotoItem$PoiPhotoItemType("UNKNOWN", 0, -1);
       PoiPhotoItem$PoiPhotoItemType.UNKNOWN = poiPhotoItem;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem1 = new PoiPhotoItem$PoiPhotoItemType("PHOTO", 1, 0);
       PoiPhotoItem$PoiPhotoItemType.PHOTO = poiPhotoItem1;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem2 = new PoiPhotoItem$PoiPhotoItemType("LIVE_STREAM", 2, 1);
       PoiPhotoItem$PoiPhotoItemType.LIVE_STREAM = poiPhotoItem2;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem3 = new PoiPhotoItem$PoiPhotoItemType("MORE", 3, 2);
       PoiPhotoItem$PoiPhotoItemType.MORE = poiPhotoItem3;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem4 = new PoiPhotoItem$PoiPhotoItemType("LABEL", 4, 3);
       PoiPhotoItem$PoiPhotoItemType.LABEL = poiPhotoItem4;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem5 = new PoiPhotoItem$PoiPhotoItemType("EMPTY", 5, 4);
       PoiPhotoItem$PoiPhotoItemType.EMPTY = poiPhotoItem5;
       PoiPhotoItem$PoiPhotoItemType[] poiPhotoItem6 = new PoiPhotoItem$PoiPhotoItemType[]{poiPhotoItem,poiPhotoItem1,poiPhotoItem2,poiPhotoItem3,poiPhotoItem4,poiPhotoItem5};
       PoiPhotoItem$PoiPhotoItemType.$VALUES = poiPhotoItem6;
    }
    public void PoiPhotoItem$PoiPhotoItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static boolean isFeedType(PoiPhotoItem$PoiPhotoItemType p0){
       boolean b = (p0 == PoiPhotoItem$PoiPhotoItemType.PHOTO || p0 == PoiPhotoItem$PoiPhotoItemType.LIVE_STREAM)? true: false;
       return b;
    }
    public static PoiPhotoItem$PoiPhotoItemType valueOf(int p0){
       PoiPhotoItem$PoiPhotoItemType[] obj;
       object oobject;
       PoiPhotoItem$PoiPhotoItemType poiPhotoItem = PoiPhotoItem$PoiPhotoItemType.class;
       if (PatchProxy.isSupport(poiPhotoItem)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, poiPhotoItem, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = PoiPhotoItem$PoiPhotoItemType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return PoiPhotoItem$PoiPhotoItemType.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mValue == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static PoiPhotoItem$PoiPhotoItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PoiPhotoItem$PoiPhotoItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PoiPhotoItem$PoiPhotoItemType.class, p0);
    }
    public static PoiPhotoItem$PoiPhotoItemType[] values(){
       Object obj = PatchProxy.apply(null, null, PoiPhotoItem$PoiPhotoItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PoiPhotoItem$PoiPhotoItemType.$VALUES.clone();
    }
    public int value(){
       return this.mValue;
    }
}
