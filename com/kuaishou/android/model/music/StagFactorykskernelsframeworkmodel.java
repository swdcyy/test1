package com.kuaishou.android.model.music.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.Music$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@000e86
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == Music.class) {
          return new Music$TypeAdapter(p0);
       }
       return null;
    }
}
