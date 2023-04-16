package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.home.block.bubble.XBlockBubbleConfig$XBlockBubble;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wq6.h;
import zr6.e;
import wq6.f;
import kotlin.jvm.internal.a;
import wq6.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import com.kwai.kcube.TabIdentifier;
import xr6.c;
import xr6.c$a;
import xr6.c$b;

public final class BlockTabLifecycleAwareness$d implements View$OnClickListener	// class@001642
{
    public final XBlockBubbleConfig$XBlockBubble b;
    public final BlockTabLifecycleAwareness c;
    public final Ref$ObjectRef d;

    public void BlockTabLifecycleAwareness$d(XBlockBubbleConfig$XBlockBubble p0,BlockTabLifecycleAwareness p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BlockTabLifecycleAwareness$d.class, "1")) {
          return;
       }
       Ref$ObjectRef element = this.d.element;
       if (element != null && element.K()) {
          element.o();
          BlockTabLifecycleAwareness$d tc = this.c;
          BlockTabLifecycleAwareness$d tb = this.b;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(tb, tc, BlockTabLifecycleAwareness.class, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 17;
             uElementPack.action2 = "SHOW_GUIDE_BUBBLE";
             i3 oi3 = i3.f();
             oi3.d("bubble_text", tb.mContent);
             oi3.d("client_guide_type", "xtab_guide");
             uElementPack.params = oi3.e();
             u1.M("", null, 1, uElementPack, null, null);
          }
          if (!TextUtils.x(this.b.mSubTabId)) {
             f uof = this.c.d();
             if (uof != null) {
                XBlockBubbleConfig$XBlockBubble mSubTabId = this.b.mSubTabId;
                a.o(mSubTabId, "bubbleConfig.mSubTabId");
                h oh = uof.I(mSubTabId);
                if (oh != null) {
                   Fragment uFragment = this.c.e();
                   if (uFragment != null) {
                      FragmentActivity activity = uFragment.getActivity();
                      if (activity != null) {
                         a.o(activity, "tabFragment?.activity ?: return@let");
                         d uod = c.a(activity);
                         a.o(uod, "IKCubeHomeTabDataStore.get\(activity\)");
                         uod.d().n(oh.M2(), c.e.c("xTabBubble").a());
                      }
                   }
                }
             }
          }
       }
    label_00b2 :
       PatchProxy.onMethodExit(BlockTabLifecycleAwareness$d.class, "1");
       return;
    }
}
