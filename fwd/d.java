package fwd.d;
import fwd.b;
import java.lang.Class;
import exd.c;
import org.slf4j.a;
import org.java_websocket.c;
import org.java_websocket.drafts.b;
import java.lang.Object;
import org.java_websocket.enums.ReadyState;
import java.nio.ByteBuffer;
import java.lang.System;
import org.java_websocket.enums.Role;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.IllegalArgumentException;
import java.lang.String;
import org.java_websocket.enums.CloseHandshakeType;
import java.lang.Exception;
import org.java_websocket.framing.a;
import iwd.c;
import java.lang.Throwable;
import org.java_websocket.exceptions.InvalidDataException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ByteChannel;
import java.io.IOException;
import java.lang.Integer;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;
import jwd.f;
import jwd.a;
import org.java_websocket.enums.HandshakeState;
import jwd.i;
import jwd.c;
import java.lang.RuntimeException;
import jwd.h;
import java.lang.StringBuilder;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import java.net.InetSocketAddress;
import java.lang.Boolean;
import java.util.concurrent.BlockingQueue;
import mwd.c;
import lwd.b$a;
import java.util.Collection;
import java.util.ArrayList;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.enums.Opcode;
import java.util.Objects;
import iwd.b;
import iwd.a;
import org.java_websocket.framing.e;
import org.java_websocket.framing.d;
import org.java_websocket.framing.c;
import java.util.Collections;
import iwd.d;

public class d implements b	// class@000ef0
{
    public final BlockingQueue b;
    public final BlockingQueue c;
    public final c d;
    public SelectionKey e;
    public ByteChannel f;
    public b$a g;
    public boolean h;
    public ReadyState i;
    public List j;
    public b k;
    public Role l;
    public ByteBuffer m;
    public a n;
    public String o;
    public Integer p;
    public Boolean q;
    public String r;
    public long s;
    public final Object t;
    public d u;
    public Object v;
    public static final c w;
    public static final boolean x;

