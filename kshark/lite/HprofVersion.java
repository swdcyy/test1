package kshark.lite.HprofVersion;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class HprofVersion extends Enum	// class@001ba2
{
    public final String versionString;
    public static final HprofVersion[] $VALUES;
    public static final HprofVersion ANDROID;
    public static final HprofVersion JDK1_2_BETA3;
    public static final HprofVersion JDK1_2_BETA4;
    public static final HprofVersion JDK_6;

    static {
       HprofVersion hprofVersion1;
       HprofVersion[] hprofVersion = new HprofVersion[]{hprofVersion1,hprofVersion1,hprofVersion1,hprofVersion1};
       hprofVersion1 = new HprofVersion("JDK1_2_BETA3", 0, "JAVA PROFILE 1.0");
       HprofVersion.JDK1_2_BETA3 = hprofVersion1;
       hprofVersion1 = new HprofVersion("JDK1_2_BETA4", 1, "JAVA PROFILE 1.0.1");
       HprofVersion.JDK1_2_BETA4 = hprofVersion1;
       hprofVersion1 = new HprofVersion("JDK_6", 2, "JAVA PROFILE 1.0.2");
       HprofVersion.JDK_6 = hprofVersion1;
       hprofVersion1 = new HprofVersion("ANDROID", 3, "JAVA PROFILE 1.0.3");
       HprofVersion.ANDROID = hprofVersion1;
       HprofVersion.$VALUES = hprofVersion;
    }
    public void HprofVersion(String p0,int p1,String p2){
       super(p0, p1);
       this.versionString = p2;
    }
    public static HprofVersion valueOf(String p0){
       return Enum.valueOf(HprofVersion.class, p0);
    }
    public static HprofVersion[] values(){
       return HprofVersion.$VALUES.clone();
    }
    public final String getVersionString(){
       return this.versionString;
    }
}
