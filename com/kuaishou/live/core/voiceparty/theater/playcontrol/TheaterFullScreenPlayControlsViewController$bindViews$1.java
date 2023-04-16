package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$bindViews$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class TheaterFullScreenPlayControlsViewController$bindViews$1 extends Lambda implements q	// class@00198c
{
    public static final TheaterFullScreenPlayControlsViewController$bindViews$1 INSTANCE;

    static {
       TheaterFullScreenPlayControlsViewController$bindViews$1.INSTANCE = new TheaterFullScreenPlayControlsViewController$bindViews$1();
    }
    public void TheaterFullScreenPlayControlsViewController$bindViews$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0.booleanValue(), p1.booleanValue(), p2));
    }
    public final boolean invoke(boolean p0,boolean p1,Boolean p2){
       if (PatchProxy.isSupport(TheaterFullScreenPlayControlsViewController$bindViews$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, TheaterFullScreenPlayControlsViewController$bindViews$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (p0 && (!p1 && !p2.booleanValue()))? true: false;
       return p0;
    }
}
