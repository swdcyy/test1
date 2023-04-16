package com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$Scene;
import com.kuaishou.live.audience.gzone.LiveGzonePresenterFactory$b;
import java.lang.Enum;
import java.lang.String;
import java.util.BitSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzonePresenterFactory$Scene extends Enum implements LiveGzonePresenterFactory$b	// class@000c10
{
    public BitSet mBitSet;
    public static final LiveGzonePresenterFactory$Scene[] $VALUES;
    public static final LiveGzonePresenterFactory$Scene BASIC;
    public static final LiveGzonePresenterFactory$Scene GAME;
    public static final LiveGzonePresenterFactory$Scene GAME_MULTI_TAB;
    public static final LiveGzonePresenterFactory$Scene GAME_NORMAL;
    public static final LiveGzonePresenterFactory$Scene MULTI_TAB;
    public static final LiveGzonePresenterFactory$Scene SHOW_MULTI_TAB;

    static {
       LiveGzonePresenterFactory$b[] uobArray = new LiveGzonePresenterFactory$b[0];
       LiveGzonePresenterFactory$Scene scene = new LiveGzonePresenterFactory$Scene("BASIC", 0, uobArray);
       LiveGzonePresenterFactory$Scene.BASIC = scene;
       LiveGzonePresenterFactory$b[] uobArray1 = new LiveGzonePresenterFactory$b[0];
       LiveGzonePresenterFactory$Scene scene1 = new LiveGzonePresenterFactory$Scene("GAME_NORMAL", 1, uobArray1);
       LiveGzonePresenterFactory$Scene.GAME_NORMAL = scene1;
       LiveGzonePresenterFactory$b[] uobArray2 = new LiveGzonePresenterFactory$b[0];
       LiveGzonePresenterFactory$Scene scene2 = new LiveGzonePresenterFactory$Scene("GAME_MULTI_TAB", 2, uobArray2);
       LiveGzonePresenterFactory$Scene.GAME_MULTI_TAB = scene2;
       LiveGzonePresenterFactory$b[] uobArray3 = new LiveGzonePresenterFactory$b[0];
       LiveGzonePresenterFactory$Scene scene3 = new LiveGzonePresenterFactory$Scene("SHOW_MULTI_TAB", 3, uobArray3);
       LiveGzonePresenterFactory$Scene.SHOW_MULTI_TAB = scene3;
       LiveGzonePresenterFactory$b[] uobArray4 = new LiveGzonePresenterFactory$b[]{scene2,scene3};
       LiveGzonePresenterFactory$Scene scene4 = new LiveGzonePresenterFactory$Scene("MULTI_TAB", 4, uobArray4);
       LiveGzonePresenterFactory$Scene.MULTI_TAB = scene4;
       LiveGzonePresenterFactory$b[] uobArray5 = new LiveGzonePresenterFactory$b[]{scene1,scene2};
       LiveGzonePresenterFactory$Scene scene5 = new LiveGzonePresenterFactory$Scene("GAME", 5, uobArray5);
       LiveGzonePresenterFactory$Scene.GAME = scene5;
       LiveGzonePresenterFactory$Scene[] sceneArray = new LiveGzonePresenterFactory$Scene[]{scene,scene1,scene2,scene3,scene4,scene5};
       LiveGzonePresenterFactory$Scene.$VALUES = sceneArray;
    }
    public void LiveGzonePresenterFactory$Scene(String p0,int p1,LiveGzonePresenterFactory$b[] p2){
       super(p0, p1);
       BitSet uBitSet = new BitSet();
       this.mBitSet = uBitSet;
       if (p2 == null || !p2.length) {
          uBitSet.set(this.ordinal(), true);
       }else {
          int len = p2.length;
          for (p1 = 0; p1 < len; p1++) {
             this.mBitSet.or(p2[p1].getBitSet());
          }
       }
       return;
    }
    public static LiveGzonePresenterFactory$Scene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzonePresenterFactory$Scene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzonePresenterFactory$Scene.class, p0);
    }
    public static LiveGzonePresenterFactory$Scene[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzonePresenterFactory$Scene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzonePresenterFactory$Scene.$VALUES.clone();
    }
    public BitSet getBitSet(){
       return this.mBitSet;
    }
}
