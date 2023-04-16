package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$UNDEFINED;
import java.lang.String;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$RELIEVED;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$ADVISE;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$CAUTIOUS;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$APK_INSTALLED;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$APK_UNINSTALLED;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class GrowthCleanerTag extends Enum	// class@001348
{
    public final int level;
    public static final GrowthCleanerTag[] $VALUES;
    public static final GrowthCleanerTag ADVISE;
    public static final GrowthCleanerTag APK_INSTALLED;
    public static final GrowthCleanerTag APK_UNINSTALLED;
    public static final GrowthCleanerTag CAUTIOUS;
    public static final GrowthCleanerTag RELIEVED;
    public static final GrowthCleanerTag UNDEFINED;

    static {
       GrowthCleanerTag$UNDEFINED uNDEFINED;
       GrowthCleanerTag$RELIEVED rELIEVED;
       GrowthCleanerTag$ADVISE uADVISE;
       GrowthCleanerTag$CAUTIOUS uCAUTIOUS;
       GrowthCleanerTag$APK_INSTALLED uAPK_INSTALL;
       GrowthCleanerTag$APK_UNINSTALLED uAPK_UNINSTA;
       GrowthCleanerTag[] growthCleane = new GrowthCleanerTag[]{uNDEFINED,rELIEVED,uADVISE,uCAUTIOUS,uAPK_INSTALL,uAPK_UNINSTA};
       uNDEFINED = new GrowthCleanerTag$UNDEFINED("UNDEFINED", 0);
       GrowthCleanerTag.UNDEFINED = uNDEFINED;
       rELIEVED = new GrowthCleanerTag$RELIEVED("RELIEVED", 1);
       GrowthCleanerTag.RELIEVED = rELIEVED;
       uADVISE = new GrowthCleanerTag$ADVISE("ADVISE", 2);
       GrowthCleanerTag.ADVISE = uADVISE;
       uCAUTIOUS = new GrowthCleanerTag$CAUTIOUS("CAUTIOUS", 3);
       GrowthCleanerTag.CAUTIOUS = uCAUTIOUS;
       uAPK_INSTALL = new GrowthCleanerTag$APK_INSTALLED("APK_INSTALLED", 4);
       GrowthCleanerTag.APK_INSTALLED = uAPK_INSTALL;
       uAPK_UNINSTA = new GrowthCleanerTag$APK_UNINSTALLED("APK_UNINSTALLED", 5);
       GrowthCleanerTag.APK_UNINSTALLED = uAPK_UNINSTA;
       GrowthCleanerTag.$VALUES = growthCleane;
    }
    public void GrowthCleanerTag(String p0,int p1){
       super(p0, p1);
    }
    public void GrowthCleanerTag(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static GrowthCleanerTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCleanerTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthCleanerTag.class, p0);
    }
    public static GrowthCleanerTag[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthCleanerTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthCleanerTag.$VALUES.clone();
    }
    public int getLevel(){
       return this.level;
    }
    public abstract String getShowTag();
    public abstract int getShowTagColor();
    public abstract boolean isSelected();
}
