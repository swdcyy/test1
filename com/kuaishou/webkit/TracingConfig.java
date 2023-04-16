package com.kuaishou.webkit.TracingConfig;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;

public class TracingConfig	// class@001260
{
    public final List mCustomIncludedCategories;
    public int mPredefinedCategories;
    public int mTracingMode;

    public void TracingConfig(int p0,List p1,int p2){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mCustomIncludedCategories = uArrayList;
       this.mPredefinedCategories = p0;
       uArrayList.addAll(p1);
       this.mTracingMode = p2;
    }
    public List getCustomIncludedCategories(){
       return this.mCustomIncludedCategories;
    }
    public int getPredefinedCategories(){
       return this.mPredefinedCategories;
    }
    public int getTracingMode(){
       return this.mTracingMode;
    }
}
