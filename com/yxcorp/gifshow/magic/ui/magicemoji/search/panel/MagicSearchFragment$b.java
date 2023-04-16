package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment$b;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import a5b.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MagicSearchFragment$b implements g	// class@001bff
{
    public final MagicSearchFragment b;
    public final h c;

    public void MagicSearchFragment$b(MagicSearchFragment p0,h p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchFragment$b.class, "1")) {
       }else {
          this.b.Dh(new h(this.c.a(), p0, "", false));
       }
       return;
    }
}
