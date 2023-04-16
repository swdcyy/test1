package com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;

public class LiveAnchorToolsInfo$LiveAnchorTool implements Serializable, a	// class@0019ed
{
    public String mButtonText;
    public int mButtonType;
    public boolean mCallBackend;
    public String mDesc;
    public String mDescIcon;
    public String mForbidReason;
    public boolean mHasLogged;
    public String mIcon;
    public boolean mIsForbidden;
    public String mJumpUrl;
    public String mName;
    public boolean mShowNewLabel;
    public boolean mSwitchOpen;
    public int mType;
    public static final long serialVersionUID = 0xb9706c13fcd083a6;

    public void LiveAnchorToolsInfo$LiveAnchorTool(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorToolsInfo$LiveAnchorTool.class, "1")) {
          return;
       }
       if (this.mButtonType <= null) {
          LiveAnchorToolsInfo$LiveAnchorTool tmType = this.mType;
          tmType = (tmType == 8 || tmType == 9)? 1: 0;
          int i = (tmType)? 1: 2;
          this.mButtonType = i;
       }
       if (TextUtils.x(this.mButtonText)) {
          this.mButtonText = a1.p(0x7f1001e1);
       }
       if (this.mButtonType == 1) {
          this.mJumpUrl = null;
       }
       return;
    }
}
