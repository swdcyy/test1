package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class PadCoronaRankingListMeta implements Serializable	// class@00123a
{
    public long coronaZoneId;
    public ArrayList hotTabList;
    public String rightZoneText;
    public String title;
    public static final long DEFAULT_ID = 0x0;
    public static final long serialVersionUID = 0xede4cd03e1dca819;

    public void PadCoronaRankingListMeta(){
       super();
       this.coronaZoneId = 0;
       this.title = "";
       this.rightZoneText = "";
       this.hotTabList = new ArrayList();
    }
}
