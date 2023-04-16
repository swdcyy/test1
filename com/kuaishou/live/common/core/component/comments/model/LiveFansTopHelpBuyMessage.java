package com.kuaishou.live.common.core.component.comments.model.LiveFansTopHelpBuyMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.utility.TextUtils;

public class LiveFansTopHelpBuyMessage extends QLiveMessage	// class@0010ba
{
    public boolean mIsAnchor;
    public boolean mIsUserSelf;
    public String mMessageTextContent;
    public boolean mSpaceQualified;

    public void LiveFansTopHelpBuyMessage(){
       super();
       this.mMessageTextContent = "";
    }
    public boolean shouldShowHelpBuyButton(){
       boolean b = (this.mSpaceQualified != null && (this.mIsUserSelf == null && this.mIsAnchor == null))? true: false;
       return b;
    }
    public void updateData(boolean p0){
       if (PatchProxy.isSupport(LiveFansTopHelpBuyMessage.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveFansTopHelpBuyMessage.class, "1")) {
          return;
       }
       this.mIsAnchor = p0;
       if (this.mUser != null) {
          StringBuilder str = "";
          CharSequence text = (p0)? a.a().a().getText(R.string.arg_RES_7f102198): a.a().a().getText(R.string.arg_RES_7f102199);
          this.mMessageTextContent = str+text;
          this.mIsUserSelf = TextUtils.n(QCurrentUser.me().getId(), this.mUser.mId);
       }
       return;
    }
}
