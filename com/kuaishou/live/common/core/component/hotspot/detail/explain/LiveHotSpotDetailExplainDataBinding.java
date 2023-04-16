package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import lnc.a1;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$adapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$b;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotDetailExplainDataBinding	// class@00139d
{
    public final TextView a;
    public final ExpandEmojiTextView b;
    public final RecyclerView c;
    public e d;
    public final p e;
    public final LiveHotSpotDetailExplainDataBinding$b f;
    public final View g;
    public final LifecycleOwner h;
    public final Activity i;
    public final k j;

    public void LiveHotSpotDetailExplainDataBinding(View p0,LifecycleOwner p1,Activity p2,k p3){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "activity");
       a.p(p3, "detailMainVCDelegate");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.a = p0.findViewById(0x7f0a2013);
       ExpandEmojiTextView uExpandEmoji = p0.findViewById(R.id.live_hot_spot_detail_explain_content_text);
       uExpandEmoji.setSpanTextBold(false);
       uExpandEmoji.setExpandTip(a1.p(R.string.arg_RES_7f1004d1));
       uExpandEmoji.setSpanPrefix(" ");
       this.b = uExpandEmoji;
       this.c = p0.findViewById(0x7f0a2011);
       this.e = s.c(new LiveHotSpotDetailExplainDataBinding$adapter$2(this));
       this.f = new LiveHotSpotDetailExplainDataBinding$b(this);
    }
    public final LiveHotSpotDetailExplainLinkAdapter a(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailExplainDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
