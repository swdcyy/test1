package com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;

public final class SubtitleStat$Type extends Enum implements Internal$EnumLite	// class@000e71
{
    public final int value;
    public static final SubtitleStat$Type[] $VALUES;
    public static final SubtitleStat$Type KUAISHAN;
    public static final SubtitleStat$Type LOCAL;
    public static final SubtitleStat$Type ONLINE;
    public static final SubtitleStat$Type ORIGIN;
    public static final SubtitleStat$Type RECORD;
    public static final SubtitleStat$Type UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       SubtitleStat$Type type = new SubtitleStat$Type("ORIGIN", 0, 0);
       SubtitleStat$Type.ORIGIN = type;
       SubtitleStat$Type type1 = new SubtitleStat$Type("RECORD", 1, 1);
       SubtitleStat$Type.RECORD = type1;
       SubtitleStat$Type type2 = new SubtitleStat$Type("LOCAL", 2, 2);
       SubtitleStat$Type.LOCAL = type2;
       SubtitleStat$Type type3 = new SubtitleStat$Type("ONLINE", 3, 3);
       SubtitleStat$Type.ONLINE = type3;
       SubtitleStat$Type type4 = new SubtitleStat$Type("KUAISHAN", 4, 4);
       SubtitleStat$Type.KUAISHAN = type4;
       SubtitleStat$Type type5 = new SubtitleStat$Type("UNRECOGNIZED", 5, -1);
       SubtitleStat$Type.UNRECOGNIZED = type5;
       SubtitleStat$Type[] typeArray = new SubtitleStat$Type[]{type,type1,type2,type3,type4,type5};
       SubtitleStat$Type.$VALUES = typeArray;
       SubtitleStat$Type.internalValueMap = new SubtitleStat$Type$a();
    }
    public void SubtitleStat$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SubtitleStat$Type forNumber(int p0){
       if (!p0) {
          return SubtitleStat$Type.ORIGIN;
       }
       if (p0 == 1) {
          return SubtitleStat$Type.RECORD;
       }
       if (p0 == 2) {
          return SubtitleStat$Type.LOCAL;
       }
       if (p0 == 3) {
          return SubtitleStat$Type.ONLINE;
       }
       if (p0 != 4) {
          return null;
       }
       return SubtitleStat$Type.KUAISHAN;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return SubtitleStat$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return SubtitleStat$Type$b.a;
    }
    public static SubtitleStat$Type valueOf(int p0){
       return SubtitleStat$Type.forNumber(p0);
    }
    public static SubtitleStat$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleStat$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SubtitleStat$Type.class, p0);
    }
    public static SubtitleStat$Type[] values(){
       Object obj = PatchProxy.apply(null, null, SubtitleStat$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleStat$Type.$VALUES.clone();
    }
    public final int getNumber(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$Type.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this != SubtitleStat$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
