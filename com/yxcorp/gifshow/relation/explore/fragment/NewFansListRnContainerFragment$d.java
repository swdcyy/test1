package com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$d;
import erd.g;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class NewFansListRnContainerFragment$d implements g	// class@00180a
{
    public final KwaiRnTab b;

    public void NewFansListRnContainerFragment$d(KwaiRnTab p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       NewFansListRnContainerFragment$d uod = NewFansListRnContainerFragment$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          this.b.eh((b ^ 0x01));
       }
       return;
    }
}
