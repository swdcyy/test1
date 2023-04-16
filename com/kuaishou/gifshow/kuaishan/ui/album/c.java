package com.kuaishou.gifshow.kuaishan.ui.album.c;
import androidx.lifecycle.Observer;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.System;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import t90.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import n90.g;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.google.common.base.Optional;
import com.kuaishou.gifshow.kuaishan.ui.album.d;
import ok.h;
import k36.c;
import h36.i;
import k36.f;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import lnc.i3;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import tkd.b;
import tkd.d;
import u80.k;
import n90.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u80.d;
import n3d.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import x80.g;
import com.kuaishou.gifshow.kuaishan.utils.e;

public final class c implements Observer	// class@001ab3
{
    public final KSPostAlbumProcessActivity b;

    public void c(KSPostAlbumProcessActivity p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.intValue() < 0) {
       }else {
          boolean b = true;
          KSPostAlbumProcessActivity kSPostAlbumP = ((System.currentTimeMillis() - tb.Q) - 200 < 0)? 1: null;
          if (tb.R == null && !kSPostAlbumP) {
             k1.m(tb.U);
             tb.E3();
          }
          boolean b1 = g7.b(tb.B3());
          KSPostAlbumProcessActivity r = tb.R;
          if (r != null && r.isAdded()) {
             if (b1 && p0.intValue() > 50) {
                tb.R.Ih(R.string.arg_RES_7f100b82);
             }
             if (p0.intValue() > tb.R.uh()) {
                tb.R.Nh(p0.intValue());
             }
          }
       label_006a :
          if (p0.intValue() == 100) {
             p0 = i.class;
             KSPostAlbumProcessActivity obj = null;
             if (!PatchProxy.isSupport(p0) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), obj, p0, "3") && !i.d)) {
                if (i.b >= 0 && (i.c < 0 || TextUtils.isEmpty(i.a))) {
                   Object[] objArray = new Object[false];
                   e.D().t("KSLoadingLogger", "loading cost invalid: downloadCost="+i.b+", "+"clipCost="+i.c+", templateId="+i.a, objArray);
                }else {
                   i.e.b(b1, "");
                   i.d = b;
                }
             }
             tb.S = m1.w0().v0();
             tb.z3();
             p0 = g.class;
             String str = "4";
             if (!PatchProxy.applyVoid(obj, tb, KSPostAlbumProcessActivity.class, str)) {
                kSPostAlbumP = tb.V;
                obj = tb.W;
                Objects.requireNonNull(kSPostAlbumP);
                String str1 = "observer";
                if (!PatchProxy.applyVoidOneRefs(obj, kSPostAlbumP, p0, "2")) {
                   a.p(obj, str1);
                   kSPostAlbumP.a.removeObserver(obj);
                }
                kSPostAlbumP = tb.V;
                obj = tb.X;
                Objects.requireNonNull(kSPostAlbumP);
                if (!PatchProxy.applyVoidOneRefs(obj, kSPostAlbumP, p0, str)) {
                   a.p(obj, str1);
                   kSPostAlbumP.b.removeObserver(obj);
                }
             }
             p0 = Optional.fromNullable(tb.S).transform(d.b).orNull();
             if (p0 != null) {
                c.d().g(new i(p0.mGroupId, p0.mTemplateId, p0.mName));
                i3 oi3 = i3.f();
                oi3.d("materialId", p0.mTemplateId);
                oi3.c("materialType", Integer.valueOf(7));
                EveManagerWrapper.e.n(CustomEvent.newBuilder().setCustomKey("clearPostHomeReco").setCustomValue(oi3.e()).build());
             }
             boolean b2 = j0.a(tb.getIntent(), "key_is_update", false);
             kSPostAlbumP = (b2 && j0.a(tb.getIntent(), "key_need_segment_clip", false))? 1: null;
             if (kSPostAlbumP) {
                d.a(-264022253).OV(tb, tb.S, new c(tb));
             }else if(PostExperimentUtils.a0() && !b2){
                b = 0;
             }
             if (b) {
                e.y(tb, tb.S, m1.w0().f, tb.T);
             }else {
                tb.setResult(-1);
                tb.finish();
             }
          }
       }
       return;
    }
}
