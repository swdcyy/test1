package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_CACHE;
import java.lang.String;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_FILES;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_DOWNLOAD;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_OTHER;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APP_UNINSTALL;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory$APK;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fna.j$e;
import java.util.List;
import fna.a;
import cra.c0;
import kotlin.jvm.internal.a;
import fna.b;
import fna.v;
import fna.j;
import fna.f;

public abstract class GrowthCleanerCategory extends Enum	// class@001315
{
    public static final GrowthCleanerCategory[] $VALUES;
    public static final GrowthCleanerCategory APK;
    public static final GrowthCleanerCategory APP_CACHE;
    public static final GrowthCleanerCategory APP_DOWNLOAD;
    public static final GrowthCleanerCategory APP_FILES;
    public static final GrowthCleanerCategory APP_OTHER;
    public static final GrowthCleanerCategory APP_UNINSTALL;

    static {
       GrowthCleanerCategory$APP_CACHE uAPP_CACHE;
       GrowthCleanerCategory$APP_FILES uAPP_FILES;
       GrowthCleanerCategory$APP_DOWNLOAD uAPP_DOWNLOA;
       GrowthCleanerCategory$APP_OTHER uAPP_OTHER;
       GrowthCleanerCategory$APP_UNINSTALL uAPP_UNINSTA;
       GrowthCleanerCategory$APK uAPK;
       GrowthCleanerCategory[] growthCleane = new GrowthCleanerCategory[]{uAPP_CACHE,uAPP_FILES,uAPP_DOWNLOA,uAPP_OTHER,uAPP_UNINSTA,uAPK};
       uAPP_CACHE = new GrowthCleanerCategory$APP_CACHE("APP_CACHE", 0);
       GrowthCleanerCategory.APP_CACHE = uAPP_CACHE;
       uAPP_FILES = new GrowthCleanerCategory$APP_FILES("APP_FILES", 1);
       GrowthCleanerCategory.APP_FILES = uAPP_FILES;
       uAPP_DOWNLOA = new GrowthCleanerCategory$APP_DOWNLOAD("APP_DOWNLOAD", 2);
       GrowthCleanerCategory.APP_DOWNLOAD = uAPP_DOWNLOA;
       uAPP_OTHER = new GrowthCleanerCategory$APP_OTHER("APP_OTHER", 3);
       GrowthCleanerCategory.APP_OTHER = uAPP_OTHER;
       uAPP_UNINSTA = new GrowthCleanerCategory$APP_UNINSTALL("APP_UNINSTALL", 4);
       GrowthCleanerCategory.APP_UNINSTALL = uAPP_UNINSTA;
       uAPK = new GrowthCleanerCategory$APK("APK", 5);
       GrowthCleanerCategory.APK = uAPK;
       GrowthCleanerCategory.$VALUES = growthCleane;
    }
    public void GrowthCleanerCategory(String p0,int p1){
       super(p0, p1);
    }
    public void GrowthCleanerCategory(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static GrowthCleanerCategory valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCleanerCategory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthCleanerCategory.class, p0);
    }
    public static GrowthCleanerCategory[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthCleanerCategory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthCleanerCategory.$VALUES.clone();
    }
    public abstract List filterAppList(j$e p0);
    public abstract c0 filterFileSize(a p0);
    public abstract List filterFileSizeList(a p0);
    public final String getDescription(j$e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "event");
       return f.a(this.getSize(v.c(this.filterAppList(p0))), this.getSize(p0));
    }
    public abstract long getSize(b p0);
    public abstract long getSize(j p0);
    public final String getSizeText(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerCategory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long size = this.getSize(p0);
       String str = (size - (long)-1 > 0)? f.d(size): "";
       return str;
    }
    public abstract String getTitle();
}
