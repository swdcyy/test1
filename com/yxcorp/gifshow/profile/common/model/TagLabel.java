package com.yxcorp.gifshow.profile.common.model.TagLabel;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;

public class TagLabel implements Serializable	// class@0012dd
{
    public int mActionType;
    public String mActionUrl;
    public List mBubbles;
    public TagLabel$DownloadParam mDownloadParams;
    public String mExtraInfo;
    public String mLabelDarkIcon;
    public String mLabelIcon;
    public String mLabelType;
    public String mName;
    public TagLabel$PopUpParam mPopUpParams;
    public int mPriority;
    public String mStatisticsInfo;
    public static final Map TAG_PRIORITY_MAP;
    public static final long serialVersionUID;

    static {
       HashMap hashMap = new HashMap();
       TagLabel.TAG_PRIORITY_MAP = hashMap;
       Integer integer = Integer.valueOf(104);
       hashMap.put("social_location", integer);
       hashMap.put("social_ip", integer);
       hashMap.put("social_school", Integer.valueOf(105));
       hashMap.put("social_mcnorganizationinfo", Integer.valueOf(106));
       hashMap.put("fans", Integer.valueOf(107));
       hashMap.put("social_age_unsetted", Integer.valueOf(108));
       hashMap.put("social_age_hidden", Integer.valueOf(109));
       hashMap.put("add_intimate", Integer.valueOf(999));
    }
    public void TagLabel(){
       super();
    }
}
