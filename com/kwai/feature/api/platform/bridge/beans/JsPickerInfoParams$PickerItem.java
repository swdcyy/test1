package com.kwai.feature.api.platform.bridge.beans.JsPickerInfoParams$PickerItem;
import java.io.Serializable;
import ja.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class JsPickerInfoParams$PickerItem implements Serializable, a	// class@001062
{
    public String mItemText;
    public List mSubGroup;
    public String mValue;
    public static final long serialVersionUID = 0xb003c75db484118d;

    public void JsPickerInfoParams$PickerItem(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsPickerInfoParams$PickerItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof JsPickerInfoParams$PickerItem && TextUtils.equals(p0.mValue, this.mValue))? true: false;
       return b;
    }
    public String getPickerViewText(){
       return this.mItemText;
    }
}
