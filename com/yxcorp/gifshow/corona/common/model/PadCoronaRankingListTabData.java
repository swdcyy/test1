package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import im8.g;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$a;
import nsd.u;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jq9.y0;
import java.util.Map;
import java.util.HashMap;
import kotlin.jvm.internal.a;

public final class PadCoronaRankingListTabData extends PadCoronaRankingListTabInfo implements g	// class@001244
{
    public boolean canSlideToScheme;
    public CoronaInfo coronaInfo;
    public int coronaZoneId;
    public ArrayList feeds;
    public String scheme;
    public int type;
    public static final PadCoronaRankingListTabData$a Companion;
    public static final long serialVersionUID;

    static {
       PadCoronaRankingListTabData.Companion = new PadCoronaRankingListTabData$a(null);
    }
    public void PadCoronaRankingListTabData(){
       super();
       this.type = -1;
       this.scheme = "";
       this.coronaInfo = new CoronaInfo(5, 1);
       this.feeds = new ArrayList();
    }
    public final boolean getCanSlideToScheme(){
       return this.canSlideToScheme;
    }
    public final CoronaInfo getCoronaInfo(){
       return this.coronaInfo;
    }
    public final int getCoronaZoneId(){
       return this.coronaZoneId;
    }
    public final ArrayList getFeeds(){
       return this.feeds;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListTabData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListTabData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PadCoronaRankingListTabData.class, new y0());
       }else {
          obj.put(PadCoronaRankingListTabData.class, null);
       }
       return obj;
    }
    public final String getScheme(){
       return this.scheme;
    }
    public final int getType(){
       return this.type;
    }
    public final void setCanSlideToScheme(boolean p0){
       this.canSlideToScheme = p0;
    }
    public final void setCoronaInfo(CoronaInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListTabData.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.coronaInfo = p0;
       return;
    }
    public final void setCoronaZoneId(int p0){
       this.coronaZoneId = p0;
    }
    public final void setFeeds(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListTabData.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.feeds = p0;
       return;
    }
    public final void setScheme(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListTabData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.scheme = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}
