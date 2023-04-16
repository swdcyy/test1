package com.yxcrop.gifshow.v3.editor.text_v3.model.CompLayerQT;
import java.io.Serializable;
import java.util.List;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v3.model.TextBeanQT;
import nsd.u;
import java.lang.Object;

public final class CompLayerQT implements Serializable	// class@000c0a
{
    public List animations;
    public Boolean isLock;
    public TextBeanQT textBean;

    public void CompLayerQT(){
       super(null, null, null, 7, null);
    }
    public void CompLayerQT(List p0,Boolean p1,TextBeanQT p2){
       super();
       this.animations = p0;
       this.isLock = p1;
       this.textBean = p2;
    }
    public void CompLayerQT(List p0,Boolean p1,TextBeanQT p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final List getAnimations(){
       return this.animations;
    }
    public final TextBeanQT getTextBean(){
       return this.textBean;
    }
    public final Boolean isLock(){
       return this.isLock;
    }
    public final void setAnimations(List p0){
       this.animations = p0;
    }
    public final void setLock(Boolean p0){
       this.isLock = p0;
    }
    public final void setTextBean(TextBeanQT p0){
       this.textBean = p0;
    }
}
