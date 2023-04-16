package ko1.b0;
import java.lang.StringBuilder;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.String;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.t;
import t45.d;
import brd.z;
import ko1.h;
import erd.o;
import ko1.s;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ko1.g;
import ko1.r;
import ko1.i;
import ko1.t;
import ko1.j;
import ko1.c;
import ko1.e;
import ko1.p;
import ko1.k;
import ko1.o;
import ko1.f;
import ko1.q;
import com.kuaishou.live.core.basic.model.LiveLikeNewStyleConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import ko1.u;
import com.kuaishou.live.common.core.basic.tools.g$a;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.common.core.basic.tools.g;
import java.util.List;
import ko1.w;
import ko1.y;
import ko1.z;
import ko1.a0;
import ko1.x;
import ko1.v;
import com.kwai.robust.PatchProxyResult;
import w4.e;
import java.lang.Boolean;
import ko1.d;

public class b0	// class@002d79
{
    public final List a;
    public final List b;
    public Bitmap c;
    public e d;
    public e e;
    public e f;
    public e g;
    public String h;
    public static final String i;

    static {
       b0.i = b.a(-1504323719).o().getAbsolutePath()+File.separatorChar+"liveNewLike"+File.separatorChar;
    }
    public void b0(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = new ArrayList();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "12")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new h(p0)).observeOn(d.a).doOnNext(new s(this)).subscribe(Functions.d(), this.m("decodeAvatarBackLottieAnimation"));
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "11")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new g(p0)).observeOn(d.a).doOnNext(new r(this)).subscribe(Functions.d(), this.m("decodeAvatarFrontLottieAnimation"));
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "13")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new i(p0)).observeOn(d.a).doOnNext(new t(this)).subscribe(Functions.d(), this.m("decodeThumbUpImage"));
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "14")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new j(p0)).observeOn(d.a).doOnNext(new c(this)).subscribe(Functions.d(), this.m("decodeThumbUpImageWithLottie"));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "9")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new e(p0)).observeOn(d.a).doOnNext(new p(this)).subscribe(Functions.d(), this.m("decodeThumbUpLottieAnimation"));
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "15")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new k(p0)).observeOn(d.a).doOnNext(new o(this)).subscribe(Functions.d(), this.m("decodeTopBarRightImage"));
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "10")) {
          return;
       }
       t.just(Integer.valueOf(1)).observeOn(d.c).map(new f(p0)).observeOn(d.a).doOnNext(new q(this)).subscribe(Functions.d(), this.m("decodeTopBarRightLottieAnimation"));
       return;
    }
    public void h(LiveLikeNewStyleConfig p0){
       String str;
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob0, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!TextUtils.isEmpty(p0.mLikeFinishedText)) {
          this.h = p0.mLikeFinishedText;
       }
       int i = 0;
       LiveLikeNewStyleConfig mLiveLikeThu = p0.mLiveLikeThumbUpImageUrls;
       while (i < mLiveLikeThu.length) {
          object oobject = mLiveLikeThu[i];
          if (!PatchProxy.applyVoidOneRefs(oobject, this, uob0, "2")) {
             DownloadManager.C("live_like_new_style_1", "");
             str = this.i(oobject);
             if (this.l(str)) {
                this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, oobject, b0.i, str, new u(this), "live_like_new_style_1"));
             }else {
                this.c(b0.i+str);
             }
          }
          i = i + 1;
       }
       LiveLikeNewStyleConfig mLiveLikeThu1 = p0.mLiveLikeThumbUpLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "4")) {
          DownloadManager.C("live_like_new_style_3", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new w(this), "live_like_new_style_3"));
          }else {
             this.e(b0.i+str);
          }
       }
       mLiveLikeThu1 = p0.mLiveLikeTopBarRightLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "6")) {
          DownloadManager.C("live_like_new_style_5", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new y(this), "live_like_new_style_5"));
          }else {
             this.g(b0.i+str);
          }
       }
       mLiveLikeThu1 = p0.mLiveLikeAvatarFrontLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "7")) {
          DownloadManager.C("live_like_new_style_6", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new z(this), "live_like_new_style_6"));
          }else {
             this.b(b0.i+str);
          }
       }
       mLiveLikeThu1 = p0.mLiveLikeAvatarBackLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "8")) {
          DownloadManager.C("live_like_new_style_7", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new a0(this), "live_like_new_style_7"));
          }else {
             this.a(b0.i+str);
          }
       }
       mLiveLikeThu1 = p0.mLiveLikeTopBarRightImageUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "5")) {
          DownloadManager.C("live_like_new_style_4", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new x(this), "live_like_new_style_4"));
          }else {
             this.f(b0.i+str);
          }
       }
       mLiveLikeThu1 = p0.mLiveLikeThumbUpImageWithLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu1, this, uob0, "3")) {
          DownloadManager.C("live_like_new_style_2", "");
          str = this.i(mLiveLikeThu1);
          if (this.l(str)) {
             this.a.add(g.b(DownloadTask$DownloadTaskType.IMMEDIATE, mLiveLikeThu1, b0.i, str, new v(this), "live_like_new_style_2"));
          }else {
             this.d(b0.i+str);
          }
       }
       return;
    }
    public String i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.substring((p0.lastIndexOf("/") + 1));
    }
    public List j(){
       return this.b;
    }
    public e k(){
       return this.d;
    }
    public final boolean l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (new File(b0.i+p0).exists() ^ 0x01);
    }
    public final g m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0);
    }
}
