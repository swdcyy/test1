package com.yxcorp.gifshow.activity.share.helper.PostLocationHelper$supportKrn$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PostLocationHelper$supportKrn$2 extends Lambda implements a	// class@00138f
{
    public static final PostLocationHelper$supportKrn$2 INSTANCE;

    static {
       PostLocationHelper$supportKrn$2.INSTANCE = new PostLocationHelper$supportKrn$2();
    }
    public void PostLocationHelper$supportKrn$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PostLocationHelper$supportKrn$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("publishKrnLocationSupport", false);
    }
}
