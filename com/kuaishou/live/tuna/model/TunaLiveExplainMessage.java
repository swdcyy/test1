package com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage$a;
import nsd.u;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage$b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.tuna.model.ExplainBundleInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class TunaLiveExplainMessage implements Serializable, Parcelable	// class@000fbd
{
    public String mActionUrl;
    public String mBizType;
    public ExplainBundleInfo mBundleInfo;
    public String mButtonText;
    public String mExtParams;
    public CDNUrl[] mIconUrls;
    public boolean mShowClose;
    public int mSignalType;
    public String mTitle;
    public CDNUrl[] mTopLeftIconUrls;
    public String mTopLeftTips;
    public static final Parcelable$Creator CREATOR;
    public static final TunaLiveExplainMessage$a Companion;
    public static final long serialVersionUID;

    static {
       TunaLiveExplainMessage.Companion = new TunaLiveExplainMessage$a(null);
       TunaLiveExplainMessage.CREATOR = new TunaLiveExplainMessage$b();
    }
    public void TunaLiveExplainMessage(){
       super();
       this.mSignalType = -1;
       this.mBizType = "";
       this.mTitle = "";
       this.mActionUrl = "";
       this.mButtonText = "";
       this.mTopLeftTips = "";
       this.mExtParams = "";
    }
    public static void getMSignalType$annotations(){
    }
    public static final TunaLiveExplainMessage pbConvertToObject(SCLiveEcoExplainCardSignal p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaLiveExplainMessage.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaLiveExplainMessage.Companion.a(p0);
    }
    public int describeContents(){
       return 0;
    }
    public final String getMActionUrl(){
       return this.mActionUrl;
    }
    public final String getMBizType(){
       return this.mBizType;
    }
    public final ExplainBundleInfo getMBundleInfo(){
       return this.mBundleInfo;
    }
    public final String getMButtonText(){
       return this.mButtonText;
    }
    public final String getMExtParams(){
       return this.mExtParams;
    }
    public final CDNUrl[] getMIconUrls(){
       return this.mIconUrls;
    }
    public final boolean getMShowClose(){
       return this.mShowClose;
    }
    public final int getMSignalType(){
       return this.mSignalType;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final CDNUrl[] getMTopLeftIconUrls(){
       return this.mTopLeftIconUrls;
    }
    public final String getMTopLeftTips(){
       return this.mTopLeftTips;
    }
    public final void setMActionUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mActionUrl = p0;
       return;
    }
    public final void setMBizType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizType = p0;
       return;
    }
    public final void setMBundleInfo(ExplainBundleInfo p0){
       this.mBundleInfo = p0;
    }
    public final void setMButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mButtonText = p0;
       return;
    }
    public final void setMExtParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mExtParams = p0;
       return;
    }
    public final void setMIconUrls(CDNUrl[] p0){
       this.mIconUrls = p0;
    }
    public final void setMShowClose(boolean p0){
       this.mShowClose = p0;
    }
    public final void setMSignalType(int p0){
       this.mSignalType = p0;
    }
    public final void setMTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTitle = p0;
       return;
    }
    public final void setMTopLeftIconUrls(CDNUrl[] p0){
       this.mTopLeftIconUrls = p0;
    }
    public final void setMTopLeftTips(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaLiveExplainMessage.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopLeftTips = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TunaLiveExplainMessage.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TunaLiveExplainMessage.class, "7")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}
