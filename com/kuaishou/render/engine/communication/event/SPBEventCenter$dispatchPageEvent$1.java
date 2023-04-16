package com.kuaishou.render.engine.communication.event.SPBEventCenter$dispatchPageEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.render.engine.communication.data.SPBEventBean;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class SPBEventCenter$dispatchPageEvent$1 extends Lambda implements l	// class@000eed
{
    public final SPBEventBean $eventBean;

    public void SPBEventCenter$dispatchPageEvent$1(SPBEventBean p0){
       this.$eventBean = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(SPBEventBean p0){
       SPBEventCenter$dispatchPageEvent$1 obj = PatchProxy.applyOneRefs(p0, this, SPBEventCenter$dispatchPageEvent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       obj = this.$eventBean;
       SPBEventBean pageId = (obj != null)? obj.pageId: null;
       return TextUtils.equals(pageId, p0.pageId);
    }
}
