package com.kuaishou.live.common.core.component.comments.d;
import lf3.g;
import com.kuaishou.live.common.core.component.comments.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qk.m;
import ne1.o;
import ok.o;
import com.google.common.collect.ImmutableList;
import java.util.List;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import lf3.f;

public final class d implements g	// class@001069
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "5")) {
       }else if(p0 == null){
          ImmutableList immutableLis = m.t(p0.richTextFeed).p(new o(tb)).B();
          if (immutableLis != null && immutableLis.size()) {
             LiveStreamRichTextFeed$RichTextFeed[] richTextFeed = new LiveStreamRichTextFeed$RichTextFeed[immutableLis.size()];
             tb.P8(immutableLis.toArray(richTextFeed));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
