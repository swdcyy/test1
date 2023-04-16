package gaa.s;
import gaa.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import crd.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import cq.a;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.robust.PatchProxyResult;
import gaa.c;
import lnc.a1;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import gaa.e;
import android.content.DialogInterface$OnCancelListener;
import gaa.n;
import voc.i;
import a46.b;
import lnc.x6;
import lnc.y6;
import pm6.m;
import com.yxcorp.gifshow.music.utils.g;
import java.util.concurrent.TimeUnit;
import java.lang.Boolean;
import brd.t;
import gaa.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import gaa.h;
import gaa.i;
import erd.g;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.StringBuilder;
import gaa.q;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import gaa.l;
import java.lang.Runnable;
import ekd.k1;
import wba.a0;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import gaa.r;
import com.yxcorp.download.b;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import gaa.f;
import android.content.Context;
import n3d.a;
import android.content.res.Resources;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.util.BitmapUtil;

public class s extends d	// class@00244b
{
    public final GifshowActivity a;
    public final QPhoto b;
    public final Music c;
    public final List d;
    public int e;
    public int f;
    public boolean g;
    public final long h;
    public long i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public ProgressFragment n;
    public DialogInterface$OnCancelListener o;
    public b p;
    public int q;
    public boolean r;

    public void s(GifshowActivity p0,QPhoto p1,Music p2,List p3,boolean p4){
       super();
       this.e = 0;
       this.f = 0;
       this.h = 0;
       this.i = 0;
       this.l = "";
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.r = p4;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       this.g = true;
       DownloadManager.n().c(this.q);
       s tp = this.p;
       if (tp != null && !tp.isDisposed()) {
          this.p.dispose();
          this.p = null;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       s tn = this.n;
       if (tn != null) {
          tn.dismiss();
          this.n = null;
       }
       return;
    }
    public void c(){
       n on1;
       String str2;
       Object[] objArray2;
       CDNUrl[] uCDNUrlArray1;
       s b;
       s c;
       t ot;
       ProgressFragment progressFrag = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, progressFrag, s.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditMusicDownloadDispatcher", "go", objArray1);
       if (QCurrentUser.me() == null || !QCurrentUser.me().isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f10305c));
          d.a(-1712118428).x00(progressFrag.a, 180, uoa.a(), new f(progressFrag));
          return;
       }else {
          String str = "5";
          if (!PatchProxy.applyVoid(objArray, progressFrag, s.class, str)) {
             Boolean uBoolean = 100;
             int i = 1;
             if (!PatchProxy.applyVoid(objArray, progressFrag, s.class, "4")) {
                ProgressFragment progressFrag1 = new ProgressFragment();
                progressFrag.n = progressFrag1;
                progressFrag1.Jh(a1.p(R.string.arg_RES_7f103667));
                progressFrag.n.Eh(0, uBoolean);
                progressFrag.n.setCancelable(i);
                progressFrag.n.show(progressFrag.a.getSupportFragmentManager(), "music_recreation");
                if (progressFrag.o == null) {
                   progressFrag.o = new e(progressFrag);
                }
                progressFrag.n.oh(progressFrag.o);
             }
             n on = new n(progressFrag);
             on.a("DOWNLOAD_MUSIC_TASK", 0, 7);
             on.a("DOWNLOAD_COVER_TASK", 0, 2);
             String str1 = "DOWNLOAD_SOUND_WAVE_TASK";
             on.a(str1, 0, i);
             if (PatchProxy.applyVoidOneRefs(on, progressFrag, s.class, "6")) {
                on1 = on;
                str2 = str1;
             }else {
                b uob = y6.r(b.class);
                boolean i1 = (uob != null)? uob.xa(): m.b(0);
                i1 = g.c(progressFrag.c, i1, 0);
                progressFrag.m = i1;
                TimeUnit timeUnit = (i1)? null: g.a(progressFrag.c);
                long l = timeUnit;
                long l1 = TimeUnit.SECONDS.toMillis((long)progressFrag.c.mCopyrightTimeLimitInSecond);
                s m = progressFrag.m;
                c = progressFrag.c;
                if (PatchProxy.isSupport(c.class)) {
                   ot = PatchProxy.applyTwoRefs(Boolean.valueOf(m), c, objArray, c.class, str);
                   if (ot != PatchProxyResult.class) {
                   label_00fa :
                      h oh = c;
                      n on2 = on;
                      str2 = str1;
                      h oh1 = c;
                      oh = new h(this, l1, l, on2);
                      on1 = on2;
                      ot.subscribeOn(d.c).observeOn(d.a).subscribe(oh1, new i(on1));
                   }
                }
                ot = t.create(new a(m, c));
                goto label_00fa ;
             }
             if (!PatchProxy.applyVoidOneRefs(on1, progressFrag, s.class, "7")) {
                if (!q.f(progressFrag.d)) {
                   CDNUrl[] uCDNUrlArray = new CDNUrl[0];
                   uCDNUrlArray1 = progressFrag.d.toArray(uCDNUrlArray);
                }else {
                   b = progressFrag.b;
                   if (b != null) {
                      uCDNUrlArray1 = b.getCoverThumbnailUrls();
                   }else {
                      b = progressFrag.c;
                      Music mImageUrls = b.mImageUrls;
                      uCDNUrlArray1 = (mImageUrls != null && mImageUrls.length)? mImageUrls: b.mAvatarUrls;
                   }
                }
                if (uCDNUrlArray1 == null || !uCDNUrlArray1.length) {
                   this.d();
                   k1.o(new l(on1));
                }else {
                   str = e0.c(uCDNUrlArray1);
                   objArray2 = new Object[0];
                   a.D().w("EditMusicDownloadDispatcher", "downloadMusicCover imgUrl = "+str, objArray2);
                   a.e(str, new q(progressFrag, on1));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(on1, progressFrag, s.class, "9")) {
                str = a0.a("https://static.yximgs.com/udata/pkg/KUAISHOU_APP_RESOURCES/post/new_sound_wave.webp");
                objArray2 = new Object[0];
                a.D().w("EditMusicDownloadDispatcher", "downloadSoundWave soundWaveUrl = "+str, objArray2);
                if (!TextUtils.x(str)) {
                   String str3 = PatchProxy.apply(null, null, c.class, "4");
                   if (str3 != PatchProxyResult.class) {
                   }else {
                      str3 = new File(PostUtils.f(), "MUSIC_RECREATION_SOUND_WAVE_.webp").getAbsolutePath();
                   }
                   if (b.S(new File(str3))) {
                      progressFrag.l = str3;
                      on1.g(str2, 100, 1);
                   }else {
                      File uFile = new File(str3);
                      DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(str);
                      uDownloadReq.setDestinationDir(uFile.getParent());
                      uDownloadReq.setDestinationFileName(uFile.getName());
                      uDownloadReq.setAllowedNetworkTypes(3);
                      uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                      uDownloadReq.setNeedCDNReport(true);
                      b[] uobArray = new b[true];
                      uobArray[0] = new r(progressFrag, on1, str3, uFile);
                      progressFrag.q = DownloadManager.n().E(uDownloadReq, uobArray);
                   }
                }
             }
          }
       label_0225 :
          return;
       }
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "8")) {
          return;
       }
       String str = PatchProxy.apply(objArray, objArray, c.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          File uFile = new File(PostUtils.f(), "MUSIC_RECREATION_DEFAULT_COVER_.png");
          b.q(uFile);
          str = uFile.getAbsolutePath();
       }
       this.k = str;
       BitmapUtil.O(BitmapFactory.decodeResource(this.a.getResources(), R.drawable.arg_RES_7f081b6c), this.k, 100);
       return;
    }
}
