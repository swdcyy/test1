package com.yxcorp.gifshow.profile.components.common.actions.HeadTagLoadAction;
import ee7.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HeadTagLoadAction extends Enum implements e	// class@0012e2
{
    public static final HeadTagLoadAction[] $VALUES;
    public static final HeadTagLoadAction UPDATE;

    static {
       HeadTagLoadAction headTagLoadA1;
       HeadTagLoadAction[] headTagLoadA = new HeadTagLoadAction[]{headTagLoadA1};
       headTagLoadA1 = new HeadTagLoadAction("UPDATE", 0);
       HeadTagLoadAction.UPDATE = headTagLoadA1;
       HeadTagLoadAction.$VALUES = headTagLoadA;
    }
    public void HeadTagLoadAction(String p0,int p1){
       super(p0, p1);
    }
    public static HeadTagLoadAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HeadTagLoadAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HeadTagLoadAction.class, p0);
    }
    public static HeadTagLoadAction[] values(){
       Object obj = PatchProxy.apply(null, null, HeadTagLoadAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HeadTagLoadAction.$VALUES.clone();
    }
}
