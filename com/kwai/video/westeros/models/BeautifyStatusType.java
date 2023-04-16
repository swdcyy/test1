package com.kwai.video.westeros.models.BeautifyStatusType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BeautifyStatusType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BeautifyStatusType$BeautifyStatusTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BeautifyStatusType extends Enum implements Internal$EnumLite	// class@000eb0
{
    public final int value;
    public static final BeautifyStatusType[] $VALUES;
    public static final BeautifyStatusType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final BeautifyStatusType kTypeBeauty;

    static {
       BeautifyStatusType uBeautifySta = new BeautifyStatusType("kTypeBeauty", 0, 0);
       BeautifyStatusType.kTypeBeauty = uBeautifySta;
       BeautifyStatusType uBeautifySta1 = new BeautifyStatusType("UNRECOGNIZED", 1, -1);
       BeautifyStatusType.UNRECOGNIZED = uBeautifySta1;
       BeautifyStatusType[] uBeautifySta2 = new BeautifyStatusType[]{uBeautifySta,uBeautifySta1};
       BeautifyStatusType.$VALUES = uBeautifySta2;
       BeautifyStatusType.internalValueMap = new BeautifyStatusType$1();
    }
    public void BeautifyStatusType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BeautifyStatusType forNumber(int p0){
       if (p0) {
          return null;
       }
       return BeautifyStatusType.kTypeBeauty;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BeautifyStatusType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BeautifyStatusType$BeautifyStatusTypeVerifier.INSTANCE;
    }
    public static BeautifyStatusType valueOf(int p0){
       return BeautifyStatusType.forNumber(p0);
    }
    public static BeautifyStatusType valueOf(String p0){
       return Enum.valueOf(BeautifyStatusType.class, p0);
    }
    public static BeautifyStatusType[] values(){
       return BeautifyStatusType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BeautifyStatusType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
