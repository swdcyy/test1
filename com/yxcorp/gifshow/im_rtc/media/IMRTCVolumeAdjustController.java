package com.yxcorp.gifshow.im_rtc.media.IMRTCVolumeAdjustController;
import cxa.m;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.media.AudioManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import dc5.c;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.yxcorp.gifshow.im_rtc.media.IMRTCVolumeAdjustController$VolumeChangedReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import cxa.l;

public class IMRTCVolumeAdjustController implements m	// class@001931
{
    public final AudioManager a;
    public BroadcastReceiver b;
    public int c;
    public boolean d;

    public void IMRTCVolumeAdjustController(){
       super();
       this.a = a.a().a().getSystemService("audio");
       this.c = -1;
       this.d = false;
    }
    public void a(int p0){
       IMRTCVolumeAdjustController iMRTCVolumeA = IMRTCVolumeAdjustController.class;
       if (PatchProxy.isSupport(iMRTCVolumeA) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, iMRTCVolumeA, "2")) {
          return;
       }
       this.g();
       if (this.c <= null) {
          return;
       }
       int i = 3;
       p0 = this.a.getStreamVolume(i);
       String str = "IMRTCVolume";
       c.g(str, "current musicVolume = "+p0);
       if (this.d != null) {
          c.g(str, "user has set musicVolume to "+p0);
       }else {
          c.g(str, "musicVolume = "+p0+", revert to "+this.c);
          this.a.setStreamVolume(i, this.c, 4);
       }
       this.c = -1;
       return;
    }
    public void b(int p0){
       IMRTCVolumeAdjustController iMRTCVolumeA = IMRTCVolumeAdjustController.class;
       if (PatchProxy.isSupport(iMRTCVolumeA) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, iMRTCVolumeA, "1")) {
          return;
       }
       int i = 3;
       p0 = this.a.getStreamVolume(i);
       this.c = p0;
       if (p0 <= 0) {
          return;
       }
       double d = (IMConfigUtil.t() > 0)? IMConfigUtil.t(): 0x3fe5555560000000;
       p0 = (int)((double)this.c * d);
       if (p0 < 1) {
          p0 = 1;
       }
       c.g("IMRTCVolume", "musicVolume = "+this.c+", set to "+p0);
       this.a.setStreamVolume(i, p0, 4);
       this.d = false;
       this.g();
       this.b = new IMRTCVolumeAdjustController$VolumeChangedReceiver(this);
       UniversalReceiver.e(a.a().a(), this.b, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
       return;
    }
    public void c(int p0){
       l.f(this, p0);
    }
    public void d(){
       l.b(this);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, IMRTCVolumeAdjustController.class, "3")) {
          return;
       }
       this.g();
       return;
    }
    public void e(){
       l.a(this);
    }
    public void f(int p0){
       l.d(this, p0);
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, IMRTCVolumeAdjustController.class, "4")) {
          return;
       }
       if (this.b != null) {
          UniversalReceiver.f(a.a().a(), this.b);
          this.b = null;
       }
       return;
    }
}
