package com.yxcorp.gifshow.prettify.filter.repo.FilterCollectPreference;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.filter.repo.FilterCollectPreference$mPreference$2;
import msd.a;
import qrd.p;
import qrd.s;
import skd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FilterCollectPreference	// class@001151
{
    public final p a;

    public void FilterCollectPreference(String p0){
       a.p(p0, "key");
       super();
       this.a = s.c(new FilterCollectPreference$mPreference$2(p0));
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, FilterCollectPreference.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
