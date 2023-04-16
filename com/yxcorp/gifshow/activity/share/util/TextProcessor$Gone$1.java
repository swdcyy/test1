package com.yxcorp.gifshow.activity.share.util.TextProcessor$Gone$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$c;

public final class TextProcessor$Gone$1 extends Lambda implements a	// class@00148b
{
    public static final TextProcessor$Gone$1 INSTANCE;

    static {
       TextProcessor$Gone$1.INSTANCE = new TextProcessor$Gone$1();
    }
    public void TextProcessor$Gone$1(){
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, TextProcessor$Gone$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextProcessor$c();
    }
}
