package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag$ADVISE;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import o56.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.app.Application;

public final class GrowthCleanerTag$ADVISE extends GrowthCleanerTag	// class@001342
{
    public final boolean isSelected;
    public final int level;
    public final String showTag;
    public final int showTagColor;

    public void GrowthCleanerTag$ADVISE(String p0,int p1){
       super(p0, p1, null);
       this.level = 3;
       this.showTag = GrowthCleanerHelper.c(0x7f1005a4);
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       this.showTagColor = b.getResources().getColor(0x7f061f7d);
    }
    public int getLevel(){
       return this.level;
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
