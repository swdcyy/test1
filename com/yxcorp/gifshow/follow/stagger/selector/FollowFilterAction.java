package com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FollowFilterAction extends Enum	// class@001229
{
    public static final FollowFilterAction[] $VALUES;
    public static final FollowFilterAction IMMEDIATE_COLLAPSE;
    public static final FollowFilterAction SMOOTH_COLLAPSE;
    public static final FollowFilterAction SMOOTH_COLLAPSE_NO_RADIO_ANIM;
    public static final FollowFilterAction SMOOTH_EXPAND;

    static {
       FollowFilterAction uFollowFilte = new FollowFilterAction("SMOOTH_COLLAPSE", 0);
       FollowFilterAction.SMOOTH_COLLAPSE = uFollowFilte;
       FollowFilterAction uFollowFilte1 = new FollowFilterAction("SMOOTH_COLLAPSE_NO_RADIO_ANIM", 1);
       FollowFilterAction.SMOOTH_COLLAPSE_NO_RADIO_ANIM = uFollowFilte1;
       FollowFilterAction uFollowFilte2 = new FollowFilterAction("SMOOTH_EXPAND", 2);
       FollowFilterAction.SMOOTH_EXPAND = uFollowFilte2;
       FollowFilterAction uFollowFilte3 = new FollowFilterAction("IMMEDIATE_COLLAPSE", 3);
       FollowFilterAction.IMMEDIATE_COLLAPSE = uFollowFilte3;
       FollowFilterAction[] uFollowFilte4 = new FollowFilterAction[]{uFollowFilte,uFollowFilte1,uFollowFilte2,uFollowFilte3};
       FollowFilterAction.$VALUES = uFollowFilte4;
    }
    public void FollowFilterAction(String p0,int p1){
       super(p0, p1);
    }
    public static FollowFilterAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowFilterAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FollowFilterAction.class, p0);
    }
    public static FollowFilterAction[] values(){
       Object obj = PatchProxy.apply(null, null, FollowFilterAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowFilterAction.$VALUES.clone();
    }
}
