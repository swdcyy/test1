package com.kwai.resource.kds.KidIconColorConfig;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.util.Pair;
import java.lang.Integer;
import java.util.Map;
import zf6.j;
import android.graphics.Color;
import java.lang.StringBuilder;
import rl7.a;

public final class KidIconColorConfig extends Enum	// class@0013ce
{
    public final Map colorConfigCache;
    public static final KidIconColorConfig[] $VALUES;
    public static final KidIconColorConfig INSTANCE;

    static {
       KidIconColorConfig kidIconColor = new KidIconColorConfig("INSTANCE", 0);
       KidIconColorConfig.INSTANCE = kidIconColor;
       KidIconColorConfig[] kidIconColor1 = new KidIconColorConfig[]{kidIconColor};
       KidIconColorConfig.$VALUES = kidIconColor1;
    }
    public void KidIconColorConfig(String p0,int p1){
       super(p0, p1);
       this.colorConfigCache = new ConcurrentHashMap();
    }
    public static KidIconColorConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KidIconColorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KidIconColorConfig.class, p0);
    }
    public static KidIconColorConfig[] values(){
       Object obj = PatchProxy.apply(null, null, KidIconColorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KidIconColorConfig.$VALUES.clone();
    }
    public Pair findIconColor(Context p0,int p1){
       Pair obj;
       KidIconColorConfig kidIconColor = KidIconColorConfig.class;
       if (PatchProxy.isSupport(kidIconColor)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kidIconColor, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null || !p1) {
          return obj;
       }else {
          Pair pair = this.colorConfigCache.get(Integer.valueOf(p1));
          if (pair == null) {
             return obj;
          }else {
             pair = pair.second.intValue();
             int i = j.e(p0, pair, 1);
             int i1 = j.e(p0, pair, 2);
             return new Pair(this.int2Hex(i), this.int2Hex(i1));
          }
       }
    }
    public final String int2Hex(int p0){
       Object[] obj;
       KidIconColorConfig kidIconColor = KidIconColorConfig.class;
       if (PatchProxy.isSupport(kidIconColor)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kidIconColor, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(Color.alpha(p0))};
       String str = (String.format("%02X", objArray)).toUpperCase();
       Object[] objArray1 = new Object[]{Integer.valueOf(Color.red(p0))};
       Object[] objArray2 = new Object[]{Integer.valueOf(Color.green(p0))};
       obj = new Object[]{Integer.valueOf(Color.blue(p0))};
       StringBuilder str1 = (String.format("#%02X", objArray1)).toUpperCase()+(String.format("%02X", objArray2)).toUpperCase()+(String.format("%02X", obj)).toUpperCase();
       if (("FF").equals(str)) {
          str = "";
       }
       return str1+str;
    }
    public final void registerIconResource(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KidIconColorConfig.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.a(this.colorConfigCache);
       }
       return;
    }
}
