package com.yxcorp.gifshow.relation.explore.fragment.k;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.relation.explore.fragment.GalleryCarouseFragment;
import org.json.JSONObject;
import java.lang.String;
import org.json.JSONException;

public final class k implements x	// class@001819
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object get(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("card_style", 2);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
}
