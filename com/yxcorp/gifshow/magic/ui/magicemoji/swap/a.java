package com.yxcorp.gifshow.magic.ui.magicemoji.swap.a;
import com.kwai.video.westeros.models.PickMediaInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.westeros.models.PickMediaOutput;
import com.kwai.video.westeros.models.FMSize;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.a$a;
import com.google.protobuf.GeneratedMessageLite;

public final class a	// class@001c2f
{
    public final PickMediaInfo a;

    public void a(PickMediaInfo p0){
       a.p(p0, "mediaInfo");
       super();
       this.a = p0;
    }
    public final String a(){
       PickMediaOutput obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getOutput();
       a.o(obj, "mediaInfo.output");
       String key = obj.getKey();
       a.o(key, "mediaInfo.output.key");
       return key;
    }
    public final FMSize b(){
       FMSize obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getSize();
       a.o(obj, "mediaInfo.size");
       return obj;
    }
    public final a$a c(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FMSize size = this.a.getSize();
       a.o(size, "mediaInfo.size");
       FMSize size1 = this.a.getSize();
       a.o(size1, "mediaInfo.size");
       return new a$a((int)size.getWidth(), (int)size1.getHeight(), this.a.getDuration());
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.toString();
       a.o(obj, "mediaInfo.toString\(\)");
       return obj;
    }
}
