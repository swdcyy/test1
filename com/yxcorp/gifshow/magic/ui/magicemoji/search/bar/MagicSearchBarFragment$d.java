package com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$d;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import java.lang.Object;
import a5b.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import z4b.p;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class MagicSearchBarFragment$d implements MagicSearchBarFragment$b	// class@001bf4
{
    public final MagicSearchBarFragment a;

    public void MagicSearchBarFragment$d(MagicSearchBarFragment p0){
       this.a = p0;
       super();
    }
    public void a(h p0,boolean p1){
       MagicSearchBarFragment$d uod = MagicSearchBarFragment$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       p op = this.a.ii();
       if (op != null) {
          op.ya(p0, p1);
       }
       this.a.dismissAllowingStateLoss();
       return;
    }
}
