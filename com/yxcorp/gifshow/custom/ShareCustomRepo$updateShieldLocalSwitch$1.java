package com.yxcorp.gifshow.custom.ShareCustomRepo$updateShieldLocalSwitch$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.edit.draft.CustomSetting$b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShareCustomRepo$updateShieldLocalSwitch$1 extends Lambda implements l	// class@00129a
{
    public final boolean $switch;

    public void ShareCustomRepo$updateShieldLocalSwitch$1(boolean p0){
       this.$switch = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CustomSetting$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCustomRepo$updateShieldLocalSwitch$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.d(this.$switch);
       return;
    }
}
