package com.yxcorp.gifshow.activity.share.helper.PostLocationHelper$krnLocationHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostLocationHelper$krnLocationHelper$2 extends Lambda implements a	// class@00138d
{
    public static final PostLocationHelper$krnLocationHelper$2 INSTANCE;

    static {
       PostLocationHelper$krnLocationHelper$2.INSTANCE = new PostLocationHelper$krnLocationHelper$2();
    }
    public void PostLocationHelper$krnLocationHelper$2(){
       super(0);
    }
    public final KrnLocationHelper invoke(){
       Object obj = PatchProxy.apply(null, this, PostLocationHelper$krnLocationHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KrnLocationHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
