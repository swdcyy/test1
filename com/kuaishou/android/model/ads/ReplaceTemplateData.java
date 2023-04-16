package com.kuaishou.android.model.ads.ReplaceTemplateData;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class ReplaceTemplateData implements Serializable	// class@000a79
{
    public ReplaceTemplateData$ReplaceCardInfo mAdCardTemplateInfo;
    public ReplaceTemplateData$ReplacePlayEndInfo mPlayEndInfo;
    public String mTemplateStyleInfos;
    public List mTemplates;
    public List mTkTemplateDatas;
    public static final long serialVersionUID = 0x402b7d2f4b6ed382;

    public void ReplaceTemplateData(){
       super();
       this.mTemplates = new ArrayList();
       this.mTkTemplateDatas = new ArrayList();
    }
}
