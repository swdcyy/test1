package com.yxcorp.gifshow.tube.TubeRankInfo;
import java.io.Serializable;
import java.lang.Object;

public class TubeRankInfo implements Serializable	// class@00132e
{
    public String coverUrl;
    public String rankId;
    public String rankName;
    public String rankNum;
    public String ruleUrl;
    public long totalSubscribeCount;
    public long updateTime;
    public static final long serialVersionUID = 0xb0942bd2bfc04dd0;

    public void TubeRankInfo(){
       super();
       this.totalSubscribeCount = 0;
       this.updateTime = 0;
    }
}
