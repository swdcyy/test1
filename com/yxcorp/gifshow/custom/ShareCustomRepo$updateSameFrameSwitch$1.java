package com.yxcorp.gifshow.custom.ShareCustomRepo$updateSameFrameSwitch$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.edit.draft.CustomSetting$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShareCustomRepo$updateSameFrameSwitch$1 extends Lambda implements l	// class@001299
{
    public final boolean $switch;

    public void ShareCustomRepo$updateSameFrameSwitch$1(boolean p0){
       this.$switch = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CustomSetting$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCustomRepo$updateSameFrameSwitch$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.b(this.$switch);
       return;
    }
}
