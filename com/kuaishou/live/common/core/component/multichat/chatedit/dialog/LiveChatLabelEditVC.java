package com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$a;
import nsd.u;
import java.lang.String;
import yp1.b;
import tp1.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$viewModel$2;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import tp1.l;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$mTextWatcher$2;
import qrd.p;
import qrd.s;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.TextView;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import tp1.g;
import android.view.View$OnClickListener;
import tp1.h;
import tp1.i;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$mTextWatcher$2$a;
import android.text.TextWatcher;
import android.widget.EditText;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.lifecycle.LiveData;
import tp1.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rp1.b;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import yp1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class LiveChatLabelEditVC extends ViewController	// class@0014d2
{
    public TextView j;
    public TextView k;
    public AppCompatEditText l;
    public TextView m;
    public AppCompatImageView n;
    public final p o;
    public final p p;
    public final String q;
    public final String r;
    public final String s;
    public final int t;
    public final b u;
    public final d v;
    public static final LiveChatLabelEditVC$a w;

    static {
       LiveChatLabelEditVC.w = new LiveChatLabelEditVC$a(null);
    }
    public void LiveChatLabelEditVC(String p0,String p1,String p2,int p3,b p4,d p5){
       a.p(p0, "userId");
       a.p(p4, "renderModel");
       a.p(p5, "chatLabelEditListener");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       this.o = new ViewModelLazy(m0.d(l.class), new LiveChatLabelEditVC$$special$$inlined$viewModels$2(new LiveChatLabelEditVC$$special$$inlined$viewModels$1(this)), new LiveChatLabelEditVC$viewModel$2(this));
       this.p = s.c(new LiveChatLabelEditVC$mTextWatcher$2(this));
    }
    public static final AppCompatImageView V2(LiveChatLabelEditVC p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("chatLabelClear");
       }
       return p0;
    }
    public static final TextView W2(LiveChatLabelEditVC p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("chatLabelCount");
       }
       return p0;
    }
    public void F2(){
       LiveChatLabelEditVC liveChatLabe = LiveChatLabelEditVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveChatLabe, "5")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0aae);
       this.j = this.A2(0x7f0a1b11);
       this.k = this.A2(0x7f0a1b0d);
       this.l = this.A2(0x7f0a1b10);
       this.m = this.A2(0x7f0a1b0f);
       this.n = this.A2(0x7f0a1b0e);
       if (!PatchProxy.applyVoid(objArray, this, liveChatLabe, "7")) {
          LiveChatLabelEditVC tj = this.j;
          if (tj == null) {
             a.S("chatLabelReset");
          }
          tj.setOnClickListener(new g(this));
          tj = this.k;
          if (tj == null) {
             a.S("chatLabelCommit");
          }
          tj.setOnClickListener(new h(this));
          tj = this.n;
          if (tj == null) {
             a.S("chatLabelClear");
          }
          tj.setOnClickListener(new i(this));
          if (!PatchProxy.applyVoid(objArray, this, liveChatLabe, "9")) {
             tj = this.l;
             String str = "chatLabelEditText";
             if (tj == null) {
                a.S(str);
             }
             LiveChatLabelEditVC$mTextWatcher$2$a omTextWatche = PatchProxy.apply(objArray, this, liveChatLabe, "4");
             if (omTextWatche == PatchProxyResult.class) {
                omTextWatche = this.p.getValue();
             }
             tj.addTextChangedListener(omTextWatche);
             LiveChatLabelEditVC tl = this.l;
             if (tl == null) {
                a.S(str);
             }
             tl.requestFocus();
             Context uContext = this.D2();
             tj = this.l;
             if (tj == null) {
                a.S(str);
             }
             n.a0(uContext, tj, 100);
          }
       }
       l ol = this.Y2();
       if (!PatchProxy.applyVoidOneRefs(ol, this, liveChatLabe, "8")) {
          ol.u0().observe(this, new f(this));
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveChatLabelEditVC.class, "6")) {
          return;
       }
       LiveChatLabelEditVC tq = this.q;
       LiveChatLabelEditVC tt = this.t;
       ClientContent$LiveStreamPackage liveStreamPa = this.u.f();
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(tq, Integer.valueOf(tt), liveStreamPa, null, b.class, "1")) {
          a.p(tq, "userId");
          a.p(liveStreamPa, "liveStreamPackage");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "WHEAT_POSITION_EDIT_CARD";
          i3 oi3 = i3.f();
          oi3.c("source", Integer.valueOf(tt));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = a.b(liveStreamPa);
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          uContentPack.userPackage = userPackage;
          userPackage.identity = tq;
          u1.B0(new ShowMetaData().setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
    public final AppCompatEditText X2(){
       LiveChatLabelEditVC obj = PatchProxy.apply(null, this, LiveChatLabelEditVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          a.S("chatLabelEditText");
       }
       return obj;
    }
    public final l Y2(){
       Object obj = PatchProxy.apply(null, this, LiveChatLabelEditVC.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
}
