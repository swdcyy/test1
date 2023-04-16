package com.kwai.feature.api.corona.model.CoronaFeatureApiCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;

public class CoronaFeatureApiCommonMeta implements Serializable	// class@000def
{
    public LandscapePlcExtModel mLandscapePlcExtModel;
    public boolean mScaledPlaying;
    public static final long serialVersionUID = 0x9c994179fa1a06b8;

    public void CoronaFeatureApiCommonMeta(){
       super();
       this.mScaledPlaying = false;
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CoronaFeatureApiCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(CoronaFeatureApiCommonMeta.class, "", "coronaFeatureApiCommonModel");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
}
