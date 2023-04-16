package com.kuaishou.common.encryption.model.BatchDrawingGiftParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.BatchDrawingGiftParam$a;
import com.kuaishou.common.encryption.model.BatchDrawingGiftParam$b;
import java.util.List;
import java.lang.String;
import com.google.gson.Gson;
import java.lang.Object;

public class BatchDrawingGiftParam extends a implements Serializable	// class@0016b2
{
    public List drawingSendInfos;
    public String giftToken;
    public int height;
    public String liveStreamId;
    public String logExtraInfo;
    public String scene;
    public int userSource;
    public int width;

    public void BatchDrawingGiftParam(){
       super();
    }
    public void BatchDrawingGiftParam(BatchDrawingGiftParam$a p0){
       super();
    }
    public static BatchDrawingGiftParam$b newBuilder(){
       return new BatchDrawingGiftParam$b();
    }
    public List getDrawingSendInfos(){
       return this.drawingSendInfos;
    }
    public String getGiftToken(){
       return this.giftToken;
    }
    public int getHeight(){
       return this.height;
    }
    public String getLiveStreamId(){
       return this.liveStreamId;
    }
    public String getLogExtraInfo(){
       return this.logExtraInfo;
    }
    public String getScene(){
       return this.scene;
    }
    public int getUserSource(){
       return this.userSource;
    }
    public int getWidth(){
       return this.width;
    }
    public void setDrawingSendInfos(List p0){
       this.drawingSendInfos = p0;
    }
    public String toJson(){
       return new Gson().q(this);
    }
}
