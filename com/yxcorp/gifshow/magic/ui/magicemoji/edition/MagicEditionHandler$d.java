package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import w46.b;

public final class MagicEditionHandler$d implements g	// class@001bbd
{
    public static final MagicEditionHandler$d b;

    static {
       MagicEditionHandler$d.b = new MagicEditionHandler$d();
    }
    public void MagicEditionHandler$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$d.class, "1")) {
       }else {
          b.D().e("MagicEditionController", "locationRecommend", p0);
       }
       return;
    }
}
