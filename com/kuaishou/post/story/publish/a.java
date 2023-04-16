package com.kuaishou.post.story.publish.a;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.publish.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rp4.a;
import q87.c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import qr4.i;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.m$k0;
import wkd.b;
import dnc.k1;
import lq.i;
import qr4.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import fq4.a;
import com.kuaishou.android.model.music.Music;
import gq4.a;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Float;
import brd.a0;
import android.util.Pair;
import java.lang.Boolean;
import java.io.File;
import kqb.b0;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import lnc.e0;
import qkd.b;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.System;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import lnc.w6;
import com.yxcorp.gifshow.encode.q0;
import io.reactivex.i;
import t45.d;
import brd.z;
import com.kuaishou.post.story.publish.d;
import erd.o;
import oq4.a;
import erd.g;
import com.kuaishou.post.story.publish.f;
import com.kuaishou.post.story.publish.c;
import java.util.List;
import oq4.b;
import crd.b;
import rp4.b;

public final class a implements View$OnClickListener	// class@000b7f
{
    public final g b;

    public void a(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a a;
       a uoa;
       a0 uoa0;
       File uFile2;
       a b = this.b;
       Objects.requireNonNull(b);
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, og, "4")) {
       }else {
          int i = 0;
          String str = "StoryEditMoodPublishPresenter";
          if (b.getActivity() == null) {
             objArray = new Object[i];
             a.D().A(str, "get activity is null", objArray);
          }else if(b.B != null){
             boolean b1 = true;
             b.B = b1;
             b.q.R();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoid(objArray, b, og, "5")) {
                Object[] objArray1 = new Object[i];
                a.D().w(str, "Publish."+b.w.F().b.E0, objArray1);
                b.a(0x6223c5ca).g(b.w.Q());
                g u = b.u;
                g w = b.w;
                String str1 = i.m().z("USER_TRACE_INFO_KEY");
                Objects.requireNonNull(w);
                if (PatchProxy.applyOneRefs(str1, w, VideoContext.class, "235") != patchProxyRe) {
                }else {
                   VideoContext.b();
                   w.a.a.n = (str1 == null)? "": str1;
                }
                ArrayList uArrayList = new ArrayList();
                AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                uAttrAnimPro.vh(b1);
                uAttrAnimPro.uh(R.dimen.arg_RES_7f070340, 0x7f070340);
                uAttrAnimPro.setCancelable(i);
                uAttrAnimPro.show(b.getActivity().getSupportFragmentManager(), "Clip");
                Music music = b.A.e.a();
                a e = b.A.e;
                a = e.a;
                a b2 = e.b;
                if (PatchProxy.isSupport(s0.class)) {
                   uoa = b2;
                   uoa0 = PatchProxy.applyThreeRefs(music, a, Float.valueOf(b2), null, s0.class, "9");
                   if (uoa0 != patchProxyRe) {
                   }else if(music == null){
                      uoa0 = a0.B(new Pair(Boolean.FALSE, objArray));
                   }else {
                      File uFile = b0.h(music);
                      if (uFile == null && URLUtil.isFileUrl(music.mUrl)) {
                         String path = Uri.parse(music.mUrl).getPath();
                         if (e0.e(path)) {
                            uFile = new File(path);
                         }
                      }
                      if (!b.S(uFile)) {
                         if (music.mType == MusicType.LOCAL) {
                            uFile = new File(music.mPath);
                            File uFile1 = PostUtils.g("[>|59|>]");
                            String str2 = "EncodingUtils"+System.currentTimeMillis();
                            try{
                               uFile2 = new File(uFile1, str2);
                               PostUtils.c(uFile, uFile2);
                            }catch(java.io.IOException e0){
                               i1.c(e0);
                            }
                            uFile = uFile2;
                         }
                         if (!b.S(uFile)) {
                            uoa0 = a0.B(new Pair(Boolean.FALSE, objArray));
                         }
                      }
                      File uFile3 = uFile;
                      Music mClipStartMi = (a == null)? music.mClipStartMills: a.mClipStartMills;
                      if (mClipStartMi <= 0) {
                         mClipStartMi = w6.f(music);
                      }
                      if (!mClipStartMi) {
                         uoa0 = a0.B(new Pair(Boolean.TRUE, uFile3));
                      }else {
                         q0 oq0 = new q0(uFile3, a, ((double)mClipStartMi / 0x408f400000000000), uoa);
                         uoa0 = a0.k(uFile);
                      }
                   }
                }else {
                   uoa = b2;
                   goto label_0105 ;
                }
                c uoc = new c(b, uArrayList, w, u, uAttrAnimPro);
                uoa0.G(d.c).u(new d(b)).r(new a(b)).C(f.b).G(d.a).R(v12, new b(b, uAttrAnimPro));
             }
             b.g("MOOD_EDIT_POST", "EDIT_MOOD_PHOTO", "");
          }
       }
       return;
    }
}
