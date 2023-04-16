package com.kuaishou.live.comments.richtext.LiveRichTextParser$badgeDecoder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.comments.richtext.LiveRichTextParser;
import cp3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import cp3.a;

public final class LiveRichTextParser$badgeDecoder$2 extends Lambda implements a	// class@000e41
{
    public final LiveRichTextParser this$0;

    public void LiveRichTextParser$badgeDecoder$2(LiveRichTextParser p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveRichTextParser$badgeDecoder$2 obj = PatchProxy.apply(objArray, this, LiveRichTextParser$badgeDecoder$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       b uob = PatchProxy.apply(objArray, obj, LiveRichTextParser.class, "9");
       if (uob != patchProxyRe) {
       }else {
          uob = new b(obj.j);
       }
       return uob;
    }
    public Object invoke(){
       return this.invoke();
    }
}
