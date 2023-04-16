package com.yxcorp.gifshow.entity.BatchFollowInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class BatchFollowInfo implements Serializable	// class@000d5e
{
    public String mFollowContent;
    public String mPageRef;
    public List mUserIds;

    public void BatchFollowInfo(String p0,String p1,String p2){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mUserIds = uArrayList;
       uArrayList.add(p0);
       this.mPageRef = p1;
       this.mFollowContent = p2;
    }
    public void BatchFollowInfo(List p0,String p1){
       super();
       this.mUserIds = p0;
       this.mPageRef = p1;
    }
}
