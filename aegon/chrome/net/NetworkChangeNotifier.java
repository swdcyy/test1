package aegon.chrome.net.NetworkChangeNotifier;
import java.lang.Object;
import java.util.ArrayList;
import aegon.chrome.base.e;
import aegon.chrome.net.m;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$h;
import java.lang.Long;
import java.util.Iterator;
import aegon.chrome.net.NetworkChangeNotifier$c;
import aegon.chrome.net.j;
import K.S;
import aegon.chrome.base.e$a;
import aegon.chrome.net.NetworkChangeNotifier$b;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import android.net.Network;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$c;
import aegon.chrome.net.NetworkChangeNotifier$a;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$g;

public class NetworkChangeNotifier	// class@000071
{
    public final ArrayList a;
    public final e b;
    public NetworkChangeNotifierAutoDetect c;
    public int d;
    public static NetworkChangeNotifier e;
    public static final boolean f;

    public void NetworkChangeNotifier(){
       super();
       this.d = 0;
       this.a = new ArrayList();
       this.b = new e();
    }
    public static NetworkChangeNotifier a(){
       return NetworkChangeNotifier.e;
    }
    public static void fakeConnectionSubtypeChanged(int p0){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().b(p0);
    }
    public static void fakeDefaultNetwork(long p0,int p1){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().c(p1, p0);
    }
    public static void fakeNetworkConnected(long p0,int p1){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().d(p0, p1);
    }
    public static void fakeNetworkDisconnected(long p0){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().e(p0);
    }
    public static void fakeNetworkSoonToBeDisconnected(long p0){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().f(p0);
    }
    public static void fakePurgeActiveNetworkList(long[] p0){
       NetworkChangeNotifier.h(false);
       NetworkChangeNotifier.a().g(p0);
    }
    public static void forceConnectivityState(boolean p0){
       boolean b = false;
       NetworkChangeNotifier.h(b);
       NetworkChangeNotifier networkChang = NetworkChangeNotifier.a();
       boolean b1 = (networkChang.d != 6)? true: false;
       if (b1 != p0) {
          if (!p0) {
             b = 6;
          }
          networkChang.j(b);
          networkChang.b((p0 ^ 1));
       }
       return;
    }
    public static void h(boolean p0){
       NetworkChangeNotifier.a().i(p0, new m());
    }
    public static NetworkChangeNotifier init(){
       if (NetworkChangeNotifier.e == null) {
          NetworkChangeNotifier.e = new NetworkChangeNotifier();
       }
       return NetworkChangeNotifier.e;
    }
    public void addNativeObserver(long p0){
       this.a.add(Long.valueOf(p0));
    }
    public void b(int p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.Mt26m31j(iterator.next().longValue(), this, p0);
       }
       return;
    }
    public final void c(int p0,long p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.MbPIImnU(iterator.next().longValue(), this, p0, p1);
       }
       Iterator iterator1 = this.b.iterator();
       Iterator iterator2 = iterator1;
       while (iterator2.hasNext()) {
          iterator2.next().a(p0);
       }
       return;
    }
    public void d(long p0,int p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.MBT1i5cd(iterator.next().longValue(), this, p0, p1);
       }
       return;
    }
    public void e(long p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.MDpuHJTB(iterator.next().longValue(), this, p0);
       }
       return;
    }
    public void f(long p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.MiJIMrTb(iterator.next().longValue(), this, p0);
       }
       return;
    }
    public void g(long[] p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          j.g();
          S.MpF$179U(iterator.next().longValue(), this, p0);
       }
       return;
    }
    public int getCurrentConnectionSubtype(){
       int i = 0;
       NetworkChangeNotifier tc = this.c;
       if (tc == null) {
       }else {
          i = tc.f().a();
       }
       return i;
    }
    public int getCurrentConnectionType(){
       return this.d;
    }
    public long getCurrentDefaultNetId(){
       NetworkChangeNotifier tc = this.c;
       long l = -1;
       if (tc == null) {
       }else {
          Network network = tc.g.b();
          if (network != null) {
             l = NetworkChangeNotifierAutoDetect.g(network);
          }
       }
       return l;
    }
    public long[] getCurrentNetworksAndTypes(){
       long[] olongArray;
       NetworkChangeNotifier tc = this.c;
       int i = 0;
       if (tc == null) {
          olongArray = new long[i];
       }else {
          Network[] networkArray = NetworkChangeNotifierAutoDetect.e(tc.g, null);
          long[] olongArray1 = new long[(networkArray.length * 2)];
          int len = networkArray.length;
          int i1 = 0;
          for (; i < len; i = i + 1) {
             object oobject = networkArray[i];
             int i2 = i1 + 1;
             olongArray1[i1] = NetworkChangeNotifierAutoDetect.g(oobject);
             i1 = i2 + 1;
             olongArray1[i2] = (long)tc.g.a(oobject);
          }
          olongArray = olongArray1;
       }
       return olongArray;
    }
    public final void i(boolean p0,NetworkChangeNotifierAutoDetect$h p1){
       if (p0) {
          if (this.c == null) {
             NetworkChangeNotifierAutoDetect networkChang = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifier$a(this), p1);
             this.c = networkChang;
             NetworkChangeNotifierAutoDetect$f uof = networkChang.f();
             this.j(uof.b());
             this.b(uof.a());
          }
       }else {
          NetworkChangeNotifier tc = this.c;
          if (tc != null) {
             tc.a();
             tc.e.b();
             tc.j();
             this.c = null;
          }
       }
       return;
    }
    public void j(int p0){
       this.d = p0;
       this.c(p0, this.getCurrentDefaultNetId());
    }
    public boolean registerNetworkCallbackFailed(){
       NetworkChangeNotifier tc = this.c;
       boolean b = (tc == null)? false: tc.o;
       return b;
    }
    public void removeNativeObserver(long p0){
       this.a.remove(Long.valueOf(p0));
    }
}
