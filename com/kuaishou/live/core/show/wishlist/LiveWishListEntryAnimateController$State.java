package com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveWishListEntryAnimateController$State extends Enum	// class@0012ca
{
    public static final LiveWishListEntryAnimateController$State[] $VALUES;
    public static final LiveWishListEntryAnimateController$State END;
    public static final LiveWishListEntryAnimateController$State EXPANDED;
    public static final LiveWishListEntryAnimateController$State EXPANDING;
    public static final LiveWishListEntryAnimateController$State INIT;
    public static final LiveWishListEntryAnimateController$State INTERRUPT;
    public static final LiveWishListEntryAnimateController$State SHRINKING;

    static {
       LiveWishListEntryAnimateController$State state;
       LiveWishListEntryAnimateController$State[] stateArray = new LiveWishListEntryAnimateController$State[]{state,state,state,state,state,state};
       state = new LiveWishListEntryAnimateController$State("INIT", 0);
       LiveWishListEntryAnimateController$State.INIT = state;
       state = new LiveWishListEntryAnimateController$State("EXPANDING", 1);
       LiveWishListEntryAnimateController$State.EXPANDING = state;
       state = new LiveWishListEntryAnimateController$State("EXPANDED", 2);
       LiveWishListEntryAnimateController$State.EXPANDED = state;
       state = new LiveWishListEntryAnimateController$State("SHRINKING", 3);
       LiveWishListEntryAnimateController$State.SHRINKING = state;
       state = new LiveWishListEntryAnimateController$State("END", 4);
       LiveWishListEntryAnimateController$State.END = state;
       state = new LiveWishListEntryAnimateController$State("INTERRUPT", 5);
       LiveWishListEntryAnimateController$State.INTERRUPT = state;
       LiveWishListEntryAnimateController$State.$VALUES = stateArray;
    }
    public void LiveWishListEntryAnimateController$State(String p0,int p1){
       super(p0, p1);
    }
    public static LiveWishListEntryAnimateController$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveWishListEntryAnimateController$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveWishListEntryAnimateController$State.class, p0);
    }
    public static LiveWishListEntryAnimateController$State[] values(){
       Object obj = PatchProxy.apply(null, null, LiveWishListEntryAnimateController$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveWishListEntryAnimateController$State.$VALUES.clone();
    }
}
