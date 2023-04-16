package com.kwai.live.gzone.tab.hybrid.TabType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TabType extends Enum	// class@000e13
{
    public final String host;
    public static final TabType[] $VALUES;
    public static final TabType H5;
    public static final TabType KRN;

    static {
       TabType tabType;
       TabType[] tabTypeArray = new TabType[]{tabType,tabType};
       tabType = new TabType("KRN", 0, "krn");
       TabType.KRN = tabType;
       tabType = new TabType("H5", 1, "http");
       TabType.H5 = tabType;
       TabType.$VALUES = tabTypeArray;
    }
    public void TabType(String p0,int p1,String p2){
       super(p0, p1);
       this.host = p2;
    }
    public static TabType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TabType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TabType.class, p0);
    }
    public static TabType[] values(){
       Object obj = PatchProxy.apply(null, null, TabType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TabType.$VALUES.clone();
    }
    public final String getHost(){
       return this.host;
    }
}
