package com.yxcorp.gifshow.nasa.NasaTagInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.nasa.NasaTagInfo$KuaiShanTemplateInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.nasa.NasaTagInfo$MusicTagInfo;

public final class NasaTagInfo implements Serializable	// class@0020d2
{
    public boolean isFromMagicFaceRecord;
    public boolean isFromPush;
    public boolean isFromTakePhotoTab;
    public NasaTagInfo$KuaiShanTemplateInfo kuaishanInfo;
    public SimpleMagicFace magicFace;
    public NasaTagInfo$MusicTagInfo musicInfo;

    public void NasaTagInfo(){
       super();
    }
    public final NasaTagInfo$KuaiShanTemplateInfo getKuaishanInfo(){
       return this.kuaishanInfo;
    }
    public final SimpleMagicFace getMagicFace(){
       return this.magicFace;
    }
    public final NasaTagInfo$MusicTagInfo getMusicInfo(){
       return this.musicInfo;
    }
    public final boolean isFromMagicFaceRecord(){
       return this.isFromMagicFaceRecord;
    }
    public final boolean isFromPush(){
       return this.isFromPush;
    }
    public final boolean isFromTakePhotoTab(){
       return this.isFromTakePhotoTab;
    }
    public final void setFromMagicFaceRecord(boolean p0){
       this.isFromMagicFaceRecord = p0;
    }
    public final void setFromPush(boolean p0){
       this.isFromPush = p0;
    }
    public final void setFromTakePhotoTab(boolean p0){
       this.isFromTakePhotoTab = p0;
    }
    public final void setKuaishanInfo(NasaTagInfo$KuaiShanTemplateInfo p0){
       this.kuaishanInfo = p0;
    }
    public final void setMagicFace(SimpleMagicFace p0){
       this.magicFace = p0;
    }
    public final void setMusicInfo(NasaTagInfo$MusicTagInfo p0){
       this.musicInfo = p0;
    }
}
