package com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$WXCardItem;
import java.lang.String;
import android.os.Bundle;
import org.json.JSONStringer;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;

public class AddCardToWXCardPackage$Req extends BaseReq	// class@000e87
{
    public List cardArrary;

    public void AddCardToWXCardPackage$Req(){
       super();
    }
    public boolean checkArgs(){
       AddCardToWXCardPackage$Req tcardArrary = this.cardArrary;
       if (tcardArrary != null && (!tcardArrary.size() || this.cardArrary.size() > 40)) {
          return false;
       }
       Iterator iterator = this.cardArrary.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          AddCardToWXCardPackage$WXCardItem wXCardItem = iterator.next();
          if (wXCardItem != null) {
             AddCardToWXCardPackage$WXCardItem cardId = wXCardItem.cardId;
             if (cardId != null && cardId.length() <= 1024) {
                wXCardItem = wXCardItem.cardExtMsg;
                if (wXCardItem == null || wXCardItem.length() <= 1024) {
                }
             }
          }
          break ;
       }
       return false;
    }
    public int getType(){
       return 9;
    }
    public void toBundle(Bundle p0){
       JSONStringer jSONStringer;
       String str;
       super.toBundle(p0);
       try{
          jSONStringer = new JSONStringer();
          jSONStringer.object();
          jSONStringer.key("card_list");
          jSONStringer.array();
          Iterator iterator = this.cardArrary.iterator();
          while (iterator.hasNext()) {
             AddCardToWXCardPackage$WXCardItem wXCardItem = iterator.next();
             jSONStringer.object();
             jSONStringer.key("card_id");
             jSONStringer.value(wXCardItem.cardId);
             jSONStringer.key("card_ext");
             wXCardItem = wXCardItem.cardExtMsg;
             if (wXCardItem == null) {
                str = "";
             }
             jSONStringer.value(str);
             jSONStringer.endObject();
          }
          jSONStringer.endArray();
          jSONStringer.endObject();
       }catch(java.lang.Exception e1){
          Log.e("MicroMsg.AddCardToWXCardPackage", "Req.toBundle exception:"+e1.getMessage());
       }
       p0.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
       return;
    }
}
