package com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo$Companion$scoreCache$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.util.LruCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecommendCoverRepo$Companion$scoreCache$2 extends Lambda implements a	// class@000e8e
{
    public static final RecommendCoverRepo$Companion$scoreCache$2 INSTANCE;

    static {
       RecommendCoverRepo$Companion$scoreCache$2.INSTANCE = new RecommendCoverRepo$Companion$scoreCache$2();
    }
    public void RecommendCoverRepo$Companion$scoreCache$2(){
       super(0);
    }
    public final LruCache invoke(){
       Object obj = PatchProxy.apply(null, this, RecommendCoverRepo$Companion$scoreCache$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LruCache(45);
    }
    public Object invoke(){
       return this.invoke();
    }
}
