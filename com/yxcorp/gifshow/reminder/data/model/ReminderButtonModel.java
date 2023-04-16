package com.yxcorp.gifshow.reminder.data.model.ReminderButtonModel;
import java.lang.Object;

public class ReminderButtonModel	// class@001a70
{
    public String mAutoPopup;
    public String mBizDataId;
    public String mBizType;
    public boolean mDisabled;
    public Map mLogInfo;
    public boolean mSelected;
    public int mStyle;
    public String mText;
    public String mUrl;

    public void ReminderButtonModel(){
       super();
       this.mText = "";
       this.mUrl = "";
       this.mAutoPopup = "";
       this.mBizType = "";
       this.mBizDataId = "";
    }
}
