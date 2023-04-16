package com.kuaishou.android.live.model.Round;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.live.model.Horse;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.Round;
import com.kuaishou.protobuf.livestream.nano.Horse;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Round implements Serializable	// class@000835
{
    public long[] mBarriers;
    public long mCost;
    public List mHorses;
    public int mPolicy;
    public long mStartRealTime;
    public long mStartTime;
    public boolean mSuccess;
    public String mTag;
    public long mTimeout;

    public void Round(){
       super();
       this.mHorses = new ArrayList();
       this.mTimeout = 500;
       this.mPolicy = 1;
       long[] olongArray = new long[0];
       this.mBarriers = olongArray;
       this.mTag = "";
    }
    public void clearState(){
       if (PatchProxy.applyVoid(null, this, Round.class, "2")) {
          return;
       }
       this.mSuccess = false;
       this.mStartTime = 0;
       this.mStartRealTime = 0;
       this.mCost = 0;
       Iterator iterator = this.mHorses.iterator();
       while (iterator.hasNext()) {
          iterator.next().clearState();
       }
       return;
    }
    public Round copyRound(){
       Round obj = PatchProxy.apply(null, this, Round.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Round();
       obj.mHorses = new ArrayList();
       Iterator iterator = this.mHorses.iterator();
       while (iterator.hasNext()) {
          obj.mHorses.add(iterator.next().copyHorse());
       }
       obj.mTimeout = this.mTimeout;
       obj.mPolicy = this.mPolicy;
       long[] olongArray = new long[this.mBarriers.length];
       obj.mBarriers = olongArray;
       Round tmBarriers = this.mBarriers;
       System.arraycopy(tmBarriers, 0, olongArray, 0, tmBarriers.length);
       obj.mTag = this.mTag;
       obj.mSuccess = this.mSuccess;
       obj.mStartTime = this.mStartTime;
       obj.mCost = this.mCost;
       obj.mStartRealTime = this.mStartRealTime;
       return obj;
    }
    public Round toProto(){
       Round obj = PatchProxy.apply(null, this, Round.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Round();
       obj.barrier = this.mBarriers;
       obj.policy = this.mPolicy;
       obj.timeout = this.mTimeout;
       obj.success = this.mSuccess;
       obj.cost = this.mCost;
       obj.startTime = this.mStartTime;
       obj.tag = this.mTag;
       Horse[] horseArray = new Horse[this.mHorses.size()];
       obj.horse = horseArray;
       for (int i = 0; i < this.mHorses.size(); i = i + 1) {
          obj.horse[i] = this.mHorses.get(i).toProto();
       }
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Round.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ("Round{"+"mHorses="+this.mHorses+", mTimeout="+this.mTimeout+", mPolicy="+this.mPolicy+", mBarriers="+Arrays.toString(this.mBarriers)+", mTag=\'"+this.mTag+'''+", mSuccess="+this.mSuccess+", mStartTime="+this.mStartTime+", mStartRealTime="+this.mStartRealTime+", mCost="+this.mCost+'}').substring(0);
    }
}
