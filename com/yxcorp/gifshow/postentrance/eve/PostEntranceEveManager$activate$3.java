package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.ArrayList;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$3$a;
import java.util.List;
import msd.l;

public final class PostEntranceEveManager$activate$3 extends Lambda implements a	// class@00104b
{
    public final ArrayList $columns;

    public void PostEntranceEveManager$activate$3(ArrayList p0){
       this.$columns = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, PostEntranceEveManager$activate$3.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("PostEntranceEvePresenter", "activate success", objArray);
       EveManagerWrapper.e.q("PostHomeReco", this.$columns, new ArrayList(), new PostEntranceEveManager$activate$3$a());
       return;
    }
}
