package com.yxcorp.gifshow.detail.util.ViewAbortClickUtils;
import java.lang.Object;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import com.yxcorp.gifshow.detail.util.ViewAbortClickUtils$isViewHasAborted$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class ViewAbortClickUtils	// class@001a2b
{
    public static final ViewAbortClickUtils a;

    static {
       ViewAbortClickUtils.a = new ViewAbortClickUtils();
    }
    public void ViewAbortClickUtils(){
       super();
    }
    public final boolean a(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewAbortClickUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SequencesKt___SequencesKt.Y(SequencesKt___SequencesKt.b1(ViewGroupKt.b(p0), ViewAbortClickUtils$isViewHasAborted$1.INSTANCE), Boolean.TRUE);
    }
}
