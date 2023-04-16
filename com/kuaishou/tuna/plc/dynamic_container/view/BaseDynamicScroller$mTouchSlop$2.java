package com.kuaishou.tuna.plc.dynamic_container.view.BaseDynamicScroller$mTouchSlop$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class BaseDynamicScroller$mTouchSlop$2 extends Lambda implements a	// class@001001
{
    public static final BaseDynamicScroller$mTouchSlop$2 INSTANCE;

    static {
       BaseDynamicScroller$mTouchSlop$2.INSTANCE = new BaseDynamicScroller$mTouchSlop$2();
    }
    public void BaseDynamicScroller$mTouchSlop$2(){
       super(0);
    }
    public final int invoke(){
       ViewConfiguration obj = PatchProxy.apply(null, this, BaseDynamicScroller$mTouchSlop$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ViewConfiguration.get(a.b());
       a.o(obj, "ViewConfiguration.get\(AppEnv.getAppContext\(\)\)");
       return obj.getScaledTouchSlop();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
