package com.kuaishou.tuna_core.plugin.l;
import nmc.c;
import java.lang.Object;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import f05.e;
import io.reactivex.g;
import com.kuaishou.tuna_core.plugin.n;
import com.kuaishou.tuna_core.plugin.n$a;

public class l implements c	// class@001120
{

    public void l(){
       super();
    }
    public t gK(DialogFragment p0,ShareBusinessLinkInfo$DialogInfo p1,UpdateShareBusinessLinkModel p2,ShareBusinessLinkPhotoParam p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TunaQigsawPluginReporter tunaQigsawPl = new TunaQigsawPluginReporter("tuna_plc_post");
       tunaQigsawPl.a();
       e uoe = new e(this, tunaQigsawPl, p0, p1, p2, p3);
       return t.create(obj);
    }
    public boolean isAvailable(){
       return true;
    }
    public void pB(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       n.a.a("tuna_plc_post", null, false);
       return;
    }
}
