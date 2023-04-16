package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$UNDEFINED;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.String;
import nsd.u;

public final class GrowthCleanerTag$UNDEFINED extends GrowthCleanerTag	// class@001347
{
    public final boolean isSelected;
    public final String showTag;
    public final int showTagColor;

    public void GrowthCleanerTag$UNDEFINED(String p0,int p1){
       super(p0, p1, null);
       this.showTag = "";
       this.showTagColor = -1;
    }
    public String getShowTag(){
       return this.showTag;
    }
    public int getShowTagColor(){
       return this.showTagColor;
    }
    public boolean isSelected(){
       return this.isSelected;
    }
}
