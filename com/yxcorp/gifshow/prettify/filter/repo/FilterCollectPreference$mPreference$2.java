package com.yxcorp.gifshow.prettify.filter.repo.FilterCollectPreference$mPreference$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import skd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import java.lang.StringBuilder;
import android.content.Context;

public final class FilterCollectPreference$mPreference$2 extends Lambda implements a	// class@001150
{
    public final String $key;

    public void FilterCollectPreference$mPreference$2(String p0){
       this.$key = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       c obj = PatchProxy.apply(null, this, FilterCollectPreference$mPreference$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       return a.b(obj.a(), "filter_collect_"+this.$key);
    }
}
