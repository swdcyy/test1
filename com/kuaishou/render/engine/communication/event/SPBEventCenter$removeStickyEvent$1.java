package com.kuaishou.render.engine.communication.event.SPBEventCenter$removeStickyEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.Object;
import com.kuaishou.render.engine.communication.data.SPBEventBean;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import bv4.c;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class SPBEventCenter$removeStickyEvent$1 extends Lambda implements l	// class@000eee
{
    public final Activity $activity;

    public void SPBEventCenter$removeStickyEvent$1(Activity p0){
       this.$activity = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(SPBEventBean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SPBEventCenter$removeStickyEvent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return TextUtils.equals(c.b(this.$activity), p0.pageId);
    }
}
