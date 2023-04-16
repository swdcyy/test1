package com.kuaishou.ax2c.PreloadParam;
import java.lang.Object;
import com.kuaishou.ax2c.PreloadParam$1;
import android.content.Context;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import java.util.List;
import java.lang.String;

public class PreloadParam	// class@000fc0
{
    public Context context;
    public boolean forceUpgradeLimit;
    public PreLoader$InflateListener inflateListener;
    public List layoutIds;
    public int maxCount;
    public int repeatCount;
    public String tag;
    public boolean useAx2c;
    public boolean useMutableContext;

    public void PreloadParam(){
       super();
       this.repeatCount = 1;
       this.maxCount = 15;
       this.useMutableContext = false;
       this.useAx2c = true;
       this.forceUpgradeLimit = false;
       this.tag = "";
    }
    public void PreloadParam(PreloadParam$1 p0){
       super();
    }
    public void setContext(Context p0){
       this.context = p0;
    }
    public void setForceUpgradeLimit(boolean p0){
       this.forceUpgradeLimit = p0;
    }
    public void setInflateListener(PreLoader$InflateListener p0){
       this.inflateListener = p0;
    }
    public void setLayoutIds(List p0){
       this.layoutIds = p0;
    }
    public void setMaxCount(int p0){
       this.maxCount = p0;
    }
    public void setRepeatCount(int p0){
       this.repeatCount = p0;
    }
    public void setTag(String p0){
       this.tag = p0;
    }
    public void setUseAx2c(boolean p0){
       this.useAx2c = p0;
    }
    public void setUseMutableContext(boolean p0){
       this.useMutableContext = p0;
    }
}
