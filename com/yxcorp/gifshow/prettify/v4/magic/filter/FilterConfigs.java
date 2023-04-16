package com.yxcorp.gifshow.prettify.v4.magic.filter.FilterConfigs;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;

public class FilterConfigs implements Serializable, Cloneable	// class@0011a5
{
    public List mFilterConfigs;
    public List mGroupInfos;
    public List mNormalConfigsWithDivider;
    public List mThemeFilterConfigs;
    public static final long serialVersionUID = 0xb3b2c5680e72f6b7;

    public void FilterConfigs(){
       super();
       this.mFilterConfigs = new ArrayList();
       this.mThemeFilterConfigs = new ArrayList();
       this.mNormalConfigsWithDivider = new ArrayList();
       this.mGroupInfos = new ArrayList();
    }
}
