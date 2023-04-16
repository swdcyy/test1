package com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$UnionResponse;
import java.util.LinkedList;

public class KSFeedGroupListResponse extends PostBaseInfoManager$UnionResponse	// class@001aa6
{
    public List mGroupList;
    public static final long serialVersionUID = 0x74975ec2ab5ca704;

    public void KSFeedGroupListResponse(){
       super();
       this.mGroupList = new LinkedList();
    }
}
