package com.kwai.link.Klink$KlinkOnlineListenerWrapper;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.link.IKlinkOnlineListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;

public class Klink$KlinkOnlineListenerWrapper	// class@000ad9
{
    public final int mID;
    public final IKlinkOnlineListener mListener;
    public static final AtomicInteger UNIQUE_ID;

    static {
       Klink$KlinkOnlineListenerWrapper.UNIQUE_ID = new AtomicInteger(0);
    }
    public void Klink$KlinkOnlineListenerWrapper(IKlinkOnlineListener p0){
       super();
       this.mID = Klink$KlinkOnlineListenerWrapper.UNIQUE_ID.incrementAndGet();
       this.mListener = p0;
    }
    public void OnAppIdUpdated(int p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, klinkOnlineL, "7")) {
          return;
       }
       this.mListener.OnAppIdUpdated(p0);
       return;
    }
    public void OnKConfUpdated(long p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, klinkOnlineL, "10")) {
          return;
       }
       this.mListener.OnKConfUpdated(p0);
       return;
    }
    public void OnLoginFailed(int p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, klinkOnlineL, "3")) {
          return;
       }
       this.mListener.OnLoginFailed(p0);
       return;
    }
    public void OnOffline(int p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, klinkOnlineL, "2")) {
          return;
       }
       this.mListener.OnOffline(p0);
       return;
    }
    public void OnOnline(){
       if (PatchProxy.applyVoid(null, this, Klink$KlinkOnlineListenerWrapper.class, "1")) {
          return;
       }
       this.mListener.OnOnline();
       return;
    }
    public void OnPushTokenReady(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink$KlinkOnlineListenerWrapper.class, "8")) {
          return;
       }
       this.mListener.OnPushTokenReady(p0);
       return;
    }
    public void OnRaceBegin(){
       if (PatchProxy.applyVoid(null, this, Klink$KlinkOnlineListenerWrapper.class, "4")) {
          return;
       }
       this.mListener.OnRaceBegin();
       return;
    }
    public void OnRaceEnd(int p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, klinkOnlineL, "5")) {
          return;
       }
       this.mListener.OnRaceEnd(p0);
       return;
    }
    public void OnServerTimeUpdated(long p0){
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = Klink$KlinkOnlineListenerWrapper.class;
       if (PatchProxy.isSupport(klinkOnlineL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, klinkOnlineL, "9")) {
          return;
       }
       this.mListener.OnServerTimeUpdated(p0);
       return;
    }
    public void OnShutdown(){
       if (PatchProxy.applyVoid(null, this, Klink$KlinkOnlineListenerWrapper.class, "6")) {
          return;
       }
       this.mListener.OnShutdown();
       return;
    }
    public int getID(){
       return this.mID;
    }
}
