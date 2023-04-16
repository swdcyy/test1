package djc.f1;
import djc.n1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import djc.g1;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import com.yxcorp.gifshow.entity.QPhoto;
import v5a.a;
import v5a.a$b;
import com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder$createPlayBuildData$1;
import msd.l;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import rx6.b;
import px6.b;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import djc.f1$d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import djc.f1$a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import djc.f1$b;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import djc.f1$c;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.sharelib.model.PainterModel;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import djc.f1$f;
import android.view.View$OnClickListener;
import djc.f1$g;
import com.kwai.sharelib.model.PainterModel$VideoContent;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import kotlin.Result;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import djc.f1$e;
import java.lang.Runnable;
import android.widget.FrameLayout;
import java.lang.Boolean;
import java.lang.Throwable;
import qrd.j0;
import android.view.ViewGroup;
import android.content.Context;
import com.yxcorp.utility.n;
import com.facebook.drawee.view.SimpleDraweeView;
import com.android.library.image.interfaces.IConfig;
import w7.c;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import w7.d;
import com.android.library.image.interfaces.IConfig$CacheType;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import xb.t$b;
import x7.b;
import w7.e;
import x7.a;
import java.lang.Integer;
import x7.c;

public final class f1 extends RecyclerView$ViewHolder implements n1	// class@0021f1
{
    public KwaiPlayerKitView b;
    public View c;
    public View d;
    public View e;
    public QPhoto f;
    public String g;
    public PainterModel h;
    public final ImageView i;
    public final KwaiImageView j;
    public boolean k;
    public final g1 l;

