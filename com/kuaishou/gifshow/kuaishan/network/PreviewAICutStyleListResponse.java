package com.kuaishou.gifshow.kuaishan.network.PreviewAICutStyleListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.LinkedList;

public class PreviewAICutStyleListResponse extends PostBaseInfoManager$DetailResponse	// class@001aa4
{
    public PreviewAICutStyleListResponse$GroupInfo mGroupInfo;
    public int mResult;
    public List mStyleList;
    public static final long serialVersionUID = 0x8d0e28779aa35a5a;

    public void PreviewAICutStyleListResponse(){
       super();
       this.mStyleList = new LinkedList();
    }
}
