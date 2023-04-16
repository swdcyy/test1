package com.kuaishou.merchant.transaction.order.orderlist.search.history.mode.SearchHistoryModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class SearchHistoryModel implements Serializable	// class@0008ad
{
    public String mKeyName;
    public static final long serialVersionUID = 0xbee5ea6e3bed170d;

    public void SearchHistoryModel(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchHistoryModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.equals(this.mKeyName, p0.mKeyName);
    }
}
