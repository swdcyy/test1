package com.yxcorp.gifshow.profile.widget.HorizontalRecyclerView$mTouchSlop$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class HorizontalRecyclerView$mTouchSlop$2 extends Lambda implements a	// class@0015f5
{
    public final Context $context;

    public void HorizontalRecyclerView$mTouchSlop$2(Context p0){
       this.$context = p0;
       super(0);
    }
    public final int invoke(){
       ViewConfiguration obj = PatchProxy.apply(null, this, HorizontalRecyclerView$mTouchSlop$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = ViewConfiguration.get(this.$context);
       a.o(obj, "ViewConfiguration.get\(context\)");
       return obj.getScaledTouchSlop();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
