package com.kwai.feature.post.funnel.IPostFunnelLifecycleCallBack$Stage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IPostFunnelLifecycleCallBack$Stage extends Enum	// class@00149e
{
    public static final IPostFunnelLifecycleCallBack$Stage[] $VALUES;
    public static final IPostFunnelLifecycleCallBack$Stage ON_CREATE;
    public static final IPostFunnelLifecycleCallBack$Stage ON_DESTROY;
    public static final IPostFunnelLifecycleCallBack$Stage ON_RESUME;
    public static final IPostFunnelLifecycleCallBack$Stage ON_STOP;
    public static final IPostFunnelLifecycleCallBack$Stage ON_VIEW_CREATE;

    static {
       IPostFunnelLifecycleCallBack$Stage stage;
       IPostFunnelLifecycleCallBack$Stage[] stageArray = new IPostFunnelLifecycleCallBack$Stage[]{stage,stage,stage,stage,stage};
       stage = new IPostFunnelLifecycleCallBack$Stage("ON_CREATE", 0);
       IPostFunnelLifecycleCallBack$Stage.ON_CREATE = stage;
       stage = new IPostFunnelLifecycleCallBack$Stage("ON_VIEW_CREATE", 1);
       IPostFunnelLifecycleCallBack$Stage.ON_VIEW_CREATE = stage;
       stage = new IPostFunnelLifecycleCallBack$Stage("ON_RESUME", 2);
       IPostFunnelLifecycleCallBack$Stage.ON_RESUME = stage;
       stage = new IPostFunnelLifecycleCallBack$Stage("ON_STOP", 3);
       IPostFunnelLifecycleCallBack$Stage.ON_STOP = stage;
       stage = new IPostFunnelLifecycleCallBack$Stage("ON_DESTROY", 4);
       IPostFunnelLifecycleCallBack$Stage.ON_DESTROY = stage;
       IPostFunnelLifecycleCallBack$Stage.$VALUES = stageArray;
    }
    public void IPostFunnelLifecycleCallBack$Stage(String p0,int p1){
       super(p0, p1);
    }
    public static IPostFunnelLifecycleCallBack$Stage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IPostFunnelLifecycleCallBack$Stage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IPostFunnelLifecycleCallBack$Stage.class, p0);
    }
    public static IPostFunnelLifecycleCallBack$Stage[] values(){
       Object obj = PatchProxy.apply(null, null, IPostFunnelLifecycleCallBack$Stage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IPostFunnelLifecycleCallBack$Stage.$VALUES.clone();
    }
}
