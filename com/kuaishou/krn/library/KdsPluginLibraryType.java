package com.kuaishou.krn.library.KdsPluginLibraryType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KdsPluginLibraryType extends Enum	// class@0008d1
{
    public static final KdsPluginLibraryType[] $VALUES;
    public static final KdsPluginLibraryType DEFAULT;
    public static final KdsPluginLibraryType DOWNLOADED;
    public static final KdsPluginLibraryType READY;

    static {
       KdsPluginLibraryType kdsPluginLib1;
       KdsPluginLibraryType[] kdsPluginLib = new KdsPluginLibraryType[]{kdsPluginLib1,kdsPluginLib1,kdsPluginLib1};
       kdsPluginLib1 = new KdsPluginLibraryType("DEFAULT", 0);
       KdsPluginLibraryType.DEFAULT = kdsPluginLib1;
       kdsPluginLib1 = new KdsPluginLibraryType("DOWNLOADED", 1);
       KdsPluginLibraryType.DOWNLOADED = kdsPluginLib1;
       kdsPluginLib1 = new KdsPluginLibraryType("READY", 2);
       KdsPluginLibraryType.READY = kdsPluginLib1;
       KdsPluginLibraryType.$VALUES = kdsPluginLib;
    }
    public void KdsPluginLibraryType(String p0,int p1){
       super(p0, p1);
    }
    public static KdsPluginLibraryType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KdsPluginLibraryType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KdsPluginLibraryType.class, p0);
    }
    public static KdsPluginLibraryType[] values(){
       Object obj = PatchProxy.apply(null, null, KdsPluginLibraryType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KdsPluginLibraryType.$VALUES.clone();
    }
}
