package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import w46.b;

public final class MagicEditionHandler$h implements g	// class@001bc1
{
    public static final MagicEditionHandler$h b;

    static {
       MagicEditionHandler$h.b = new MagicEditionHandler$h();
    }
    public void MagicEditionHandler$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$h.class, "1")) {
       }else {
          b.D().e("MagicEditionController", "saveRecordInfo error", p0);
       }
       return;
    }
}
