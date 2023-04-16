package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.e;
import qw7.e;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import faa.a;
import w46.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import grc.o;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import grc.h;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import w69.x0;
import com.kwai.sdk.switchconfig.a;
import brd.t;
import java.lang.StringBuilder;
import q87.c;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import grc.m;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.a;
import grc.i;
import grc.n;
import grc.j;
import java.lang.Math;
import lnc.g7;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.c;
import brd.w;
import grc.s;
import erd.g;
import grc.r;
import grc.q;
import erd.a;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.f;
import grc.t;
import crd.b;

public final class e implements e	// class@001020
{
    public final KuaishanSegmentVideoEditFragment a;

    public void e(KuaishanSegmentVideoEditFragment p0){
       this.a = p0;
    }
    public final void a(QMedia p0,float[] p1){
       t ot;
       Object[] objArray;
       z c;
       Object obj = p0;
       Object obj1 = p1;
       e a = this.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, a, KuaishanSegmentVideoEditFragment.class, "9")) {
       }else if(obj == null || a.n == null){
          a.fh(null, null, null);
       }else {
          String str = a1.p(R.string.arg_RES_7f101871);
          boolean b = true;
          if (!PatchProxy.applyVoidOneRefs(str, a, KuaishanSegmentVideoEditFragment.class, "6")) {
             GifshowActivity activity = a.getActivity();
             if (activity == null) {
                Object[] objArray1 = new Object[false];
                a.D().t("KuaishanSegmentVideoEditFragment", "showProgressFragment: activity is null", objArray1);
             }else {
                ProgressFragment progressFrag = new ProgressFragment();
                a.m = progressFrag;
                progressFrag.Fh(false, 100, b);
                a.m.setCancelable(false);
                a.m.xh(new o(a));
                a.m.zh(false);
                a.m.Jh(str);
                a.m.vh(R.string.cancel);
                a.m.k0(new h(a));
                a.m.show(activity.getSupportFragmentManager(), "KuaishanSegmentVideoEditFragment");
             }
          }
          QMedia qMedia = x0.a(p0);
          if (a.r == null || a.t().d("template_import_switch", false)) {
             ot = PatchProxy.applyTwoRefs(qMedia, obj1, a, KuaishanSegmentVideoEditFragment.class, "11");
             if (ot != PatchProxyResult.class) {
             }else {
                objArray = new Object[false];
                a.D().w("KuaishanSegmentVideoEditFragment", "useDefaultExport invoked with media: "+qMedia.getPath(), objArray);
                ot = (a.n == null)? t.error(new IllegalArgumentException("useDefaultExport: mVideoData is null")): t.fromCallable(new n(a, qMedia, obj1)).subscribeOn(d.c).flatMap(new j(qMedia));
             }
          }else {
             KuaishanSegmentVideoEditFragment r = a.r;
             KuaishanSegmentVideoEditFragment kuaishanSegm = r;
             KuaishanSegmentVideoEditFragment kuaishanSegm1 = r;
             ot = PatchProxy.applyThreeRefs(kuaishanSegm, qMedia, p1, a, KuaishanSegmentVideoEditFragment.class, "10");
             if (ot != PatchProxyResult.class) {
             }else {
                objArray = new Object[false];
                a.D().w("KuaishanSegmentVideoEditFragment", "useTemplateImportHandler invoked with media: "+qMedia.getPath(), objArray);
                if (a.n == null) {
                   ot = t.error(new IllegalArgumentException("useDefaultExport: mVideoData is null"));
                }else {
                   c = d.c;
                   ot = t.fromCallable(new m(a, qMedia, kuaishanSegm1, obj1)).subscribeOn(c).flatMap(b.b).observeOn(c);
                   ot = ot.flatMap(new a(qMedia)).observeOn(d.a).map(new i(qMedia));
                }
             }
          }
          long l = Math.min(a.p, qMedia.duration);
          a.l = t.concat(g7.m(qMedia.path, g7.c(qMedia, a.n.mClipDuration, l), l).flatMap(c.b), ot).observeOn(d.a).doOnNext(new s(a)).takeLast(1).doOnError(new r(a)).doOnComplete(new q(a)).subscribe(new f(a, obj, qMedia, obj1), new t(a));
       }
       return;
    }
}
