package com.yxcorp.gifshow.model.HotspotContentType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public final class HotspotContentType extends Enum	// class@001e26
{
    public int mValue;
    public static final HotspotContentType[] $VALUES;
    public static final HotspotContentType TYPE_HOTSPOT;
    public static final HotspotContentType TYPE_VIDEO;
    public static final HotspotContentType UNKNOWN;

    static {
       HotspotContentType hotspotConte = new HotspotContentType("UNKNOWN", 0, 0);
       HotspotContentType.UNKNOWN = hotspotConte;
       HotspotContentType hotspotConte1 = new HotspotContentType("TYPE_HOTSPOT", 1, 1);
       HotspotContentType.TYPE_HOTSPOT = hotspotConte1;
       HotspotContentType hotspotConte2 = new HotspotContentType("TYPE_VIDEO", 2, 2);
       HotspotContentType.TYPE_VIDEO = hotspotConte2;
       HotspotContentType[] hotspotConte3 = new HotspotContentType[]{hotspotConte,hotspotConte1,hotspotConte2};
       HotspotContentType.$VALUES = hotspotConte3;
    }
    public void HotspotContentType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static boolean isValidType(HotspotContentType p0){
       HotspotContentType[] obj = PatchProxy.applyOneRefs(p0, null, HotspotContentType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = HotspotContentType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0 == obj[i] && p0 != HotspotContentType.UNKNOWN) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static HotspotContentType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HotspotContentType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HotspotContentType.class, p0);
    }
    public static HotspotContentType[] values(){
       Object obj = PatchProxy.apply(null, null, HotspotContentType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HotspotContentType.$VALUES.clone();
    }
    public HotspotContentType valueOf(int p0){
       HotspotContentType[] obj;
       object oobject;
       HotspotContentType hotspotConte = HotspotContentType.class;
       if (PatchProxy.isSupport(hotspotConte)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, hotspotConte, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = HotspotContentType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return HotspotContentType.UNKNOWN;
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
}
