package com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveGiftReceiver implements Serializable	// class@00128c
{
    public int mAllReceiverRes;
    public String mBase64Segments;
    public UserStateRichTextSegment mIconSegment;
    public boolean mIsSendToAll;
    public List mMultipleReceiverList;
    public List mTags;
    public UserInfo mUserInfo;
    public int mWealthGrade;
    public static final long serialVersionUID = 0xfb12e6309ba473;

    public void LiveGiftReceiver(){
       super();
       this.mAllReceiverRes = -1;
       this.mIsSendToAll = false;
       this.mMultipleReceiverList = new ArrayList();
    }
}
