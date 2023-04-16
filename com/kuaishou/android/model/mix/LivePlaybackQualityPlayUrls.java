package com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LivePlaybackQualityPlayUrls implements Serializable	// class@000d06
{
    public String mLevel;
    public List mUrls;
    public static final long serialVersionUID = 0xce7749fbe4bcaf26;

    public void LivePlaybackQualityPlayUrls(){
       super();
       this.mUrls = new ArrayList();
    }
}
