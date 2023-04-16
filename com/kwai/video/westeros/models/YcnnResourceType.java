package com.kwai.video.westeros.models.YcnnResourceType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.YcnnResourceType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.YcnnResourceType$YcnnResourceTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class YcnnResourceType extends Enum implements Internal$EnumLite	// class@0010ae
{
    public final int value;
    public static final YcnnResourceType[] $VALUES;
    public static final YcnnResourceType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final YcnnResourceType kLowLight;

    static {
       YcnnResourceType ycnnResource = new YcnnResourceType("kLowLight", 0, 0);
       YcnnResourceType.kLowLight = ycnnResource;
       YcnnResourceType ycnnResource1 = new YcnnResourceType("UNRECOGNIZED", 1, -1);
       YcnnResourceType.UNRECOGNIZED = ycnnResource1;
       YcnnResourceType[] ycnnResource2 = new YcnnResourceType[]{ycnnResource,ycnnResource1};
       YcnnResourceType.$VALUES = ycnnResource2;
       YcnnResourceType.internalValueMap = new YcnnResourceType$1();
    }
    public void YcnnResourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static YcnnResourceType forNumber(int p0){
       if (p0) {
          return null;
       }
       return YcnnResourceType.kLowLight;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return YcnnResourceType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return YcnnResourceType$YcnnResourceTypeVerifier.INSTANCE;
    }
    public static YcnnResourceType valueOf(int p0){
       return YcnnResourceType.forNumber(p0);
    }
    public static YcnnResourceType valueOf(String p0){
       return Enum.valueOf(YcnnResourceType.class, p0);
    }
    public static YcnnResourceType[] values(){
       return YcnnResourceType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != YcnnResourceType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
