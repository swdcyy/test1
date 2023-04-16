package kshark.lite.internal.HprofInMemoryIndex;
import kshark.lite.internal.HprofInMemoryIndex$b;
import nsd.u;
import utd.f;
import utd.d;
import kshark.lite.internal.SortedBytesMap;
import java.util.List;
import std.c;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import wsd.m;
import kshark.lite.internal.HprofInMemoryIndex$indexedClassSequence$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import kshark.lite.internal.HprofInMemoryIndex$indexedInstanceSequence$1;
import kshark.lite.internal.HprofInMemoryIndex$indexedObjectArraySequence$1;
import kshark.lite.internal.HprofInMemoryIndex$indexedPrimitiveArraySequence$1;
import std.a;
import std.i$a;

public final class HprofInMemoryIndex	// class@001bcc
{
    public final int a;
    public final f b;
    public final d c;
    public final SortedBytesMap d;
    public final SortedBytesMap e;
    public final SortedBytesMap f;
    public final SortedBytesMap g;
    public final List h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final c n;
    public final int o;
    public static final HprofInMemoryIndex$b p;

    static {
       HprofInMemoryIndex.p = new HprofInMemoryIndex$b(null);
    }
    public void HprofInMemoryIndex(int p0,f p1,d p2,SortedBytesMap p3,SortedBytesMap p4,SortedBytesMap p5,SortedBytesMap p6,List p7,int p8,int p9,int p10,int p11,boolean p12,c p13,int p14,u p15){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
    }
    public final String a(long p0,long p1){
       return this.c(p1);
    }
    public final c b(){
       return this.n;
    }
    public final String c(long p0){
       HprofInMemoryIndex tb = this.b;
       f uof = null;
       f uof1 = null;
       if (!p0 - uof1) {
          if (tb.f != null) {
             uof = tb.b[(tb.d + 1)];
          }
       }else {
          f a = tb.a;
          f d = tb.d;
          int i = tb.c(p0) & d;
          long l = a[i];
          while (l - uof1) {
             if (!l - p0) {
                uof = tb.b[i];
                break ;
             }
             i = i + 1;
             i = i & d;
             l = a[i];
          }
       }
       if (uof != null) {
          return uof;
       }else {
          throw new IllegalArgumentException("Hprof string "+p0+" not in cache");
       }
    }
    public final m d(){
       return SequencesKt___SequencesKt.b1(this.d.b(), new HprofInMemoryIndex$indexedClassSequence$1(this));
    }
    public final m e(){
       return SequencesKt___SequencesKt.b1(this.e.b(), new HprofInMemoryIndex$indexedInstanceSequence$1(this));
    }
    public final m f(){
       return SequencesKt___SequencesKt.b1(this.f.b(), new HprofInMemoryIndex$indexedObjectArraySequence$1(this));
    }
    public final m g(){
       return SequencesKt___SequencesKt.b1(this.g.b(), new HprofInMemoryIndex$indexedPrimitiveArraySequence$1(this));
    }
    public final i$a h(a p0){
       i$a uoa = new i$a(p0.d(this.a), p0.b(), p0.c(), p0.d(this.i), (int)p0.d(this.o));
       return p0;
    }
}
