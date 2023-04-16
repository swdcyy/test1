package com.kuaishou.gifshow.kuaishan.network.KSTemplateDetailListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.LinkedList;

public class KSTemplateDetailListResponse extends PostBaseInfoManager$DetailResponse	// class@001a9b
{
    public List mTemplatesInfo;
    public static final long serialVersionUID = 0x3addc138aea078a1;

    public void KSTemplateDetailListResponse(){
       super();
       this.mTemplatesInfo = new LinkedList();
    }
}