    public void f1(g1 p0,View p1){
       View view;
       a.p(p0, "adapter");
       a.p(p1, "view");
       super(p1);
       this.l = p0;
       this.g = "";
       view = this.itemView.findViewById(R.id.share_player_controller);
       a.o(view, "itemView.findViewById\(R.¡­.share_player_controller\)");
       this.i = view;
       view = this.itemView.findViewById(R.id.share_player_cover);
       a.o(view, "itemView.findViewById\(R.id.share_player_cover\)");
       this.j = view;
       this.k = true;
    }
    public final View a(){
       f1 obj = PatchProxy.apply(null, this, f1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("errorView");
       }
       return obj;
    }
    public final KwaiPlayerKitView b(){
       f1 obj = PatchProxy.apply(null, this, f1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("kwaiPlayerKitView");
       }
       return obj;
    }
    public final View c(){
       f1 obj = PatchProxy.apply(null, this, f1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("loadingView");
       }
       return obj;
    }
    public final QPhoto d(){
       f1 obj = PatchProxy.apply(null, this, f1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("qPhoto");
       }
       return obj;
    }
    public final void e(){
       f1 uof1 = f1.class;
       if (PatchProxy.applyVoid(null, this, uof1, "16")) {
          return;
       }
       f1 tf = this.f;
       if (tf == null) {
          a.S("qPhoto");
       }
       a uoa = PatchProxy.applyOneRefs(tf, this, uof1, "17");
       if (uoa != PatchProxyResult.class) {
       }else {
          a$b uob = new a$b(tf);
          uob.b(ImmerseSharePosterVideoViewHolder$createPlayBuildData$1.INSTANCE);
          uoa = uob.a();
          a.o(uoa, "PlayerBuildData.Builder\(¡­e\)\n      }\n      .build\(\)");
       }
       tf = this.b;
       if (tf == null) {
          a.S("kwaiPlayerKitView");
       }
       QPhotoPlayerKitDataSource qPhotoPlayer = QPhotoPlayerKitDataSource.g(uoa);
       a.o(qPhotoPlayer, "QPhotoPlayerKitDataSourc¡­layerBuildData\(buildData\)");
       tf.g(qPhotoPlayer, uoa.a());
       uof1 = this.b;
       if (uof1 == null) {
          a.S("kwaiPlayerKitView");
       }
       uoa = uof1.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          IWaynePlayer player = uoa.getPlayer();
          if (player != null) {
             player.addOnInfoListener(f1$d.b);
             player.addOnCompletionListener(new f1$a(this));
             player.addOnPlayerLoadingChangedListener(new f1$b(this));
             player.addOnWayneErrorListener(new f1$c(this));
             player.setLooping(false);
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, f1.class, "18")) {
          return;
       }
       f1 tb = this.b;
       if (tb != null) {
          if (tb == null) {
             a.S("kwaiPlayerKitView");
          }
          tb.reset();
       }
       int i = 0;
       this.i.setVisibility(i);
       this.j.setVisibility(i);
       tb = this.c;
       if (tb == null) {
          a.S("loadingView");
       }
       tb.setVisibility(4);
       tb = this.d;
       if (tb == null) {
          a.S("errorView");
       }
       tb.setVisibility(4);
       return;
    }
    public final void g(PainterModel p0,ImmerseSharePanelFragment p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f1.class, "14")) {
          return;
       }
       a.p(p0, "painterModel");
       a.p(p1, "fragment");
       this.h = p0;
       String str = "kwaiPlayerKitView";
       if (this.b == null) {
          View view = this.itemView.findViewById(R.id.share_player);
          a.o(view, "itemView.findViewById\(R.id.share_player\)");
          this.b = view;
          view = this.itemView.findViewById(R.id.share_player_loading);
          a.o(view, "itemView.findViewById\(R.id.share_player_loading\)");
          this.c = view;
          view = this.itemView.findViewById(R.id.share_player_error);
          a.o(view, "itemView.findViewById\(R.id.share_player_error\)");
          this.d = view;
          view = this.itemView.findViewById(R.id.share_player_retry_btn);
          a.o(view, "itemView.findViewById\(R.id.share_player_retry_btn\)");
          this.e = view;
          f1 tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.c();
          this.i.setOnClickListener(new f1$f(this));
          tb = this.e;
          if (tb == null) {
             a.S("retryView");
          }
          tb.setOnClickListener(new f1$g(this));
       }
       p0 = p0.mVideoContent;
       int i = 0;
       if (p0 != null) {
          PainterModel$VideoContent mQPhotoJsonE = p0.mQPhotoJsonElement;
          if (mQPhotoJsonE != null) {
             JsonArray obj = a.a.c(mQPhotoJsonE, QPhoto.class);
             a.o(obj, "Gsons.KWAI_GSON.fromJson¡­Json, QPhoto::class.java\)");
             this.f = obj;
             obj = mQPhotoJsonE.r().g0("cover_thumbnail_urls");
             if (obj != null && obj.size() > 0) {
                JsonElement jsonElement = obj.e0(i);
                if (jsonElement != null) {
                   jsonElement = jsonElement.r().e0("url");
                   if (jsonElement != null) {
                      str1 = jsonElement.w();
                      if (str1 != null) {
                      label_00cd :
                         this.g = str1;
                      }
                   }
                }
                str1 = "";
                goto label_00cd ;
             }
             f1 tb1 = this.b;
             if (tb1 == null) {
                a.S(str);
             }
             mQPhotoJsonE = Result.constructor-impl(Boolean.valueOf(tb1.post(new f1$e(mQPhotoJsonE, this))));
             Result.box-impl(mQPhotoJsonE);
          }
       }
       ViewGroup viewGroup = this.itemView.findViewById(R.id.poster_layout);
       str = "itemView";
       if (viewGroup != null) {
          RecyclerView$ViewHolder titemView = this.itemView;
          a.o(titemView, str);
          RecyclerView$ViewHolder titemView1 = this.itemView;
          a.o(titemView1, str);
          viewGroup.setPadding(n.c(titemView.getContext(), 18.00f), i, n.c(titemView1.getContext(), 18.00f), i);
       }
       IConfig iConfig = c.b(this.j);
       iConfig.a(ImageRequest$CacheChoice.DEFAULT);
       iConfig.y(IConfig$CacheType.NO_DISK_CACHE);
       RecyclerView$ViewHolder titemView2 = this.itemView;
       a.o(titemView2, str);
       iConfig.D(new ColorDrawable(titemView2.getResources().getColor(R.color.arg_RES_7f060bd7)));
       titemView2 = this.itemView;
       a.o(titemView2, str);
       iConfig.e(new ColorDrawable(titemView2.getResources().getColor(R.color.arg_RES_7f060bd7)));
       iConfig.j(t$b.i);
       iConfig.load(this.g).b();
       this.i.setVisibility(i);
       this.j.setVisibility(i);
       f1 tc = this.c;
       if (tc == null) {
          a.S("loadingView");
       }
       tc.setVisibility(4);
       tc = this.d;
       if (tc == null) {
          a.S("errorView");
       }
       tc.setVisibility(4);
       this.k = true;
       return;
    }
    public void onPageSelected(int p0){
       f1 uof1 = f1.class;
       if (PatchProxy.isSupport(uof1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof1, "15")) {
          return;
       }
       f1 th = this.h;
       if (th != null) {
          if (th == null) {
             a.S("painterModel");
          }
          PainterModel mVideoConten = th.mVideoContent;
          String str = null;
          PainterModel$VideoContent autoPlay = (mVideoConten != null)? mVideoConten.autoPlay: null;
          String str1 = "errorView";
          String str2 = "loadingView";
          int i = 4;
          if (autoPlay != null) {
             this.e();
             th = this.b;
             if (th == null) {
                a.S("kwaiPlayerKitView");
             }
             a uoa = th.getPlayerKitContext().e(a.class);
             if (uoa != null) {
                IWaynePlayer player = uoa.getPlayer();
                if (player != null) {
                   player.play();
                }
             }
             this.i.setVisibility(i);
             this.j.setVisibility(i);
             th = this.c;
             if (th == null) {
                a.S(str2);
             }
             th.setVisibility(i);
             th = this.d;
             if (th == null) {
                a.S(str1);
             }
             th.setVisibility(i);
          }else {
             this.i.setVisibility(str);
             this.j.setVisibility(str);
             th = this.c;
             if (th == null) {
                a.S(str2);
             }
             th.setVisibility(i);
             th = this.d;
             if (th == null) {
                a.S(str1);
             }
             th.setVisibility(i);
          }
       }
       IConfig iConfig = c.b(this.j);
       iConfig.a(ImageRequest$CacheChoice.DEFAULT);
       iConfig.y(IConfig$CacheType.NO_DISK_CACHE);
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       iConfig.D(new ColorDrawable(titemView.getResources().getColor(R.color.arg_RES_7f060bd7)));
       titemView = this.itemView;
       a.o(titemView, "itemView");
       iConfig.e(new ColorDrawable(titemView.getResources().getColor(R.color.arg_RES_7f060bd7)));
       iConfig.j(t$b.i);
       iConfig.load(this.g).b();
       this.itemView.invalidate();
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, f1.class, "19")) {
          return;
       }
       f1 tb = this.b;
       if (tb != null) {
          if (tb == null) {
             a.S("kwaiPlayerKitView");
          }
          tb.release();
       }
       int i = 0;
       this.i.setVisibility(i);
       this.j.setVisibility(i);
       tb = this.c;
       if (tb == null) {
          a.S("loadingView");
       }
       tb.setVisibility(4);
       tb = this.d;
       if (tb == null) {
          a.S("errorView");
       }
       tb.setVisibility(4);
       return;
    }
}
