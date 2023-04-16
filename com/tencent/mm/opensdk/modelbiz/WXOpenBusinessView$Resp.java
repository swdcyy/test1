package com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.lang.String;

public final class WXOpenBusinessView$Resp extends BaseResp	// class@000ec5
{
    public String businessType;
    public String extMsg;

    public void WXOpenBusinessView$Resp(){
       super();
    }
    public void WXOpenBusinessView$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.extMsg = p0.getString("_openbusinessview_ext_msg");
       this.businessType = p0.getString("_openbusinessview_business_type");
    }
    public int getType(){
       return 26;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putString("_openbusinessview_ext_msg", this.extMsg);
       p0.putString("_openbusinessview_business_type", this.businessType);
    }
}
