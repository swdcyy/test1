package com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;

public interface abstract PlcEntryDataAdapter implements Serializable	// class@00165e
{

    boolean enableForceClose();
    String getActionIconUrl();
    String getActionLabel();
    String getActionSubUrl();
    int getActionType();
    String getActionUrl();
    String getAppIconUrl();
    String getAppLink();
    String getAppName();
    List getAtmosphereBarImage();
    List getAvatarImages();
    String getBizCustomEntryTag();
    Map getBizRequiredParams();
    int getBizType();
    String getCommentCategoryText();
    String getCommentTagInfoText();
    int getCoverCategoryMaxLen();
    String getCoverCategoryText();
    int getCoverStyleSubType();
    Map getDownloadInfoMap();
    String getDownloadUrl();
    String getFileName();
    String getHighLightLabel();
    String getHighlightLabelColor();
    String getIconLeftLabel();
    String getIconUrl();
    List getIconUrls();
    List getLabels();
    String getMarketUri();
    String getPackageName();
    QPhoto getPhoto();
    PlcEntryStyleInfo getPlcEntryStyleInfo();
    int getStrongCategoryMaxLen();
    String getStrongCategoryText();
    String getStrongHighLightIcon();
    List getStrongMultiHighLightLabel();
    List getStrongStyleItems();
    String getStrongTagInfoText();
    int getStyleSubType();
    int getStyleType();
    String getSubscriptDescription();
    String getTKBundleId();
    String getTitle();
    int getViewStyle();
    int getWeakCategoryMaxLen();
    String getWeakCategoryText();
    int getWeakStyleSubType();
    String getWeakTagInfoText();
    boolean haveStyleTransition();
    boolean isEnableCommentLabelArrow();
    boolean isHideAdTag();
    boolean isHidePlcAfterStrongDisappear();
    boolean isRoundCornerIcon();
    boolean isShowAdLabelInDetail();
}