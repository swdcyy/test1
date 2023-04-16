package com.yxcorp.gateway.pay.loading.LoadingStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LoadingStyle extends Enum	// class@001226
{
    public int value;
    public static final LoadingStyle[] $VALUES;
    public static final LoadingStyle GRADIENT;
    public static final LoadingStyle GRAY;
    public static final LoadingStyle GRAY_DARK;
    public static final LoadingStyle GRAY_LIGHT;
    public static final LoadingStyle WHITE;

    static {
       LoadingStyle loadingStyle = new LoadingStyle("GRAY", 0, 0);
       LoadingStyle.GRAY = loadingStyle;
       LoadingStyle loadingStyle1 = new LoadingStyle("GRAY_LIGHT", 1, 1);
       LoadingStyle.GRAY_LIGHT = loadingStyle1;
       LoadingStyle loadingStyle2 = new LoadingStyle("GRAY_DARK", 2, 2);
       LoadingStyle.GRAY_DARK = loadingStyle2;
       LoadingStyle loadingStyle3 = new LoadingStyle("WHITE", 3, 3);
       LoadingStyle.WHITE = loadingStyle3;
       LoadingStyle loadingStyle4 = new LoadingStyle("GRADIENT", 4, 4);
       LoadingStyle.GRADIENT = loadingStyle4;
       LoadingStyle[] loadingStyle5 = new LoadingStyle[]{loadingStyle,loadingStyle1,loadingStyle2,loadingStyle3,loadingStyle4};
       LoadingStyle.$VALUES = loadingStyle5;
    }
    public void LoadingStyle(String p0,int p1,int p2){
       this.value = p2;
    }
    public static LoadingStyle fromOrdinal(int p0){
       LoadingStyle loadingStyle = LoadingStyle.class;
       if (PatchProxy.isSupport(loadingStyle)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, loadingStyle, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0 && p0 < LoadingStyle.values().length) {
          return LoadingStyle.values()[p0];
       }else {
          return LoadingStyle.GRAY;
       }
    }
    public static LoadingStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadingStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadingStyle.class, p0);
    }
    public static LoadingStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LoadingStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadingStyle.$VALUES.clone();
    }
}
