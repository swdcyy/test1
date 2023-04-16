package com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupCardConfig;
import java.io.Serializable;
import com.kuaishou.gifshow.platform.network.keyconfig.GrowthUpPopupCardConfig$a;
import nsd.u;
import java.lang.Object;

public final class GrowthUpPopupCardConfig implements Serializable	// class@00086d
{
    public long cardBackwardSecond;
    public long cardDisappearSecond;
    public long cardForwardSecond;
    public GrowthUpPopupImageConfig cardImage;
    public String cardSubtitle;
    public String cardTitle;
    public String cardUrl;
    public long plcIntervalSecond;
    public static final GrowthUpPopupCardConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthUpPopupCardConfig.Companion = new GrowthUpPopupCardConfig$a(null);
       GrowthUpPopupCardConfig.serialVersionUID = 0xe030ea59b12818e2;
    }
    public void GrowthUpPopupCardConfig(){
       super();
       this.cardDisappearSecond = -1;
       this.plcIntervalSecond = -1;
       this.cardBackwardSecond = -1;
       this.cardForwardSecond = -1;
    }
    public static final long getSerialVersionUID(){
       return GrowthUpPopupCardConfig.serialVersionUID;
    }
}
