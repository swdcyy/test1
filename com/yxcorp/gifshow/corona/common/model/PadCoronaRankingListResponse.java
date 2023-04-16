package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse;
import la6.b;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PadCoronaRankingListResponse implements b	// class@00123f
{
    public String bgImageUrl;
    public int errorCode;
    public ArrayList feeds;
    public String logoUrl;
    public int result;
    public ArrayList tabList;
    public String updateText;
    public static final PadCoronaRankingListResponse$a Companion;
    public static final long serialVersionUID;

    static {
       PadCoronaRankingListResponse.Companion = new PadCoronaRankingListResponse$a(null);
    }
    public void PadCoronaRankingListResponse(){
       super();
       this.errorCode = -1;
       this.bgImageUrl = "";
       this.logoUrl = "";
       this.updateText = "";
       this.tabList = new ArrayList();
       this.feeds = new ArrayList();
    }
    public final String getBgImageUrl(){
       return this.bgImageUrl;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
    public final ArrayList getFeeds(){
       return this.feeds;
    }
    public List getItems(){
       return this.feeds;
    }
    public final String getLogoUrl(){
       return this.logoUrl;
    }
    public final int getResult(){
       return this.result;
    }
    public final ArrayList getTabList(){
       return this.tabList;
    }
    public final String getUpdateText(){
       return this.updateText;
    }
    public boolean hasMore(){
       return false;
    }
    public final boolean isSuccess(){
       boolean b = true;
       if (this.result == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void setBgImageUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.bgImageUrl = p0;
       return;
    }
    public final void setErrorCode(int p0){
       this.errorCode = p0;
    }
    public final void setFeeds(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListResponse.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.feeds = p0;
       return;
    }
    public final void setLogoUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.logoUrl = p0;
       return;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
    public final void setTabList(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListResponse.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tabList = p0;
       return;
    }
    public final void setUpdateText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.updateText = p0;
       return;
    }
}
