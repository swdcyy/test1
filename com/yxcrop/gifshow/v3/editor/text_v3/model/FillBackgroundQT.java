package com.yxcrop.gifshow.v3.editor.text_v3.model.FillBackgroundQT;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import nsd.u;
import java.lang.Object;

public final class FillBackgroundQT implements Serializable	// class@000c0f
{
    public Long alpha;
    public String color;

    public void FillBackgroundQT(){
       super(null, null, 3, null);
    }
    public void FillBackgroundQT(Long p0,String p1){
       super();
       this.alpha = p0;
       this.color = p1;
    }
    public void FillBackgroundQT(Long p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final Long getAlpha(){
       return this.alpha;
    }
    public final String getColor(){
       return this.color;
    }
    public final void setAlpha(Long p0){
       this.alpha = p0;
    }
    public final void setColor(String p0){
       this.color = p0;
    }
}
