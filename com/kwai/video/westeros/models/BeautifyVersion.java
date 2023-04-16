package com.kwai.video.westeros.models.BeautifyVersion;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BeautifyVersion$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BeautifyVersion$BeautifyVersionVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BeautifyVersion extends Enum implements Internal$EnumLite	// class@000eb6
{
    public final int value;
    public static final BeautifyVersion[] $VALUES;
    public static final BeautifyVersion UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final BeautifyVersion kBeautifyVersion3;
    public static final BeautifyVersion kBeautifyVersion4;
    public static final BeautifyVersion kBeautifyVersion4_Downgrade;
    public static final BeautifyVersion kBeautifyVersionDefault;
    public static final BeautifyVersion kBeautifyVersionG1;
    public static final BeautifyVersion kBeautifyVersionG1se;
    public static final BeautifyVersion kBeautifyVersionG2;
    public static final BeautifyVersion kBeautifyVersionG2p;
    public static final BeautifyVersion kBeautifyVersionG2se;
    public static final BeautifyVersion kBeautifyVersionG3;
    public static final BeautifyVersion kBeautifyVersionG3se;
    public static final BeautifyVersion kBeautifyVersionS2M2U;
    public static final BeautifyVersion kBeautifyVersionS2M2U_Downgrade;

    static {
       BeautifyVersion uBeautifyVer = new BeautifyVersion("kBeautifyVersionDefault", 0, 0);
       BeautifyVersion.kBeautifyVersionDefault = uBeautifyVer;
       BeautifyVersion uBeautifyVer1 = new BeautifyVersion("kBeautifyVersion3", 1, 3);
       BeautifyVersion.kBeautifyVersion3 = uBeautifyVer1;
       BeautifyVersion uBeautifyVer2 = new BeautifyVersion("kBeautifyVersion4", 2, 4);
       BeautifyVersion.kBeautifyVersion4 = uBeautifyVer2;
       BeautifyVersion uBeautifyVer3 = new BeautifyVersion("kBeautifyVersion4_Downgrade", 3, 5);
       BeautifyVersion.kBeautifyVersion4_Downgrade = uBeautifyVer3;
       BeautifyVersion uBeautifyVer4 = new BeautifyVersion("kBeautifyVersionG1", 4, 6);
       BeautifyVersion.kBeautifyVersionG1 = uBeautifyVer4;
       BeautifyVersion uBeautifyVer5 = new BeautifyVersion("kBeautifyVersionG1se", 5, 7);
       BeautifyVersion.kBeautifyVersionG1se = uBeautifyVer5;
       BeautifyVersion uBeautifyVer6 = new BeautifyVersion("kBeautifyVersionG2", 6, 8);
       BeautifyVersion.kBeautifyVersionG2 = uBeautifyVer6;
       BeautifyVersion uBeautifyVer7 = new BeautifyVersion("kBeautifyVersionG2p", 7, 9);
       BeautifyVersion.kBeautifyVersionG2p = uBeautifyVer7;
       BeautifyVersion uBeautifyVer8 = new BeautifyVersion("kBeautifyVersionG2se", 8, 10);
       BeautifyVersion.kBeautifyVersionG2se = uBeautifyVer8;
       BeautifyVersion uBeautifyVer9 = new BeautifyVersion("kBeautifyVersionG3", 9, 11);
       BeautifyVersion.kBeautifyVersionG3 = uBeautifyVer9;
       BeautifyVersion uBeautifyVer10 = new BeautifyVersion("kBeautifyVersionG3se", 10, 12);
       BeautifyVersion.kBeautifyVersionG3se = uBeautifyVer10;
       BeautifyVersion uBeautifyVer11 = new BeautifyVersion("kBeautifyVersionS2M2U", 11, 13);
       BeautifyVersion.kBeautifyVersionS2M2U = uBeautifyVer11;
       BeautifyVersion uBeautifyVer12 = new BeautifyVersion("kBeautifyVersionS2M2U_Downgrade", 12, 14);
       BeautifyVersion.kBeautifyVersionS2M2U_Downgrade = uBeautifyVer12;
       BeautifyVersion uBeautifyVer13 = uBeautifyVer12;
       BeautifyVersion uBeautifyVer14 = new BeautifyVersion("UNRECOGNIZED", 13, -1);
       BeautifyVersion.UNRECOGNIZED = uBeautifyVer14;
       BeautifyVersion[] uBeautifyVer15 = new BeautifyVersion[14];
       uBeautifyVer15[0] = uBeautifyVer;
       uBeautifyVer15[1] = uBeautifyVer1;
       uBeautifyVer15[2] = uBeautifyVer2;
       uBeautifyVer15[3] = uBeautifyVer3;
       uBeautifyVer15[4] = uBeautifyVer4;
       uBeautifyVer15[5] = uBeautifyVer5;
       uBeautifyVer15[6] = uBeautifyVer6;
       uBeautifyVer15[7] = uBeautifyVer7;
       uBeautifyVer15[8] = uBeautifyVer8;
       uBeautifyVer15[9] = uBeautifyVer9;
       uBeautifyVer15[10] = uBeautifyVer10;
       uBeautifyVer15[11] = uBeautifyVer11;
       uBeautifyVer15[12] = uBeautifyVer13;
       uBeautifyVer15[13] = uBeautifyVer14;
       BeautifyVersion.$VALUES = uBeautifyVer15;
       BeautifyVersion.internalValueMap = new BeautifyVersion$1();
    }
    public void BeautifyVersion(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BeautifyVersion forNumber(int p0){
       if (!p0) {
          return BeautifyVersion.kBeautifyVersionDefault;
       }
       switch (p0){
           case 3:
             return BeautifyVersion.kBeautifyVersion3;
           case 4:
             return BeautifyVersion.kBeautifyVersion4;
           case 5:
             return BeautifyVersion.kBeautifyVersion4_Downgrade;
           case 6:
             return BeautifyVersion.kBeautifyVersionG1;
           case 7:
             return BeautifyVersion.kBeautifyVersionG1se;
           case 8:
             return BeautifyVersion.kBeautifyVersionG2;
           case 9:
             return BeautifyVersion.kBeautifyVersionG2p;
           case 10:
             return BeautifyVersion.kBeautifyVersionG2se;
           case 11:
             return BeautifyVersion.kBeautifyVersionG3;
           case 12:
             return BeautifyVersion.kBeautifyVersionG3se;
           case 13:
             return BeautifyVersion.kBeautifyVersionS2M2U;
           case 14:
             return BeautifyVersion.kBeautifyVersionS2M2U_Downgrade;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BeautifyVersion.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BeautifyVersion$BeautifyVersionVerifier.INSTANCE;
    }
    public static BeautifyVersion valueOf(int p0){
       return BeautifyVersion.forNumber(p0);
    }
    public static BeautifyVersion valueOf(String p0){
       return Enum.valueOf(BeautifyVersion.class, p0);
    }
    public static BeautifyVersion[] values(){
       return BeautifyVersion.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BeautifyVersion.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
