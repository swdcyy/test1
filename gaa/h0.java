package gaa.h0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import nm6.d;
import r8c.g;
import java.lang.Object;
import java.util.ArrayList;
import gaa.y;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import gaa.c;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import voc.i;
import java.util.List;
import lnc.s6;
import java.lang.Math;
import brd.t;
import gaa.f0;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Iterable;
import gaa.g0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import gaa.d0;
import crd.b;
import exb.b;
import gaa.h0$b;
import gaa.w;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import jkd.c;
import java.util.Iterator;
import cq.a;
import q87.c;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import gaa.t;
import android.content.DialogInterface$OnCancelListener;
import gaa.h0$a;
import gaa.b0;
import io.reactivex.g;
import gaa.e0;
import gaa.i;
import lnc.e0;
import gaa.l0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.util.Arrays;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import com.yxcorp.utility.TextUtils;
import gaa.x;
import java.util.concurrent.Callable;
import gaa.c0;

public class h0	// class@002434
{
    public final GifshowActivity a;
    public final QPhoto b;
    public Music c;
    public final CDNUrl[] d;
    public final QPreInfo e;
    public final g f;
    public final d g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final long n;
    public long o;
    public String p;
    public boolean q;
    public ProgressFragment r;
    public DialogInterface$OnCancelListener s;
    public final ArrayList t;
    public final ArrayList u;
    public final List v;
    public final y w;

    public void h0(GifshowActivity p0,QPhoto p1,d p2,g p3){
       super();
       this.h = -1;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.t = new ArrayList();
       this.u = new ArrayList();
       this.v = new ArrayList();
       this.w = y.b;
       this.a = p0;
       this.b = p1;
       this.f = p3;
       this.e = p2.e();
       this.g = p2;
       this.d = c.c(p1);
       if (p1.getMusic() != null) {
          this.c = p1.getMusic();
       }else if(p1.getSoundTrack() != null){
          this.c = p1.getSoundTrack();
       }
       return;
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, h0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(PostUtils.g("[>|50|>]"), "/source"+a1.k()+".jpg").getAbsolutePath();
    }
    public static String d(QPhoto p0,int p1){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oh0, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "source_photo_"+p0.getEntity().getId()+p1;
    }
    public final void a(i p0){
       h0 oh0 = h0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh0, "5")) {
          return;
       }
       h0 tv = this.v;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, oh0, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          this.m = (s6.k())? Math.min(this.b.getAtlasList().size(), 4): this.b.getAtlasList().size();
          for (int i = 0; i < this.m; i = i + 1) {
             uArrayList.add(t.just(Integer.valueOf(i)).map(new f0(this, p0, i)).subscribeOn(d.c).observeOn(d.a));
          }
       }
       tv.add(t.fromIterable(uArrayList).concatMap(g0.b).subscribe(Functions.d(), new d0(this)));
       return;
    }
    public final b b(String p0,File p1,i p2,int p3){
       Object obj;
       if (PatchProxy.isSupport(h0.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, h0.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       h0$b uob = new h0$b(this, p2, p1, p3, p0);
       return obj;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0.class, "12")) {
          return;
       }
       k1.o(w.b);
       h0 tr = this.r;
       if (tr != null) {
          tr.dismiss();
          this.r = objArray;
       }
       a.d().k(new PlayEvent(this.b, PlayEvent$Status.RESUME, 17));
       if (this.g.c() != null) {
          this.g.c().onFail(0, "");
       }
       this.f();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, h0.class, "13")) {
          return;
       }
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().dispose();
       }
       this.l = 0;
       this.m = 0;
       return;
    }
    public final void g(){
       h0 oh0 = h0.class;
       if (PatchProxy.applyVoid(null, this, oh0, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditSourcePictureDownloadDispatcher", "startDownload", objArray);
       ProgressFragment progressFrag = new ProgressFragment();
       this.r = progressFrag;
       progressFrag.Jh(a1.p(R.string.arg_RES_7f103667));
       this.r.Eh(i, 100);
       boolean b = true;
       this.r.setCancelable(b);
       this.r.show(this.a.getSupportFragmentManager(), "music_recreation");
       if (this.s == null) {
          this.s = new t(this);
       }
       this.r.oh(this.s);
       h0$a uoa = new h0$a(this);
       int i1 = 2;
       uoa.a("DOWNLOAD_COVER_TASK", i, i1);
       uoa.a("DOWNLOAD_PICTURE_TASK", i, 8);
       if (c.c(this.b) != null) {
          uoa.a("DOWNLOAD_MUSIC_TASK", i, 7);
          if (!PatchProxy.applyVoidOneRefs(uoa, this, oh0, "3")) {
             h0 tv = this.v;
             h0 tb = this.b;
             t ot = PatchProxy.applyOneRefs(tb, this, oh0, "7");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = t.create(new b0(this, tb));
             }
             tv.add(ot.subscribeOn(d.c).observeOn(d.a).subscribe(new e0(this, uoa), new i(uoa)));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(uoa, this, oh0, "8")) {
          a.e(e0.c(this.b.getCoverThumbnailUrls()), new l0(this, uoa));
       }
       if (this.b.isSinglePhoto() && !this.b.isLongPhotos()) {
          this.h = i;
          if (!PatchProxy.applyVoidOneRefs(uoa, this, oh0, "4")) {
             StatModel statModel = new StatModel("downloadSinglePicFromDialog");
             statModel.mDownloadIndex = Integer.toString(i);
             List list = Arrays.asList(c.d(this.b));
             String str = h0.d(this.b, i);
             String str1 = b.a(0x5f2ddeb4).g(str, String.class);
             if (TextUtils.x(str1) || !new File(str1).exists()) {
                str1 = h0.c();
             }
             File uFile = new File(str1);
             b uob = this.b(str, uFile, uoa, i);
             if (uFile.exists()) {
                Object[] objArray1 = new Object[i];
                a.D().w("EditSourcePictureDownloadDispatcher", "downloadSinglePhoto: filePath = "+str1+", already existed", objArray1);
                uob.onSuccess();
             }else {
                statModel.mLocalFile = uFile;
                x ox = new x(this, list, uFile, statModel, uob);
                this.v.add(t.fromCallable(uoa).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), new c0(this)));
             }
          }
       }else if(this.b.isAtlasPhotos()){
          this.h = b;
          this.a(uoa);
       }else if(this.b.isLongPhotos()){
          this.h = i1;
          this.a(uoa);
       }else {
          this.e();
       }
       return;
    }
}
