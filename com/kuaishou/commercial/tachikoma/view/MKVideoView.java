package com.kuaishou.commercial.tachikoma.view.MKVideoView;
import k00.d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.wayne.player.listeners.OnProgressChangeListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.commercial.tachikoma.view.a;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import px6.b;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.video.wayne.player.main.IPlayerListener;
import yx.j0;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import k00.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.CharSequence;
import java.lang.Math;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import ux6.d;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import nx6.b;
import com.kwai.video.wayne.player.main.RetryInfo;
import o56.c;
import o56.a;
import uv8.h1;
import e17.i;
import java.lang.Throwable;
import java.util.ArrayList;
import rx6.f;
import java.util.List;
import com.kuaishou.commercial.tachikoma.view.b;
import rx6.b;
import msd.l;
import nx6.a;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.commercial.tachikoma.view.MKVideoView$a;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public class MKVideoView extends FrameLayout implements d, IMediaPlayer$OnPreparedListener, OnStartListener, IMediaPlayer$OnVideoSizeChangedListener, OnProgressChangeListener, IMediaPlayer$OnInfoListener, OnPlayerLoadingChangedListener, OnPauseListener, IMediaPlayer$OnCompletionListener, OnWayneErrorListener	// class@00168e
{
    public int b;
    public int c;
    public IWaynePlayer d;
    public boolean e;
    public boolean f;
    public a g;
    public long h;
    public KwaiPlayerKitView i;
    public IMediaPlayer$OnCompletionListener j;
    public static final int k;

    public void MKVideoView(Context p0){
       super(p0, null);
    }
    public void MKVideoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MKVideoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 0;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, str)) {
       }else {
          this.setBackgroundColor(0xff000000);
          KwaiPlayerKitView kwaiPlayerKi = new KwaiPlayerKitView(p0);
          this.i = kwaiPlayerKi;
          kwaiPlayerKi.c();
          this.addView(this.i, new FrameLayout$LayoutParams(-1, -1));
          a uoa = new a(this.getContext(), this);
          this.g = uoa;
          a uoa1 = a.class;
          a uoa2 = PatchProxy.apply(null, uoa, uoa1, "3");
          if (uoa2 != PatchProxyResult.class) {
          }else {
             View view = uoa.b.getSystemService("layout_inflater").inflate(R.layout.arg_RES_7f0d0063, null);
             uoa.c = view;
             uoa.d = view.findViewById(0x7f0a2ac5);
             uoa.e = uoa.c.findViewById(0x7f0a0a2e);
             uoa.j = uoa.c.findViewById(0x7f0a0d47);
             uoa.f = uoa.c.findViewById(0x7f0a30dc);
             uoa.i = uoa.c.findViewById(0x7f0a0972);
             uoa.k = uoa.c.findViewById(0x7f0a30d9);
             uoa.n = uoa.c.findViewById(0x7f0a4497);
             uoa.o = uoa.c.findViewById(0x7f0a096e);
             uoa.p = uoa.c.findViewById(0x7f0a096d);
             uoa.k.n0(R.string.arg_RES_7f1007bc);
             if (!PatchProxy.applyVoid(null, uoa, uoa1, str)) {
                uoa.d.setOnSeekBarChangeListener(uoa.v);
                uoa.c.setOnClickListener(uoa.r);
                uoa.k.setOnClickListener(uoa.u);
                uoa.n.setOnClickListener(uoa.s);
                uoa.f.setOnClickListener(uoa.t);
             }
             uoa2 = uoa.c;
          }
          this.addView(uoa2);
       }
       return;
    }
    public boolean a(){
       return this.e;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "1")) {
          return;
       }
       a uoa = this.i.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          IWaynePlayer player = uoa.getPlayer();
          StringBuilder str = "initWaynePlayer  waynePlayer ";
          String str1 = (player == null)? "": player.toString();
          this.d(str+str1);
          if (player != this.d) {
             this.d = player;
             if (player != null) {
                this.e();
                this.d.setLooping(false);
                this.setMuted(this.e);
             }
             if (!PatchProxy.applyVoid(null, this, MKVideoView.class, "2")) {
                MKVideoView td = this.d;
                if (td != null) {
                   td.addOnPreparedListener(this);
                   this.d.addOnStartListener(this);
                   this.d.addOnVideoSizeChangedListener(this);
                   this.d.addOnVideoSizeChangedListener(this);
                   this.d.addOnProgressChangeListener(this);
                   this.d.addOnInfoListener(this);
                   this.d.addOnPlayerLoadingChangedListener(this);
                   this.d.addOnPreparedListener(this);
                   this.d.addOnPauseListener(this);
                   this.d.addOnStartListener(this);
                   this.d.addOnCompletionListener(this);
                   this.d.addOnWayneErrorListener(this);
                }
             }
          }
       }
    label_009d :
       return;
    }
    public final boolean c(){
       boolean b = true;
       if (this.d != null) {
          MKVideoView tb = this.b;
          if (tb != -1 && (tb != null && (tb != b && tb != 6))) {
          label_0013 :
             return b;
          }
       }
    label_0012 :
       b = false;
       goto label_0013 ;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("MKVideoView", p0, objArray);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "3")) {
          return;
       }
       MKVideoView td = this.d;
       if (td != null) {
          td.removeOnStartListener(this);
          this.d.removeOnPreparedListener(this);
          this.d.removeOnVideoSizeChangedListener(this);
          this.d.removeOnVideoSizeChangedListener(this);
          this.d.removeOnProgressChangeListener(this);
          this.d.removeOnInfoListener(this);
          this.d.removeOnPlayerLoadingChangedListener(this);
          this.d.removeOnPreparedListener(this);
          this.d.removeOnPauseListener(this);
          this.d.removeOnStartListener(this);
          this.d.removeOnCompletionListener(this);
          this.d.removeOnWayneErrorListener(this);
       }
       return;
    }
    public long getCurrentPosition(){
       MKVideoView obj = PatchProxy.apply(null, this, MKVideoView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       if (obj == null) {
          return 0;
       }
       return obj.getCurrentPosition();
    }
    public long getDuration(){
       MKVideoView obj = PatchProxy.apply(null, this, MKVideoView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       long duration = (obj != null)? obj.getDuration(): 0;
       return duration;
    }
    public final b getKitContext(){
       Object obj = PatchProxy.apply(null, this, MKVideoView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getPlayerKitContext();
    }
    public boolean isPlaying(){
       MKVideoView obj = PatchProxy.apply(null, this, MKVideoView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.isPlaying())? true: false;
       return b;
    }
    public void onChanged(boolean p0,LoadingType p1){
       if (PatchProxy.isSupport(MKVideoView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, MKVideoView.class, "22")) {
          return;
       }
       this.d("onChanged isLoading = "+p0+" loadingType = "+p1);
       return;
    }
    public void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "24")) {
          return;
       }
       this.b = 5;
       this.c = 5;
       MKVideoView tj = this.j;
       if (tj != null) {
          tj.onCompletion(p0);
       }
       MKVideoView tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, a.class, "1")) {
          if (tg.d()) {
             tg.a();
          }
          tg.e("show replay view");
          tg.o.setVisibility(0);
          tg.m = true;
          tg.p.setOnClickListener(new a(tg));
       }
       this.d("onCompletion  current position = "+this.getCurrentPosition());
       return;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(MKVideoView.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MKVideoView.class, "21");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.d("onInfo what = "+p1+" extra = "+p2);
       return false;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "23")) {
          return;
       }
       this.d("onPause");
       this.b = 4;
       return;
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "17")) {
          return;
       }
       this.b = 2;
       this.d("onPrepared");
       MKVideoView th = this.h;
       if (th) {
          this.seekTo(th);
       }
       if (this.f != null || this.c == 3) {
          this.start();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "18")) {
          return;
       }
       this.d("onStart");
       this.g.b();
       return;
    }
    public void onVideoProgressChanged(Long p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MKVideoView.class, "20")) {
          return;
       }
       MKVideoView tg = this.g;
       long l = p0.longValue();
       long l1 = p1.longValue();
       Objects.requireNonNull(tg);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Long.valueOf(l1), tg, uoa, "12") && tg.q != null)) {
          int i = (int)l1;
          tg.j.setText(tg.g(i));
          int i1 = (int)l;
          tg.e.setText(tg.g(i1));
          tg.d.setMax(Math.max(i, 0));
          tg.d.setProgress(Math.max(i1, 0));
       }
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(MKVideoView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MKVideoView.class, "19")) {
             return;
          }
       }
       DefaultFrameUiModule uDefaultFram = this.getKitContext().i(DefaultFrameUiModule.class);
       if (uDefaultFram == null) {
          return;
       }else {
          p3 = this.i.getWidth();
          p4 = this.i.getHeight();
          if (!p3 || !p4) {
             this.d("measuredWidth or measuredHeight is zero");
             return;
          }else if(!p1 || !p2){
             this.d("height or width is zero");
             return;
          }else {
             int i = (int)((float)p3 / (((float)p1 * 0x3f800000) / (float)p2));
             this.d("onVideoSizeChanged videoWidth: "+p1+"videoHeight: "+p2+" viewWidth: "+p3+" viewHeight: "+p4+" targetHeight = "+i);
             if (uDefaultFram.l() instanceof b) {
                uDefaultFram.l().c(p3, i);
             }
             return;
          }
       }
    }
    public void onWayneError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "25")) {
          return;
       }
       this.d("onError info = "+p0);
       this.b = -1;
       this.c = -1;
       this.g.a();
       this.g.c();
       if (a.a().c()) {
          h1.a.b("player error info : "+p0);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "8")) {
          return;
       }
       try{
          if (this.c() && this.d.isPlaying()) {
             this.d.pause();
             this.b = 4;
          }
          this.c = 4;
       }catch(java.lang.IllegalStateException e0){
          j0.b("MKVideoView", "pause error", e0);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "14")) {
          return;
       }
       String str = "release";
       try{
          this.d(str);
          this.e();
          MKVideoView td = this.d;
          if (td == null) {
             return;
          }else if(td.isPlaying()){
             this.d.pause();
          }
          this.i.release();
       }catch(java.lang.IllegalStateException e0){
          j0.b("MKVideoView", "release error", e0);
       }
          this.b = 6;
          this.c = 6;
          return;
    }
    public void restart(long p0){
       if (PatchProxy.isSupport(MKVideoView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, MKVideoView.class, "9")) {
          return;
       }
       MKVideoView td = this.d;
       if (td == null) {
          return;
       }
       td.restart(p0);
       return;
    }
    public void seekTo(long p0){
       if (PatchProxy.isSupport(MKVideoView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, MKVideoView.class, "12")) {
          return;
       }
       String str = "seekTo = "+p0;
       try{
          this.d(str);
          if (this.c()) {
             this.d.seekTo(p0);
             this.h = 0;
          }else {
             this.h = p0;
          }
       }catch(java.lang.IllegalStateException e0){
          j0.b("MKVideoView", "seekTo error "+p0, e0);
       }
       return;
    }
    public void setAutoPlay(boolean p0){
       this.f = p0;
    }
    public void setDataSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "5")) {
          return;
       }
       if (p0 == null || !p0.startsWith("http")) {
          this.d("video URL is null");
          return;
       }else {
          try{
             ArrayList uArrayList = new ArrayList(1);
             uArrayList.add(p0);
             f uof = new f(uArrayList, 1);
             this.i.g(uof, b.b);
             this.b();
          }catch(java.lang.Exception e3){
             j0.b("MKVideoView", "setDataSource error ", e3);
          }
          return;
       }
    }
    public void setMuted(boolean p0){
       if (PatchProxy.isSupport(MKVideoView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MKVideoView.class, "15")) {
          return;
       }
       this.e = p0;
       MKVideoView td = this.d;
       if (td == null) {
          return;
       }
       if (p0) {
          td.setVolume(0, 0);
       }else {
          td.setVolume(0x3f800000, 0x3f800000);
       }
       return;
    }
    public void setOnCompletionListener(IMediaPlayer$OnCompletionListener p0){
       this.j = p0;
    }
    public void setPoster(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView.class, "16")) {
          return;
       }
       if (p0 != null && p0.startsWith("http")) {
          this.d("setPoster : "+p0);
          a uoa = this.getKitContext().e(a.class);
          if (uoa != null) {
             uoa.m(true);
             a.a(uoa.getCover(), ImageRequestBuilder.k(Uri.parse(p0)).a(), null, new MKVideoView$a(this));
          }
       }
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, MKVideoView.class, "10")) {
          return;
       }
       if (this.c()) {
          try{
             this.d.start();
             this.b = 3;
          }catch(java.lang.IllegalStateException e0){
             j0.b("MKVideoView", "start error", e0);
          }
       }
    }
}
