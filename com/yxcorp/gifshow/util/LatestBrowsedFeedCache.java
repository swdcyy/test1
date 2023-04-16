package com.yxcorp.gifshow.util.LatestBrowsedFeedCache;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$currentFeedLruMap$1;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$a;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$Operation;

public final class LatestBrowsedFeedCache	// class@001ef4
{
    public static final ReentrantReadWriteLock a;
    public static final ReentrantReadWriteLock$ReadLock b;
    public static final ReentrantReadWriteLock$WriteLock c;
    public static final LinkedHashMap d;
    public static QPhoto e;
    public static boolean f;
    public static final a g;
    public static final LatestBrowsedFeedCache h;

    static {
       LatestBrowsedFeedCache.h = new LatestBrowsedFeedCache();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       LatestBrowsedFeedCache.a = reentrantRea;
       LatestBrowsedFeedCache.b = reentrantRea.readLock();
       LatestBrowsedFeedCache.c = reentrantRea.writeLock();
       LatestBrowsedFeedCache.d = new LatestBrowsedFeedCache$currentFeedLruMap$1();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<FeedEvent>\(\)");
       LatestBrowsedFeedCache.g = uoa;
    }
    public void LatestBrowsedFeedCache(){
       super();
    }
    public final QPhoto a(){
       return LatestBrowsedFeedCache.e;
    }
    public final boolean b(){
       return LatestBrowsedFeedCache.f;
    }
    public final a c(){
       return LatestBrowsedFeedCache.g;
    }
    public final void d(QPhoto p0){
       if (LatestBrowsedFeedCache.e == p0 && LatestBrowsedFeedCache.f) {
          LatestBrowsedFeedCache.g.onNext(new LatestBrowsedFeedCache$a(p0, LatestBrowsedFeedCache$Operation.INACTIVE));
          LatestBrowsedFeedCache.f = false;
       }
       return;
    }
}
