package com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z4b.p;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import a5b.g;
import kotlin.jvm.internal.a;
import a5b.h;
import z4b.p$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class MagicSearchBarFragment$c implements View$OnClickListener	// class@001bf3
{
    public final MagicSearchBarFragment b;

    public void MagicSearchBarFragment$c(MagicSearchBarFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarFragment$c.class, str)) {
          return;
       }
       p op = this.b.ii();
       if (op != null) {
          MagicSearchBarFragment$c tb = this.b;
          Objects.requireNonNull(tb);
          MagicSearchBarFragment magicSearchB = PatchProxy.apply(null, tb, MagicSearchBarFragment.class, str);
          if (magicSearchB != PatchProxyResult.class) {
          }else {
             magicSearchB = tb.V0;
             if (magicSearchB == null) {
                a.S("magicSearchDataManager");
             }
          }
          p$a.a(op, magicSearchB.b(), false, 2, null);
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
