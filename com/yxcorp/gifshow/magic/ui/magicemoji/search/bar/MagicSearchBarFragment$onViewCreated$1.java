package com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$onViewCreated$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import a5b.h;
import a5b.g;
import z4b.p;
import z4b.p$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class MagicSearchBarFragment$onViewCreated$1 extends Lambda implements l	// class@001bf5
{
    public final MagicSearchBarFragment this$0;

    public void MagicSearchBarFragment$onViewCreated$1(MagicSearchBarFragment p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(MagicSearchBarFragment$onViewCreated$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSearchBarFragment$onViewCreated$1.class, "1")) {
          return;
       }
       MagicSearchBarFragment$onViewCreated$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (PatchProxy.isSupport(MagicSearchBarFragment.class) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tthis$0, MagicSearchBarFragment.class, "13") && p0)) {
          MagicSearchBarFragment y0 = tthis$0.Y0;
          if (y0 != null) {
             MagicSearchBarFragment v0 = tthis$0.V0;
             if (v0 == null) {
                a.S("magicSearchDataManager");
             }
             p$a.a(y0, v0.b(), false, 2, null);
          }
          tthis$0.dismissAllowingStateLoss();
       }
       return;
    }
}
