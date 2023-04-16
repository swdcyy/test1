package l09.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l09.d$a;
import nsd.u;
import l09.d$e;
import l09.d$d;
import l09.d$c;
import l09.d$f;
import l09.d$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment;
import nc6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c$b;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import android.net.Uri;
import com.kwai.framework.player.core.b;
import nc6.d;
import l09.e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.robust.PatchProxyResult;
import gc6.b;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Enum;
import ec6.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import l09.d$b;
import java.lang.Runnable;
import ekd.k1;
import l09.f;
import ai7.e;
import android.view.Surface;
import android.view.View;
import ekd.m1;

public final class d extends PresenterV2	// class@002c6a
{
    public final IMediaPlayer$OnErrorListener A;
    public final TextureView$SurfaceTextureListener B;
    public BaseFeed p;
    public PopShowFragment q;
    public TextureView r;
    public b s;
    public boolean t;
    public String u;
    public Surface v;
    public boolean w;
    public final c$b x;
    public final b$b y;
    public final Runnable z;
    public static final d$a C;

    static {
       d.C = new d$a(null);
    }
    public void d(){
       super();
       this.x = new d$e(this);
       this.y = new d$d(this);
       this.z = new d$c(this);
       this.A = new d$f(this);
       this.B = new d$g(this);
    }
    public void E8(){
       PhotoAdvertisement$PopShowVideoInfo mVideoUri;
       b uob;
       int i;
       int i1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       d tp = this.p;
       if (tp == null) {
          a.S("mEntity");
       }
       if (!c.c(tp)) {
          tp = this.q;
          if (tp != null) {
             tp.dh("data invalid");
          }
       }
       this.u = a.a();
       tp = this.q;
       if (tp != null) {
          c fragmentMana = tp.getFragmentManager();
          if (fragmentMana != null) {
             fragmentMana.registerFragmentLifecycleCallbacks(this.x, false);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          Object[] objArray1 = new Object[false];
          j0.f("PopPlayVideoPresenter", "initPlayer", objArray1);
          tp = this.p;
          if (tp == null) {
             a.S("mEntity");
          }
          PhotoAdvertisement$PopPlayInfo popPlayInfo = c.E(tp);
          if (popPlayInfo != null) {
             popPlayInfo = popPlayInfo.mPopShowVideoInfo;
             if (popPlayInfo != null) {
                mVideoUri = popPlayInfo.mVideoUri;
             label_0062 :
                d tp1 = this.p;
                if (tp1 == null) {
                   a.S("mEntity");
                }
                PhotoAdvertisement$PopPlayInfo popPlayInfo1 = c.E(tp1);
                if (popPlayInfo1 != null) {
                   popPlayInfo1 = popPlayInfo1.mPopShowVideoInfo;
                   if (popPlayInfo1 != null) {
                      PhotoAdvertisement$PopShowVideoInfo mVideoUrls = popPlayInfo1.mVideoUrls;
                      if (mVideoUrls != null) {
                         CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(mVideoUrls);
                         if (uCDNUrl != null) {
                            uCDNUrl = uCDNUrl.mUrl;
                         label_0083 :
                            if (mVideoUri != null) {
                               uob = this.P8(mVideoUri);
                               if (uob == null) {
                               label_013c :
                                  if (this.s == null) {
                                     this.R8();
                                     return;
                                  }else {
                                     this.W8();
                                     return;
                                  }
                               }
                            }else if(uCDNUrl != null){
                               Uri uri = Uri.parse(uCDNUrl);
                               a.o(uri, "Uri.parse\(videoUrl\)");
                               uob = this.P8(uri);
                               if (uob == null) {
                               }
                            }else {
                               goto label_013c ;
                            }
                            this.s = uob;
                            uob.x().e(1);
                            uob.x().g(this.u);
                            uob.addOnPreparedListener(new e(this, uob));
                            tp1 = this.r;
                            if (tp1 != null) {
                               tp1.setSurfaceTextureListener(this.B);
                            }
                            uob.w(this.y);
                            uob.addOnErrorListener(this.A);
                            i oi = PatchProxy.apply(objArray, this, uod, "8");
                            if (oi != PatchProxyResult.class) {
                            }else {
                               uod = this.p;
                               if (uod == null) {
                                  a.S("mEntity");
                               }
                               PhotoAdvertisement photoAdverti = uod.get("AD");
                               if (photoAdverti != null) {
                                  photoAdverti = photoAdverti.mAdGroup;
                                  if (photoAdverti != null) {
                                     i = photoAdverti.ordinal();
                                  label_00f4 :
                                     d tp2 = this.p;
                                     if (tp2 == null) {
                                        a.S("mEntity");
                                     }
                                     PhotoAdvertisement$PopPlayInfo popPlayInfo2 = c.E(tp2);
                                     popPlayInfo2 = (popPlayInfo2 != null)? popPlayInfo2.mDisplayDurMs: 0;
                                     long l = (long)popPlayInfo2;
                                     tp2 = this.p;
                                     if (tp2 == null) {
                                        a.S("mEntity");
                                     }
                                     FeedLogCtx uFeedLogCtx = r1.O0(tp2);
                                     tp2 = this.p;
                                     if (tp2 == null) {
                                        a.S("mEntity");
                                     }
                                     String str = r1.M0(tp2);
                                     tp2 = this.p;
                                     if (tp2 == null) {
                                        a.S("mEntity");
                                     }
                                     i oi1 = new i(2, l, null, uFeedLogCtx, str, i, r1.x1(tp2));
                                  }
                               }
                               i = 0;
                               goto label_00f4 ;
                            }
                            uob.D(oi);
                            uob.setLooping(false);
                            uob.setVolume(0, 0);
                            uob.prepareAsync();
                            goto label_013c ;
                         }
                      }
                   }
                }
                Object[] objArray2 = objArray;
                goto label_0083 ;
             }
          }
          mVideoUri = objArray;
          goto label_0062 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       d tq = this.q;
       if (tq != null) {
          c fragmentMana = tq.getFragmentManager();
          if (fragmentMana != null) {
             fragmentMana.unregisterFragmentLifecycleCallbacks(this.x);
          }
       }
       this.S8();
       tq = this.s;
       if (tq != null) {
          tq.O(this.y);
       }
       return;
    }
    public final b P8(Uri p0){
       b uob;
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d("CommercialPopShowVideo");
       WayneBuildData wayneBuildDa = obj.setBizFt(":ks-features:ft-commercial:commercial");
       String str = p0.toString();
       try{
          wayneBuildDa.setNormalUrl(str, 1);
          uob = c.a(obj);
       }catch(java.lang.Exception e4){
          j0.b("PopPlayVideoPresenter", "KpMidVodHlsBuilder, createPlayer failed ", e4);
          uob = null;
       }
       return uob;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("PopPlayVideoPresenter", "exceptionFinish", objArray);
       d tq = this.q;
       if (tq != null) {
          tq.dh("exceptionFinish");
       }
       k1.r(new d$b(this), 1);
       return;
    }
    public final void S8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "17")) {
          return;
       }
       if (this.w != null) {
          return;
       }
       this.w = true;
       if (!PatchProxy.applyVoid(objArray, this, uod, "13")) {
          uod = this.s;
          if (uod != null) {
             d tp = this.p;
             if (tp == null) {
                a.S("mEntity");
             }
             PhotoAdvertisement photoAdverti = tp.get("AD");
             if (photoAdverti != null) {
                uod.x().f();
                uod.releaseAsync(new f(this, photoAdverti));
             }
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       d ts = this.s;
       if (ts != null) {
          ts.setSurface(null);
          ts = this.v;
          if (ts != null) {
             ts.release();
          }
       }
       return;
    }
    public final void W8(){
       int i;
       if (PatchProxy.applyVoid(null, this, d.class, "18")) {
          return;
       }
       k1.m(this.z);
       d tz = this.z;
       d tp = this.p;
       if (tp == null) {
          a.S("mEntity");
       }
       PhotoAdvertisement$PopPlayInfo popPlayInfo = c.E(tp);
       popPlayInfo = (popPlayInfo != null)? popPlayInfo.mDisplayDurMs: 5;
       k1.r(tz, (long)popPlayInfo);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a317d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.q8(BaseFeed.class);
       a.o(obj, "inject\(BaseFeed::class.java\)");
       this.p = obj;
       this.q = this.t8("POPSHOW_FRAGMENT");
       return;
    }
}
