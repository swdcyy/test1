package com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;

public final class AlbumStat$NextMode extends Enum implements Internal$EnumLite	// class@000e06
{
    public final int value;
    public static final AlbumStat$NextMode[] $VALUES;
    public static final AlbumStat$NextMode MIX;
    public static final AlbumStat$NextMode PHOTO;
    public static final AlbumStat$NextMode UNRECOGNIZED;
    public static final AlbumStat$NextMode VIDEO;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AlbumStat$NextMode nextMode = new AlbumStat$NextMode("VIDEO", 0, 0);
       AlbumStat$NextMode.VIDEO = nextMode;
       AlbumStat$NextMode nextMode1 = new AlbumStat$NextMode("PHOTO", 1, 1);
       AlbumStat$NextMode.PHOTO = nextMode1;
       AlbumStat$NextMode nextMode2 = new AlbumStat$NextMode("MIX", 2, 2);
       AlbumStat$NextMode.MIX = nextMode2;
       AlbumStat$NextMode nextMode3 = new AlbumStat$NextMode("UNRECOGNIZED", 3, -1);
       AlbumStat$NextMode.UNRECOGNIZED = nextMode3;
       AlbumStat$NextMode[] nextModeArra = new AlbumStat$NextMode[]{nextMode,nextMode1,nextMode2,nextMode3};
       AlbumStat$NextMode.$VALUES = nextModeArra;
       AlbumStat$NextMode.internalValueMap = new AlbumStat$NextMode$a();
    }
    public void AlbumStat$NextMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AlbumStat$NextMode forNumber(int p0){
       if (!p0) {
          return AlbumStat$NextMode.VIDEO;
       }
       if (p0 == 1) {
          return AlbumStat$NextMode.PHOTO;
       }
       if (p0 != 2) {
          return null;
       }
       return AlbumStat$NextMode.MIX;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AlbumStat$NextMode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AlbumStat$NextMode$b.a;
    }
    public static AlbumStat$NextMode valueOf(int p0){
       return AlbumStat$NextMode.forNumber(p0);
    }
    public static AlbumStat$NextMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumStat$NextMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AlbumStat$NextMode.class, p0);
    }
    public static AlbumStat$NextMode[] values(){
       Object obj = PatchProxy.apply(null, null, AlbumStat$NextMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumStat$NextMode.$VALUES.clone();
    }
    public final int getNumber(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$NextMode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this != AlbumStat$NextMode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
