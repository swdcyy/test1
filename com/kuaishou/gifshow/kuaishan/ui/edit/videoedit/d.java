package com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.d;
import qw7.e;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import java.util.Arrays;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import g79.a;
import w69.x;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.c;
import t36.f$a;
import t36.f;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import lnc.a1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w46.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import p90.d;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import p90.c;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import brd.t;
import com.yxcorp.gifshow.encode.i;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.e;
import p90.f;
import erd.g;
import crd.b;

public final class d implements e	// class@001ac2
{
    public final KuaishanVideoClipFragment a;

    public void d(KuaishanVideoClipFragment p0){
       this.a = p0;
    }
    public final void a(QMedia p0,float[] p1){
       boolean b;
       Intent intent;
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p1, p0, ta, KuaishanVideoClipFragment.class, "6")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          e.D().s("KuaishanVideoClipFragment", "startProcessing\(\) called with: position = ["+Arrays.toString(p1)+"]", objArray);
          Object[] objArray1 = null;
          p0 = PatchProxy.apply(objArray1, ta, KuaishanVideoClipFragment.class, "4");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(ta.getActivity() != null){
             intent = ta.getActivity().getIntent();
          }else {
             intent = objArray1;
          }
          if (intent != null && intent.getBooleanExtra("kuaishan_clip_for_swap_magic", i)) {
             b = true;
          }else {
             b = false;
          }
          if (b && !PatchProxy.applyVoid(objArray1, ta, KuaishanVideoClipFragment.class, "5")) {
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CUT_VIDEO_FINISH_BTN";
             uClickEvent.elementPackage = uElementPack;
             a.c.f().e(uClickEvent);
          }
          KuaishanVideoClipFragment o = ta.o;
          o.mExportPositionX = p1[i];
          o.mExportPositionY = p1[1];
          ta.k.s0(c.a);
          if (ta.t != null) {
             ta.fh(ta.o, 1);
          }else {
             b = ta.n.needServerSupport();
             int i1 = (b)? 0x7f101bde: 0x7f101871;
             String str = a1.p(i1);
             if (!PatchProxy.applyVoidOneRefs(str, ta, KuaishanVideoClipFragment.class, "7")) {
                GifshowActivity activity = ta.getActivity();
                if (activity == null) {
                   objArray1 = new Object[i];
                   e.D().t("KuaishanVideoClipFragment", "showProgressFragment: activity is null", objArray1);
                }else {
                   ProgressFragment progressFrag = new ProgressFragment();
                   ta.m = progressFrag;
                   progressFrag.Fh(i, 100, 1);
                   ta.m.setCancelable(i);
                   ta.m.xh(new d(ta));
                   ta.m.zh(i);
                   ta.m.Jh(str);
                   ta.m.vh(R.string.cancel);
                   ta.m.k0(new c(ta));
                   ta.m.show(activity.getSupportFragmentManager(), "KuaishanVideoClipFragment");
                }
             }
             QMedia[] qMediaArray = new QMedia[]{ta.o};
             Lists.e(qMediaArray);
             objArray1 = new Object[i];
             e.D().s("KuaishanVideoClipFragment", "startProcessing: needServerProcess="+b, objArray1);
             QMedia[] qMediaArray1 = new QMedia[]{ta.o};
             ta.l = i.f(Lists.e(qMediaArray1), ta.n, 1, ta.r, ta.s).observeOn(d.a).subscribe(new e(ta), new f(ta));
          }
       }
       return;
    }
}
