package ba1.d;
import hf3.a;
import hf3.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ba1.a;
import hf3.e;
import mf3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf3.a;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Integer;
import lf3.g;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import wkd.b;
import zb5.i;
import j85.e;
import e93.f;
import java.util.Map;
import java.util.ArrayList;
import lf3.i;
import lf3.d;
import java.util.Set;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import com.google.protobuf.nano.MessageNano;
import v00.c;
import nf3.a;
import java.lang.Throwable;
import java.util.Iterator;

public class d implements a	// class@000329
{
    public final a a;
    public boolean b;
    public final b c;
    public final Map d;
    public final Set e;
    public final e f;

    public void d(b p0){
       super();
       this.b = false;
       this.d = new ConcurrentHashMap();
       this.e = new CopyOnWriteArraySet();
       this.f = new a(this);
       this.c = p0;
       this.a = new e(p0);
    }
    public a A0(){
       Object obj = PatchProxy.apply(null, this, d.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.A0();
    }
    public void B0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       this.a.B0(p0);
       return;
    }
    public JsonObject C0(){
       Object obj = PatchProxy.apply(null, this, d.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.C0();
    }
    public boolean D0(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.D0();
    }
    public void E0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "26")) {
          return;
       }
       this.a.E0(p0);
       return;
    }
    public void F0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       this.a.F0(p0);
       return;
    }
    public void J(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, d.class, "18")) {
          return;
       }
       this.a.J(p0, p1, p2, p3);
       this.b(p0, p1, p2, p3);
       return;
    }
    public void a(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       LiveLogTag lIVE_SOCKET = LiveLogTag.LIVE_SOCKET;
       lIVE_SOCKET.appendTag("LiveSocketImpl");
       b.P(lIVE_SOCKET, "forceExit: "+this.k());
       this.a.a();
       if (!PatchProxy.applyVoid(objArray, this, uod, "29")) {
          if (this.b != null) {
             b.Z(lIVE_SOCKET, "unregisterImConnection");
             b.a(-1989170423).g(this.f);
             this.b = false;
          }
          f.g(this);
       }
       return;
    }
    public final void b(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, d.class, "30")) {
          return;
       }
       List list = this.d.get(Integer.valueOf(p0));
       if (list == null) {
          list = new ArrayList();
          this.d.put(Integer.valueOf(p0), list);
       }
       list.add(new i(p0, p1, p2, p3));
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "19")) {
          return;
       }
       this.a.c(p0);
       this.e.add(p0);
       return;
    }
    public void clearAllListener(){
       if (PatchProxy.applyVoid(null, this, d.class, "21")) {
          return;
       }
       this.a.clearAllListener();
       return;
    }
    public void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "24")) {
          return;
       }
       this.a.d(p0);
       return;
    }
    public void disconnect(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       b.P(LiveLogTag.LIVE_SOCKET.appendTag("LiveSocketImpl"), "disconnect: "+this.k());
       this.a.disconnect();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       this.a.e();
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "25")) {
          return;
       }
       this.a.f(p0);
       return;
    }
    public void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "20")) {
          return;
       }
       this.a.g(p0);
       this.e.remove(p0);
       return;
    }
    public Race h(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.h();
    }
    public void i(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       this.a.i(p0);
       return;
    }
    public boolean isConnected(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isConnected();
    }
    public l$c j(){
       Object obj = PatchProxy.apply(null, this, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j();
    }
    public final String k(){
       Object obj = PatchProxy.apply(null, this, d.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{isLite: "+this.c.e+", isSimple: "+this.c.d+", anchorId: "+this.c.h+", liveStreamid: "+this.c.e()+"}";
    }
    public final MessageNano l(SocketMessages$SocketMessage p0,Class p1){
       byte[] uobyteArray;
       SocketMessages$SocketMessage obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.payload;
       if (p0.compressionType == 2) {
          uobyteArray = c.a(obj);
       }
       return this.m(uobyteArray, p1);
    }
    public final MessageNano m(byte[] p0,Class p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new a(p1);
          return obj.a(p0);
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e5){
          b.H(LiveLogTag.LIVE_SOCKET, "failed to parse im message", "payload", p0, e5);
          return null;
       }
    }
    public void o(int p0,g p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "17")) {
          return;
       }
       this.a.o(p0, p1);
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "31")) {
          List list = this.d.get(Integer.valueOf(p0));
          if (list != null) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   i oi = iterator.next();
                   if (oi.a == p0 && oi.c == p1) {
                      iterator.remove();
                   }
                }
                if (list.isEmpty()) {
                   this.d.remove(Integer.valueOf(p0));
                   break ;
                }
             }
          }
       }
       return;
    }
    public void pause(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_SOCKET.appendTag("LiveSocketImpl"), "pause: "+this.k());
       this.a.pause(p0);
       return;
    }
    public void resume(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
          return;
       }
       LiveLogTag lIVE_SOCKET = LiveLogTag.LIVE_SOCKET;
       lIVE_SOCKET.appendTag("LiveSocketImpl");
       b.P(lIVE_SOCKET, "resume: "+this.k());
       this.a.resume();
       if (!PatchProxy.applyVoid(objArray, this, uod, "28") && this.b == null) {
          b.Z(lIVE_SOCKET, "registerImConnection");
          String[] stringArray = new String[]{"Push.WebServer.Live"};
          b.a(-1989170423).e(this.f, stringArray);
          this.b = true;
       }
       return;
    }
    public void u0(int p0,Class p1,g p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "16")) {
          return;
       }
       this.a.u0(p0, p1, p2);
       this.b(p0, p1, p2, true);
       return;
    }
    public void v0(){
       b.P(LiveLogTag.LIVE_SOCKET.appendTag("LiveSocketImpl"), "exitImmediately: "+this.k());
       this.a();
    }
    public void w0(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       this.a.w0();
       return;
    }
    public boolean x0(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.x0();
    }
    public void y0(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       this.a.y0();
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       b.P(LiveLogTag.LIVE_SOCKET.appendTag("LiveSocketImpl"), "reconnect: "+this.k());
       this.a.z0();
       return;
    }
}
