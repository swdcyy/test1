package com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditStartAction;
import xvc.b;
import java.lang.String;
import nsd.u;

public final class TextEditStartAction extends b	// class@000b7c
{
    public final int keyboardOffset;
    public final String originText;

    public void TextEditStartAction(int p0,String p1){
       super();
       this.keyboardOffset = p0;
       this.originText = p1;
    }
    public void TextEditStartAction(int p0,String p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final int getKeyboardOffset(){
       return this.keyboardOffset;
    }
    public final String getOriginText(){
       return this.originText;
    }
}
