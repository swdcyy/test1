package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;

public final class PostEntranceEveManager$activate$2$b implements g	// class@001048
{
    public static final PostEntranceEveManager$activate$2$b b;

    static {
       PostEntranceEveManager$activate$2$b.b = new PostEntranceEveManager$activate$2$b();
    }
    public void PostEntranceEveManager$activate$2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostEntranceEveManager$activate$2$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          g.C().t("PostEntranceEvePresenter", "onInfer err: "+p0.getMessage(), objArray);
       }
       return;
    }
}
