package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.a;
import java.lang.Integer;
import o07.o;

public final class BlockTabLifecycleAwareness$e implements PopupInterface$h	// class@001643
{
    public final XBlockBubbleConfig$XBlockBubble b;
    public final BlockTabLifecycleAwareness c;
    public final Ref$ObjectRef d;

    public void BlockTabLifecycleAwareness$e(XBlockBubbleConfig$XBlockBubble p0,BlockTabLifecycleAwareness p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BlockTabLifecycleAwareness$e.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       BlockTabLifecycleAwareness$e tc = this.c;
       BlockTabLifecycleAwareness$e tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, BlockTabLifecycleAwareness.class, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 17;
          uElementPack.action2 = "SHOW_GUIDE_BUBBLE";
          i3 oi3 = i3.f();
          oi3.d("bubble_text", tb.mContent);
          oi3.d("client_guide_type", "xtab_guide");
          uElementPack.params = oi3.e();
          u1.D0("", null, 7, uElementPack, null, null);
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("x_block_bubble_shown_version", this.b.mVersion);
       g.a(uEditor);
       RxBus.f.b(new a(true));
       PatchProxy.onMethodExit(BlockTabLifecycleAwareness$e.class, "1");
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(BlockTabLifecycleAwareness$e.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, BlockTabLifecycleAwareness$e.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       RxBus.f.b(new a(false));
       PatchProxy.onMethodExit(BlockTabLifecycleAwareness$e.class, "2");
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
