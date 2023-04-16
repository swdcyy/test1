package com.kuaishou.ax2c.PreloadParam$Builder;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.ax2c.PreloadParam;
import com.kuaishou.ax2c.PreloadParam$1;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.kuaishou.ax2c.PreLoader$InflateListener;

public class PreloadParam$Builder	// class@000fbf
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

    public void PreloadParam$Builder(Context p0){
       super();
       this.repeatCount = 1;
       this.maxCount = 15;
       this.useMutableContext = false;
       this.useAx2c = true;
       this.forceUpgradeLimit = false;
       this.tag = "";
       this.layoutIds = new ArrayList();
       this.context = p0;
    }
    public PreloadParam$Builder addLayoutId(int p0){
       this.layoutIds.add(Integer.valueOf(p0));
       return this;
    }
    public PreloadParam build(){
       PreloadParam preloadParam = new PreloadParam(null);
       if (this.context == null) {
          throw new IllegalArgumentException("需要设置context");
       }
       if (!this.layoutIds.size()) {
          throw new IllegalArgumentException("需要设置预加载的layout id");
       }
       if (this.layoutIds.size() > 1 && this.repeatCount > 1) {
          throw new IllegalArgumentException("同时加载多个布局的情况下, repeatCount最大为1");
       }
       preloadParam.setContext(this.context);
       preloadParam.setLayoutIds(this.layoutIds);
       preloadParam.setUseAx2c(this.useAx2c);
       preloadParam.setTag(this.tag);
       preloadParam.setUseMutableContext(this.useMutableContext);
       preloadParam.setInflateListener(this.inflateListener);
       preloadParam.setForceUpgradeLimit(this.forceUpgradeLimit);
       if (this.layoutIds.size() > 1) {
          preloadParam.setMaxCount(this.maxCount);
       }else {
          preloadParam.setRepeatCount(this.repeatCount);
       }
       return preloadParam;
    }
    public PreloadParam$Builder setContext(Context p0){
       this.context = p0;
       return this;
    }
    public PreloadParam$Builder setForceUpgradeLimit(boolean p0){
       this.forceUpgradeLimit = p0;
       return this;
    }
    public PreloadParam$Builder setInflateListener(PreLoader$InflateListener p0){
       this.inflateListener = p0;
       return this;
    }
    public PreloadParam$Builder setMaxCount(int p0){
       this.maxCount = p0;
       return this;
    }
    public PreloadParam$Builder setRepeatCount(int p0){
       this.repeatCount = p0;
       return this;
    }
    public PreloadParam$Builder setTag(String p0){
       this.tag = p0;
       return this;
    }
    public PreloadParam$Builder setUseAx2c(boolean p0){
       this.useAx2c = p0;
       return this;
    }
    public PreloadParam$Builder setUseMutableContext(boolean p0){
       this.useMutableContext = p0;
       return this;
    }
}
