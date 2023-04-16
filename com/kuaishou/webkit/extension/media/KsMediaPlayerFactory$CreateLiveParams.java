package com.kuaishou.webkit.extension.media.KsMediaPlayerFactory$CreateLiveParams;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;

public class KsMediaPlayerFactory$CreateLiveParams	// class@00130a
{
    public final Bundle mExtra;
    public final String mLiveSrc;

    public void KsMediaPlayerFactory$CreateLiveParams(String p0,Bundle p1){
       super();
       this.mLiveSrc = p0;
       this.mExtra = p1;
    }
    public String liveSrc(){
       return this.mLiveSrc;
    }
}
