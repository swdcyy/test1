package com.kuaishou.render.engine.communication.data.SPBEventBean;
import java.io.Serializable;
import java.lang.Object;

public class SPBEventBean implements Serializable	// class@000eea
{
    public String action;
    public String customPageId;
    public String data;
    public boolean ignoreGlobal;
    public boolean isPageEvent;
    public String pageId;
    public String pageName;
    public String token;

    public void SPBEventBean(){
       super();
    }
}
