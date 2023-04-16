package com.kwai.feature.post.api.aicut.AICutProjectOption;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;

public final class AICutProjectOption implements Serializable	// class@0012c5
{
    public List mMedias;
    public final String mMusicId;
    public final int mMusicType;
    public final String mTaskId;
    public final int mTemplateType;
    public final String mThemeId;
    public static final long serialVersionUID = 0x40a4b9d9211c2aaf;

    public void AICutProjectOption(String p0,String p1,int p2,String p3,int p4){
       super();
       this.mMedias = new ArrayList();
       this.mTaskId = p0;
       this.mThemeId = p1;
       this.mTemplateType = p2;
       this.mMusicId = p3;
       this.mMusicType = p4;
    }
    public void AICutProjectOption(String p0,String p1,String p2,int p3){
       super();
       this.mMedias = new ArrayList();
       this.mTaskId = p0;
       this.mThemeId = p1;
       this.mTemplateType = 0;
       this.mMusicId = p2;
       this.mMusicType = p3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AICutProjectOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AICutProjectOption mTaskId="+this.mTaskId+" mMedias size="+this.mMedias.size()+" mThemeId="+this.mThemeId+" mTemplateType"+this.mTemplateType+" mMusicId="+this.mMusicId+" mMusicType="+this.mMusicType;
    }
}
