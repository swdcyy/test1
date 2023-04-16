package com.yxcorp.gifshow.activity.share.copywriting.CopyWritingItem;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class CopyWritingItem implements Serializable	// class@00137b
{
    public final String captionRecoText;

    public void CopyWritingItem(String p0){
       a.p(p0, "captionRecoText");
       super();
       this.captionRecoText = p0;
    }
    public final String getCaptionRecoText(){
       return this.captionRecoText;
    }
}
