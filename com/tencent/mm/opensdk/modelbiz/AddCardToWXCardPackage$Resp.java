package com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import android.os.Bundle;
import java.util.List;
import java.util.LinkedList;
import java.lang.String;
import org.json.JSONTokener;
import java.lang.Object;
import org.json.JSONObject;
import org.json.JSONArray;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$WXCardItem;
import org.json.JSONStringer;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;

public class AddCardToWXCardPackage$Resp extends BaseResp	// class@000e88
{
    public List cardArrary;

    public void AddCardToWXCardPackage$Resp(){
       super();
    }
    public void AddCardToWXCardPackage$Resp(Bundle p0){
       super().fromBundle(p0);
    }
    public boolean checkArgs(){
       AddCardToWXCardPackage$Resp tcardArrary = this.cardArrary;
       if (tcardArrary == null || !tcardArrary.size()) {
          return false;
       }
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       if (this.cardArrary == null) {
          this.cardArrary = new LinkedList();
       }
       String str = p0.getString("_wxapi_add_card_to_wx_card_list");
       if (str != null && str.length() > 0) {
          try{
             JSONArray jSONArray = new JSONTokener(str).nextValue().getJSONArray("card_list");
             for (int i = 0; i < jSONArray.length(); i = i + 1) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                AddCardToWXCardPackage$WXCardItem wXCardItem = new AddCardToWXCardPackage$WXCardItem();
                wXCardItem.cardId = jSONObject.optString("card_id");
                wXCardItem.cardExtMsg = jSONObject.optString("card_ext");
                wXCardItem.cardState = jSONObject.optInt("is_succ");
                this.cardArrary.add(wXCardItem);
             }
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public int getType(){
       return 9;
    }
    public void toBundle(Bundle p0){
       JSONStringer jSONStringer;
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
             AddCardToWXCardPackage$WXCardItem cardExtMsg = wXCardItem.cardExtMsg;
             if (cardExtMsg == null) {
                cardExtMsg = "";
             }
             jSONStringer.value(cardExtMsg);
             jSONStringer.key("is_succ");
             jSONStringer.value((long)wXCardItem.cardState);
             jSONStringer.endObject();
          }
          jSONStringer.endArray();
          jSONStringer.endObject();
       }catch(java.lang.Exception e1){
          Log.e("MicroMsg.AddCardToWXCardPackage", "Resp.toBundle exception:"+e1.getMessage());
       }
       p0.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
       return;
    }
}
