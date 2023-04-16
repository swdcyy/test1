package com.kuaishou.common.encryption.model.DrawingGiftParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.DrawingGiftParam$a;
import com.kuaishou.common.encryption.model.DrawingGiftParam$b;
import java.util.List;
import java.lang.String;
import com.google.gson.Gson;
import java.lang.Object;

public class DrawingGiftParam extends a implements Serializable	// class@0016bb
{
    public List drawingGiftPoints;
    public String giftToken;
    public int height;
    public String liveStreamId;
    public String logExtraInfo;
    public int userSource;
    public int width;

    public void DrawingGiftParam(){
       super();
    }
    public void DrawingGiftParam(DrawingGiftParam$a p0){
       super();
    }
    public static DrawingGiftParam$b newBuilder(){
       return new DrawingGiftParam$b();
    }
    public List getDrawingGiftPoints(){
       return this.drawingGiftPoints;
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
    public int getUserSource(){
       return this.userSource;
    }
    public int getWidth(){
       return this.width;
    }
    public void setDrawingGiftPoints(List p0){
       this.drawingGiftPoints = p0;
    }
    public String toJson(){
       return new Gson().q(this);
    }
}
