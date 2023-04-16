package com.kwai.user.base.chat.target.bean.BottomNavItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;

public class BottomNavItem implements Serializable	// class@001975
{
    public int index;
    public String mActionUrl;
    public I18NText mButtonText;
    public String mButtonType;
    public List mItemList;
    public static final long serialVersionUID = 0x783b5fc1e0a0c9a4;

    public void BottomNavItem(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomNavItem.class, "1");
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
       if (!d.a(this.mButtonText, p0.mButtonText) || (!d.a(this.mButtonType, p0.mButtonType) || (!d.a(this.mActionUrl, p0.mActionUrl) || !d.a(this.mItemList, p0.mItemList)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, BottomNavItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mButtonText,this.mButtonType,this.mActionUrl,this.mItemList};
       return d.b(obj);
    }
}
