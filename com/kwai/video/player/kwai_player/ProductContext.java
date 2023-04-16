package com.kwai.video.player.kwai_player.ProductContext;
import com.kwai.video.player.kwai_player.ProductContext$Builder;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import org.json.JSONException;
import com.kwai.video.player.kwai_player.ProductContext$1;

public class ProductContext	// class@000b4e
{
    public boolean isPreloadPlayer;
    public int playIndex;
    public String productContextJson;
    public String retryInfo;

    public void ProductContext(ProductContext$Builder p0){
       JSONObject jSONObject;
       super();
       try{
          jSONObject = new JSONObject();
          jSONObject.put("biz_type", p0.bizType);
          jSONObject.put("play_index", p0.playIndex);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       this.productContextJson = jSONObject.toString();
       this.playIndex = p0.playIndex;
       return;
    }
    public void ProductContext(ProductContext$Builder p0,ProductContext$1 p1){
       super(p0);
    }
}
