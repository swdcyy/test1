package com.kuaishou.render.engine.communication.data.SPBMethodBean;
import java.io.Serializable;
import java.lang.Object;

public class SPBMethodBean implements Serializable	// class@000eeb
{
    public String callbackId;
    public String customPageId;
    public String data;
    public boolean ignoreGlobal;
    public boolean isPageMethod;
    public String name;
    public String pageId;
    public String pageName;
    public String token;

    public void SPBMethodBean(){
       super();
    }
}
