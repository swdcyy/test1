package okhttp3.ConnectionPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;
import java.util.concurrent.BlockingQueue;
import java.lang.Object;
import okhttp3.ConnectionPool$1;
import java.util.ArrayDeque;
import okhttp3.internal.connection.RouteDatabase;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Deque;
import okhttp3.internal.connection.RealConnection;
import java.net.Socket;
import okhttp3.Address;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.Route;
import java.util.ArrayList;
import java.util.List;
import java.lang.ref.Reference;
import okhttp3.internal.connection.StreamAllocation$StreamAllocationReference;
import okhttp3.HttpUrl;
import okhttp3.internal.platform.Platform;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class ConnectionPool	// class@00206a
{
    public final Runnable cleanupRunnable;
    public boolean cleanupRunning;
    public final Deque connections;
    public final long keepAliveDurationNs;
    public final int maxIdleConnections;
    public final RouteDatabase routeDatabase;
    public static final boolean $assertionsDisabled;
    public static final Executor executor;

    static {
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
       ConnectionPool.executor = v8;
    }
    public void ConnectionPool(){
       super(5, 5, TimeUnit.MINUTES);
    }
    public void ConnectionPool(int p0,long p1,TimeUnit p2){
       super();
       this.cleanupRunnable = new ConnectionPool$1(this);
       this.connections = new ArrayDeque();
       this.routeDatabase = new RouteDatabase();
       this.maxIdleConnections = p0;
       this.keepAliveDurationNs = p2.toNanos(p1);
       if (p1 - null > 0) {
          return;
       }
       throw new IllegalArgumentException("keepAliveDuration <= 0: "+p1);
    }
    public long cleanup(long p0){
       _monitor_enter(this);
       Iterator iterator = this.connections.iterator();
       RealConnection realConnecti = null;
       long l = Long.MIN_VALUE;
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          RealConnection realConnecti1 = iterator.next();
          if (this.pruneAndGetAllocationCount(realConnecti1, p0) > 0) {
             i1 = i1 + 1;
          }else {
             i = i + 1;
             long l1 = p0 - realConnecti1.idleAtNanos;
             if (l1 - l > 0) {
                realConnecti = realConnecti1;
                l = l1;
             }
          }
       }
       ConnectionPool tkeepAliveDu = this.keepAliveDurationNs;
       if (l - tkeepAliveDu >= 0 || i > this.maxIdleConnections) {
          this.connections.remove(realConnecti);
          _monitor_exit(this);
          Util.closeQuietly(realConnecti.socket());
          return 0;
       }else if(i > 0){
          _monitor_exit(this);
          return (tkeepAliveDu - l);
       }else if(i1 > 0){
          _monitor_exit(this);
          return tkeepAliveDu;
       }else {
          this.cleanupRunning = false;
          _monitor_exit(this);
          return -1;
       }
    }
    public boolean connectionBecameIdle(RealConnection p0){
       if (p0.noNewStreams != null || this.maxIdleConnections == null) {
          this.connections.remove(p0);
          return true;
       }else {
          this.notifyAll();
          return false;
       }
    }
    public synchronized int connectionCount(){
       return this.connections.size();
    }
    public Socket deduplicate(Address p0,StreamAllocation p1){
       RealConnection realConnecti;
       Iterator iterator = this.connections.iterator();
       while (true) {
          Route route = null;
          if (!iterator.hasNext()) {
             return route;
          }
          realConnecti = iterator.next();
          if (realConnecti.isEligible(p0, route) && (realConnecti.isMultiplexed() && realConnecti != p1.connection())) {
             break ;
          }
       }
       return p1.releaseAndAcquire(realConnecti);
    }
    public void evictAll(){
       ArrayList uArrayList = new ArrayList();
       _monitor_enter(this);
       Iterator iterator = this.connections.iterator();
       while (iterator.hasNext()) {
          RealConnection realConnecti = iterator.next();
          if (realConnecti.allocations.isEmpty()) {
             realConnecti.noNewStreams = true;
             uArrayList.add(realConnecti);
             iterator.remove();
          }
       }
       _monitor_exit(this);
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          Util.closeQuietly(iterator1.next().socket());
       }
       return;
    }
    public RealConnection get(Address p0,StreamAllocation p1,Route p2){
       RealConnection realConnecti;
       Iterator iterator = this.connections.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          realConnecti = iterator.next();
          if (realConnecti.isEligible(p0, p2)) {
             break ;
          }
       }
       p1.acquire(realConnecti, true);
       return realConnecti;
    }
    public synchronized int idleConnectionCount(){
       int i = 0;
       Iterator iterator = this.connections.iterator();
       while (iterator.hasNext()) {
          if (iterator.next().allocations.isEmpty()) {
             i = i + 1;
          }
       }
       return i;
    }
    public final int pruneAndGetAllocationCount(RealConnection p0,long p1){
       RealConnection allocations = p0.allocations;
       int i = 0;
       while (true) {
          if (i >= allocations.size()) {
             return allocations.size();
          }
          Reference reference = allocations.get(i);
          if (reference.get() != null) {
             i = i + 1;
          }else {
             Platform.get().logCloseableLeak("A connection to "+p0.route().address().url()+" was leaked. Did you forget to close a response body?", reference.callStackTrace);
             allocations.remove(i);
             p0.noNewStreams = true;
             if (allocations.isEmpty()) {
                break ;
             }
          }
       }
       p0.idleAtNanos = p1 - this.keepAliveDurationNs;
       return 0;
    }
    public void put(RealConnection p0){
       if (this.cleanupRunning == null) {
          this.cleanupRunning = true;
          ConnectionPool.executor.execute(this.cleanupRunnable);
       }
       this.connections.add(p0);
       return;
    }
}
