package com.kwai.emotionsdk.db.dao.EmotionPackageDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.String;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;

public class EmotionPackageDao$Properties	// class@000daa
{
    public static final Property MDescription;
    public static final Property MEmotionAuthor;
    public static final Property MEmotionPackageVersion;
    public static final Property MEmotions;
    public static final Property MExtraInfo;
    public static final Property MId;
    public static final Property MIntroduction;
    public static final Property MName;
    public static final Property MPackageBannerUrl;
    public static final Property MPackageDownloadUrl;
    public static final Property MPackageImageBigUrl;
    public static final Property MPackageImageMiddleUrl;
    public static final Property MPackageImageSmallUrl;
    public static final Property MPackageImageSmallUrlDarkMode;
    public static final Property MStyle;
    public static final Property MType;

    static {
       Property property = new Property(0, String.class, "mId", true, "M_ID");
       EmotionPackageDao$Properties.MId = v6;
       Property property1 = new Property(1, String.class, "mName", false, "M_NAME");
       EmotionPackageDao$Properties.MName = property;
       Property property2 = new Property(2, String.class, "mIntroduction", false, "M_INTRODUCTION");
       EmotionPackageDao$Properties.MIntroduction = property;
       property1 = new Property(3, String.class, "mDescription", false, "M_DESCRIPTION");
       EmotionPackageDao$Properties.MDescription = property;
       Class tYPE = Integer.TYPE;
       property2 = new Property(4, tYPE, "mType", false, "M_TYPE");
       EmotionPackageDao$Properties.MType = property;
       Property property3 = new Property(5, String.class, "mStyle", false, "M_STYLE");
       EmotionPackageDao$Properties.MStyle = property;
       property2 = new Property(6, String.class, "mPackageImageSmallUrl", false, "M_PACKAGE_IMAGE_SMALL_URL");
       EmotionPackageDao$Properties.MPackageImageSmallUrl = property;
       property3 = new Property(7, String.class, "mPackageImageSmallUrlDarkMode", false, "M_PACKAGE_IMAGE_SMALL_URL_DARK_MODE");
       EmotionPackageDao$Properties.MPackageImageSmallUrlDarkMode = property;
       property2 = new Property(8, String.class, "mPackageImageMiddleUrl", false, "M_PACKAGE_IMAGE_MIDDLE_URL");
       EmotionPackageDao$Properties.MPackageImageMiddleUrl = property;
       property3 = new Property(9, String.class, "mPackageBannerUrl", false, "M_PACKAGE_BANNER_URL");
       EmotionPackageDao$Properties.MPackageBannerUrl = property;
       property2 = new Property(10, String.class, "mPackageImageBigUrl", false, "M_PACKAGE_IMAGE_BIG_URL");
       EmotionPackageDao$Properties.MPackageImageBigUrl = property;
       property3 = new Property(11, String.class, "mPackageDownloadUrl", false, "M_PACKAGE_DOWNLOAD_URL");
       EmotionPackageDao$Properties.MPackageDownloadUrl = property;
       property2 = new Property(12, String.class, "mEmotionAuthor", false, "M_EMOTION_AUTHOR");
       EmotionPackageDao$Properties.MEmotionAuthor = property;
       property3 = new Property(13, String.class, "mEmotions", false, "M_EMOTIONS");
       EmotionPackageDao$Properties.MEmotions = property;
       property2 = new Property(14, String.class, "mExtraInfo", false, "M_EXTRA_INFO");
       EmotionPackageDao$Properties.MExtraInfo = property;
       property2 = new Property(15, tYPE, "mEmotionPackageVersion", false, "M_EMOTION_PACKAGE_VERSION");
       EmotionPackageDao$Properties.MEmotionPackageVersion = property;
    }
    public void EmotionPackageDao$Properties(){
       super();
    }
}
