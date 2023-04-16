package com.kuaishou.android.live.doublelist.danmaku.h$b;
import t99.y;
import com.kuaishou.android.live.doublelist.danmaku.h;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import xl8.b;
import java.lang.System;
import com.kuaishou.android.live.doublelist.danmaku.b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public class h$b implements y	// class@0007d2
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "4")) {
          return;
       }
       h$b tb = this.b;
       tb.k9(tb.y);
       this.b.y = 0;
       return;
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.b.v.d(Boolean.FALSE);
       this.b.y = System.currentTimeMillis();
       this.b.B.w();
       return;
    }
    public void onPlayerRetrieved(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       this.b.v.d(Boolean.TRUE);
       this.b.B.y();
       return;
    }
    public void onRenderStop(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "5")) {
          return;
       }
       h$b tb = this.b;
       if (tb.z != null) {
          tb.v.d(Boolean.FALSE);
       }
       tb = this.b;
       tb.z = false;
       tb.k9(tb.y);
       this.b.B.w();
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       x.k(this, p0, p1, p2);
    }
    public void onVideoStart(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "3")) {
          return;
       }
       h$b tb = this.b;
       if (tb.z == null) {
          tb.v.d(Boolean.TRUE);
       }
       this.b.y = System.currentTimeMillis();
       this.b.B.y();
       this.b.z = true;
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       x.m(this, p0);
    }
}
