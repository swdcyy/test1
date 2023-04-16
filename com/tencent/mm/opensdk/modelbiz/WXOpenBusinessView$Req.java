package com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public final class WXOpenBusinessView$Req extends BaseReq	// class@000ec4
{
    public String businessType;
    public String extInfo;
    public String query;

    public void WXOpenBusinessView$Req(){
       super();
    }
    public boolean checkArgs(){
       if (!b.b(this.businessType)) {
          return true;
       }
       Log.e("MicroMsg.SDK.WXOpenBusinessView.Req", "businessType is null");
       return false;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.businessType = p0.getString("_openbusinessview_businessType");
       this.query = p0.getString("_openbusinessview__query_info");
       this.extInfo = p0.getString("_openbusinessview_extInfo");
    }
    public int getType(){
       return 26;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_openbusinessview_businessType", this.businessType);
       p0.putString("_openbusinessview__query_info", this.query);
       p0.putString("_openbusinessview_extInfo", this.extInfo);
    }
}
