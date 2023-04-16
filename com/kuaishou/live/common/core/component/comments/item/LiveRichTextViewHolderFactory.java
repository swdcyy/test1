package com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory;
import k81.k;
import o81.g;
import h81.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.comments.richtext.LiveRichTextParser;
import hf1.j;
import hf1.k;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$backgroundParser$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.ViewGroup;
import g81.a;
import k81.h;
import com.kuaishou.live.comments.widget.LiveDraweeItemView;
import android.content.Context;
import r81.c;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$a;

public final class LiveRichTextViewHolderFactory implements k	// class@001098
{
    public final LiveRichTextParser a;
    public final p b;
    public final g c;
    public final e d;

    public void LiveRichTextViewHolderFactory(g p0,e p1){
       a.p(p0, "param");
       super();
       this.c = p0;
       this.d = p1;
       LiveRichTextParser liveRichText = PatchProxy.apply(null, this, LiveRichTextViewHolderFactory.class, "3");
       if (liveRichText != PatchProxyResult.class) {
       }else {
          liveRichText = new LiveRichTextParser();
          liveRichText.i = j.a;
          liveRichText.j = new k(this);
          liveRichText.d(p1);
       }
       this.a = liveRichText;
       this.b = s.c(LiveRichTextViewHolderFactory$backgroundParser$2.INSTANCE);
       return;
    }
    public h a(ViewGroup p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveRichTextViewHolderFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       a.p(p1, "config");
       LiveDraweeItemView liveDraweeIt = new LiveDraweeItemView(p0.getContext());
       liveDraweeIt.setViewStyle(this.c.d());
       return new LiveRichTextViewHolderFactory$a(this, liveDraweeIt);
    }
}
