package com.kuaishou.bowl.core.trigger.ScrollingTriggerEvent;
import java.io.Serializable;
import java.lang.Object;

public class ScrollingTriggerEvent implements Serializable	// class@0011af
{
    public int lastVisiblePosition;
    public int offsetX;
    public int offsetY;
    public String pageCode;
    public String pageInstance;
    public String pageName;
    public static final long serialVersionUID = 0x77eec89e1479fb46;

    public void ScrollingTriggerEvent(){
       super();
    }
}
