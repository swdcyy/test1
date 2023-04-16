package com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TeenageModeConfig implements Serializable	// class@000aad
{
    public List dialogNewContent;
    public DialogTopInfo dialogTopInfo;
    public boolean mCanVerifyIdCard;
    public String mCurfewText;
    public String mDialogCancelText;
    public String mDialogConfirmText;
    public String mDialogContent;
    public int mDialogNewContentVersion;
    public String mDialogOverrideCancelButtonUrl;
    public long mDialogShowDelaySeconds;
    public String mDialogTitle;
    public int mDisableEndHour;
    public int mDisableStartHour;
    public boolean mEnablePhotoContinue;
    public List mGuideInfoDesc;
    public boolean mIsOpen;
    public String mMaxUsageMinutes;
    public int mMode;
    public String mOfficialPhone;
    public String mOptionalCurfewText;
    public String mOptionalOverTimeText;
    public String mOverTimeText;
    public String mProtocolCheck;
    public String mProtocolName;
    public String mProtocolToast;
    public String mProtocolUrl;
    public boolean mShowDialog;
    public static final long serialVersionUID = 0x77a265302151d037;

    public void TeenageModeConfig(){
       super();
    }
    public boolean isTeenageModeProtocolValid(){
       Object obj = PatchProxy.apply(null, this, TeenageModeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mProtocolCheck) && (!TextUtils.isEmpty(this.mProtocolName) && (!TextUtils.isEmpty(this.mProtocolUrl) && !TextUtils.isEmpty(this.mProtocolToast))))? true: false;
       return b;
    }
}
