package com.yxcorp.gifshow.model.OverallEmotionsData;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class OverallEmotionsData implements Serializable	// class@001e6a
{
    public String mEmojiKey;
    public String mEmojiUrl;

    public void OverallEmotionsData(){
       super();
    }
    public static OverallEmotionsData from(CommentGuide$EmojiBean p0){
       OverallEmotionsData obj = PatchProxy.applyOneRefs(p0, null, OverallEmotionsData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new OverallEmotionsData();
       obj.mEmojiKey = p0.mkey;
       obj.mEmojiUrl = p0.mUrl;
       return obj;
    }
}
