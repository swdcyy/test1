package com.kuaishou.gifshow.platform.network.keyconfig.ZtGameKeyConfig;
import java.io.Serializable;
import java.lang.Object;

public class ZtGameKeyConfig implements Serializable	// class@00088c
{
    public String battleHistoryURL;
    public String gameListAppId;
    public boolean mDefalutLinkMicStatus;
    public boolean mDefaultSpeakerStatus;
    public Map mLuaGameIds;
    public Map mSoGameOfficeAccounts;
    public String[] mainStackLaunchGameIds;
    public String messageCenterURL;
    public boolean openExternalShare;
    public boolean openPerformanceReport;
    public int perfReportFrequency;
    public String searchGamePlaceholder;
    public String[] supportVipCommandGames;
    public static final long serialVersionUID = 0x26803af80ef99cf;

    public void ZtGameKeyConfig(){
       super();
       this.openPerformanceReport = false;
       this.openExternalShare = false;
       this.perfReportFrequency = 100;
    }
}
