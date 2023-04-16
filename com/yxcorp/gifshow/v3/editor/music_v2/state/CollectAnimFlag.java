package com.yxcorp.gifshow.v3.editor.music_v2.state.CollectAnimFlag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CollectAnimFlag extends Enum	// class@0010be
{
    public static final CollectAnimFlag[] $VALUES;
    public static final CollectAnimFlag FAVORITE;
    public static final CollectAnimFlag IDLE;
    public static final CollectAnimFlag UN_FAVORITE;

    static {
       CollectAnimFlag uCollectAnim1;
       CollectAnimFlag[] uCollectAnim = new CollectAnimFlag[]{uCollectAnim1,uCollectAnim1,uCollectAnim1};
       uCollectAnim1 = new CollectAnimFlag("IDLE", 0);
       CollectAnimFlag.IDLE = uCollectAnim1;
       uCollectAnim1 = new CollectAnimFlag("FAVORITE", 1);
       CollectAnimFlag.FAVORITE = uCollectAnim1;
       uCollectAnim1 = new CollectAnimFlag("UN_FAVORITE", 2);
       CollectAnimFlag.UN_FAVORITE = uCollectAnim1;
       CollectAnimFlag.$VALUES = uCollectAnim;
    }
    public void CollectAnimFlag(String p0,int p1){
       super(p0, p1);
    }
    public static CollectAnimFlag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CollectAnimFlag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CollectAnimFlag.class, p0);
    }
    public static CollectAnimFlag[] values(){
       Object obj = PatchProxy.apply(null, null, CollectAnimFlag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectAnimFlag.$VALUES.clone();
    }
}
