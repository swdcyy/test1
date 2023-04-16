package com.kuaishou.live.lite.combocomment_old.item.LiveLiteComboCommentViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import msd.l;
import xp5.i;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.combocomment_old.item.LiveLiteComboCommentViewController$onCreate$viewModel$2;
import com.kuaishou.live.lite.combocomment_old.item.LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import r93.g;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.combocomment_old.item.LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import r93.a;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import r93.b;
import androidx.lifecycle.Observer;
import r93.c;
import r93.d;
import android.view.View$OnLongClickListener;
import android.widget.TextView;
import r93.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import r93.f;
import android.view.View$OnTouchListener;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ComboCommentFeed;
import q93.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import q93.d$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;

public final class LiveLiteComboCommentViewController extends ViewController	// class@0007d5
{
    public final LiveData j;
    public final l k;
    public final i l;
    public final a m;
    public final a n;

    public void LiveLiteComboCommentViewController(LiveData p0,l p1,i p2,a p3,a p4){
       a.p(p0, "message");
       a.p(p1, "updateShowDuration");
       a.p(p2, "logProvider");
       a.p(p3, "liteCommentService");
       a.p(p4, "commentEditorService");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
    }
    public void F2(){
       d$a a;
       if (PatchProxy.applyVoid(null, this, LiveLiteComboCommentViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0985);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       a uoa = new a(view, this);
       g value = new ViewModelLazy(m0.d(g.class), new LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$2(new LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$1(this)), new LiveLiteComboCommentViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, uoa, a.class, "2")) {
          a.p(value, "viewModel");
          value.d.observe(uoa.g, new b(uoa));
          value.e.observe(uoa.g, new c(uoa));
          uoa.a.setOnLongClickListener(new d(value));
          uoa.b.setOnClickListener(new e(value));
          uoa.b.setOnTouchListener(new f(uoa));
       }
       LiveStreamMessages$ComboCommentFeed value1 = this.j.getValue();
       if (value1 != null) {
          value1 = value1.content;
          if (value1 != null) {
             a = d.a;
             ClientContent$LiveStreamPackage liveStreamPa = this.l.a();
             a.o(liveStreamPa, "logProvider.liveStreamPackage");
             e0 page = this.l.getPage();
             a.o(page, "logProvider.page");
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, page, value1, a, d$a.class, "3")) {
                a.p(liveStreamPa, "liveStreamPackage");
                a.p(page, "logPage");
                a.p(value1, "content");
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AGGREGATION_COMMENT_CARD";
                i3 oi3 = i3.f();
                oi3.d("text", value1);
                uElementPack.params = oi3.e();
                u1.C0("", page, 1, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
}
