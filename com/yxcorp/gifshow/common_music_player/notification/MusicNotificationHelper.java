package com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper;
import rm9.a;
import android.content.Context;
import nsd.u;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import npb.c;
import kob.r;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper$MusicNotificationBroadcastReceiver;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Long;

public final class MusicNotificationHelper extends a	// class@001195
{
    public r k;
    public MusicNotificationHelper$MusicNotificationBroadcastReceiver l;

    public void MusicNotificationHelper(){
       super(null, 1, null);
    }
    public Music e(){
       Object[] objArray = null;
       MusicNotificationHelper obj = PatchProxy.apply(objArray, this, MusicNotificationHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj != null) {
          c current = obj.getCurrent();
          if (current != null) {
             objArray = current.c();
          }
       }
       return objArray;
    }
    public BroadcastReceiver h(){
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = new MusicNotificationHelper$MusicNotificationBroadcastReceiver();
       }
       obj = this.l;
       a.m(obj);
       return obj;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "6")) {
          return;
       }
       this.k = d.a(-1687636538);
       super.j();
       return;
    }
    public boolean k(){
       boolean b = (this.k != null)? true: false;
       return b;
    }
    public long l(){
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.k;
       long currentPosit = (obj != null)? obj.getCurrentPosition(): 0;
       return currentPosit;
    }
    public boolean m(){
       MusicNotificationHelper obj = PatchProxy.apply(null, this, MusicNotificationHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null || obj.isPlaying() != b) {
          b = false;
       }
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "3")) {
          return;
       }
       MusicNotificationHelper tk = this.k;
       if (tk != null && tk.isPlaying() == true) {
          tk = this.k;
          if (tk != null) {
             tk.pause();
          }
       }else {
          tk = this.k;
          if (tk != null) {
             tk.start();
          }
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "4")) {
          return;
       }
       MusicNotificationHelper tk = this.k;
       if (tk != null) {
          tk.next();
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "2")) {
          return;
       }
       MusicNotificationHelper tk = this.k;
       if (tk != null) {
          tk.pause();
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "1")) {
          return;
       }
       MusicNotificationHelper tk = this.k;
       if (tk != null) {
          tk.start();
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, MusicNotificationHelper.class, "5")) {
          return;
       }
       MusicNotificationHelper tk = this.k;
       if (tk != null) {
          tk.previous();
       }
       return;
    }
    public void s(long p0){
       MusicNotificationHelper musicNotific = MusicNotificationHelper.class;
       if (PatchProxy.isSupport(musicNotific) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, musicNotific, "7")) {
          return;
       }
       musicNotific = this.k;
       if (musicNotific != null) {
          musicNotific.seekTo(p0);
       }
       return;
    }
}
