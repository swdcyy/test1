package com.kwai.player.network.KwaiNetworkMonitor;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.player.network.KwaiNetworkMonitor$a;
import com.kwai.player.network.KwaiNetworkMonitor$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.AssertionError;
import android.content.Context;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect;
import com.kwai.robust.PatchProxyResult;
import com.kwai.player.network.KwaiNetworkMonitor$b;
import com.kwai.player.network.IKwaiNetwork;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$e;
import java.lang.Number;
import java.util.List;
import java.util.Collection;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$c;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$ConnectionType;
import java.util.Iterator;
import java.lang.Long;
import com.kwai.player.network.KwaiNetworkMonitor$d;
import java.util.Objects;
import com.kwai.player.network.KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class KwaiNetworkMonitor	// class@0012ef
{
    public KwaiNetworkMonitorAutoDetect autoDetect;
    public final Object autoDetectLock;
    public final ArrayList nativeNetworkObservers;
    public final ArrayList networkObservers;
    public int numObservers;
    public static final String TAG = "NetworkMonitor";

    public void KwaiNetworkMonitor(){
       super();
       this.autoDetectLock = new Object();
       this.nativeNetworkObservers = new ArrayList();
       this.networkObservers = new ArrayList();
       this.numObservers = 0;
    }
    public void KwaiNetworkMonitor(KwaiNetworkMonitor$a p0){
       super();
    }
    public static void addNetworkObserver(KwaiNetworkMonitor$e p0){
       KwaiNetworkMonitor.getInstance().addObserver(p0);
    }
    public static void assertIsTrue(boolean p0){
       KwaiNetworkMonitor kwaiNetworkM = KwaiNetworkMonitor.class;
       if (PatchProxy.isSupport(kwaiNetworkM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kwaiNetworkM, "1")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new AssertionError("Expected to be true");
    }
    public static KwaiNetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context p0){
       KwaiNetworkMonitor obj = PatchProxy.applyOneRefs(p0, null, KwaiNetworkMonitor.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiNetworkMonitor.getInstance();
       KwaiNetworkMonitorAutoDetect kwaiNetworkM = obj.createAutoDetect(p0);
       obj.autoDetect = kwaiNetworkM;
       return kwaiNetworkM;
    }
    public static KwaiNetworkMonitor getInstance(){
       return KwaiNetworkMonitor$b.a;
    }
    public static IKwaiNetwork getNetwork(){
       Object obj = PatchProxy.apply(null, null, KwaiNetworkMonitor.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiNetworkMonitor.getInstance().snapshotNetworkInfos();
    }
    public static void init(Context p0){
    }
    public static void removeNetworkObserver(KwaiNetworkMonitor$e p0){
       KwaiNetworkMonitor.getInstance().removeObserver(p0);
    }
    public void addObserver(KwaiNetworkMonitor$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "13")) {
          return;
       }
       KwaiNetworkMonitor tnetworkObse = this.networkObservers;
       _monitor_enter(tnetworkObse);
       this.networkObservers.add(p0);
       _monitor_exit(tnetworkObse);
       return;
    }
    public final KwaiNetworkMonitorAutoDetect createAutoDetect(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiNetworkMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiNetworkMonitorAutoDetect(new KwaiNetworkMonitor$a(this), p0);
    }
    public long getCurrentDefaultNetId(){
       KwaiNetworkMonitor obj = PatchProxy.apply(null, this, KwaiNetworkMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.autoDetectLock;
       _monitor_enter(obj);
       KwaiNetworkMonitor tautoDetect = this.autoDetect;
       long l = (tautoDetect == null)? -1: tautoDetect.d();
       _monitor_exit(obj);
       return l;
    }
    public final List getNativeNetworkObserversSync(){
       KwaiNetworkMonitor obj = PatchProxy.apply(null, this, KwaiNetworkMonitor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.nativeNetworkObservers;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return new ArrayList(this.nativeNetworkObservers);
    }
    public KwaiNetworkMonitorAutoDetect getNetworkMonitorAutoDetect(){
       KwaiNetworkMonitor tautoDetectL = this.autoDetectLock;
       _monitor_enter(tautoDetectL);
       _monitor_exit(tautoDetectL);
       return this.autoDetect;
    }
    public int getNumObservers(){
       KwaiNetworkMonitor tautoDetectL = this.autoDetectLock;
       _monitor_enter(tautoDetectL);
       _monitor_exit(tautoDetectL);
       return this.numObservers;
    }
    public final void nativeNotifyConnectionTypeChanged(long p0){
    }
    public final void nativeNotifyOfActiveNetworkList(long p0,KwaiNetworkMonitorAutoDetect$c[] p1){
    }
    public final void nativeNotifyOfNetworkConnect(long p0,KwaiNetworkMonitorAutoDetect$c p1){
    }
    public final void nativeNotifyOfNetworkDisconnect(long p0,long p1){
    }
    public final void notifyObserversOfConnectionTypeChange(KwaiNetworkMonitorAutoDetect$ConnectionType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "8")) {
          return;
       }
       Iterator iterator = this.getNativeNetworkObserversSync().iterator();
       while (iterator.hasNext()) {
          this.nativeNotifyConnectionTypeChanged(iterator.next().longValue());
       }
       KwaiNetworkMonitor tnetworkObse = this.networkObservers;
       _monitor_enter(tnetworkObse);
       _monitor_exit(tnetworkObse);
       iterator = new ArrayList(this.networkObservers).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void notifyObserversOfNetworkConnect(KwaiNetworkMonitorAutoDetect$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "9")) {
          return;
       }
       Iterator iterator = this.getNativeNetworkObserversSync().iterator();
       while (iterator.hasNext()) {
          this.nativeNotifyOfNetworkConnect(iterator.next().longValue(), p0);
       }
       return;
    }
    public void notifyObserversOfNetworkDisconnect(long p0){
       KwaiNetworkMonitor kwaiNetworkM = KwaiNetworkMonitor.class;
       if (PatchProxy.isSupport(kwaiNetworkM) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiNetworkM, "10")) {
          return;
       }
       Iterator iterator = this.getNativeNetworkObserversSync().iterator();
       while (iterator.hasNext()) {
          this.nativeNotifyOfNetworkDisconnect(iterator.next().longValue(), p0);
       }
       return;
    }
    public void removeObserver(KwaiNetworkMonitor$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "14")) {
          return;
       }
       KwaiNetworkMonitor tnetworkObse = this.networkObservers;
       _monitor_enter(tnetworkObse);
       this.networkObservers.remove(p0);
       _monitor_exit(tnetworkObse);
       return;
    }
    public final IKwaiNetwork snapshotNetworkInfos(){
       Object[] objArray = null;
       KwaiNetworkMonitor obj = PatchProxy.apply(objArray, this, KwaiNetworkMonitor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.autoDetectLock;
       _monitor_enter(obj);
       KwaiNetworkMonitor tautoDetect = this.autoDetect;
       if (tautoDetect != null) {
          objArray = tautoDetect.a();
       }
       _monitor_exit(obj);
       return new KwaiNetworkMonitor$d(objArray);
    }
    public void startMonitoring(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "2")) {
          return;
       }
       KwaiNetworkMonitor tautoDetectL = this.autoDetectLock;
       _monitor_enter(tautoDetectL);
       this.numObservers = this.numObservers + 1;
       if (this.autoDetect == null) {
          this.autoDetect = this.createAutoDetect(p0);
       }
       _monitor_exit(tautoDetectL);
       return;
    }
    public void stopMonitoring(){
       if (PatchProxy.applyVoid(null, this, KwaiNetworkMonitor.class, "3")) {
          return;
       }
       KwaiNetworkMonitor tautoDetectL = this.autoDetectLock;
       _monitor_enter(tautoDetectL);
       int i = this.numObservers - 1;
       this.numObservers = i;
       if (!i) {
          KwaiNetworkMonitor tautoDetect = this.autoDetect;
          Objects.requireNonNull(tautoDetect);
          if (!PatchProxy.applyVoid(null, tautoDetect, KwaiNetworkMonitorAutoDetect.class, "3")) {
             KwaiNetworkMonitorAutoDetect d = tautoDetect.d;
             if (d != null) {
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(null, d, KwaiNetworkMonitorAutoDetect$WifiDirectManagerDelegate.class, "2")) {
                   UniversalReceiver.f(d.a, d);
                }
             }
          }
          this.autoDetect = null;
       }
       _monitor_exit(tautoDetectL);
       return;
    }
    public void updateCurrentConnectionType(KwaiNetworkMonitorAutoDetect$ConnectionType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiNetworkMonitor.class, "7")) {
          return;
       }
       this.notifyObserversOfConnectionTypeChange(p0);
       return;
    }
    public final void updateObserverActiveNetworkList(long p0){
       KwaiNetworkMonitor kwaiNetworkM = KwaiNetworkMonitor.class;
       if (PatchProxy.isSupport(kwaiNetworkM) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiNetworkM, "11")) {
          return;
       }
       kwaiNetworkM = this.autoDetectLock;
       _monitor_enter(kwaiNetworkM);
       KwaiNetworkMonitor tautoDetect = this.autoDetect;
       List list = (tautoDetect == null)? null: tautoDetect.a();
       _monitor_exit(kwaiNetworkM);
       if (list != null && list.size()) {
          KwaiNetworkMonitorAutoDetect$c[] uocArray = new KwaiNetworkMonitorAutoDetect$c[list.size()];
          this.nativeNotifyOfActiveNetworkList(p0, list.toArray(uocArray));
       }
       return;
    }
}
