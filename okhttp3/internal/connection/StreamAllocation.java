package okhttp3.internal.connection.StreamAllocation;
import okhttp3.ConnectionPool;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import java.lang.Object;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation$StreamAllocationReference;
import java.util.List;
import java.lang.IllegalStateException;
import okhttp3.internal.http.HttpCodec;
import java.net.Socket;
import java.lang.System;
import okhttp3.internal.Internal;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.Connection;
import okhttp3.internal.connection.RouteSelector$Selection;
import java.io.IOException;
import java.lang.String;
import okhttp3.OkHttpClient;
import okhttp3.Interceptor$Chain;
import okhttp3.internal.connection.RouteException;
import java.lang.ref.Reference;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.ConnectionShutdownException;
import java.lang.StringBuilder;

public final class StreamAllocation	// class@0020b1
{
    public final Address address;
    public final Call call;
    public final Object callStackTrace;
    public boolean canceled;
    public HttpCodec codec;
    public RealConnection connection;
    public final ConnectionPool connectionPool;
    public final EventListener eventListener;
    public int refusedStreamCount;
    public boolean released;
    public boolean reportedAcquired;
    public Route route;
    public RouteSelector$Selection routeSelection;
    public final RouteSelector routeSelector;
    public static final boolean $assertionsDisabled;

