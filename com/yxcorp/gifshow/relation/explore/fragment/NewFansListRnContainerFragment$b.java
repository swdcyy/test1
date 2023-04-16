package com.yxcorp.gifshow.relation.explore.fragment.NewFansListRnContainerFragment$b;
import erd.g;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class NewFansListRnContainerFragment$b implements g	// class@001808
{
    public final KwaiRnTab b;

    public void NewFansListRnContainerFragment$b(KwaiRnTab p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       NewFansListRnContainerFragment$b uob = NewFansListRnContainerFragment$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "1")) {
          if (b) {
             this.b.A();
          }else {
             this.b.m0();
          }
       }
       return;
    }
}
