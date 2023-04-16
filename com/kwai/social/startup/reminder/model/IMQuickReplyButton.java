package com.kwai.social.startup.reminder.model.IMQuickReplyButton;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class IMQuickReplyButton implements Serializable	// class@0018cf
{
    public final String emotionId;
    public final String englishContent;
    public final String simpleChineseContent;
    public final String traditionalChineseContent;

    public void IMQuickReplyButton(String p0,String p1,String p2,String p3){
       a.p(p0, "emotionId");
       a.p(p1, "simpleChineseContent");
       a.p(p2, "englishContent");
       a.p(p3, "traditionalChineseContent");
       super();
       this.emotionId = p0;
       this.simpleChineseContent = p1;
       this.englishContent = p2;
       this.traditionalChineseContent = p3;
    }
    public final String getEmotionId(){
       return this.emotionId;
    }
    public final String getEnglishContent(){
       return this.englishContent;
    }
    public final String getSimpleChineseContent(){
       return this.simpleChineseContent;
    }
    public final String getTraditionalChineseContent(){
       return this.traditionalChineseContent;
    }
}
