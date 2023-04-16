package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.ArrayList;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$3$a;
import java.util.List;
import msd.l;
import otc.a;

public final class PostStickerEveManager$activate$3 extends Lambda implements a	// class@001245
{
    public final ArrayList $columns;

    public void PostStickerEveManager$activate$3(ArrayList p0){
       this.$columns = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, PostStickerEveManager$activate$3.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostStickerEveManager", "activate success", objArray);
       EveManagerWrapper.e.q("PostStickerRerank", this.$columns, new ArrayList(), new PostStickerEveManager$activate$3$a());
       a.g.a();
       return;
    }
}
