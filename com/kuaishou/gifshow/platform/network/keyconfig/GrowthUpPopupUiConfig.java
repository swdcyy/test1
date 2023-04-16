package com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupUiConfig;
import java.io.Serializable;
import com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupUiConfig$a;
import nsd.u;
import java.lang.Object;

public final class GrowthUpPopupUiConfig implements Serializable	// class@000874
{
    public String actionUrl;
    public GrowthUpPopupImageConfig athleteImage;
    public String athleteNameEn;
    public long audioStartTime;
    public GrowthUpPopupImageConfig backupImage;
    public GrowthUpPopupImageConfig backupMusic;
    public GrowthUpPopupImageConfig buttonImage;
    public String buttonTitle;
    public GrowthUpPopupCardConfig card;
    public GrowthUpPopupImageConfig degradeImage;
    public String desc;
    public long imageStartTime;
    public GrowthUpPopupImageConfig logoIcon;
    public GrowthUpPopupImageConfig lottie;
    public long lottieStartTime;
    public String subtitle;
    public GrowthUpPopupImageConfig tagImage;
    public String tagText;
    public String title;
    public boolean useBackupImage;
    public GrowthUpPopupVideoConfig video;
    public int viewType;
    public static final GrowthUpPopupUiConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthUpPopupUiConfig.Companion = new GrowthUpPopupUiConfig$a(null);
       GrowthUpPopupUiConfig.serialVersionUID = 0xe5be003b27532eba;
    }
    public void GrowthUpPopupUiConfig(){
       super();
       this.viewType = -1;
       this.imageStartTime = -1;
       this.audioStartTime = -1;
       this.lottieStartTime = -1;
    }
    public static final long getSerialVersionUID(){
       return GrowthUpPopupUiConfig.serialVersionUID;
    }
}
