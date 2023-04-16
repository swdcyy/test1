package com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedDetailListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.LinkedList;

public class KSTemplateFeedDetailListResponse extends PostBaseInfoManager$DetailResponse	// class@001aa7
{
    public List mTemplateList;
    public static final long serialVersionUID = 0x406b1979155a74f;

    public void KSTemplateFeedDetailListResponse(){
       super();
       this.mTemplateList = new LinkedList();
    }
}
