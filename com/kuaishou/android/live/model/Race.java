package com.kuaishou.android.live.model.Race;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.live.model.Round;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Race implements Serializable	// class@000831
{
    public long mCost;
    public List mRounds;
    public long mStartRealTime;
    public long mStartTime;
    public boolean mSuccess;
    public String mTag;

    public void Race(){
       super();
       this.mRounds = new ArrayList();
       this.mTag = "";
    }
    public void clearState(){
       if (PatchProxy.applyVoid(null, this, Race.class, "1")) {
          return;
       }
       this.mStartTime = 0;
       this.mStartRealTime = 0;
       this.mCost = 0;
       this.mSuccess = false;
       Iterator iterator = this.mRounds.iterator();
       while (iterator.hasNext()) {
          iterator.next().clearState();
       }
       return;
    }
    public Race copyRace(){
       Race obj = PatchProxy.apply(null, this, Race.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Race();
       obj.mRounds = new ArrayList();
       Iterator iterator = this.mRounds.iterator();
       while (iterator.hasNext()) {
          obj.mRounds.add(iterator.next().copyRound());
       }
       obj.mTag = this.mTag;
       obj.mStartTime = this.mStartTime;
       obj.mStartRealTime = this.mStartRealTime;
       obj.mCost = this.mCost;
       obj.mSuccess = this.mSuccess;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Race.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Race{mRounds="+this.mRounds+", mTag=\'"+this.mTag+'''+", mStartTime="+this.mStartTime+", mStartRealTime="+this.mStartRealTime+", mCost="+this.mCost+", mSuccess="+this.mSuccess+'}';
    }
}
