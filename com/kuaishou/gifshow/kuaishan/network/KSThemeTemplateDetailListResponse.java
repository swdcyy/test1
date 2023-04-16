package com.kuaishou.gifshow.kuaishan.network.KSThemeTemplateDetailListResponse;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import java.util.LinkedList;

public class KSThemeTemplateDetailListResponse extends PostBaseInfoManager$DetailResponse	// class@001aa0
{
    public int mResult;
    public List mTemplatesInfo;
    public static final long serialVersionUID = 0xf8a842b3f529e151;

    public void KSThemeTemplateDetailListResponse(){
       super();
       this.mTemplatesInfo = new LinkedList();
    }
}
