package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f$a;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import dsa.e;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yta.w2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import nsd.r0;
import java.util.Locale;
import lnc.a1;
import java.util.Arrays;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import b26.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import yta.k2;
import com.yxcorp.gifshow.entity.QPhoto;
import erd.o;
import yta.l2;
import yta.m2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import android.content.ContentResolver;
import android.net.Uri;
import ib.c;
import yta.x2;
import yta.y2;
import com.yxcorp.gifshow.model.CDNUrl;
import yta.z2;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.utility.TextUtils;
import yta.a3;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.android.model.mix.CoverMeta;
import yta.c3;
import yta.d3;
import yta.e3;
import erd.a;
import yta.t2;
import yta.v2;
import crd.b;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class PhotoSharePresenter$f$a implements g	// class@0017a0
{
    public final PhotoSharePresenter$f b;

    public void PhotoSharePresenter$f$a(PhotoSharePresenter$f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PhotoSharePresenter q1;
       ArrayList uArrayList;
       ImageMeta$Atlas mList;
       int len;
       object oobject;
       Activity activity1;
       ContentResolver contentResol;
       Uri uri;
       Object[] objArray3;
       Activity activity2;
       object oobject1;
       Uri uri1;
       String str2;
       String str3;
       PhotoSharePresenter p;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoSharePresenter$f$a.class, "1")) {
       }else {
          a.p(p0, "p");
          if (p0.b != null) {
             p0 = this.b.a;
             Objects.requireNonNull(p0);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             PhotoSharePresenter photoSharePr = PhotoSharePresenter.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, photoSharePr, "47")) {
                String str = "PhotoSharePresenter";
                int i = 0;
                if (p0.R != null) {
                   Object[] objArray1 = new Object[i];
                   e.C().w(str, "mSaveAlbumDisposable is running", objArray1);
                }else {
                   Object[] objArray2 = new Object[i];
                   e.C().w(str, "save album", objArray2);
                   GifshowActivity activity = (p0.getActivity() instanceof GifshowActivity)? p0.getActivity(): objArray;
                   w2 ow2 = new w2(p0);
                   objArray2 = PatchProxy.applyTwoRefs(activity, ow2, p0, photoSharePr, "50");
                   if (objArray2 != patchProxyRe) {
                   }else if(activity == null){
                      objArray2 = objArray;
                   }else {
                      ProgressFragment progressFrag = new ProgressFragment();
                      progressFrag.Eh(i, 100);
                      progressFrag.setCancelable(i);
                      Object[] objArray4 = new Object[]{a1.p(0x7f100f18)};
                      str3 = String.format(Locale.US, "%s ", Arrays.copyOf(objArray4, 1));
                      a.o(str3, "java.lang.String.format\(locale, format, *args\)");
                      progressFrag.Jh(str3);
                      progressFrag.wh(a1.p(R.string.cancel));
                      progressFrag.xh(ow2);
                      progressFrag.show(activity.getSupportFragmentManager(), "process");
                   }
                   p0.Q = objArray2;
                   PhotoSharePresenter q = p0.q;
                   str = "mPhoto";
                   if (q == null) {
                      a.S(str);
                   }
                   t ot = PatchProxy.applyOneRefs(q, p0, photoSharePr, "48");
                   if (ot != patchProxyRe) {
                   }else {
                      ot = y6.s(d.class, LoadPolicy.SILENT_IMMEDIATE).w(new k2(q)).doOnNext(new l2(p0)).map(m2.b);
                      a.o(ot, "PostPluginManager.load\(E¡­otoStatus.ADD_WATERMARK }");
                   }
                   AtomicInteger uAtomicInteg = new AtomicInteger();
                   q = p0.q;
                   if (q == null) {
                      a.S(str);
                   }
                   if (q.isAtlasPhotos()) {
                      q1 = p0.q;
                      if (q1 == null) {
                         a.S(str);
                      }
                      uArrayList = new ArrayList(q1.getAtlasInfo().mList.length);
                      q1 = p0.q;
                      if (q1 == null) {
                         a.S(str);
                      }
                      mList = q1.getAtlasInfo().mList;
                      len = mList.length;
                      for (; i < len; i = i + 1) {
                         oobject = mList[i];
                         activity1 = p0.getActivity();
                         contentResol = (activity1 != null)? activity1.getContentResolver(): objArray;
                         a.m(contentResol);
                         uri = c.l(oobject);
                         a.m(uri);
                         uArrayList.add(c.b(contentResol, uri));
                      }
                      ot = ot.flatMap(new x2(p0, uAtomicInteg, uArrayList));
                      a.o(ot, "watermarkStatusObservabl¡­d, needWatermark\)\n      }");
                   }else {
                      q = p0.q;
                      if (q == null) {
                         a.S(str);
                      }
                      if (q.isLongPhotos()) {
                         q1 = p0.q;
                         if (q1 == null) {
                            a.S(str);
                         }
                         uArrayList = new ArrayList(q1.getAtlasInfo().mList.length);
                         q1 = p0.q;
                         if (q1 == null) {
                            a.S(str);
                         }
                         mList = q1.getAtlasInfo().mList;
                         len = mList.length;
                         for (; i < len; i = i + 1) {
                            oobject = mList[i];
                            activity1 = p0.getActivity();
                            contentResol = (activity1 != null)? activity1.getContentResolver(): objArray;
                            a.m(contentResol);
                            uri = c.l(oobject);
                            a.m(uri);
                            uArrayList.add(c.b(contentResol, uri));
                         }
                         ot = ot.flatMap(new y2(p0, uAtomicInteg, uArrayList));
                      }else {
                         q = p0.q;
                         if (q == null) {
                            a.S(str);
                         }
                         String str1 = "mPhoto.coverUrls[0]";
                         if (q.isSinglePhoto()) {
                            activity2 = p0.getActivity();
                            if (activity2 != null) {
                               objArray = activity2.getContentResolver();
                            }
                            a.m(objArray);
                            q = p0.q;
                            if (q == null) {
                               a.S(str);
                            }
                            oobject1 = q.getCoverUrls()[i];
                            a.o(oobject1, str1);
                            uri1 = c.l(oobject1.getUrl());
                            a.m(uri1);
                            str2 = c.b(objArray, uri1);
                            ot = ot.flatMap(new z2(p0, uAtomicInteg, str2));
                         }else {
                            q = p0.q;
                            if (q == null) {
                               a.S(str);
                            }
                            str3 = "mPhotoMeta";
                            if (q.isKtvSong()) {
                               q = p0.p;
                               if (q == null) {
                                  a.S(str3);
                               }
                               if (TextUtils.x(q.mLocalVideoUrl)) {
                                  activity2 = p0.getActivity();
                                  if (activity2 != null) {
                                     objArray = activity2.getContentResolver();
                                  }
                                  a.m(objArray);
                                  q = p0.q;
                                  if (q == null) {
                                     a.S(str);
                                  }
                                  oobject1 = q.getCoverUrls()[i];
                                  a.o(oobject1, str1);
                                  uri1 = c.l(oobject1.getUrl());
                                  a.m(uri1);
                                  str2 = c.b(objArray, uri1);
                                  ot = ot.flatMap(new a3(p0, uAtomicInteg, str2));
                               }
                            }
                            Ref$ObjectRef objectRef = new Ref$ObjectRef();
                            objectRef.element = objArray;
                            Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
                            objectRef1.element = objArray;
                            Activity activity3 = p0.getActivity();
                            if (activity3 != null) {
                               a.o(activity3, "act");
                               ContentResolver contentResol1 = activity3.getContentResolver();
                               p = p0.p;
                               if (p == null) {
                                  a.S(str3);
                               }
                               uri = c.l(p.mLocalVideoUrl);
                               a.m(uri);
                               objectRef.element = c.b(contentResol1, uri);
                               q1 = p0.r;
                               if (q1 == null) {
                                  a.S("mCoverMeta");
                               }
                               CoverMeta mCoverUrl = q1.mCoverUrl;
                               if (mCoverUrl != null) {
                                  Uri uri2 = c.l(mCoverUrl);
                                  if (uri2 != null) {
                                     str2 = c.b(activity3.getContentResolver(), uri2);
                                  }
                               }
                               objectRef1.element = str2;
                            }
                            ot = ot.flatMap(new c3(p0, uAtomicInteg, objectRef, objectRef1));
                         }
                      }
                      a.o(ot, "if \(mPhoto.isLongPhotos\)¡­\)\n        }\n      }\n    }");
                   }
                   ot.doOnSubscribe(new d3(p0)).doOnDispose(e3.b).subscribe(new t2(p0, uAtomicInteg), new v2(p0, uAtomicInteg));
                }
             }
          }else {
             PermissionUtils.o(this.b.a.getActivity(), a1.p(R.string.arg_RES_7f104ab5));
          }
          PatchProxy.onMethodExit(PhotoSharePresenter$f$a.class, "1");
       }
       return;
    }
}
