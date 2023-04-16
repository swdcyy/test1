package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$3$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$3;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import kotlin.jvm.internal.a;
import com.kwai.android.common.ext.SharePreferenceExtKt;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$3$1 extends Lambda implements a	// class@0014ed
{
    public final GrowthTestCommonLayoutKt$inflateCommonLayout$3 this$0;

    public void GrowthTestCommonLayoutKt$inflateCommonLayout$3$1(GrowthTestCommonLayoutKt$inflateCommonLayout$3 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestCommonLayoutKt$inflateCommonLayout$3$1.class, "1")) {
          return;
       }
       SharedPreferences sharedPrefer = b.c(this.this$0.$context, "emotionsdk_kvt", 0);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­ext, \"emotionsdk_kvt\", 0\)");
       SharePreferenceExtKt.remove(sharedPrefer, "recently_used_emoji_cache_key");
       return;
    }
}
