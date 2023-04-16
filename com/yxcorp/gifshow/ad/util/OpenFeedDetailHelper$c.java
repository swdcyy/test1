package com.yxcorp.gifshow.ad.util.OpenFeedDetailHelper$c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;

public final class OpenFeedDetailHelper$c extends Accessor	// class@001870
{

    public void OpenFeedDetailHelper$c(){
       super();
    }
    public Object get(){
       CommonMeta uCommonMeta = PatchProxy.apply(null, this, OpenFeedDetailHelper$c.class, "1");
       if (uCommonMeta != PatchProxyResult.class) {
       }else {
          uCommonMeta = new CommonMeta();
       }
       return uCommonMeta;
    }
}
