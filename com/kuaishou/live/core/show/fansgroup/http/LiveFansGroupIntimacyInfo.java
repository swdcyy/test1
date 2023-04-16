package com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.j$b;
import ok.j;

public class LiveFansGroupIntimacyInfo implements Serializable	// class@000b44
{
    public int mLevel;
    public int mScore;
    public int mStatus;
    public static final long serialVersionUID = 0xe015c6135f4511f9;

    public void LiveFansGroupIntimacyInfo(){
       super();
       this.mScore = 0;
       this.mLevel = 0;
       this.mStatus = 0;
    }
    public void LiveFansGroupIntimacyInfo(int p0,int p1,int p2){
       super();
       this.mScore = p0;
       this.mLevel = p1;
       this.mStatus = p2;
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveFansGroupIntimacyInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.a("mScore", this.mScore);
       obj.a("mLevel", this.mLevel);
       obj.a("mStatus", this.mStatus);
       return obj.toString();
    }
}
