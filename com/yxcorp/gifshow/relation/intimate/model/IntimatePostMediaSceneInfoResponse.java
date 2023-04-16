package com.yxcorp.gifshow.relation.intimate.model.IntimatePostMediaSceneInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import com.google.gson.JsonObject;

public class IntimatePostMediaSceneInfoResponse implements Serializable	// class@001910
{
    public JsonObject mPostParams;
    public int mResult;
    public static final long serialVersionUID = 0x2360ba45d6daa451;

    public void IntimatePostMediaSceneInfoResponse(){
       super();
       this.mPostParams = new JsonObject();
    }
}
