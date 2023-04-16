package kshark.lite.internal.SortedBytesMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.m;
import usd.k;
import usd.q;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kshark.lite.internal.SortedBytesMap$entrySequence$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import std.a;
import std.b;

public final class SortedBytesMap	// class@001bd2
{
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final byte[] f;

    public void SortedBytesMap(boolean p0,int p1,byte[] p2){
       a.p(p2, "sortedEntries");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       int i = (p0)? 8: 4;
       this.a = i;
       i = i + p1;
       this.b = i;
       this.c = p2.length / i;
       return;
    }
    public final int a(long p0){
       int i2;
       int i = this.c - 1;
       int i1 = 0;
       while (true) {
          if (i1 > i) {
             return (~ i1);
          }
          i2 = i1 + i;
          i2 = i2 >> 1;
          if ((v5 = this.g(i2) - p0) < 0) {
             i2 = i2 + 1;
             i1 = i2;
          }else if(v5 > 0){
             i2 = i2 - 1;
             i = i2;
          }else {
             break ;
          }
       }
       return i2;
    }
    public final m b(){
       return SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(q.n1(0, this.c)), new SortedBytesMap$entrySequence$1(this));
    }
    public final a c(long p0){
       int i = this.a(p0);
       if (i < 0) {
          return null;
       }
       return this.d(i);
    }
    public final a d(int p0){
       return new a(this.f, ((p0 * this.b) + this.a), this.e, this.d);
    }
    public final int e(){
       return this.c;
    }
    public final int f(long p0){
       return this.a(p0);
    }
    public final long g(int p0){
       p0 = p0 * this.b;
       long l = (this.d != null)? b.b(this.f, p0): (long)b.a(this.f, p0);
       return l;
    }
}
