package com.kwai.video.wayne.player.config.ks_sub.VodP2spConfig;
import com.kwai.video.wayne.player.config.inerface.VodP2spConfigInterface;
import java.lang.Object;
import java.lang.String;

public class VodP2spConfig implements VodP2spConfigInterface	// class@000d06
{
    public int cdnRequestInitialSize;
    public int cdnRequestMaxSize;
    public boolean holeIgnoreSpeedcal;
    public int offThreshold;
    public int onThreshold;
    public String params;
    public String policy;
    public int taskMaxSize;
    public String taskVersion;

    public void VodP2spConfig(){
       super();
       this.policy = "";
       this.params = "";
       this.taskVersion = "";
       this.taskMaxSize = 0x8000000;
       this.cdnRequestMaxSize = 0x10000;
       this.cdnRequestInitialSize = 0x100000;
       this.onThreshold = 90;
       this.offThreshold = 50;
       this.holeIgnoreSpeedcal = false;
    }
    public int getP2spCdnRequestInitialSize(boolean p0){
       return this.cdnRequestInitialSize;
    }
    public int getP2spCdnRequestMaxSize(boolean p0){
       return this.cdnRequestMaxSize;
    }
    public int getP2spOffThreshold(boolean p0){
       return this.offThreshold;
    }
    public int getP2spOnThreshold(boolean p0){
       return this.onThreshold;
    }
    public String getP2spParams(boolean p0){
       return this.params;
    }
    public String getP2spPolicy(boolean p0){
       return this.policy;
    }
    public int getP2spTaskMaxSize(boolean p0){
       return this.taskMaxSize;
    }
    public String getP2spTaskVersion(boolean p0){
       return this.taskVersion;
    }
    public boolean isP2spHoleIgnoreSpeedcal(boolean p0){
       return this.holeIgnoreSpeedcal;
    }
}
