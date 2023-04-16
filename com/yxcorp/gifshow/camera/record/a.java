package com.yxcorp.gifshow.camera.record.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import lnc.s6;
import qs5.d;
import tkd.b;
import tkd.d;
import ng9.e;
import r16.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import r16.d;
import qb9.b;
import ekd.k1;

public final class a implements Runnable	// class@001c9a
{
    public final CameraActivity b;

    public void a(CameraActivity p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       if (tb.isFinishing()) {
       }else {
          tb.N3();
          tb.setVolumeControlStream(3);
          String[] stringArray = new String[]{"visionengine","ar","mmu","audio_recognition","ykit_module","ycnn_pre"};
          List list = Arrays.asList(stringArray);
          PluginDownloadExtension k = PluginDownloadExtension.k;
          int i = 40;
          k.t(list, i);
          Dva.instance().getPluginInstallManager().k(list);
          if (!s6.A()) {
             k.s("record_ktv", i);
          }
          Dva.instance().getPluginInstallManager().j("record_ktv");
          d.g("live_anchor_plugin", 30);
          int i1 = 0x25e02757;
          if (d.a(i1).isAvailable()) {
             d.a(i1).V10("CameraActivity");
          }
          d.a(0x14d6f666).Y50(true, RequestTiming.DEFAULT);
          k1.r(new b(tb), 500);
       }
       return;
    }
}
