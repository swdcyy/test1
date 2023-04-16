package com.kwai.yoda.session.logger.batch.HybridBatchDataWebEventItem;
import com.kwai.yoda.session.logger.batch.HybridBatchDataItem;
import java.lang.String;

public final class HybridBatchDataWebEventItem extends HybridBatchDataItem	// class@0012d5
{
    public String level;
    public String tag;

    public void HybridBatchDataWebEventItem(){
       super();
    }
    public final String getLevel(){
       return this.level;
    }
    public final String getTag(){
       return this.tag;
    }
    public final void setLevel(String p0){
       this.level = p0;
    }
    public final void setTag(String p0){
       this.tag = p0;
    }
}
