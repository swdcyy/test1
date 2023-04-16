package com.yxcorp.gifshow.postentrance.eve.PostEveRecoInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager;
import java.util.Objects;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import com.kwai.sdk.eve.internal.featurecenter.Column;
import nsd.u;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$generatorGather$1;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$1;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$3;
import msd.p;
import msd.l;
import msd.a;

public class PostEveRecoInitModule extends TTIInitModule	// class@00104f
{

    public void PostEveRecoInitModule(){
       super();
    }
    public int f0(){
       return 2;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostEveRecoInitModule.class, "1")) {
          return;
       }
       PostEntranceEveManager e = PostEntranceEveManager.e;
       Objects.requireNonNull(e);
       PostEntranceEveManager postEntrance = PostEntranceEveManager.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, e, postEntrance, "2")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          String str = "PostEntranceEvePresenter";
          g.C().w(str, "start, isPostHomeRecoEnable: "+e.b()+' '+"isActivated: "+PostEntranceEveManager.b, objArray1);
          if (e.b() && !PostEntranceEveManager.b) {
             PostEntranceEveManager.b = true;
             if (!PatchProxy.applyVoid(objArray, e, postEntrance, "8")) {
                Object[] objArray2 = new Object[i];
                g.C().w(str, "activate", objArray2);
                ArrayList uArrayList = new ArrayList();
                Column uColumn = new Column("materialId", "LuaValueTypeString", false, false, 12, null);
                uArrayList.add(objArray2);
                Column uColumn1 = new Column("materialType", "LuaValueTypeNumber", false, false, 12, null);
                uArrayList.add(objArray2);
                Column uColumn2 = new Column("used", "LuaValueTypeBoolean", false, false, 12, null);
                uArrayList.add(objArray2);
                Column uColumn3 = new Column("iconUrl", "LuaValueTypeString", false, 0, 12, null);
                uArrayList.add(objArray2);
                uColumn = new Column("timestamp", "LuaValueTypeNumber", 0, 0, 12, 0);
                uArrayList.add(objArray2);
                EveManagerWrapper.e.c("PostHomeReco", PostEntranceEveManager$generatorGather$1.INSTANCE, PostEntranceEveManager$activate$1.INSTANCE, PostEntranceEveManager$activate$2.INSTANCE, new PostEntranceEveManager$activate$3(uArrayList));
             }
          }
       }
       return;
    }
}
