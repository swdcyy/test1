package com.yxcorp.gifshow.relation.explore.model.TabConfig$TabInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public class TabConfig$TabInfo implements Serializable	// class@00181a
{
    public Class fragmentClass;
    public String tabId;
    public String tabName;
    public static final long serialVersionUID = 0xb730aa857dabe479;

    public void TabConfig$TabInfo(String p0,String p1,Class p2){
       super();
       this.tabId = p0;
       this.tabName = p1;
       this.fragmentClass = p2;
    }
}
