package okhttp3.internal.connection.RouteSelector;
import okhttp3.Address;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.Call;
import okhttp3.EventListener;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.lang.String;
import java.net.InetAddress;
import okhttp3.Route;
import java.io.IOException;
import java.net.Proxy$Type;
import java.net.ProxySelector;
import java.net.URI;
import java.net.SocketAddress;
import okhttp3.internal.connection.RouteSelector$Selection;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.net.SocketException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import okhttp3.Dns;
import java.net.UnknownHostException;
import okhttp3.internal.Util;

public final class RouteSelector	// class@0020af
{
    public final Address address;
    public final Call call;
    public final EventListener eventListener;
    public List inetSocketAddresses;
    public int nextProxyIndex;
    public final List postponedRoutes;
    public List proxies;
    public final RouteDatabase routeDatabase;

    public void RouteSelector(Address p0,RouteDatabase p1,Call p2,EventListener p3){
       super();
       this.proxies = Collections.emptyList();
       this.inetSocketAddresses = Collections.emptyList();
       this.postponedRoutes = new ArrayList();
       this.address = p0;
       this.routeDatabase = p1;
       this.call = p2;
       this.eventListener = p3;
       this.resetNextProxy(p0.url(), p0.proxy());
    }
    public static String getHostString(InetSocketAddress p0){
       InetAddress address = p0.getAddress();
       if (address == null) {
          return p0.getHostName();
       }
       return address.getHostAddress();
    }
    public void connectFailed(Route p0,IOException p1){
       if (p0.proxy().type() != Proxy$Type.DIRECT && this.address.proxySelector() != null) {
          this.address.proxySelector().connectFailed(this.address.url().uri(), p0.proxy().address(), p1);
       }
       this.routeDatabase.failed(p0);
       return;
    }
    public boolean hasNext(){
       boolean b = (this.hasNextProxy() || !this.postponedRoutes.isEmpty())? true: false;
       return b;
    }
    public final boolean hasNextProxy(){
       boolean b = (this.nextProxyIndex < this.proxies.size())? true: false;
       return b;
    }
    public RouteSelector$Selection next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       ArrayList uArrayList = new ArrayList();
       while (true) {
          if (this.hasNextProxy()) {
             Proxy proxy = this.nextProxy();
             int i = 0;
             int i1 = this.inetSocketAddresses.size();
             while (i < i1) {
                Route route = new Route(this.address, proxy, this.inetSocketAddresses.get(i));
                if (this.routeDatabase.shouldPostpone(route)) {
                   this.postponedRoutes.add(route);
                }else {
                   uArrayList.add(route);
                }
                i = i + 1;
             }
             if (uArrayList.isEmpty()) {
                continue ;
             }
          }
          if (uArrayList.isEmpty()) {
             uArrayList.addAll(this.postponedRoutes);
             this.postponedRoutes.clear();
             break ;
          }
          break ;
       }
       return new RouteSelector$Selection(uArrayList);
    }
    public final Proxy nextProxy(){
       Proxy proxy;
       if (!this.hasNextProxy()) {
          throw new SocketException("No route to "+this.address.url().host()+"; exhausted proxy configurations: "+this.proxies);
       }
       RouteSelector tnextProxyIn = this.nextProxyIndex;
       this.nextProxyIndex = tnextProxyIn + 1;
       proxy = this.proxies.get(tnextProxyIn);
       this.resetNextInetSocketAddress(proxy);
       return proxy;
    }
    public final void resetNextInetSocketAddress(Proxy p0){
       String str;
       int i;
       this.inetSocketAddresses = new ArrayList();
       if (p0.type() == Proxy$Type.DIRECT || p0.type() == Proxy$Type.SOCKS) {
          str = this.address.url().host();
          i = this.address.url().port();
       }else {
          SocketAddress socketAddres = p0.address();
          if (socketAddres instanceof InetSocketAddress) {
             str = RouteSelector.getHostString(socketAddres);
             i = socketAddres.getPort();
          }else {
             throw new IllegalArgumentException("Proxy.address\(\) is not an InetSocketAddress: "+socketAddres.getClass());
          }
       }
       if (i >= 1 && i <= 0xffff) {
          if (p0.type() == Proxy$Type.SOCKS) {
             this.inetSocketAddresses.add(InetSocketAddress.createUnresolved(str, i));
          }else {
             this.eventListener.dnsStart(this.call, str);
             List list = this.address.dns().lookup(str);
             if (!list.isEmpty()) {
                this.eventListener.dnsEnd(this.call, str, list);
                int i2 = list.size();
                for (int i1 = 0; i1 < i2; i1 = i1 + 1) {
                   this.inetSocketAddresses.add(new InetSocketAddress(list.get(i1), i));
                }
             }else {
                throw new UnknownHostException(this.address.dns()+" returned no addresses for "+str);
             }
          }
          return;
       }else {
          throw new SocketException("No route to "+str+":"+i+"; port is out of range");
       }
    }
    public final void resetNextProxy(HttpUrl p0,Proxy p1){
       if (p1 != null) {
          this.proxies = Collections.singletonList(p1);
       }else {
          List list = this.address.proxySelector().select(p0.uri());
          if (list != null && !list.isEmpty()) {
             list = Util.immutableList(list);
          }else {
             Proxy[] proxyArray = new Proxy[]{Proxy.NO_PROXY};
             list = Util.immutableList(proxyArray);
          }
          this.proxies = list;
       }
       this.nextProxyIndex = 0;
       return;
    }
}
