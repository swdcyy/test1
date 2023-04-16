package com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig;
import java.io.Serializable;
import java.lang.Object;

public class GameCenterKeyConfig$ToggleConfig implements Serializable	// class@000864
{
    public boolean mAutoDownloadColdBoot;
    public boolean mAutoDownloadNetChange;
    public boolean mBgInstallCtrlEmui;
    public boolean mBgInstallCtrlMiui;
    public boolean mBgInstallCtrlOppo;
    public boolean mBgInstallCtrlVivo;
    public boolean mDownloadConcurrencyControl;
    public boolean mDownloadUseDns;
    public static final long serialVersionUID = 0x823873f2438dd1bb;

    public void GameCenterKeyConfig$ToggleConfig(){
       super();
       this.mAutoDownloadColdBoot = true;
       this.mAutoDownloadNetChange = true;
       this.mDownloadConcurrencyControl = true;
       this.mDownloadUseDns = true;
       this.mBgInstallCtrlVivo = false;
       this.mBgInstallCtrlMiui = false;
       this.mBgInstallCtrlOppo = false;
       this.mBgInstallCtrlEmui = false;
    }
}
