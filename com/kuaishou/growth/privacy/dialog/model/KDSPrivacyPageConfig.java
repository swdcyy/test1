package com.kuaishou.growth.privacy.dialog.model.KDSPrivacyPageConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class KDSPrivacyPageConfig implements Serializable	// class@000724
{
    public boolean active;
    public String privacyBundle;
    public String protocolListBundle;
    public String protocolSummaryBundle;
    public List rnIgnoreList;
    public String userServiceBundle;
    public List yodaIgnoreList;
    public static final long serialVersionUID = 0x99276debe10740d4;

    public void KDSPrivacyPageConfig(){
       super();
       this.privacyBundle = "";
       this.userServiceBundle = "";
       this.protocolSummaryBundle = "";
       this.protocolListBundle = "";
       this.rnIgnoreList = new ArrayList();
       this.yodaIgnoreList = new ArrayList();
       this.active = true;
    }
}
