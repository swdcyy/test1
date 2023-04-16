package com.kwai.tokenshare.model.TokenDialogModel;
import java.io.Serializable;
import java.lang.Object;

public class TokenDialogModel implements Serializable	// class@001933
{
    public String mAction;
    public int mBizType;
    public TokenDialogModel$DialogConfig mDialogConfig;
    public String mExt;
    public String mMessage;
    public BaseFeed mPhoto;
    public User mPhotoUser;
    public TokenDialogModel$ShareMerchantItem mShareMerchantItem;
    public TokenDialogModel$ShareMerchantShop mShareMerchantShop;
    public TokenDialogModel$SharePoi mSharePoi;
    public TokenDialogModel$ShareTag mShareTag;
    public User mShareUser;
    public String mShareUserProfile;
    public int mType;
    public User mUser;
    public static final long serialVersionUID = 0x4891be0bb7ed209e;

    public void TokenDialogModel(){
       super();
    }
}
