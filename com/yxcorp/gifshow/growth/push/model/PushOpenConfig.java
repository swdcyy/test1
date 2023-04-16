package com.yxcorp.gifshow.growth.push.model.PushOpenConfig;
import java.io.Serializable;
import java.lang.Object;

public class PushOpenConfig implements Serializable	// class@0014a3
{
    public String btnText;
    public String darkIcon;
    public int dayMax;
    public String icon;
    public int perMax;
    public int period;
    public String subtitle;
    public String tip;
    public String title;
    public static final long serialVersionUID = 0x79a79a10f8cbd392;

    public void PushOpenConfig(){
       super();
       this.dayMax = 0;
       this.period = 0;
       this.perMax = 0;
       this.title = "";
       this.subtitle = "";
       this.btnText = "";
       this.icon = "";
       this.darkIcon = "";
       this.tip = "";
    }
}
