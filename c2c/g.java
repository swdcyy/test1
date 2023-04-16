package c2c.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import b2c.a;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import brd.t;
import t45.d;
import brd.z;
import c2c.g$f;
import erd.o;
import c2c.g$g;
import erd.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.utils.e;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.chat.components.utils.a;
import c2c.g$h;
import android.content.DialogInterface$OnDismissListener;
import cxb.n;
import c2c.g$i;
import c2c.g$j;
import erd.a;
import io.reactivex.internal.functions.Functions;
import c2c.g$k;
import c2c.g$e;
import qrd.l1;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import e17.i;
import b2c.a$a;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.ui.popupmanager.dialog.a;
import c2c.g$l;
import lnc.a1;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import c2c.g$m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import mz6.b;
import c2c.g$n;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import android.view.View;
import c2c.g$a;
import android.view.View$OnLongClickListener;
import ekd.m1;
import java.lang.Boolean;
import c2c.g$b;
import com.yxcorp.gifshow.widget.m;
import android.widget.ImageButton;
import c2c.g$c;
import android.view.ViewStub;
import z5c.f3;
import c2c.g$d;

public final class g extends PresenterV2	// class@00050d
{
    public ProfileBgVideoInfo p;
    public ViewStub q;
    public boolean r;
    public a s;
    public ProgressFragment t;
    public b u;
    public boolean v;

    public void g(){
       super();
       this.v = true;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "5")) {
          return;
       }
       g tt = this.t;
       if (tt != null) {
          tt.dismiss();
       }
       tt = this.s;
       if (tt != null && !PatchProxy.applyVoid(objArray, tt, a.class, "4")) {
          a b = tt.b;
          if (b != null) {
             DownloadManager.n().B(tt.c, b);
          }
          if (tt.d != null) {
             DownloadManager.n().c(tt.c);
             tt.c = -1;
          }
       }
    label_003f :
       b9.a(this.u);
       return;
    }
    public final void P8(){
       g tp1;
       a a;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "6")) {
          return;
       }
       g tp = this.p;
       String str = "mVideoInfo";
       if (tp == null) {
          a.S(str);
       }
       if (tp.getLocalVideo()) {
          tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          this.X7(t.just(tp1).subscribeOn(d.c).map(g$f.b).observeOn(d.a).subscribe(g$g.b));
          return;
       }else {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (tp.getUseFeedPlay()) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             if (tp.getFeed() != null) {
                g tp2 = this.p;
                if (tp2 == null) {
                   a.S(str);
                }
                BaseFeed feed = tp2.getFeed();
                a.m(feed);
                File uFile = PatchProxy.applyOneRefs(feed, objArray, e.class, "10");
                if (uFile != patchProxyRe) {
                }else {
                   uFile = new File(e.a(), a.c(feed.getId())+".mp4");
                }
                if (uFile.exists()) {
                   uFile.delete();
                }
                this.S8();
                tp1 = this.t;
                if (tp1 != null) {
                   tp1.k0(new g$h(this));
                }
                tp1 = this.p;
                if (tp1 == null) {
                   a.S(str);
                }
                BaseFeed feed1 = tp1.getFeed();
                a.m(feed1);
                a.o(uFile, "saveFile");
                this.u = n.a(feed1, uFile.getAbsolutePath()).subscribeOn(d.c).observeOn(d.a).doOnNext(new g$i(this, uFile)).doFinally(new g$j(this)).subscribe(Functions.d(), new g$k(this));
                return;
             }
          }
          if (this.s == null) {
             g tp3 = this.p;
             if (tp3 == null) {
                a.S(str);
             }
             a uoa1 = new a(tp3);
             g$e uoe = new g$e(this);
             if (!PatchProxy.applyVoidOneRefs(uoe, uoa1, uoa, "1")) {
                a.p(uoe, "listener");
                uoa1.e = uoe;
             }
             this.s = uoa1;
          }
          tp = this.s;
          if (tp != null && !PatchProxy.applyVoid(objArray, tp, uoa, "2")) {
             int i = 0x7f11066a;
             if (!p0.C(a.b())) {
                i.a(i, R.string.arg_RES_7f1038e5);
             }else if(tp.d != null){
                i.a(i, R.string.arg_RES_7f1043da);
             }else if(tp.a == null || tp.b == null){
                i.a(i, R.string.arg_RES_7f10160f);
             }else {
                String str1 = tp.a(tp.f);
                a.o(str1, "downloadUrl");
                tp.a.setDestinationFileName(a.h.b(tp.f, str1));
                a = tp.a;
                a b = tp.b;
                b[] obj = PatchProxy.applyTwoRefs(a, b, tp, uoa, "5");
                if (obj != patchProxyRe) {
                   i1 = obj.intValue();
                }else {
                   obj = new b[]{b};
                   i1 = DownloadManager.n().E(a, obj);
                }
                tp.c = i1;
                DownloadManager.C("social_profile_background_video", str1);
             }
          }
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       String str = "android.permission.WRITE_EXTERNAL_STORAGE";
       if (PermissionUtils.a(this.getActivity(), str)) {
          this.P8();
       }else {
          String[] stringArray = new String[]{str};
          this.X7(a.k(this.getActivity(), stringArray).subscribe(new g$l(this), Functions.d()));
       }
       return;
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "7")) {
          return;
       }
       if (this.t == null) {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Eh(0, 100);
          progressFrag.Jh(a1.r(R.string.arg_RES_7f100aab, ""));
          progressFrag.vh(R.string.cancel);
          progressFrag.setCancelable(0);
          progressFrag.zh(0);
          progressFrag.xh(new g$m(this));
          this.t = progressFrag;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          g tt = this.t;
          if (tt != null) {
             tt.show(objArray.getSupportFragmentManager(), "save-video");
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          b uob = new b(activity);
          uob.e(true);
          int[] ointArray = new int[true];
          ointArray[0] = 0x7f1043c7;
          uob.j(ointArray);
          uob.h(true);
          uob.l(new g$n(this));
          uob.q();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "view");
       m1.d(p0, new g$a(this), R.id.option_view);
       return;
    }
    public void j8(){
       View view;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Boolean obj = this.r8("PROFILE_PREVIEW_VIDEO_INFO");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_INFO\)");
       this.p = obj;
       obj = this.t8("PROFILE_PREVIEW_CLICK_EXIT");
       int i = 0;
       boolean b = (obj != null)? obj.booleanValue(): false;
       this.r = b;
       if (b) {
          g$b uob = new g$b(this);
          m1.b(this.m8(), uob, R.id.title_root);
          m1.b(this.m8(), uob, R.id.option_view);
       }
       obj = this.t8("PROFILE_PREVIEW_IS_MINE");
       if (obj != null) {
          b = obj.booleanValue();
          this.v = b;
          if (b) {
             view = m1.f(this.m8(), R.id.more_btn);
             a.o(view, "ViewBindUtils.bindWidget¡­\(rootView, R.id.more_btn\)");
             view.setVisibility(i);
             m1.b(this.m8(), new g$c(this), R.id.more_btn);
          }else {
             view = m1.f(this.m8(), R.id.save_background_layout);
             a.o(view, "ViewBindUtils.bindWidget¡­d.save_background_layout\)");
             this.q = view;
             if (view == null) {
                a.S("mSaveBgViewStub");
             }
             f3.a(view);
             m1.b(this.m8(), new g$d(this), R.id.save_background_layout);
          }
       }
       return;
    }
}
