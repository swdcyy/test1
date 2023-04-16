package com.kuaishou.live.lite.combocomment_old.LiveLiteComboCommentAreaViewController$handleComboCommentFeeds$itemViewController$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import q93.a;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.HashMap;
import com.kuaishou.live.viewcontroller.ViewController;
import kotlin.jvm.internal.a;
import ekd.k1;
import q93.b;
import java.lang.Runnable;

public final class LiveLiteComboCommentAreaViewController$handleComboCommentFeeds$itemViewController$1 extends Lambda implements l	// class@0007cf
{
    public final a this$0;

    public void LiveLiteComboCommentAreaViewController$handleComboCommentFeeds$itemViewController$1(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteComboCommentAreaViewController$handleComboCommentFeeds$itemViewController$1.class, "1")) {
          return;
       }
       LiveLiteComboCommentAreaViewController$handleComboCommentFeeds$itemViewController$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, a.class, "5") && p0 != null) {
          ViewController viewControll = tthis$0.m.get(p0);
          if (viewControll != null) {
             a.o(viewControll, "vcMap[key] ?: return");
             k1.n(viewControll);
             k1.s(new b(tthis$0, p0, viewControll), viewControll, tthis$0.k);
          }
       }
       return;
    }
}
