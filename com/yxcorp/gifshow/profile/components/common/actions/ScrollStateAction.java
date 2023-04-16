package com.yxcorp.gifshow.profile.components.common.actions.ScrollStateAction;
import ee7.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ScrollStateAction extends Enum implements e	// class@0012e4
{
    public static final ScrollStateAction[] $VALUES;
    public static final ScrollStateAction UPDATE;

    static {
       ScrollStateAction scrollStateA1;
       ScrollStateAction[] scrollStateA = new ScrollStateAction[]{scrollStateA1};
       scrollStateA1 = new ScrollStateAction("UPDATE", 0);
       ScrollStateAction.UPDATE = scrollStateA1;
       ScrollStateAction.$VALUES = scrollStateA;
    }
    public void ScrollStateAction(String p0,int p1){
       super(p0, p1);
    }
    public static ScrollStateAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScrollStateAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScrollStateAction.class, p0);
    }
    public static ScrollStateAction[] values(){
       Object obj = PatchProxy.apply(null, null, ScrollStateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScrollStateAction.$VALUES.clone();
    }
}
