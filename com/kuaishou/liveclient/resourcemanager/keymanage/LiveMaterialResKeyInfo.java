package com.kuaishou.liveclient.resourcemanager.keymanage.LiveMaterialResKeyInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LiveMaterialResKeyInfo implements Serializable	// class@00108f
{
    public String mGroupName;
    public String mResId;
    public String mSubBiz;

    public void LiveMaterialResKeyInfo(String p0,String p1,String p2){
       super();
       this.mSubBiz = p0;
       this.mGroupName = p1;
       this.mResId = p2;
    }
}
