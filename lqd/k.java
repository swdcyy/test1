package lqd.k;
import lqd.b;
import io.netty.channel.y;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.d;
import io.netty.channel.c;
import java.lang.Object;
import kqd.e;
import lqd.g;
import lqd.p;
import java.util.Map;
import lqd.h;
import java.util.IdentityHashMap;
import java.util.Objects;
import io.netty.channel.d0;
import zqd.o;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.Boolean;
import io.netty.channel.b0;
import java.lang.StringBuilder;

public class k implements b	// class@001c9f
{
    public final d a;
    public e b;
    public d0 c;
    public b0 d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public static final b0 k;
    public static final AtomicIntegerFieldUpdater l;

    static {
       k.k = y.b;
       AtomicIntegerFieldUpdater uAtomicInteg = PlatformDependent.v(k.class, "autoRead");
       if (uAtomicInteg == null) {
          uAtomicInteg = AtomicIntegerFieldUpdater.newUpdater(k.class, "g");
       }
       k.l = uAtomicInteg;
    }
    public void k(d p0){
       c uoc = new c();
       super();
       this.b = e.a;
       this.d = k.k;
       this.e = 0x7530;
       this.f = 16;
       this.g = 1;
       this.h = true;
       this.i = 0x10000;
       this.j = 0x8000;
       uoc.c(p0.W2().b);
       this.c = uoc;
       this.a = p0;
    }
    public void P(){
    }
    public Map Q(Map p0,h[] p1){
       IdentityHashMap identityHash;
       if (p0 == null) {
          identityHash = new IdentityHashMap();
       }
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          identityHash.put(oobject, this.n0(oobject));
       }
       return identityHash;
    }
    public void R(h p0,Object p1){
       Objects.requireNonNull(p0, "option");
       Objects.requireNonNull(p1, "value");
    }
    public b a(d0 p0){
       o.a(p0, "allocator");
       this.c = p0;
       return this;
    }
    public Map a0(){
       h[] ohArray = new h[10];
       ohArray[0] = h.j;
       ohArray[1] = h.k;
       ohArray[2] = h.l;
       ohArray[3] = h.g;
       ohArray[4] = h.p;
       ohArray[5] = h.q;
       ohArray[6] = h.h;
       ohArray[7] = h.m;
       ohArray[8] = h.n;
       ohArray[9] = h.i;
       return this.Q(null, ohArray);
    }
    public b b(boolean p0){
       int i = 1;
       if (k.l.getAndSet(this, p0) == i) {
       }else {
          i = 0;
       }
       if (p0 && !i) {
          this.a.read();
       }else if(!p0 && i){
          this.P();
       }
       return this;
    }
    public int b0(){
       return this.j;
    }
    public b c(int p0){
       if (p0 <= 0) {
          throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
       }
       this.f = p0;
       return this;
    }
    public boolean c0(){
       return this.h;
    }
    public b d(int p0){
       try{
          this.j0().c(p0);
          return this;
       }catch(java.lang.ClassCastException e3){
          throw new IllegalStateException("getRecvByteBufAllocator\(\) must return an object of type MaxMessagesRecvByteBufAllocator", e3);
       }
    }
    public boolean d0(Map p0){
       Objects.requireNonNull(p0, "options");
       boolean b = true;
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          h key = uEntry.getKey();
          if (!this.e0(key, uEntry.getValue())) {
             b = false;
          }
       }
       return b;
    }
    public b e(int p0){
       if (p0 >= 0) {
          this.e = p0;
          return this;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d \(expected: >= 0\)", objArray));
       }
    }
    public boolean e0(h p0,Object p1){
       this.R(p0, p1);
       if (p0 == h.j) {
          this.e(p1.intValue());
       }else if(p0 == h.k){
          this.d(p1.intValue());
       }else if(p0 == h.l){
          this.c(p1.intValue());
       }else if(p0 == h.g){
          this.g(p1);
       }else if(p0 == h.h){
          this.a(p1);
       }else if(p0 == h.p){
          this.b(p1.booleanValue());
       }else if(p0 == h.q){
          this.i(p1.booleanValue());
       }else if(p0 == h.m){
          this.m(p1.intValue());
       }else if(p0 == h.n){
          this.p(p1.intValue());
       }else if(p0 == h.i){
          this.f(p1);
       }else {
          return false;
       }
       return true;
    }
    public b f(b0 p0){
       Objects.requireNonNull(p0, "estimator");
       this.d = p0;
       return this;
    }
    public int f0(){
       return this.e;
    }
    public b g(e p0){
       Objects.requireNonNull(p0, "allocator");
       this.b = p0;
       return this;
    }
    public int g0(){
       try{
          return this.j0().e();
       }catch(java.lang.ClassCastException e0){
          throw new IllegalStateException("getRecvByteBufAllocator\(\) must return an object of type MaxMessagesRecvByteBufAllocator", e0);
       }
    }
    public e h0(){
       return this.b;
    }
    public b i(boolean p0){
       this.h = p0;
       return this;
    }
    public b0 i0(){
       return this.d;
    }
    public d0 j0(){
       return this.c;
    }
    public int k0(){
       return this.f;
    }
    public boolean l0(){
       boolean b = true;
       if (this.g == b) {
       }else {
          b = false;
       }
       return b;
    }
    public b m(int p0){
       if (p0 < this.b0()) {
          throw new IllegalArgumentException("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark \("+this.b0()+"\): "+p0);
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
       }
       this.i = p0;
       return this;
    }
    public int m0(){
       return this.i;
    }
    public Object n0(h p0){
       Objects.requireNonNull(p0, "option");
       if (p0 == h.j) {
          return Integer.valueOf(this.f0());
       }
       if (p0 == h.k) {
          return Integer.valueOf(this.j0().e());
       }
       if (p0 == h.l) {
          return Integer.valueOf(this.k0());
       }
       if (p0 == h.g) {
          return this.h0();
       }
       if (p0 == h.h) {
          return this.j0();
       }
       if (p0 == h.p) {
          return Boolean.valueOf(this.l0());
       }
       if (p0 == h.q) {
          return Boolean.valueOf(this.c0());
       }
       if (p0 == h.m) {
          return Integer.valueOf(this.m0());
       }
       if (p0 == h.n) {
          return Integer.valueOf(this.b0());
       }
       if (p0 == h.i) {
          return this.i0();
       }
       return null;
    }
    public b p(int p0){
       if (p0 > this.m0()) {
          throw new IllegalArgumentException("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark \("+this.m0()+"\): "+p0);
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
       }
       this.j = p0;
       return this;
    }
}
