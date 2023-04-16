package com.yxcorp.gifshow.tuna_post.business2.ShareBusinessLinkFragmentWrapper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.a;
import com.yxcorp.gifshow.tuna_post.business2.ShareBusinessLinkFragmentWrapper$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nmc.c;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import brd.t;
import tmc.c;
import erd.g;
import t45.d;
import brd.z;
import tmc.d;
import com.yxcorp.gifshow.tuna_post.business2.a;
import crd.b;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import tmc.f;
import msd.a;
import c15.b;
import java.lang.Boolean;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.tuna_post.business2.b;
import com.yxcorp.gifshow.tuna_post.business2.d;
import com.yxcorp.gifshow.tuna_post.business2.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import ekd.m1;
import android.view.View$OnClickListener;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lnc.b9;

public class ShareBusinessLinkFragmentWrapper extends BaseFragment	// class@001e2d
{
    public DialogFragment j;
    public KwaiLoadingView k;
    public KwaiEmptyStateView l;
    public a m;
    public View$OnClickListener n;
    public ViewGroup o;
    public ShareBusinessLinkInfo$DialogInfo p;
    public UpdateShareBusinessLinkModel q;
    public ShareBusinessLinkPhotoParam r;
    public static final int s;

    public void ShareBusinessLinkFragmentWrapper(){
       super();
       this.m = new a();
       this.n = new ShareBusinessLinkFragmentWrapper$a(this);
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, ShareBusinessLinkFragmentWrapper.class, "6")) {
          return;
       }
       boolean b = true;
       boolean b1 = false;
       KsLogTunaPlcTag ksLogTunaPlc = (this.j != null && this.p != null)? 1: null;
       if (ksLogTunaPlc) {
          this.eh(b);
          this.dh(b1);
          d.a(0x14466a24).gK(this.j, this.p, this.q, this.r).doOnSubscribe(new c(this)).observeOn(d.a).subscribe(new d(this), new a(this));
       }else {
          this.eh(b1);
          this.dh(b);
          b.d(KsLogTunaPlcTag.PLC_POST.appendTag("onViewCreated"), new f(this));
       }
       return;
    }
    public final void dh(boolean p0){
       if (PatchProxy.isSupport(ShareBusinessLinkFragmentWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShareBusinessLinkFragmentWrapper.class, "7")) {
          return;
       }
       ShareBusinessLinkFragmentWrapper tl = this.l;
       if (tl != null) {
          if (p0) {
             tl.d(1);
             n.Y(this.l, 0, 0);
          }else {
             tl.d(1);
             n.Y(this.l, 8, 0);
          }
       }
       return;
    }
    public final void eh(boolean p0){
       if (PatchProxy.isSupport(ShareBusinessLinkFragmentWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShareBusinessLinkFragmentWrapper.class, "8")) {
          return;
       }
       ShareBusinessLinkFragmentWrapper tk = this.k;
       if (tk != null) {
          if (p0) {
             tk.h();
             n.Y(this.k, 0, 0);
          }else {
             tk.i();
             n.Y(this.k, 8, 0);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareBusinessLinkFragmentWrapper.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          Serializable serializable = SerializableHook.getSerializable(p0, "dlg_info");
          if (serializable instanceof ShareBusinessLinkInfo$DialogInfo) {
             this.p = serializable;
          }else {
             b.d(KsLogTunaPlcTag.PLC_POST.appendTag("onCreate"), b.b);
          }
          serializable = SerializableHook.getSerializable(p0, "select_item");
          if (serializable instanceof UpdateShareBusinessLinkModel) {
             this.q = serializable;
          }else {
             b.f(KsLogTunaPlcTag.PLC_POST.appendTag("onCreate"), d.b);
          }
          Serializable serializable1 = SerializableHook.getSerializable(p0, "photo_param");
          if (serializable1 instanceof ShareBusinessLinkPhotoParam) {
             this.r = serializable1;
          }else {
             b.f(KsLogTunaPlcTag.PLC_POST.appendTag("onCreate"), c.b);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareBusinessLinkFragmentWrapper.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0510, p1, false);
       this.k = m1.f(view, 0x7f0a312a);
       KwaiEmptyStateView kwaiEmptySta = m1.f(view, R.id.plc_post_error_view);
       this.l = kwaiEmptySta;
       if (kwaiEmptySta != null) {
          kwaiEmptySta.p(this.n);
       }
       this.o = m1.f(view, 0x7f0a3128);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ShareBusinessLinkFragmentWrapper.class, "9")) {
          return;
       }
       super.onDestroy();
       b9.a(this.m);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareBusinessLinkFragmentWrapper.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.ch();
       return;
    }
}
