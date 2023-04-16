package com.kuaishou.merchant.transaction.order.orderlist.tab.model.ButtonTabInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import z1.d;

public class ButtonTabInfo implements Serializable	// class@0008d2
{
    public String mBorderColor;
    public List mBubbleInfos;
    public String mContent;
    public MerchantEventModel mEvent;
    public String mTextColor;
    public static final long serialVersionUID = 0xeb055d4e781f7290;

    public void ButtonTabInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ButtonTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!TextUtils.equals(this.mContent, p0.mContent) || (!TextUtils.equals(this.mBorderColor, p0.mBorderColor) || !TextUtils.equals(this.mTextColor, p0.mTextColor))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ButtonTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mContent,this.mBorderColor,this.mTextColor};
       return d.b(obj);
    }
}
