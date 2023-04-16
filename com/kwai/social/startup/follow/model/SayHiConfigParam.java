package com.kwai.social.startup.follow.model.SayHiConfigParam;
import java.io.Serializable;
import java.lang.Object;

public class SayHiConfigParam implements Serializable	// class@0018a7
{
    public int btnType;
    public String emojiText;
    public String emotionId;
    public String packageId;
    public boolean useEmoji;
    public static SayHiConfigParam DEFAULT;
    public static final long serialVersionUID;

    static {
       SayHiConfigParam.DEFAULT = new SayHiConfigParam();
    }
    public void SayHiConfigParam(){
       super();
    }
}
