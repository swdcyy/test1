package com.kuaishou.merchant.live.cart.salemanager.model.TopNoticeBarInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TopNoticeBarInfo implements Serializable	// class@0019f4
{
    public String mBackgroundColor;
    public List mIconUrlList;
    public String mText;
    public String mTextColor;

    public void TopNoticeBarInfo(){
       super();
    }
    public boolean isInValid(){
       Object obj = PatchProxy.apply(null, this, TopNoticeBarInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.isEmpty(this.mText);
    }
}
