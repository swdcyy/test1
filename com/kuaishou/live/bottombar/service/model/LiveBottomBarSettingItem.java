package com.kuaishou.live.bottombar.service.model.LiveBottomBarSettingItem;
import java.io.Serializable;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem$LiveBottomBarResponseItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveBottomBarSettingItem extends LiveNormalBottomBarItem implements Serializable	// class@000d52
{
    public int mButtonType;
    public boolean mEnableSwitch;
    public CharSequence mRightDescription;
    public CharSequence mSubTitle;
    public static final long serialVersionUID = 0x330e4a1183551124;

    public void LiveBottomBarSettingItem(){
       super();
       this.mButtonType = 2;
       this.mEnableSwitch = true;
    }
    public void updateChildConfig(LiveNormalBottomBarItem$LiveBottomBarResponseItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomBarSettingItem.class, "1")) {
          return;
       }
       super.updateChildConfig(p0);
       if (TextUtils.x(this.mSubTitle)) {
          this.mSubTitle = p0.mSubtitle;
       }
       return;
    }
}
