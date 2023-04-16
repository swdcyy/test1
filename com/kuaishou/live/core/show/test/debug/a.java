package com.kuaishou.live.core.show.test.debug.a;
import erd.g;
import com.kuaishou.live.core.show.test.debug.b;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.f;
import com.kuaishou.live.core.show.test.debug.b$c;
import jl2.a;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.k;
import tj3.e;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import elb.e;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.LivePlayerUtils;
import java.util.Locale;
import wkd.b;
import kka.h;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;

public final class a implements g	// class@00119f
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b$c b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, b.class, "5")) {
       }else {
          p0 = tb.w;
          if (f.h()) {
             if (tb.p == null) {
                p0 = new b$c(tb);
                tb.p = p0;
                p0.a();
                p0 = tb.z;
                if (p0 != null) {
                   tb.X7(p0.subscribe(new a(tb)));
                }
             }else if(p0 != null && p0.getLiveMediaPlayer() != tb.r){
                tb.p.b();
                tb.p.a();
             }
             p0 = tb.p;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, b$c.class, "3")) {
                b = p0.b;
                b w = b.w;
                k ok = b.x.x();
                w.getCurrentPlayUrlInfo().getDnsResolvedUrl();
                Locale uS = Locale.US;
                Object[] objArray1 = new Object[]{Long.valueOf(p0.b.s)};
                Object[] objArray2 = new Object[]{Long.valueOf(p0.b.u)};
                p0.a.a("ip:"+LivePlayerUtils.getServerAddress(w.getLiveMediaPlayer())+"\n"+"HttpDns: "+ok.Q()+" -> "+ok.S()+" -> "+ok.R()+"\n"+"View创建到StartPlayApi回调:"+String.format(uS, "%d", objArray1)+"ms\n"+"PlayerPrepare时间:"+String.format(uS, "%d", objArray2)+"ms\n"+"是否免流量: "+w.getCurrentPlayUrlInfo().isFreeTraffic()+"\n"+"currentFreeTrafficType: "+b.a(-1592356291).b()+"\n"+"用户体感首屏耗时: "+ok.L()+"ms"+"\n"+"重试次数: "+w.getTotalRetryCount()+"\n"+"时间: "+""+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS", Locale.CHINA).format(new Date()), "Gif", 8);
             }
          }
       }
       return;
    }
}
