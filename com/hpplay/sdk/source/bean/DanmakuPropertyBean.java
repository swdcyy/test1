package com.hpplay.sdk.source.bean.DanmakuPropertyBean;
import java.lang.Object;
import com.hpplay.sdk.source.bean.DanmakuPropertyBean$Lines;
import com.hpplay.sdk.source.bean.DanmakuPropertyBean$Speed;
import java.lang.String;
import org.json.JSONObject;
import com.hpplay.sdk.source.a.a;
import java.lang.Throwable;

public class DanmakuPropertyBean	// class@00064a
{
    public int lineSpace;
    public int lines;
    public int padding;
    public int rowSpace;
    public float speed;
    public boolean swch;

    public void DanmakuPropertyBean(){
       super();
    }
    public void setLineSpace(int p0){
       this.lineSpace = p0;
    }
    public void setLines(DanmakuPropertyBean$Lines p0){
       this.lines = p0.value();
    }
    public void setPadding(int p0){
       this.padding = p0;
    }
    public void setRowSpace(int p0){
       this.rowSpace = p0;
    }
    public void setSpeed(DanmakuPropertyBean$Speed p0){
       this.speed = p0.value();
    }
    public void setSwitch(boolean p0){
       this.swch = p0;
    }
    public String toJson(int p0){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("manifestVer", p0);
          jSONObject.put("swch", this.swch);
          jSONObject.put("padding", this.padding);
          jSONObject.put("speed", (double)this.speed);
          jSONObject.put("lines", this.lines);
          jSONObject.put("rowSpace", this.rowSpace);
          jSONObject.put("lineSpace", this.lineSpace);
          a.f("DanmakuPropertyBean", jSONObject.toString());
          return jSONObject.toString();
       }catch(java.lang.Exception e5){
          a.b(v0, e5);
          return null;
       }
    }
}
