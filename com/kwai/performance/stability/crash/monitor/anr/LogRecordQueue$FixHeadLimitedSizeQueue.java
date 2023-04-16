package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$FixHeadLimitedSizeQueue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.Iterator;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Arrays;
import java.util.AbstractCollection;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$FixHeadLimitedSizeQueue$a;

public class LogRecordQueue$FixHeadLimitedSizeQueue extends LinkedList	// class@00119c
{
    public final int mBatchPop;
    public final Object[] mHeader;
    public int mHeaderIndex;
    public final int mMaxSize;

    public void LogRecordQueue$FixHeadLimitedSizeQueue(int p0,int p1,int p2){
       super();
       this.mHeaderIndex = 0;
       this.mMaxSize = p0;
       this.mBatchPop = p1;
       Object[] objArray = new Object[p2];
       this.mHeader = objArray;
    }
    public static Iterator access$1301(LogRecordQueue$FixHeadLimitedSizeQueue p0){
       return super.iterator();
    }
    public boolean add(Object p0){
       LogRecordQueue$FixHeadLimitedSizeQueue tmHeaderInde = this.mHeaderIndex;
       LogRecordQueue$FixHeadLimitedSizeQueue tmHeader = this.mHeader;
       if (tmHeaderInde < tmHeader.length) {
          this.mHeaderIndex = tmHeaderInde + 1;
          tmHeader[tmHeaderInde] = p0;
          return true;
       }else if(this.mMaxSize != -1 && this.size() > this.mMaxSize){
          int i = 0;
          while (this.size() > this.mMaxSize || i < this.mBatchPop) {
             this.pop();
             i = i + 1;
          }
       }
       return super.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       throw new UnsupportedOperationException("addAll");
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException("addAll");
    }
    public void clear(){
       Arrays.fill(this.mHeader, null);
       this.mHeaderIndex = 0;
       super.clear();
    }
    public boolean isEmpty(){
       boolean b = (this.mHeaderIndex == null && super.isEmpty())? true: false;
       return b;
    }
    public Iterator iterator(){
       return new LogRecordQueue$FixHeadLimitedSizeQueue$a(this);
    }
    public Object remove(int p0){
       throw new UnsupportedOperationException("remove");
    }
    public boolean remove(Object p0){
       throw new UnsupportedOperationException("remove");
    }
    public int size(){
       return (this.mHeaderIndex + super.size());
    }
    public String toString(){
       return super.toString();
    }
}
