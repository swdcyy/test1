package com.kuaishou.gifshow.kuaishan.network.MediaSceneConfigListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.LinkedList;

public class MediaSceneConfigListResponse extends PostBaseInfoManager$DetailResponse	// class@001aa1
{
    public int mResult;
    public List mTemplatesInfo;
    public static final long serialVersionUID = 0x8d0e28779aa35a5a;

    public void MediaSceneConfigListResponse(){
       super();
       this.mTemplatesInfo = new LinkedList();
    }
}
