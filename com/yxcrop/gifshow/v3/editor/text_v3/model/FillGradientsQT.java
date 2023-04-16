package com.yxcrop.gifshow.v3.editor.text_v3.model.FillGradientsQT;
import java.io.Serializable;
import java.util.List;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class FillGradientsQT implements Serializable	// class@000c11
{
    public List colors;
    public Long type;

    public void FillGradientsQT(){
       super(null, null, 3, null);
    }
    public void FillGradientsQT(List p0,Long p1){
       super();
       this.colors = p0;
       this.type = p1;
    }
    public void FillGradientsQT(List p0,Long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final List getColors(){
       return this.colors;
    }
    public final Long getType(){
       return this.type;
    }
    public final void setColors(List p0){
       this.colors = p0;
    }
    public final void setType(Long p0){
       this.type = p0;
    }
}
