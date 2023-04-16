package com.yxcrop.gifshow.v3.editor.text_v3.model.BoxQT;
import java.io.Serializable;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class BoxQT implements Serializable	// class@000c09
{
    public Long height;
    public Long width;

    public void BoxQT(){
       super(null, null, 3, null);
    }
    public void BoxQT(Long p0,Long p1){
       super();
       this.height = p0;
       this.width = p1;
    }
    public void BoxQT(Long p0,Long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final Long getHeight(){
       return this.height;
    }
    public final Long getWidth(){
       return this.width;
    }
    public final void setHeight(Long p0){
       this.height = p0;
    }
    public final void setWidth(Long p0){
       this.width = p0;
    }
}
