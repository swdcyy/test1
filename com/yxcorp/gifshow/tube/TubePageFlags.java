package com.yxcorp.gifshow.tube.TubePageFlags;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class TubePageFlags implements Serializable	// class@001e1a
{
    public String enablePlayHistory;
    public String enableSimilarReco;
    public String enableSubscribe;
    public String showAuthorOtherTubes;
    public String showChannelInfo;
    public String showHistoriesEntrance;
    public String showRankInfo;
    public String showTubeEntrance;
    public static final long serialVersionUID = 0xa271dfbe13305f40;

    public void TubePageFlags(){
       super();
       this.enableSimilarReco = "1";
       this.showTubeEntrance = "1";
       this.enableSubscribe = "1";
       this.showChannelInfo = "1";
       this.showRankInfo = "1";
       this.enablePlayHistory = "1";
       this.showAuthorOtherTubes = "1";
       this.showHistoriesEntrance = "1";
    }
    public boolean isEnablePlayHistory(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.enablePlayHistory).equals("1");
    }
    public boolean isEnableSimilarReco(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.enableSimilarReco).equals("1");
    }
    public boolean isEnableSubscribe(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.enableSubscribe).equals("1");
    }
    public boolean isShowAuthorOtherTubes(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.showAuthorOtherTubes).equals("1");
    }
    public boolean isShowChannelInfo(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.showChannelInfo).equals("1");
    }
    public boolean isShowHistoriesEntrance(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.showHistoriesEntrance).equals("1");
    }
    public boolean isShowRankInfo(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.showRankInfo).equals("1");
    }
    public boolean isShowTubeEntrance(){
       Object obj = PatchProxy.apply(null, this, TubePageFlags.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.showTubeEntrance).equals("1");
    }
}
