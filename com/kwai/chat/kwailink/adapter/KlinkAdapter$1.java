package com.kwai.chat.kwailink.adapter.KlinkAdapter$1;
import com.kwai.link.IKlinkOnlineListener;
import com.kwai.chat.kwailink.adapter.KlinkAdapter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.chat.kwailink.base.b;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.adapter.s;
import java.lang.Runnable;
import java.lang.Long;
import q75.b;
import e85.a;

public class KlinkAdapter$1 implements IKlinkOnlineListener	// class@000a03
{
    public final KlinkAdapter this$0;

    public void KlinkAdapter$1(KlinkAdapter p0){
       this.this$0 = p0;
       super();
    }
    public void OnAppIdUpdated(int p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "7")) {
          return;
       }
       b.k(p0);
       u1 = this.this$0;
       Objects.requireNonNull(u1);
       if (!PatchProxy.isSupport(KlinkAdapter.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), u1, KlinkAdapter.class, "5")) {
          u1.R1().execute(new s(p0));
       }
       return;
    }
    public void OnKConfUpdated(long p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, u1, "10")) {
          return;
       }
       u1 = this.this$0;
       Objects.requireNonNull(u1);
       if (!PatchProxy.isSupport(KlinkAdapter.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), u1, KlinkAdapter.class, "11")) {
          u1.j = Long.valueOf(p0);
          u1.L1(p0);
       }
       return;
    }
    public void OnLoginFailed(int p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "3")) {
          return;
       }
       this.this$0.M1(p0);
       return;
    }
    public void OnOffline(int p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "2")) {
          return;
       }
       this.this$0.O1(0);
       return;
    }
    public void OnOnline(){
       if (PatchProxy.applyVoid(null, this, KlinkAdapter$1.class, "1")) {
          return;
       }
       this.this$0.O1(2);
       return;
    }
    public void OnPushTokenReady(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter$1.class, "8")) {
          return;
       }
       KlinkAdapter$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, KlinkAdapter.class, "6")) {
          tthis$0.h = p0;
          tthis$0.N1(p0);
       }
       return;
    }
    public void OnRaceBegin(){
       if (PatchProxy.applyVoid(null, this, KlinkAdapter$1.class, "4")) {
          return;
       }
       this.this$0.O1(1);
       return;
    }
    public void OnRaceEnd(int p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "5")) {
          return;
       }
       u1 = this.this$0;
       int i = (!p0)? 2: 0;
       u1.O1(i);
       this.this$0.M1(p0);
       return;
    }
    public void OnServerTimeUpdated(long p0){
       KlinkAdapter$1 u1 = KlinkAdapter$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, u1, "9")) {
          return;
       }
       u1 = this.this$0;
       Objects.requireNonNull(u1);
       if (!PatchProxy.isSupport(KlinkAdapter.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), u1, KlinkAdapter.class, "9")) {
          u1.i = Long.valueOf(p0);
          _monitor_enter(b.class);
          if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, b.class, "9")) {
             _monitor_exit(b.class);
          }else if(p0 - b.c){
             b.c = p0;
             b.a.e("server_client_time_offset", p0);
          }
          _monitor_exit(b.class);
          u1.Q1(p0);
       }
       return;
    }
    public void OnShutdown(){
       if (PatchProxy.applyVoid(null, this, KlinkAdapter$1.class, "6")) {
          return;
       }
       this.this$0.O1(0);
       return;
    }
}