    static {
       d.w = a.f(d.class);
    }
    public void d(c p0,b p1){
       super();
       this.h = false;
       this.i = ReadyState.NOT_YET_CONNECTED;
       b uob = null;
       this.k = uob;
       this.m = ByteBuffer.allocate(false);
       this.n = uob;
       this.o = uob;
       this.p = uob;
       this.q = uob;
       this.r = uob;
       this.s = System.currentTimeMillis();
       this.t = new Object();
       if (p0 == null || (p1 == null && this.l == Role.SERVER)) {
          throw new IllegalArgumentException("parameters must not be null");
       }
       this.b = new LinkedBlockingQueue();
       this.c = new LinkedBlockingQueue();
       this.d = p0;
       this.l = Role.CLIENT;
       if (p1 != null) {
          this.k = p1.d();
       }
       return;
    }
    public synchronized void a(int p0,String p1,boolean p2){
       a uoa;
       ReadyState cLOSING = ReadyState.CLOSING;
       if (this.i == cLOSING || this.i == ReadyState.CLOSED) {
          return;
       }
       if (this.i == ReadyState.OPEN) {
          if (p0 == 1006) {
             this.i = cLOSING;
             this.i(p0, p1, false);
             return;
          }else if(this.k.i() != CloseHandshakeType.NONE){
             try{
                if (!p2) {
                   this.d.onWebsocketCloseInitiated(this, p0, p1);
                }
             }catch(java.lang.RuntimeException e1){
                this.d.onWebsocketError(this, e1);
             }catch(org.java_websocket.exceptions.InvalidDataException e1){
                d.w.error("generated frame is invalid", e1);
                this.d.onWebsocketError(this, e1);
                this.i(1006, "generated frame is invalid", false);
             }
          }
       }else {
          int i = -3;
          if (p0 == i) {
             this.i(i, p1, true);
          }else if(p0 == 1002){
             this.i(p0, p1, p2);
          }else {
             this.i(-1, p1, false);
          }
       }
       this.i = ReadyState.CLOSING;
       this.m = null;
       return;
    }
    public void b(InvalidDataException p0){
       this.a(p0.getCloseCode(), p0.getMessage(), false);
    }
    public synchronized void c(int p0,String p1,boolean p2){
       d tk;
       if (this.i == ReadyState.CLOSED) {
          return;
       }
       if (this.i == ReadyState.OPEN && p0 == 1006) {
          this.i = ReadyState.CLOSING;
       }
       d te = this.e;
       if (te != null) {
          te.cancel();
       }
       te = this.f;
       if (te != null) {
          try{
             te.close();
          }catch(java.io.IOException e0){
             if ((e0.getMessage()).equals("Broken pipe")) {
                d.w.trace("Caught IOException: Broken pipe during closeConnection\(\)", e0);
             }else {
                d.w.error("Exception during channel.close\(\)", e0);
                this.d.onWebsocketError(this, e0);
             }
          }
       }
    }
    public void close(){
       this.close(1000);
    }
    public void close(int p0){
       this.a(p0, "", false);
    }
    public void close(int p0,String p1){
       this.a(p0, p1, false);
    }
    public void closeConnection(int p0,String p1){
       this.c(p0, p1, false);
    }
    public void d(int p0,boolean p1){
       this.c(p0, "", p1);
    }
    public final void e(InvalidDataException p0){
       this.r(this.j(404));
       this.i(p0.getCloseCode(), p0.getMessage(), false);
    }
    public void f(ByteBuffer p0){
       ByteBuffer uByteBuffer;
       d tm;
       f uof1;
       int closeCode;
       c w = d.w;
       Integer integer = Integer.valueOf(p0.remaining());
       String str = (p0.remaining() > 1000)? "too big to display": new String(p0.array(), p0.position(), p0.remaining());
       w.trace("process\({}\): \({}\)", integer, str);
       if (this.i != ReadyState.NOT_YET_CONNECTED) {
          if (this.i == ReadyState.OPEN) {
             this.g(p0);
          }
       }else if(!this.m.capacity()){
          uByteBuffer = p0;
       }else if(this.m.remaining() < p0.remaining()){
          uByteBuffer = ByteBuffer.allocate((this.m.capacity() + p0.remaining()));
          this.m.flip();
          uByteBuffer.put(this.m);
          this.m = uByteBuffer;
       }
       this.m.put(p0);
       this.m.flip();
       uByteBuffer = this.m;
       uByteBuffer.mark();
       try{
          str = 0;
          d tl = this.l;
          String str1 = "Closing due to protocol error: wrong http function";
          if (tl == Role.SERVER) {
             tl = this.k;
             if (tl == null) {
                Iterator iterator = this.j.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      b uob = iterator.next().d();
                      try{
                         uob.p(this.l);
                         uByteBuffer.reset();
                         f uof = uob.r(uByteBuffer);
                         if (!uof instanceof a) {
                            d.w.trace("Closing due to wrong handshake");
                            this.e(new InvalidDataException(1002, "wrong http function"));
                         }else {
                            if (uob.b(uof) == HandshakeState.MATCHED) {
                               str1 = uof.getResourceDescriptor();
                               this.r = str1;
                               i oi = this.d.onWebsocketHandshakeReceivedAsServer(this, uob, uof);
                               this.s(uob.h(uob.l(uof, oi)));
                               this.k = uob;
                               this.o(uof);
                            }
                         }
                      }catch(org.java_websocket.exceptions.InvalidHandshakeException e0){
                      }catch(org.java_websocket.exceptions.InvalidDataException e3){
                         d.w.trace("Closing due to wrong handshake. Possible handshake rejection", e3);
                         this.e(e3);
                      }catch(java.lang.RuntimeException e3){
                         d.w.error("Closing due to internal server error", e3);
                         this.d.onWebsocketError(this, e3);
                         this.r(this.j(500));
                         this.i(-1, e3.getMessage(), str);
                      }catch(org.java_websocket.exceptions.IncompleteHandshakeException e0){
                         if (!this.m.capacity()) {
                            uByteBuffer.reset();
                            int preferredSiz = e0.getPreferredSize();
                            if (!preferredSiz) {
                               preferredSiz = uByteBuffer.capacity() + 16;
                            }
                            ByteBuffer uByteBuffer1 = ByteBuffer.allocate(preferredSiz);
                            this.m = uByteBuffer1;
                            uByteBuffer1.put(p0);
                         }else {
                            tm = this.m;
                            tm.position(tm.limit());
                            tm = this.m;
                            tm.limit(tm.capacity());
                         }
                      }
                   }else if(this.k == null){
                      d.w.trace("Closing due to protocol error: no draft matches");
                      this.e(new InvalidDataException(1002, "no draft matches"));
                   }
                }
             }else {
                uof1 = tl.r(uByteBuffer);
                if (!uof1 instanceof a) {
                   w.trace(str1);
                   this.i(1002, "wrong http function", str);
                }else if(this.k.b(uof1) == HandshakeState.MATCHED){
                   this.o(uof1);
                }else {
                   w.trace("Closing due to protocol error: the handshake did finally not match");
                   this.close(1002, "the handshake did finally not match");
                }
             }
          }else if(tl == Role.CLIENT){
             this.k.p(tl);
             uof1 = this.k.r(uByteBuffer);
             if (!uof1 instanceof h) {
                w.trace(str1);
                this.i(1002, "wrong http function", str);
             }else if(this.k.a(this.n, uof1) == HandshakeState.MATCHED){
                tm = this.d;
                d tn = this.n;
                tm.onWebsocketHandshakeReceivedAsClient(this, tn, uof1);
                this.o(uof1);
             }else {
                w.trace("Closing due to protocol error: draft {} refuses handshake", this.k);
                this.close(1002, "draft "+this.k+" refuses handshake");
             }
          }
       }catch(org.java_websocket.exceptions.InvalidHandshakeException e0){
          d.w.trace("Closing due to invalid handshake", e0);
          this.b(e0);
       }catch(org.java_websocket.exceptions.IncompleteHandshakeException e0){
       }
       if (str && (!this.isClosing() && !this.isClosed())) {
          if (p0.hasRemaining()) {
             this.g(p0);
          }else if(this.m.hasRemaining()){
             this.g(this.m);
          }
       }
    label_0245 :
       return;
    }
    public final void g(ByteBuffer p0){
       try{
          Iterator iterator = this.k.q(p0).iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             d.w.trace("matched frame: {}", uoc);
             this.k.m(this, uoc);
          }
       }catch(org.java_websocket.exceptions.LimitExceededException e4){
          if (e4.getLimit() == Integer.MAX_VALUE) {
             d.w.error("Closing due to invalid size of frame", e4);
             this.d.onWebsocketError(this, e4);
          }
          this.b(e4);
       }catch(org.java_websocket.exceptions.InvalidDataException e4){
          d.w.error("Closing due to invalid data in frame", e4);
          this.d.onWebsocketError(this, e4);
          this.b(e4);
       }
       return;
    }
    public Object getAttachment(){
       return this.v;
    }
    public b getDraft(){
       return this.k;
    }
    public InetSocketAddress getLocalSocketAddress(){
       return this.d.getLocalSocketAddress(this);
    }
    public ReadyState getReadyState(){
       return this.i;
    }
    public InetSocketAddress getRemoteSocketAddress(){
       return this.d.getRemoteSocketAddress(this);
    }
    public String getResourceDescriptor(){
       return this.r;
    }
    public void h(){
       boolean b = true;
       if (this.i == ReadyState.NOT_YET_CONNECTED) {
          this.d(-1, b);
       }else if(this.h != null){
          this.c(this.p.intValue(), this.o, this.q.booleanValue());
       }else if(this.k.i() == CloseHandshakeType.NONE){
          this.d(1000, b);
       }else if(this.k.i() == CloseHandshakeType.ONEWAY){
          if (this.l == Role.SERVER) {
             this.d(1006, b);
          }else {
             this.d(1000, b);
          }
       }else {
          this.d(1006, b);
       }
       return;
    }
    public boolean hasBufferedData(){
       return (this.b.isEmpty() ^ 0x01);
    }
    public synchronized void i(int p0,String p1,boolean p2){
       if (this.h != null) {
          return;
       }
       this.p = Integer.valueOf(p0);
       this.o = p1;
       this.q = Boolean.valueOf(p2);
       this.h = true;
       d td = this.d;
       try{
          td.onWriteDemand(this);
          this.d.onWebsocketClosing(this, p0, p1, p2);
       }catch(java.lang.RuntimeException e2){
          d.w.error("Exception in onWebsocketClosing", e2);
          this.d.onWebsocketError(this, e2);
       }
       d tk = this.k;
       if (tk != null) {
          tk.o();
       }
       this.n = null;
       return;
    }
    public boolean isClosed(){
       boolean b = (this.i == ReadyState.CLOSED)? true: false;
       return b;
    }
    public boolean isClosing(){
       boolean b = (this.i == ReadyState.CLOSING)? true: false;
       return b;
    }
    public boolean isFlushAndClose(){
       return this.h;
    }
    public boolean isOpen(){
       boolean b = (this.i == ReadyState.OPEN)? true: false;
       return b;
    }
    public final ByteBuffer j(int p0){
       String str = (p0 != 404)? "500 Internal Server Error": "404 WebSocket Upgrade Failure";
       return ByteBuffer.wrap(c.a("HTTP/1.1 "+str+"\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: "+(str.length() + 48)+"\r\n\r\n<html><head></head><body><h1>"+str+"</h1></body></html>"));
    }
    public ByteChannel k(){
       return this.f;
    }
    public SelectionKey l(){
       return this.e;
    }
    public c m(){
       return this.d;
    }
    public b$a n(){
       return this.g;
    }
    public final void o(f p0){
       d.w.trace("open using draft: {}", this.k);
       ReadyState oPEN = ReadyState.OPEN;
       try{
          this.i = oPEN;
          this.d.onWebsocketOpen(this, p0);
       }catch(java.lang.RuntimeException e4){
          this.d.onWebsocketError(this, e4);
       }
       return;
    }
    public final void p(Collection p0){
       if (!this.isOpen()) {
          throw new WebsocketNotConnectedException();
       }
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          d.w.trace("send frame: {}", uoc);
          uArrayList.add(this.k.e(uoc));
       }
       this.s(uArrayList);
       return;
    }
    public void q(){
       this.s = System.currentTimeMillis();
    }
    public final void r(ByteBuffer p0){
       c w = d.w;
       Integer integer = Integer.valueOf(p0.remaining());
       String str = (p0.remaining() > 1000)? "too big to display": new String(p0.array());
       w.trace("write\({}\): {}", integer, str);
       this.b.add(p0);
       this.d.onWriteDemand(this);
       return;
    }
    public final void s(List p0){
       d tt = this.t;
       _monitor_enter(tt);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.r(iterator.next());
       }
       _monitor_exit(tt);
       return;
    }
    public void send(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Cannot send \'null\' data to a WebSocketImpl.");
       }
       d tk = this.k;
       boolean b = (this.l == Role.CLIENT)? true: false;
       this.p(tk.f(p0, b));
       return;
    }
    public void send(ByteBuffer p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Cannot send \'null\' data to a WebSocketImpl.");
       }
       d tk = this.k;
       boolean b = (this.l == Role.CLIENT)? true: false;
       this.p(tk.g(p0, b));
       return;
    }
    public void send(byte[] p0){
       this.send(ByteBuffer.wrap(p0));
    }
    public void sendFragmentedFrame(Opcode p0,ByteBuffer p1,boolean p2){
       b uob;
       d tk = this.k;
       Objects.requireNonNull(tk);
       Opcode bINARY = Opcode.BINARY;
       if (p0 != bINARY && p0 != Opcode.TEXT) {
          throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
       }
       if (tk.b != null) {
          uob = new b();
       }else {
          tk.b = p0;
          if (p0 == bINARY) {
             uob = new a();
          }else if(p0 == Opcode.TEXT){
             uob = new e();
          }else {
             uob = null;
          }
       }
       uob.d(p1);
       try{
          uob.c(p2);
          uob.b();
          tk.b = (p2)? null: p0;
          this.p(Collections.singletonList(uob));
          return;
       }catch(org.java_websocket.exceptions.InvalidDataException e5){
          throw new IllegalArgumentException(e5);
       }
    }
    public void sendFrame(c p0){
       this.p(Collections.singletonList(p0));
    }
    public void sendFrame(Collection p0){
       this.p(p0);
    }
    public void sendPing(){
       if (this.u == null) {
          this.u = new d();
       }
       this.sendFrame(this.u);
       return;
    }
    public void setAttachment(Object p0){
       this.v = p0;
    }
    public String toString(){
       return super.toString();
    }
}