    public void StreamAllocation(ConnectionPool p0,Address p1,Call p2,EventListener p3,Object p4){
       super();
       this.connectionPool = p0;
       this.address = p1;
       this.call = p2;
       this.eventListener = p3;
       this.routeSelector = new RouteSelector(p1, this.routeDatabase(), p2, p3);
       this.callStackTrace = p4;
    }
    public void acquire(RealConnection p0,boolean p1){
       if (this.connection != null) {
          throw new IllegalStateException();
       }
       this.connection = p0;
       this.reportedAcquired = p1;
       p0.allocations.add(new StreamAllocation$StreamAllocationReference(this, this.callStackTrace));
       return;
    }
    public void cancel(){
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       this.canceled = true;
       StreamAllocation tcodec = this.codec;
       StreamAllocation tconnection = this.connection;
       _monitor_exit(tconnectionP);
       if (tcodec != null) {
          tcodec.cancel();
       }else if(tconnection != null){
          tconnection.cancel();
       }
       return;
    }
    public HttpCodec codec(){
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       _monitor_exit(tconnectionP);
       return this.codec;
    }
    public synchronized RealConnection connection(){
       return this.connection;
    }
    public final Socket deallocate(boolean p0,boolean p1,boolean p2){
       Socket socket;
       HttpCodec httpCodec = null;
       if (p2) {
          this.codec = httpCodec;
       }
       p2 = true;
       if (p1) {
          this.released = p2;
       }
       StreamAllocation tconnection = this.connection;
       if (tconnection != null) {
          if (p0) {
             tconnection.noNewStreams = p2;
          }
          if (this.codec == null && (this.released != null || tconnection.noNewStreams != null)) {
             this.release(tconnection);
             if (this.connection.allocations.isEmpty()) {
                p0.idleAtNanos = System.nanoTime();
                if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                   socket = this.connection.socket();
                label_0047 :
                   this.connection = httpCodec;
                   httpCodec = socket;
                }
             }
             socket = httpCodec;
             goto label_0047 ;
          }
       }
    label_004a :
       return httpCodec;
    }
    public final RealConnection findConnection(int p0,int p1,int p2,int p3,boolean p4){
       int i;
       Route route1;
       StreamAllocation streamAlloca = this;
       StreamAllocation connectionPo = streamAlloca.connectionPool;
       _monitor_enter(connectionPo);
       if (streamAlloca.released != null) {
          throw new IllegalStateException("released");
       }
       if (streamAlloca.codec != null) {
          throw new IllegalStateException("codec != null");
       }
       if (streamAlloca.canceled != null) {
          throw new IOException("Canceled");
       }
       StreamAllocation connection = streamAlloca.connection;
       Socket socket = this.releaseIfNoNewStreams();
       StreamAllocation connection1 = streamAlloca.connection;
       Route route = null;
       if (connection1 != null) {
          connection = route;
       }else {
          connection1 = route;
       }
       if (streamAlloca.reportedAcquired == null) {
          connection = route;
       }
       if (connection1 == null) {
          Internal.instance.get(streamAlloca.connectionPool, streamAlloca.address, streamAlloca, route);
          StreamAllocation connection2 = streamAlloca.connection;
          if (connection2 != null) {
             connection1 = connection2;
             i = 1;
             route1 = route;
          label_003e :
             _monitor_exit(connectionPo);
             Util.closeQuietly(socket);
             if (connection != null) {
                streamAlloca.eventListener.connectionReleased(streamAlloca.call, connection);
             }
             if (i) {
                streamAlloca.eventListener.connectionAcquired(streamAlloca.call, connection1);
             }
             if (connection1 != null) {
                streamAlloca.route = streamAlloca.connection.route();
                return connection1;
             }else if(route1 == null){
                connection = streamAlloca.routeSelection;
                if (connection == null || !connection.hasNext()) {
                   streamAlloca.routeSelection = streamAlloca.routeSelector.next();
                   connection = 1;
                label_0076 :
                   StreamAllocation connectionPo1 = streamAlloca.connectionPool;
                   _monitor_enter(connectionPo1);
                   if (streamAlloca.canceled == null) {
                      if (connection) {
                         List all = streamAlloca.routeSelection.getAll();
                         int i1 = all.size();
                         int i2 = 0;
                         while (i2 < i1) {
                            Route route2 = all.get(i2);
                            Internal.instance.get(streamAlloca.connectionPool, streamAlloca.address, streamAlloca, route2);
                            StreamAllocation connection3 = streamAlloca.connection;
                            if (connection3 != null) {
                               streamAlloca.route = route2;
                               connection1 = connection3;
                               i = 1;
                               break ;
                            }
                            i2 = i2 + 1;
                         }
                      }
                      if (!i) {
                         if (route1 == null) {
                            route1 = streamAlloca.routeSelection.next();
                         }
                         streamAlloca.route = route1;
                         streamAlloca.refusedStreamCount = 0;
                         connection1 = new RealConnection(streamAlloca.connectionPool, route1);
                         streamAlloca.acquire(connection1, 0);
                      }
                      _monitor_exit(connectionPo1);
                      if (i) {
                         streamAlloca.eventListener.connectionAcquired(streamAlloca.call, connection1);
                         return connection1;
                      }else {
                         connection1.connect(p0, p1, p2, p3, p4, streamAlloca.call, streamAlloca.eventListener);
                         this.routeDatabase().connected(connection1.route());
                         connectionPo = streamAlloca.connectionPool;
                         _monitor_enter(connectionPo);
                         streamAlloca.reportedAcquired = true;
                         Internal.instance.put(streamAlloca.connectionPool, connection1);
                         if (connection1.isMultiplexed()) {
                            route = Internal.instance.deduplicate(streamAlloca.connectionPool, streamAlloca.address, streamAlloca);
                            connection1 = streamAlloca.connection;
                         }
                         _monitor_exit(connectionPo);
                         Util.closeQuietly(route);
                         streamAlloca.eventListener.connectionAcquired(streamAlloca.call, connection1);
                         return connection1;
                      }
                   }else {
                      throw new IOException("Canceled");
                   }
                }
             }
             connection = null;
             goto label_0076 ;
          }else {
             route1 = streamAlloca.route;
          }
       }else {
          route1 = route;
       }
       i = 0;
       goto label_003e ;
    }
    public final RealConnection findHealthyConnection(int p0,int p1,int p2,int p3,boolean p4,boolean p5){
       RealConnection realConnecti;
       while (true) {
          realConnecti = this.findConnection(p0, p1, p2, p3, p4);
          StreamAllocation tconnectionP = this.connectionPool;
          _monitor_enter(tconnectionP);
          if (realConnecti.successCount == null && !realConnecti.isMultiplexed()) {
             _monitor_exit(tconnectionP);
             return realConnecti;
          }else {
             _monitor_exit(tconnectionP);
             if (!realConnecti.isHealthy(p5)) {
                this.noNewStreams();
             }else {
                break ;
             }
          }
       }
       return realConnecti;
    }
    public boolean hasMoreRoutes(){
       boolean b;
       if (this.route == null) {
          StreamAllocation trouteSelect = this.routeSelection;
          if (trouteSelect != null && (!trouteSelect.hasNext() && !this.routeSelector.hasNext())) {
             b = false;
          label_001a :
             return b;
          }
       }
       b = true;
       goto label_001a ;
    }
    public HttpCodec newStream(OkHttpClient p0,Interceptor$Chain p1,boolean p2){
       int i = p1.connectTimeoutMillis();
       int i1 = p1.readTimeoutMillis();
       int i2 = p1.writeTimeoutMillis();
       int i3 = p0.pingIntervalMillis();
       boolean b = p0.retryOnConnectionFailure();
       StreamAllocation streamAlloca = this;
       try{
          int i4 = p2;
          HttpCodec httpCodec = streamAlloca.findHealthyConnection(i, i1, i2, i3, b, i4).newCodec(p0, p1, this);
          StreamAllocation tconnectionP = this.connectionPool;
          _monitor_enter(tconnectionP);
          this.codec = httpCodec;
          _monitor_exit(tconnectionP);
          return httpCodec;
       }catch(java.io.IOException e8){
          throw new RouteException(e8);
       }
    }
    public void noNewStreams(){
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       StreamAllocation tconnection = this.connection;
       Socket socket = this.deallocate(true, false, false);
       if (this.connection != null) {
          tconnection = null;
       }
       _monitor_exit(tconnectionP);
       Util.closeQuietly(socket);
       if (tconnection != null) {
          this.eventListener.connectionReleased(this.call, tconnection);
       }
       return;
    }
    public void release(){
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       StreamAllocation tconnection = this.connection;
       Socket socket = this.deallocate(false, true, false);
       if (this.connection != null) {
          tconnection = null;
       }
       _monitor_exit(tconnectionP);
       Util.closeQuietly(socket);
       if (tconnection != null) {
          Internal.instance.timeoutExit(this.call, null);
          this.eventListener.connectionReleased(this.call, tconnection);
          this.eventListener.callEnd(this.call);
       }
       return;
    }
    public final void release(RealConnection p0){
       int i = p0.allocations.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             throw new IllegalStateException();
          }
          if (p0.allocations.get(i1).get() == this) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       p0.allocations.remove(i1);
       return;
    }
    public Socket releaseAndAcquire(RealConnection p0){
       if (this.codec == null) {
          boolean b = true;
          if (this.connection.allocations.size() == b) {
             this.connection = p0;
             p0.allocations.add(this.connection.allocations.get(0));
             return this.deallocate(b, 0, 0);
          }
       }
       throw new IllegalStateException();
    }
    public final Socket releaseIfNoNewStreams(){
       StreamAllocation tconnection = this.connection;
       if (tconnection != null && tconnection.noNewStreams != null) {
          return this.deallocate(false, false, true);
       }
       return null;
    }
    public Route route(){
       return this.route;
    }
    public final RouteDatabase routeDatabase(){
       return Internal.instance.routeDatabase(this.connectionPool);
    }
    public void streamFailed(IOException p0){
       boolean i;
       StreamAllocation tconnection;
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       boolean b = false;
       Route route = null;
       if (p0 instanceof StreamResetException) {
          StreamResetException errorCode = p0.errorCode;
          if (errorCode == ErrorCode.REFUSED_STREAM) {
             i = this.refusedStreamCount + 1;
             this.refusedStreamCount = i;
             if (i > 1) {
                this.route = route;
             }else {
             label_0046 :
                i = false;
             label_0047 :
                tconnection = this.connection;
                Socket socket = this.deallocate(i, b, 1);
                if (this.connection == null && this.reportedAcquired != null) {
                   route = tconnection;
                }
                _monitor_exit(tconnectionP);
                Util.closeQuietly(socket);
                if (route != null) {
                   this.eventListener.connectionReleased(this.call, route);
                }
                return;
             }
          }else if(errorCode != ErrorCode.CANCEL){
             this.route = route;
          }else {
             goto label_0046 ;
          }
       }else {
          tconnection = this.connection;
          if (tconnection != null && (!tconnection.isMultiplexed() || p0 instanceof ConnectionShutdownException)) {
             if (this.connection.successCount == null) {
                tconnection = this.route;
                if (tconnection != null && p0 != null) {
                   this.routeSelector.connectFailed(tconnection, p0);
                }
                this.route = route;
             }
          }else {
             goto label_0046 ;
          }
       }
       i = true;
       goto label_0047 ;
    }
    public void streamFinished(boolean p0,HttpCodec p1,long p2,IOException p3){
       StreamAllocation tconnection;
       this.eventListener.responseBodyEnd(this.call, p2);
       StreamAllocation tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       if (p1 == null || p1 != this.codec) {
          throw new IllegalStateException("expected "+this.codec+" but was "+p1);
       }
       int i = 1;
       if (!p0) {
          tconnection = this.connection;
          tconnection.successCount = tconnection.successCount + i;
       }
       tconnection = this.connection;
       Socket socket = this.deallocate(p0, false, i);
       if (this.connection != null) {
          tconnection = null;
       }
       StreamAllocation treleased = this.released;
       _monitor_exit(tconnectionP);
       Util.closeQuietly(socket);
       if (tconnection != null) {
          this.eventListener.connectionReleased(this.call, tconnection);
       }
       if (p3 != null) {
          this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, p3));
       }else if(treleased != null){
          Internal.instance.timeoutExit(this.call, null);
          this.eventListener.callEnd(this.call);
       }
       return;
    }
    public String toString(){
       RealConnection realConnecti = this.connection();
       String str = (realConnecti != null)? realConnecti.toString(): this.address.toString();
       return str;
    }
}
