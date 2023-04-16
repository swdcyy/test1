package com.kuaishou.android.model.mix.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.ScoreMark;
import com.kuaishou.android.model.mix.ScoreMark$TypeAdapter;
import com.kuaishou.android.model.mix.CoverAnimation;
import com.kuaishou.android.model.mix.CoverAnimation$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@000e01
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == ScoreMark.class) {
          return new ScoreMark$TypeAdapter(p0);
       }
       if (rawType == CoverAnimation.class) {
          return new CoverAnimation$TypeAdapter(p0);
       }
       return null;
    }
}
