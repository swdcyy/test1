package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;

public abstract class NoticeBoxBaseItem extends DefaultObservableAndSyncable	// class@001253
{
    public JsonObject extParams;
    public String mNotifyId;
    public Integer mPlateId;
    public int mType;

    public void NoticeBoxBaseItem(){
       super();
       this.mNotifyId = "";
    }
}
