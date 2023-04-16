package com.kuaishou.android.post.topic.TagSourceUtils$extractor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.gifshow.twitter.widget.Extractor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TagSourceUtils$extractor$2 extends Lambda implements a	// class@000ec1
{
    public static final TagSourceUtils$extractor$2 INSTANCE;

    static {
       TagSourceUtils$extractor$2.INSTANCE = new TagSourceUtils$extractor$2();
    }
    public void TagSourceUtils$extractor$2(){
       super(0);
    }
    public final Extractor invoke(){
       Object obj = PatchProxy.apply(null, this, TagSourceUtils$extractor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Extractor();
    }
    public Object invoke(){
       return this.invoke();
    }
}
