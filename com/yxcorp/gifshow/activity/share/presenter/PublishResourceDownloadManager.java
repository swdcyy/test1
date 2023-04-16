package com.yxcorp.gifshow.activity.share.presenter.PublishResourceDownloadManager;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import tw8.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer$PhotoInfo;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import r8c.n;
import mm6.g;
import zw8.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import zw8.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Collection;
import ekd.q;
import android.util.Pair;
import java.lang.Iterable;
import com.yxcorp.gifshow.activity.share.presenter.d;
import erd.o;
import java.util.concurrent.TimeUnit;
import zw8.b;
import com.yxcorp.gifshow.activity.share.presenter.b;
import java.util.concurrent.Callable;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ln6.a;
import com.kwai.framework.model.feed.BaseFeed;
import ln6.b;
import zw8.g;
import zw8.f;
import brd.w;
import erd.k;
import com.yxcorp.gifshow.activity.share.presenter.c;
import erd.g;
import zw8.e;
import erd.a;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;

public class PublishResourceDownloadManager	// class@00139e
{
    public n a;
    public u b;
    public String c;
    public d d;
    public InteractStickerInfo e;

    public void PublishResourceDownloadManager(){
       super();
       this.c = PostUtils.g("[>|36|>]").getAbsolutePath();
       this.d = new d();
    }
    public t a(QPhoto p0,String p1,GifshowActivity p2,List p3){
       boolean this;
       Object[] this1;
       t ot;
       Object[] objArray;
       t this1;
       t ot3;
       t ot5;
       t ot6;
       PublishResourceDownloadManager a;
       n on = this;
       Object obj = p0;
       Object obj1 = p1;
       Object[] obj2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PublishResourceDownloadManager.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 0;
       String str = "PublishResourceDownloadManager";
       List list = null;
       if (!obj) {
          obj2 = new Object[i];
          a.b().w(str, "downloadResource qphoto is null", obj2);
          return t.just(new PreviewPlayer$PhotoInfo(list, list, list));
       }else {
          this = true;
          n on1 = new n(p2, list, this);
          on.a = on1;
          on1.e = this;
          if (!PatchProxy.applyVoid(list, on, PublishResourceDownloadManager.class, "17")) {
             a = on.a;
             if (a != null) {
                a.c();
             }
          }
          if (p0.isVideoType()) {
             this1 = new Object[i];
             a.b().w(str, "downloadResource is video", this1);
             ot = PatchProxy.applyOneRefs(obj, on, PublishResourceDownloadManager.class, "12");
             if (ot != PatchProxyResult.class) {
             }else {
                this1 = new Object[i];
                a.b().w(str, "downloadVideo", this1);
                ot = t.create(new a(on, obj));
             }
             ot = ot.subscribeOn(d.c);
          }else {
             this1 = new Object[i];
             a.b().w(str, "downloadResource is photo", this1);
             ot = PatchProxy.applyTwoRefs(obj, obj1, on, PublishResourceDownloadManager.class, "9");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = t.create(new c(on, obj, obj1));
             }
             ot = ot.subscribeOn(d.c);
          }
          t ot1 = ot;
          p0.isVideoType();
          String str1 = "";
          t ot2 = t.just(str1);
          if (p0.isVideoAndNotKtv() && PostExperimentUtils.c0()) {
             objArray = new Object[i];
             a.b().w(str, "downloadResource can downloadOriginCover", objArray);
             this1 = PatchProxy.applyOneRefs(p3, on, PublishResourceDownloadManager.class, "3");
             if (this1 != PatchProxyResult.class) {
             }else {
                Object[] objArray2 = new Object[i];
                a.b().w(str, "downloadOriginCoverIfNeeded", objArray2);
                if (q.f(p3)) {
                   objArray = new Object[i];
                   a.b().w(str, "downloadOriginCoverIfNeeded originCoverUrl is empty", objArray);
                   this1 = t.just(new Pair(list, str1));
                }else {
                   this1 = t.fromIterable(p3).flatMap(new d(on)).timeout(3, TimeUnit.SECONDS).onErrorReturnItem(new Pair(list, str1)).subscribeOn(d.c);
                }
             }
             ot3 = this1;
          }else {
             objArray = new Object[i];
             a.b().w(str, "downloadResource can not downloadOriginCover", objArray);
             ot3 = t.just(new Pair(list, str1));
          }
          ot = PatchProxy.applyOneRefs(obj, on, PublishResourceDownloadManager.class, "13");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(new b(on, obj));
          }
          Object obj3 = ot;
          t ot4 = PatchProxy.apply(list, on, PublishResourceDownloadManager.class, "16");
          if (ot4 != PatchProxyResult.class) {
          }else {
             ot4 = t.fromCallable(b.b).subscribeOn(d.c);
          }
          Object obj4 = ot4;
          Object obj5 = PatchProxy.applyOneRefs(obj, on, PublishResourceDownloadManager.class, "5");
          if (obj5 != PatchProxyResult.class) {
             ot5 = obj5;
          }else {
             Object[] objArray1 = new Object[i];
             a.b().w(str, "getInteractStickerInfo", objArray1);
             if (!p0.hasInteractSticker()) {
                obj2 = new Object[i];
                a.b().w(str, "getInteractStickerInfo no interactStickerInfo", obj2);
                Objects.requireNonNull(InteractStickerInfo.Companion);
                ot6 = t.just(InteractStickerInfo.NONE);
             }else {
                PublishResourceDownloadManager e = on.e;
                ot6 = (e != null)? t.just(e): d.a(-863649994).pR(p0.getInteractStickerType(), obj.mEntity).map(new g(on));
             }
             ot5 = ot6;
          }
          return t.zip(ot1, obj3, obj4, ot5, ot2, ot3, new f(on, obj)).observeOn(d.a).doOnError(c.b).doFinally(new e(on));
       }
    }
    public final boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PublishResourceDownloadManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isSinglePhoto() || p0.isKtvSong())? true: false;
       return b;
    }
    public void c(int p0,int p1){
       PublishResourceDownloadManager publishResou = PublishResourceDownloadManager.class;
       if (PatchProxy.isSupport(publishResou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, publishResou, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().s("PublishResourceDownloadManager", "updateProgress called with: current = "+p0+", total = "+p1, objArray);
       publishResou = this.a;
       if (publishResou != null) {
          publishResou.b(p0, p1, 0);
       }
       return;
    }
}
