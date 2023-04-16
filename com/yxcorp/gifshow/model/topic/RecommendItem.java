package com.yxcorp.gifshow.model.topic.RecommendItem;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import com.yxcorp.gifshow.model.topic.TopicIcon;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;

public class RecommendItem extends HistoryItem	// class@001fa6
{
    public TopicIcon mLeftIcon;
    public long mPhotoCount;
    public RecommendItem$Tag mTag;
    public TopicIcon mTopicIcon;
    public long mViewCount;
    public static final long serialVersionUID = 0x842bd1c7b61c3af;

    public void RecommendItem(){
       super();
    }
    public int getItemType(){
       Object obj = PatchProxy.apply(null, this, RecommendItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TopicItemType.RECOMMEND.getValue();
    }
    public TopicIcon getLeftIcon(){
       return this.mLeftIcon;
    }
    public long getPhotoCount(){
       return this.mPhotoCount;
    }
    public RecommendItem$Tag getTag(){
       return this.mTag;
    }
    public TopicIcon getTopicIcon(){
       return this.mTopicIcon;
    }
    public long getViewCount(){
       return this.mViewCount;
    }
    public void setPhotoCount(int p0){
       this.mPhotoCount = (long)p0;
    }
    public void setTag(RecommendItem$Tag p0){
       this.mTag = p0;
    }
}
