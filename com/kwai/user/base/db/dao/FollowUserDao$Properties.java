package com.kwai.user.base.db.dao.FollowUserDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public class FollowUserDao$Properties	// class@001981
{
    public static final Property MGender;
    public static final Property MHeadCDNUrls;
    public static final Property MHeadUrl;
    public static final Property MHeadUrls;
    public static final Property MId;
    public static final Property MName;
    public static final Property MNameAbbr;
    public static final Property MNamePY;
    public static final Property MRelation;
    public static final Property MRemarkName;
    public static final Property MRemarkNameAbbr;
    public static final Property MRemarkNamePY;

    static {
       Property property = new Property(0, String.class, "mId", true, "M_ID");
       FollowUserDao$Properties.MId = v6;
       Property property1 = new Property(1, String.class, "mName", false, "M_NAME");
       FollowUserDao$Properties.MName = property;
       Property property2 = new Property(2, String.class, "mNamePY", false, "M_NAME_PY");
       FollowUserDao$Properties.MNamePY = property;
       property1 = new Property(3, String.class, "mNameAbbr", false, "M_NAME_ABBR");
       FollowUserDao$Properties.MNameAbbr = property;
       property2 = new Property(4, String.class, "mRemarkName", false, "M_REMARK_NAME");
       FollowUserDao$Properties.MRemarkName = property;
       property1 = new Property(5, String.class, "mRemarkNamePY", false, "M_REMARK_NAME_PY");
       FollowUserDao$Properties.MRemarkNamePY = property;
       property2 = new Property(6, String.class, "mRemarkNameAbbr", false, "M_REMARK_NAME_ABBR");
       FollowUserDao$Properties.MRemarkNameAbbr = property;
       property1 = new Property(7, String.class, "mGender", false, "M_GENDER");
       FollowUserDao$Properties.MGender = property;
       property2 = new Property(8, String.class, "mHeadUrl", false, "M_HEAD_URL");
       FollowUserDao$Properties.MHeadUrl = property;
       property1 = new Property(9, String.class, "mHeadUrls", false, "M_HEAD_URLS");
       FollowUserDao$Properties.MHeadUrls = property;
       property2 = new Property(10, String.class, "mHeadCDNUrls", false, "M_HEAD_CDNURLS");
       FollowUserDao$Properties.MHeadCDNUrls = property;
       property1 = new Property(11, String.class, "mRelation", false, "M_RELATION");
       FollowUserDao$Properties.MRelation = property;
    }
    public void FollowUserDao$Properties(){
       super();
    }
}
