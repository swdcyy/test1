package fwd.a;
import org.java_websocket.a;
import java.lang.Class;
import exd.c;
import org.slf4j.a;
import java.lang.Object;
import java.util.Timer;
import java.util.TimerTask;
import fwd.b;
import fwd.d;
import java.lang.String;
import java.util.Collection;
import fwd.a$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Throwable;

public abstract class a extends a	// class@000eed
{
    public int connectionLostTimeout;
    public Timer connectionLostTimer;
    public TimerTask connectionLostTimerTask;
    public boolean reuseAddr;
    public final Object syncConnectionLost;
    public boolean tcpNoDelay;
    public boolean websocketRunning;
    public static final c log;

    static {
       a.log = a.f(a.class);
    }
    public void a(){
       super();
       this.connectionLostTimeout = 60;
       this.websocketRunning = false;
       this.syncConnectionLost = new Object();
    }
    public final void cancelConnectionLostTimer(){
       a tconnectionL = this.connectionLostTimer;
       if (tconnectionL != null) {
          tconnectionL.cancel();
          this.connectionLostTimer = null;
       }
       tconnectionL = this.connectionLostTimerTask;
       if (tconnectionL != null) {
          tconnectionL.cancel();
          this.connectionLostTimerTask = null;
       }
       return;
    }
    public void executeConnectionLostDetection(b p0,long p1){
       if (!p0 instanceof d) {
          return;
       }
       if (p0.s - p1 < 0) {
          a.log.trace("Closing connection due to no pong received: {}", p0);
          p0.closeConnection(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
       }else if(p0.isOpen()){
          p0.sendPing();
       }else {
          a.log.trace("Trying to ping a non open connection: {}", p0);
       }
       return;
    }
    public int getConnectionLostTimeout(){
       a tsyncConnect = this.syncConnectionLost;
       _monitor_enter(tsyncConnect);
       _monitor_exit(tsyncConnect);
       return this.connectionLostTimeout;
    }
    public abstract Collection getConnections();
    public boolean isReuseAddr(){
       return this.reuseAddr;
    }
    public boolean isTcpNoDelay(){
       return this.tcpNoDelay;
    }
    public final void restartConnectionLostTimer(){
       this.cancelConnectionLostTimer();
       this.connectionLostTimer = new Timer("WebSocketTimer");
       a$a uoa = new a$a(this);
       this.connectionLostTimerTask = uoa;
       a tconnectionL = this.connectionLostTimeout;
       this.connectionLostTimer.scheduleAtFixedRate(uoa, ((long)tconnectionL * 1000), (1000 * (long)tconnectionL));
    }
    public void setConnectionLostTimeout(int p0){
       a tsyncConnect = this.syncConnectionLost;
       _monitor_enter(tsyncConnect);
       this.connectionLostTimeout = p0;
       if (p0 <= 0) {
          a.log.trace("Connection lost timer stopped");
          this.cancelConnectionLostTimer();
          _monitor_exit(tsyncConnect);
          return;
       }else if(this.websocketRunning != null){
          c log = a.log;
          String str = "Connection lost timer restarted";
          try{
             log.trace(str);
             Iterator iterator = new ArrayList(this.getConnections()).iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob instanceof d) {
                   uob.q();
                }
             }
          }catch(java.lang.Exception e4){
             a.log.error("Exception during connection lost restart", e4);
          }
          this.restartConnectionLostTimer();
       }
       _monitor_exit(tsyncConnect);
       return;
    }
    public void setReuseAddr(boolean p0){
       this.reuseAddr = p0;
    }
    public void setTcpNoDelay(boolean p0){
       this.tcpNoDelay = p0;
    }
    public void startConnectionLostTimer(){
       a tsyncConnect = this.syncConnectionLost;
       _monitor_enter(tsyncConnect);
       if (this.connectionLostTimeout <= null) {
          a.log.trace("Connection lost timer deactivated");
          _monitor_exit(tsyncConnect);
          return;
       }else {
          a.log.trace("Connection lost timer started");
          this.websocketRunning = true;
          this.restartConnectionLostTimer();
          _monitor_exit(tsyncConnect);
          return;
       }
    }
    public void stopConnectionLostTimer(){
       a tsyncConnect = this.syncConnectionLost;
       _monitor_enter(tsyncConnect);
       if (this.connectionLostTimer != null || this.connectionLostTimerTask != null) {
          this.websocketRunning = false;
          a.log.trace("Connection lost timer stopped");
          this.cancelConnectionLostTimer();
       }
       _monitor_exit(tsyncConnect);
       return;
    }
}
