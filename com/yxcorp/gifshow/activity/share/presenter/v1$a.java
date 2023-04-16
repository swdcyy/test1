package com.yxcorp.gifshow.activity.share.presenter.v1$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.v1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import java.util.Objects;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.yxcorp.gifshow.activity.share.presenter.v1$b;
import com.kuaishou.edit.draft.VisibilityTimeType;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import xw8.p0;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kuaishou.perf.page.impl.d;
import lq.i;
import f66.i;
import jq.a;
import q87.c;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.MiniAppBusinessArg;
import com.kuaishou.android.post.PostPageArg;
import com.kwai.feature.post.api.feature.mix.model.MiniAppBusinessInfoModel;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.ArrayList;
import qr4.i;
import qr4.k$j;
import qr4.k$e$g;
import haa.f;
import eba.a;
import haa.a;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.VoteStickerParam;
import com.kuaishou.edit.draft.StickerResult;
import h69.j;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import android.app.Activity;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.util.HashMap;
import ow8.c;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import lnc.a1;
import e17.i;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import brd.t;
import com.yxcorp.gifshow.activity.preview.f;
import zw8.x3;
import zw8.w3;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class v1$a extends m	// class@00143b
{
    public final v1 c;

    public void v1$a(v1 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object[] objArray2;
       v1 q1;
       v1 u;
       int i;
       k$e a;
       String str3;
       v1 ov1 = v1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, v1$a.class, "1")) {
          return;
       }
       boolean b = false;
       a.s1(b);
       v1$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       String str = 2;
       if (!PatchProxy.applyVoid(objArray, tc, ov1, "4")) {
          q1 = tc.u;
          if (q1 != null) {
             b uob = q1.Q0();
             if (uob != null) {
                Publish publish = uob.v();
                if (publish != null) {
                   int i3 = v1$b.a[publish.getVisibilityTimeType().ordinal()];
                   if (i3 != 1 && (i3 == str && tc.x.d() == PhotoVisibility.PRIVATE)) {
                      tc.x.m(PhotoVisibility.PUBLIC);
                   }
                }
             }
          }
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, ov1, "5")) {
          u = tc.u;
          Workspace$Type type = (u != null)? u.a1(): Workspace$Type.UNKNOWN;
          int i2 = v1$b.b[type.ordinal()];
          if (i2 != 1) {
             if (i2 != str) {
                if (i2 != 3) {
                   if (i2 != 4) {
                      str3 = (i2 != 5)? "": "longPicture";
                   }else {
                      str3 = "singlePicture";
                   }
                }else {
                   str3 = "atlas";
                }
             }else {
                str3 = "photoMovie";
             }
          }else {
             str3 = "video";
          }
          if (!TextUtils.x(str3)) {
             d.d("postPublishMonitor").n();
             String[] stringArray1 = new String[str];
             stringArray1[b] = "share";
             stringArray1[1] = str3;
             d.d("postPublishMonitor").m(stringArray1);
             d.d("postPublishMonitor").g("clickToPublish");
          }
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, ov1, "18")) {
          if (!i.h()) {
             objArray2 = new Object[b];
             a.b().t("SharePublishPresenter", "Fill extra: post session not available", objArray2);
          }else if(tc.q == null){
             objArray2 = new Object[b];
             a.b().t("SharePublishPresenter", "Fill extra: null videoContext", objArray2);
          }else if(i.g().getMiniAppBusinessInfo().isValid()){
             MiniAppBusinessInfoModel mBusinessLin = i.g().getMiniAppBusinessInfo().get().mBusinessLinkModel;
             if (mBusinessLin != null) {
                tc.q.R1(a.a.q(mBusinessLin));
             }else {
                String str2 = "mini program included but got empty model";
                PostUtils.D("SharePublishPresenter", str2, new Exception(str2));
             }
          }
          k$e uoe = b.g(tc.q);
          i oi = (!DraftUtils.J(tc.u) && uoe != null)? 1: null;
          if (oi) {
             Object[] objArray3 = new Object[b];
             a.b().w("SharePublishPresenter", "delete VoteMagicEmoji.", objArray3);
             v1 q = tc.q;
             if (!PatchProxy.applyVoidOneRefs(q, objArray, b.class, "31") && q != null) {
                ArrayList uArrayList = new ArrayList();
                k$j u2 = q.F().c.u;
                int len1 = u2.length;
                int i1 = 0;
                while (i1 < len1) {
                   object oobject1 = u2[i1];
                   if (oobject1.A == null) {
                      uArrayList.add(oobject1);
                   }
                   i1 = i1 + 1;
                }
                k$e[] uoeArray = new k$e[b];
                q.F().c.u = uArrayList.toArray(uoeArray);
             }
          }
          i oi1 = (DraftUtils.J(tc.u) && (uoe != null && uoe.A.d == null))? 1: null;
          if (oi1) {
             Object[] objArray4 = new Object[b];
             a.b().w("SharePublishPresenter", "fill VoteMagicEmoji.", objArray4);
             q1 = tc.q;
             u = tc.u;
             if (!PatchProxy.applyVoidTwoRefs(q1, u, objArray, DraftUtils.class, "94")) {
                String str1 = "DraftUtils";
                if (u == null) {
                   objArray2 = new Object[b];
                   f.D().w(str1, "fillVoteMagicEmoji: draft = null", objArray2);
                }else if(q1 != null){
                   k$j u1 = q1.F().c.u;
                   int len = u1.length;
                   Object[] objArray5 = objArray;
                   i = 0;
                   while (i < len) {
                      object oobject = u1[i];
                      a = oobject.A;
                      if (a != null && a.d == null) {
                         objArray5 = oobject;
                      }
                      i = i + 1;
                   }
                   if (objArray5 == null) {
                      objArray2 = new Object[b];
                      f.D().w(str1, "fillVoteMagicEmoji: no voteMagicEmoji qualified", objArray2);
                   }else {
                      Iterator iterator = a.q(u).z().iterator();
                      while (iterator.hasNext()) {
                         Sticker sticker = iterator.next();
                         if (sticker.hasVoteStickerParam()) {
                            VoteStickerParam voteStickerP = sticker.getVoteStickerParam();
                            List optionsList = voteStickerP.getOptionsList();
                            objArray5.A.a = voteStickerP.getQuestion();
                            String[] stringArray = new String[b];
                            objArray5.A.b = optionsList.toArray(stringArray);
                            float[] uofloatArray = new float[str];
                            uofloatArray[b] = sticker.getResult().getCenterX();
                            uofloatArray[1] = sticker.getResult().getCenterY();
                            objArray5.A.c = uofloatArray;
                         }
                      }
                   }
                }
             }
          }
       }
       if (j.j(this.c.u)) {
          MemoryLogger.d("doPublish", this.c.r);
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.applyVoid(objArray, tc, ov1, "6") || (tc.W == null && !tc.s.isFinishing())) {
          ov1 = tc.Q;
          if (ov1 != null && (ov1.getText() != null && c.h(c.d(tc.Q.getText().toString(), tc.L)) > c.e(tc.K))) {
             i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f104023, c.e(tc.K)));
          }else {
             tc.W = true;
             ov1 = tc.u;
             if (ov1 != null && (tc.y == null && tc.v != null)) {
                if (DraftUtils.V(ov1)) {
                   tc.X7(f.a(tc.u, objArray, true, tc.r).subscribe(new x3(tc), new w3(tc)));
                }else {
                   tc.W8();
                }
                Object[] objArray1 = new Object[b];
                a.b().w("SharePublishPresenter", "share\(\): wait createEncodeRequest", objArray1);
             }else {
                tc.W8();
             }
          }
       }
       return;
    }
}
