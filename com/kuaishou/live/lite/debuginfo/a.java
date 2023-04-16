package com.kuaishou.live.lite.debuginfo.a;
import erd.g;
import com.kuaishou.live.lite.debuginfo.c;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.f;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import xp5.g;
import wkd.b;
import kc6.b;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import o31.l;
import crd.a;
import pa3.a;
import com.gifshow.tuna.player.poi.e;
import crd.b;
import tj3.e;
import ga1.d;
import tj3.k;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import elb.e;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.LivePlayerUtils;
import java.util.Locale;
import kka.h;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class a implements g	// class@0008d0
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "2")) {
       }else if(f.h()){
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "4")) {
             LivePlayerController livePlayerCo = tb.V2();
             if (livePlayerCo != null && livePlayerCo.getLiveMediaPlayer() != tb.o) {
                tb.W2();
             }
             if (tb.s == null) {
                tb.s = i;
                if (tb.n != null && tb.V2() != null) {
                   tb.n.b(tb.V2().getLiveMediaPlayer());
                   String liveStreamId = tb.l.getLiveStreamId();
                   if (!PatchProxy.applyVoidOneRefs(liveStreamId, tb, p0, "8") && liveStreamId != null) {
                      c u = tb.u;
                      Objects.requireNonNull(u);
                      b.a(-885597376).b(liveStreamId).observeOn(a.c()).doOnSubscribe(new l(u)).subscribe(new a(tb, liveStreamId), e.b);
                   }
                }
                tb.o = tb.V2().getLiveMediaPlayer();
             }
          }
          if (!PatchProxy.applyVoid(objArray, tb, p0, "6")) {
             p0 = tb.V2();
             k ok = tb.m.a().x();
             p0.getCurrentPlayUrlInfo().getDnsResolvedUrl();
             Locale uS = Locale.US;
             Object[] objArray1 = new Object[i];
             objArray1[0] = Long.valueOf(tb.p);
             Object[] objArray2 = new Object[i];
             objArray2[0] = Long.valueOf(tb.r);
             tb.n.a("ip:"+LivePlayerUtils.getServerAddress(p0.getLiveMediaPlayer())+"\n"+"HttpDns: "+ok.Q()+" -> "+ok.S()+" -> "+ok.R()+"\n"+"View创建到StartPlayApi回调:"+String.format(uS, "%d", objArray1)+"ms\n"+"PlayerPrepare时间:"+String.format(uS, "%d", objArray2)+"ms\n"+"是否免流量: "+p0.getCurrentPlayUrlInfo().isFreeTraffic()+"\n"+"currentFreeTrafficType: "+b.a(-1592356291).b()+"\n"+"用户体感首屏耗时: "+ok.L()+"ms"+"\n"+"重试次数: "+p0.getTotalRetryCount()+"\n"+"时间: "+""+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS", Locale.CHINA).format(new Date()), "Gif", 8);
          }
       }else {
          tb.W2();
       }
       return;
    }
}
