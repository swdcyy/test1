package lwd.b;
import java.lang.Runnable;
import fwd.a;
import java.lang.Class;
import exd.c;
import org.slf4j.a;
import java.lang.Runtime;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lwd.a;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import lwd.b$a;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.nio.channels.SocketChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SelectableChannel;
import java.net.Socket;
import org.java_websocket.a;
import fwd.d;
import org.java_websocket.d;
import java.nio.channels.Selector;
import java.nio.channels.ByteChannel;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import fwd.b;
import java.io.IOException;
import org.java_websocket.e;
import java.nio.Buffer;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.Exception;
import org.java_websocket.drafts.b;
import org.java_websocket.enums.Role;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import java.util.Collection;
import java.net.SocketAddress;
import jwd.a;
import jwd.f;
import java.lang.StringBuilder;
import java.net.ServerSocket;
import java.util.Set;

public abstract class b extends a implements Runnable	// class@001cf0
{
    public final Collection b;
    public final InetSocketAddress c;
    public ServerSocketChannel d;
    public Selector e;
    public List f;
    public Thread g;
    public final AtomicBoolean h;
    public List i;
    public List j;
    public BlockingQueue k;
    public int l;
    public final AtomicInteger m;
    public d n;
    public static final c o;
    public static final int p;

    static {
       b.o = a.f(b.class);
       b.p = Runtime.getRuntime().availableProcessors();
    }
    public void b(){
       super(new InetSocketAddress(80), b.p, null);
    }
    public void b(InetSocketAddress p0){
       super(p0, b.p, null);
    }
    public void b(InetSocketAddress p0,int p1,List p2){
       HashSet hashSet = new HashSet();
       super();
       boolean b = false;
       this.h = new AtomicBoolean(b);
       this.l = b;
       this.m = new AtomicInteger(b);
       this.n = new a();
       if (p0 == null || p1 < 1) {
          throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
       }
       this.f = Collections.emptyList();
       this.c = p0;
       this.b = hashSet;
       this.setTcpNoDelay(b);
       this.setReuseAddr(b);
       this.j = new LinkedList();
       this.i = new ArrayList(p1);
       this.k = new LinkedBlockingQueue();
       for (; b < p1; b = b + 1) {
          this.i.add(new b$a(this));
       }
       return;
    }
    public final void a(SelectionKey p0,Iterator p1){
       SocketChannel socketChanne = this.d.accept();
       if (socketChanne == null) {
          return;
       }
       socketChanne.configureBlocking(false);
       Socket socket = socketChanne.socket();
       socket.setTcpNoDelay(this.isTcpNoDelay());
       socket.setKeepAlive(true);
       d uod = this.n.b(this, this.f);
       SelectionKey selectionKey = socketChanne.register(this.e, true, uod);
       try{
          uod.e = selectionKey;
          uod.f = this.n.wrapChannel(socketChanne, uod.l());
          p1.remove();
          if (this.m.get() < ((this.i.size() * 2) + true)) {
             this.m.incrementAndGet();
             this.k.put(ByteBuffer.allocate(0x4000));
          }
       }catch(java.io.IOException e5){
          if (uod.l() != null) {
             uod.l().cancel();
          }
          this.h(uod.l(), null, e5);
       }
       return;
    }
    public final void b(){
       while (!this.j.isEmpty()) {
          int i = 0;
          d uod = this.j.remove(i);
          e uoe = uod.k();
          ByteBuffer uByteBuffer = this.q();
          try{
             uByteBuffer.clear();
             uByteBuffer.flip();
             if (uoe.readMore(uByteBuffer) == -1) {
                uod.h();
             }else {
                i = uoe.isNeedRead();
             }
             if (i) {
                this.j.add(uod);
             }
             if (uByteBuffer.hasRemaining()) {
                uod.c.put(uByteBuffer);
                this.o(uod);
             }else {
                this.n(uByteBuffer);
             }
          }catch(java.io.IOException e0){
             this.n(uByteBuffer);
             throw e0;
          }
       }
       return;
    }
    public final boolean c(SelectionKey p0,Iterator p1){
       d uod = p0.attachment();
       ByteBuffer uByteBuffer = this.q();
       boolean b = false;
       if (uod.k() == null) {
          p0.cancel();
          this.h(p0, uod, new IOException());
          return b;
       }else {
          try{
             uByteBuffer.clear();
             int i = uod.k().read(uByteBuffer);
             uByteBuffer.flip();
             if (i == -1) {
                uod.h();
             }else if(i){
                b = true;
             }
             if (b) {
                if (uByteBuffer.hasRemaining()) {
                   uod.c.put(uByteBuffer);
                   this.o(uod);
                   p1.remove();
                   if (uod.k() instanceof e && uod.k().isNeedRead()) {
                      this.j.add(uod);
                   }
                }else {
                   this.n(uByteBuffer);
                }
             }else {
                this.n(uByteBuffer);
             }
             return true;
          }catch(java.io.IOException e6){
             this.n(uByteBuffer);
             throw e6;
          }
       }
    }
    public final void d(){
       this.stopConnectionLostTimer();
       b ti = this.i;
       if (ti != null) {
          Iterator iterator = ti.iterator();
          while (iterator.hasNext()) {
             iterator.next().interrupt();
          }
       }
       ti = this.e;
       if (ti != null) {
          try{
             ti.close();
          }catch(java.io.IOException e0){
             b.o.error("IOException during selector.close", e0);
             this.j(null, e0);
          }
       }
    }
    public final void e(SelectionKey p0){
       ByteChannel uByteChannel1;
       boolean b;
       d uod = p0.attachment();
       ByteChannel uByteChannel = uod.k();
       ByteBuffer uByteBuffer = uod.b.peek();
       if (uByteBuffer == null) {
          if (uByteChannel instanceof e) {
             uByteChannel1 = uByteChannel;
             if (uByteChannel1.isNeedWrite()) {
                uByteChannel1.writeMore();
             }
          }else {
          label_003f :
             uByteChannel1 = null;
          }
       }else {
          while (true) {
             uByteChannel.write(uByteBuffer);
             if (uByteBuffer.remaining() > 0) {
             label_0093 :
                b = false;
             label_0096 :
                if (b && p0.isValid()) {
                   p0.interestOps(1);
                   break ;
                }
                break ;
             }else {
                uod.b.poll();
                uByteBuffer = uod.b.peek();
                if (uByteBuffer == null) {
                   goto label_003f ;
                }
             }
          }
          return;
       }
       if (uod.b.isEmpty() && (uod.isFlushAndClose() && (uod.getDraft() != null && (uod.getDraft().j() != null && uod.getDraft().j() == Role.SERVER)))) {
          if (uod.q != null) {
             uod.c(uod.p.intValue(), uod.o, uod.q.booleanValue());
          }else {
             throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
          }
       }
    label_0088 :
       if (uByteChannel1 == null || !uByteChannel.isNeedWrite()) {
          b = true;
          goto label_0096 ;
       }else {
          goto label_0093 ;
       }
    }
    public final Socket f(b p0){
       return p0.l().channel().socket();
    }
    public void g(b p0,Exception p1){
       Iterator iterator;
       b.o.error("Shutdown due to fatal error", p1);
       this.j(p0, p1);
       p0 = this.i;
       if (p0 != null) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             iterator.next().interrupt();
          }
       }
       iterator = this.g;
       if (iterator != null) {
          iterator.interrupt();
       }
       iterator = 0;
       try{
          this.stop();
       }catch(java.io.IOException e5){
          b.o.error("Error during shutdown", e5);
          this.j(iterator, e5);
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          b.o.error("Interrupt during stop", p1);
          this.j(iterator, e0);
       }
       return;
    }
    public Collection getConnections(){
       return Collections.unmodifiableCollection(new ArrayList(this.b));
    }
    public InetSocketAddress getLocalSocketAddress(b p0){
       return this.f(p0).getLocalSocketAddress();
    }
    public InetSocketAddress getRemoteSocketAddress(b p0){
       return this.f(p0).getRemoteSocketAddress();
    }
    public final void h(SelectionKey p0,b p1,IOException p2){
       if (p1 != null) {
          p1.closeConnection(1006, p2.getMessage());
       }else if(p0 != null){
          try{
             SelectableChannel selectableCh = p0.channel();
             if (selectableCh != null && selectableCh.isOpen()) {
                selectableCh.close();
                b.o.trace("Connection closed because of exception", p2);
             }
          }catch(java.io.IOException e0){
          }
       }
    }
    public abstract void i(b p0,int p1,String p2,boolean p3);
    public abstract void j(b p0,Exception p1);
    public abstract void k(b p0,String p1);
    public abstract void l(b p0,a p1);
    public abstract void m();
    public void n(ByteBuffer p0){
       if (this.k.size() > this.m.intValue()) {
          return;
       }
       this.k.put(p0);
       return;
    }
    public void o(d p0){
       if (p0.n() == null) {
          b ti = this.i;
          p0.g = ti.get((this.l % ti.size()));
          this.l = this.l + 1;
       }
       p0.n().b.put(p0);
       return;
    }
    public final void onWebsocketClose(b p0,int p1,String p2,boolean p3){
       this.e.wakeup();
       if (this.p(p0)) {
          this.i(p0, p1, p2, p3);
       }
       return;
    }
    public void onWebsocketCloseInitiated(b p0,int p1,String p2){
    }
    public void onWebsocketClosing(b p0,int p1,String p2,boolean p3){
    }
    public final void onWebsocketError(b p0,Exception p1){
       this.j(p0, p1);
    }
    public final void onWebsocketMessage(b p0,String p1){
       this.k(p0, p1);
    }
    public final void onWebsocketMessage(b p0,ByteBuffer p1){
    }
    public final void onWebsocketOpen(b p0,f p1){
       boolean b;
       if (!this.h.get()) {
          b tb = this.b;
          _monitor_enter(tb);
          b = this.b.add(p0);
          _monitor_exit(tb);
       }else {
          p0.close(1001);
          b = true;
       }
       if (b) {
          this.l(p0, p1);
       }
       return;
    }
    public final void onWriteDemand(b p0){
       try{
          p0.l().interestOps(5);
       }catch(java.nio.channels.CancelledKeyException e0){
          p0.b.clear();
       }
       this.e.wakeup();
       return;
    }
    public boolean p(b p0){
       boolean b;
       b tb = this.b;
       _monitor_enter(tb);
       if (this.b.contains(p0)) {
          b = this.b.remove(p0);
       }else {
          b.o.trace("Removing connection which is not in the connections collection! Possible no handshake recieved! {}", p0);
          b = false;
       }
       _monitor_exit(tb);
       if (this.h.get() && this.b.isEmpty()) {
          this.g.interrupt();
       }
       return b;
    }
    public final ByteBuffer q(){
       return this.k.take();
    }
    public void run(){
       boolean b;
       b uob;
       SelectionKey selectionKey;
       _monitor_enter(this);
       if (this.g != null) {
          throw new IllegalStateException(b.class.getName()+" can only be started once.");
       }
       this.g = Thread.currentThread();
       int i = 1;
       b = false;
       if (this.h.get()) {
          _monitor_exit(this);
          uob = null;
       }else {
          _monitor_exit(this);
          uob = 1;
       }
       if (!uob) {
          return;
       }else {
          this.g.setName("WebSocketSelector-"+this.g.getId());
          try{
             uob = 0;
             ServerSocketChannel serverSocket = ServerSocketChannel.open();
             this.d = serverSocket;
             serverSocket.configureBlocking(b);
             ServerSocket serverSocket1 = this.d.socket();
             serverSocket1.setReceiveBufferSize(0x4000);
             serverSocket1.setReuseAddress(this.isReuseAddr());
             serverSocket1.bind(this.c);
             Selector selector = Selector.open();
             this.e = selector;
             b td = this.d;
             td.register(selector, td.validOps());
             this.startConnectionLostTimer();
             Iterator iterator = this.i.iterator();
             while (iterator.hasNext()) {
                iterator.next().start();
             }
             this.m();
          }catch(java.io.IOException e1){
             this.g(uob, e1);
             i = 0;
          }
          if (!i) {
             return;
          }else {
             int i1 = 5;
             try{
                while (!this.g.isInterrupted() && i1) {
                   try{
                      if (this.h.get()) {
                         b = 5;
                      }
                      if (!this.e.select((long)b) && this.h.get()) {
                         i1 = i1 - 1;
                      }
                      Iterator iterator1 = this.e.selectedKeys().iterator();
                      int i2 = uob;
                      try{
                         while (iterator1.hasNext()) {
                            SelectionKey selectionKey1 = iterator1.next();
                            try{
                               if (selectionKey1.isValid()) {
                                  if (selectionKey1.isAcceptable()) {
                                     this.a(selectionKey1, iterator1);
                                  }else if(selectionKey1.isReadable() && (this.c(selectionKey1, iterator1) && selectionKey1.isWritable())){
                                     this.e(selectionKey1);
                                  }
                               }
                            label_00f4 :
                               selectionKey = selectionKey1;
                            }catch(java.io.IOException e4){
                               selectionKey = selectionKey1;
                            }catch(java.lang.InterruptedException e0){
                            label_00ff :
                               Thread.currentThread().interrupt();
                               goto label_0090 ;
                            }catch(java.lang.InterruptedException e0){
                            }
                         }
                         this.b();
                      }catch(java.io.IOException e4){
                      }catch(java.io.IOException e0){
                      }catch(java.io.IOException e0){
                      }
                   }catch(java.nio.channels.ClosedByInterruptException e0){
                      this.d();
                      return;
                   }catch(java.io.IOException e4){
                   }catch(java.lang.InterruptedException e0){
                   }catch(java.lang.RuntimeException e1){
                      this.g(uob, e1);
                   }
                }
                this.d();
                return;
             }catch(java.lang.RuntimeException e1){
             }catch(java.nio.channels.CancelledKeyException e0){
             }catch(java.nio.channels.ClosedByInterruptException e0){
             }catch(java.io.IOException e4){
                selectionKey = uob;
             }catch(java.lang.InterruptedException e0){
             }
          }
       }
    }
    public void stop(){
       if (!this.h.compareAndSet(false, true)) {
       }else {
          b tb = this.b;
          _monitor_enter(tb);
          _monitor_exit(tb);
          Iterator iterator = new ArrayList(this.b).iterator();
          while (iterator.hasNext()) {
             iterator.next().close(1001);
          }
          this.n.close();
          _monitor_enter(this);
          if (this.g != null) {
             tb = this.e;
             if (tb != null) {
                tb.wakeup();
                this.g.join((long)false);
             }
          }
          _monitor_exit(this);
       }
       return;
    }
}
