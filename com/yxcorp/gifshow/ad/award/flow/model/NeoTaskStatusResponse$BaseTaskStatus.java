package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BaseTaskStatus;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BaseTaskStatus$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public class NeoTaskStatusResponse$BaseTaskStatus implements Serializable	// class@00103f
{
    public final String label;
    public final int maxProgress;
    public final int progress;
    public final String progressDisplay;
    public final int singleAwardAmount;
    public final String subTitle;
    public final String titlePrefix;
    public final String titleSuffix;
    public int type;
    public static final NeoTaskStatusResponse$BaseTaskStatus$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$BaseTaskStatus.Companion = new NeoTaskStatusResponse$BaseTaskStatus$a(null);
    }
    public void NeoTaskStatusResponse$BaseTaskStatus(){
       super();
       this.progressDisplay = "";
    }
    public static void getType$annotations(){
    }
    public final String getLabel(){
       return this.label;
    }
    public final int getMaxProgress(){
       return this.maxProgress;
    }
    public final int getProgress(){
       return this.progress;
    }
    public final String getProgressDisplay(){
       return this.progressDisplay;
    }
    public final int getSingleAwardAmount(){
       return this.singleAwardAmount;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitlePrefix(){
       return this.titlePrefix;
    }
    public final String getTitleSuffix(){
       return this.titleSuffix;
    }
    public final int getType(){
       return this.type;
    }
    public final boolean isComplete(){
       NeoTaskStatusResponse$BaseTaskStatus tmaxProgress = this.maxProgress;
       boolean b = (tmaxProgress != null && this.progress == tmaxProgress)? true: false;
       return b;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}
