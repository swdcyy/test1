package com.kwai.video.westeros.error.WesterosErrorCode$Level;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import java.util.EnumSet;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WesterosErrorCode$Level extends Enum	// class@000e78
{
    public final int code;
    public static final WesterosErrorCode$Level[] $VALUES;
    public static final WesterosErrorCode$Level kNone;
    public static final WesterosErrorCode$Level kOk;
    public static final WesterosErrorCode$Level kP0;
    public static final WesterosErrorCode$Level kP1;
    public static final WesterosErrorCode$Level kP2;
    public static final Map lookup;

    static {
       int i = 0;
       WesterosErrorCode$Level level = new WesterosErrorCode$Level("kOk", i, i);
       WesterosErrorCode$Level.kOk = level;
       WesterosErrorCode$Level level1 = new WesterosErrorCode$Level("kP0", 1, 1);
       WesterosErrorCode$Level.kP0 = level1;
       WesterosErrorCode$Level level2 = new WesterosErrorCode$Level("kP1", 2, 2);
       WesterosErrorCode$Level.kP1 = level2;
       WesterosErrorCode$Level level3 = new WesterosErrorCode$Level("kP2", 3, 3);
       WesterosErrorCode$Level.kP2 = level3;
       WesterosErrorCode$Level level4 = new WesterosErrorCode$Level("kNone", 4, -1);
       WesterosErrorCode$Level.kNone = level4;
       WesterosErrorCode$Level[] levelArray = new WesterosErrorCode$Level[]{level,level1,level2,level3,level4};
       WesterosErrorCode$Level.$VALUES = levelArray;
       WesterosErrorCode$Level.lookup = new HashMap();
       Iterator iterator = EnumSet.allOf(WesterosErrorCode$Level.class).iterator();
       while (iterator.hasNext()) {
          level1 = iterator.next();
          WesterosErrorCode$Level.lookup.put(Integer.valueOf(level1.code), level1);
       }
    }
    public void WesterosErrorCode$Level(String p0,int p1,int p2){
       super(p0, p1);
       this.code = p2;
    }
    public static WesterosErrorCode$Level fromCode(int p0){
       WesterosErrorCode$Level level = WesterosErrorCode$Level.class;
       if (PatchProxy.isSupport(level)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, level, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WesterosErrorCode$Level level1 = WesterosErrorCode$Level.lookup.get(Integer.valueOf(p0));
       if (level1 == null) {
          level1 = WesterosErrorCode$Level.kNone;
       }
       return level1;
    }
    public static WesterosErrorCode$Level valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode$Level.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WesterosErrorCode$Level.class, p0);
    }
    public static WesterosErrorCode$Level[] values(){
       Object obj = PatchProxy.apply(null, null, WesterosErrorCode$Level.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Level.$VALUES.clone();
    }
    public int getCode(){
       return this.code;
    }
}
