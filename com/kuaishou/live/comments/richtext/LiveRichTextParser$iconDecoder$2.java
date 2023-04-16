package com.kuaishou.live.comments.richtext.LiveRichTextParser$iconDecoder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.comments.richtext.LiveRichTextParser;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import l81.a;
import cp3.f;

public final class LiveRichTextParser$iconDecoder$2 extends Lambda implements a	// class@000e43
{
    public final LiveRichTextParser this$0;

    public void LiveRichTextParser$iconDecoder$2(LiveRichTextParser p0){
       this.this$0 = p0;
       super(0);
    }
    public final IconSegmentDecoder invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveRichTextParser$iconDecoder$2 obj = PatchProxy.apply(null, this, LiveRichTextParser$iconDecoder$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       IconSegmentDecoder iconSegmentD = PatchProxy.apply(null, obj, LiveRichTextParser.class, "10");
       if (iconSegmentD != patchProxyRe) {
       }else {
          iconSegmentD = new IconSegmentDecoder(a.a);
       }
       return iconSegmentD;
    }
    public Object invoke(){
       return this.invoke();
    }
}
