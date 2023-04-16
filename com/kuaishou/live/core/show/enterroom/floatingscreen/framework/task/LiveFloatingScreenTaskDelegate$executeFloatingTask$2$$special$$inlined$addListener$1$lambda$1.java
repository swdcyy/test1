package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2;
import java.util.Objects;
import s72.b;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import s72.a;
import w72.a;
import java.lang.Integer;

public final class LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1 extends Lambda implements a	// class@000b0e
{
    public final LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 this$0;

    public void LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1(LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2 obj = PatchProxy.applyWithListener(objArray, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0.a.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "8");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(obj.i.a(obj.f.h().getBizType()) == true){
          i = 0;
       }else {
          i = 8;
       }
       PatchProxy.onMethodExit(LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1$lambda$1.class, "1");
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
