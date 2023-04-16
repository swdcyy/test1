package com.kwai.social.startup.reminder.model.IMMagicFaceConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class IMMagicFaceConfig implements Serializable	// class@000f5a
{
    public final boolean enableMagicFace;
    public final boolean enablePreDownload;
    public final List magicEmotionConfig;
    public final List preDownloadMagicIds;

    public void IMMagicFaceConfig(){
       super();
       this.preDownloadMagicIds = CollectionsKt__CollectionsKt.E();
       this.magicEmotionConfig = CollectionsKt__CollectionsKt.E();
    }
    public final boolean getEnableMagicFace(){
       return this.enableMagicFace;
    }
    public final boolean getEnablePreDownload(){
       return this.enablePreDownload;
    }
    public final List getMagicEmotionConfig(){
       return this.magicEmotionConfig;
    }
    public final List getPreDownloadMagicIds(){
       return this.preDownloadMagicIds;
    }
}
