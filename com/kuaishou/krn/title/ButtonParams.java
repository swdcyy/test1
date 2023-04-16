package com.kuaishou.krn.title.ButtonParams;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.krn.title.ButtonParams$PositionId;

public class ButtonParams implements Serializable	// class@000919
{
    public ButtonParams$PositionId buttonId;
    public String image;
    public String pressedImage;
    public String role;
    public String textColor;
    public String title;
    public String viewType;

    public void ButtonParams(){
       super();
       this.buttonId = ButtonParams$PositionId.LEFT1;
    }
}
