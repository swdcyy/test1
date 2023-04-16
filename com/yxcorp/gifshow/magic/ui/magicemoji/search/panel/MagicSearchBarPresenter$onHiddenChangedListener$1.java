package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$onHiddenChangedListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class MagicSearchBarPresenter$onHiddenChangedListener$1 extends Lambda implements l	// class@001bfc
{
    public final MagicSearchBarPresenter this$0;

    public void MagicSearchBarPresenter$onHiddenChangedListener$1(MagicSearchBarPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       MagicSearchBarPresenter$onHiddenChangedListener$1 tthis$0;
       boolean b;
       if (PatchProxy.isSupport(MagicSearchBarPresenter$onHiddenChangedListener$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSearchBarPresenter$onHiddenChangedListener$1.class, "1")) {
          return;
       }
       if (p0) {
          tthis$0 = this.this$0;
          b = false;
       }else {
          tthis$0 = this.this$0;
          b = true;
       }
       tthis$0.R8(b);
       return;
    }
}
