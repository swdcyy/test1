package com.yxcorp.upgrade.impl.c;
import zjd.h;
import android.view.TextureView$SurfaceTextureListener;
import zjd.h$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import zjd.h$a;
import android.widget.TextView;
import zjd.d;
import akd.p;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import ag6.a;
import android.view.TextureView;
import android.widget.ImageView;
import akd.l;
import android.view.View$OnClickListener;
import akd.k;
import android.widget.ProgressBar;
import android.text.method.ScrollingMovementMethod;
import android.text.method.MovementMethod;
import android.os.Handler;
import android.os.Looper;
import bkd.b;
import java.lang.Integer;
import java.io.File;
import android.net.Uri;
import android.media.MediaPlayer;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.yxcorp.upgrade.impl.c$a;
import android.media.MediaPlayer$OnPreparedListener;
import com.yxcorp.upgrade.impl.c$b;
import android.media.MediaPlayer$OnErrorListener;
import akd.m;
import java.lang.Runnable;
import java.lang.Exception;

public class c implements h, TextureView$SurfaceTextureListener, h$b	// class@000993
{
    public FrameLayout b;
    public TextureView c;
    public ImageView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public ProgressBar j;
    public FrameLayout k;
    public FrameLayout l;
    public View m;
    public MediaPlayer n;
    public Handler o;
    public b p;
    public Uri q;
    public boolean r;
    public boolean s;
    public Activity t;
    public h$a u;

    public void c(){
       super();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c.class, "10")) {
          return;
       }
       this.u.f(this);
       int i = 0;
       if (p0) {
          this.r = true;
          this.h.setText(R.string.arg_RES_7f104f8a);
       }else {
          Activity uActivity = p.c().c();
          if (uActivity != null) {
             Toast.makeText(uActivity, uActivity.getResources().getString(R.string.arg_RES_7f100209), i).show();
          }
       }
       this.h.setVisibility(i);
       this.k.setVisibility(4);
       return;
    }
    public void b(){
    }
    public View c(Activity p0,LayoutInflater p1,h$a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.t = p0;
       View view = a.c(p1, R.layout.arg_RES_7f0d02cb, null, false);
       this.b = view.findViewById(0x7f0a0efd);
       this.c = view.findViewById(0x7f0a454e);
       this.d = view.findViewById(0x7f0a159f);
       ImageView imageView = view.findViewById(R.id.iv_close);
       this.e = imageView;
       imageView.setOnClickListener(new l(this));
       this.f = view.findViewById(0x7f0a42cc);
       this.g = view.findViewById(0x7f0a414d);
       TextView textView = view.findViewById(R.id.tv_upgrade_now);
       this.h = textView;
       textView.setOnClickListener(new k(this));
       this.i = view.findViewById(0x7f0a4169);
       this.j = view.findViewById(0x7f0a32f5);
       this.k = view.findViewById(0x7f0a0ef2);
       this.l = view.findViewById(0x7f0a0eef);
       this.m = view.findViewById(0x7f0a419f);
       this.g.setMovementMethod(new ScrollingMovementMethod());
       this.c.setSurfaceTextureListener(this);
       this.u = p2;
       this.o = new Handler(Looper.getMainLooper());
       this.s = false;
       return view;
    }
    public void d(b p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, c.class, "2")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       this.p = p0;
       this.f.setText(p0.d);
       this.g.setText(this.p.e);
       int i = 4;
       this.k.setVisibility(i);
       c tp = this.p;
       if (tp.b != null) {
          this.e.setVisibility(8);
          if (p1 == 1) {
             this.u.d(this);
             this.h.setVisibility(i);
             this.k.setVisibility(0);
          }else if(p1 == 2){
             this.r = true;
             this.h.setText(R.string.arg_RES_7f104f8a);
          }
       }else if(tp.c != null){
          this.h.setText(R.string.arg_RES_7f104f8b);
       }else {
          this.m.setVisibility(0);
          this.h.setText(R.string.arg_RES_7f104f92);
       }
       tp = this.p;
       if (tp.g != null) {
          tp = tp.h;
          if (tp == null || tp.isEmpty()) {
          label_00cd :
             this.c.setVisibility(8);
             this.d.setVisibility(0);
          }else {
             tp = this.p.g;
             if (tp == 1) {
                this.c.setVisibility(8);
                this.d.setVisibility(0);
                this.d.setImageURI(Uri.fromFile(new File(this.p.h)));
             }else if(tp == 2){
                this.c.setVisibility(0);
                this.d.setVisibility(8);
                this.q = Uri.fromFile(new File(this.p.h));
             }
          }
       }else {
          goto label_00cd ;
       }
       return;
    }
    public void e(int p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c.class, "9")) {
          return;
       }
       this.j.setProgress(p0);
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       this.i.setText(String.format("%d%%", objArray));
       if (p0 >= 50) {
          this.i.setTextColor(-1);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tn = this.n;
       if (tn != null) {
          tn.stop();
          this.n.setSurface(null);
          this.n.release();
          this.n = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.f();
       c tu = this.u;
       if (tu != null) {
          tu.f(this);
       }
       return;
    }
    public void onFragmentPause(){
       this.s = true;
    }
    public void onFragmentResume(){
       this.s = false;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "5")) {
          return;
       }
       try{
          MediaPlayer mediaPlayer = new MediaPlayer();
          this.n = mediaPlayer;
          mediaPlayer.setDataSource(this.t, this.q);
          this.n.setSurface(new Surface(p0));
          this.n.prepareAsync();
          this.n.setLooping(true);
          this.n.setOnPreparedListener(new c$a(this));
          this.n.setOnErrorListener(new c$b(this));
       }catch(java.lang.Exception e8){
          this.t.runOnUiThread(new m(this));
          e8.printStackTrace();
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.f();
       this.l.setVisibility(0);
       this.c.setVisibility(4);
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
