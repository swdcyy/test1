package com.yxcrop.gifshow.v3.editor.text_v3.action.UpdateOriginTextActionV3;
import xvc.b;
import java.lang.String;
import nsd.u;

public final class UpdateOriginTextActionV3 extends b	// class@000c07
{
    public final String originHintText;
    public final String text;

    public void UpdateOriginTextActionV3(){
       super(null, null, 3, null);
    }
    public void UpdateOriginTextActionV3(String p0,String p1){
       super();
       this.text = p0;
       this.originHintText = p1;
    }
    public void UpdateOriginTextActionV3(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final String getOriginHintText(){
       return this.originHintText;
    }
    public final String getText(){
       return this.text;
    }
}
