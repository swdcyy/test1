package com.kwai.video.wayne.player.main.OmniRetryInfo;
import com.kwai.video.wayne.player.main.OmniRetryInfo$Companion;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;
import java.util.List;
import nsd.r0;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.kwai.video.wayne.player.main.OmniRetryInfo$PlayerTryInfo;
import java.lang.Long;

public final class OmniRetryInfo	// class@000d77
{
    public OmniRetryInfo$PlayerTryInfo mCurrentPlayerTryInfo;
    public String mDescribe;
    public final AtomicBoolean mDirty;
    public final List mPlayerTryInfoList;
    public int mTotalUrlOrRepCount;
    public static final OmniRetryInfo$Companion Companion;

    static {
       OmniRetryInfo.Companion = new OmniRetryInfo$Companion(null);
    }
    public void OmniRetryInfo(){
       super();
       this.mDirty = new AtomicBoolean(true);
       this.mDescribe = "OmniRetryInfo NoValue";
       this.mPlayerTryInfoList = new ArrayList();
    }
    public final String getDescribe(){
       Object obj = PatchProxy.apply(null, this, OmniRetryInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDirty.getAndSet(false)) {
          this.mDescribe = this.makeDescribe();
       }
       return this.mDescribe;
    }
    public final String makeDescribe(){
       Object[] objArray;
       String str1;
       String obj = PatchProxy.apply(null, this, OmniRetryInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String str = "java.lang.String.format\(locale, format, *args\)";
       int i = 0;
       int i1 = 1;
       if (!this.mPlayerTryInfoList.size()) {
          objArray = new Object[i1];
          objArray[i] = Integer.valueOf(this.mTotalUrlOrRepCount);
          str1 = String.format(Locale.US, "url/rep count:%d, 没播放器创建历史", Arrays.copyOf(objArray, i1));
          a.o(str1, str);
          obj = obj+str1;
          a.o(obj, "sb.toString\(\)");
       }else {
          objArray = new Object[i1];
          objArray[i] = Integer.valueOf(this.mTotalUrlOrRepCount);
          str1 = String.format(Locale.US, "url/rep count:%d", Arrays.copyOf(objArray, i1));
          a.o(str1, str);
          obj = obj+str1;
          int i2 = this.mPlayerTryInfoList.size();
          for (; i < i2; i = i + 1) {
             obj = obj+"\n"+this.mPlayerTryInfoList.get(i).getDescribe();
          }
          obj = obj;
          a.o(obj, "sb.toString\(\)");
       }
       return obj;
    }
    public final void onCdnError(int p0){
       OmniRetryInfo omniRetryInf = OmniRetryInfo.class;
       if (PatchProxy.isSupport(omniRetryInf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omniRetryInf, "3")) {
          return;
       }
       omniRetryInf = this.mCurrentPlayerTryInfo;
       if (omniRetryInf == null) {
          return;
       }
       omniRetryInf.addError("cdnError", p0);
       this.mDirty.set(true);
       return;
    }
    public final void onNewPlayerCreated(int p0,long p1){
       OmniRetryInfo omniRetryInf = OmniRetryInfo.class;
       if (PatchProxy.isSupport(omniRetryInf) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, omniRetryInf, "2")) {
          return;
       }
       OmniRetryInfo$PlayerTryInfo playerTryInf = new OmniRetryInfo$PlayerTryInfo((this.mPlayerTryInfoList.size() + 1), p0, p1);
       this.mCurrentPlayerTryInfo = playerTryInf;
       a.m(playerTryInf);
       this.mPlayerTryInfoList.add(playerTryInf);
       this.mDirty.set(1);
       return;
    }
    public final void onPlayerError(int p0){
       OmniRetryInfo omniRetryInf = OmniRetryInfo.class;
       if (PatchProxy.isSupport(omniRetryInf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omniRetryInf, "4")) {
          return;
       }
       omniRetryInf = this.mCurrentPlayerTryInfo;
       if (omniRetryInf == null) {
          return;
       }
       omniRetryInf.addError("playerError", p0);
       this.mDirty.set(true);
       return;
    }
    public final void setTotalUrlOrRepCount(int p0){
       OmniRetryInfo omniRetryInf = OmniRetryInfo.class;
       if (PatchProxy.isSupport(omniRetryInf) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omniRetryInf, "1")) {
          return;
       }
       this.mTotalUrlOrRepCount = p0;
       this.mDirty.set(true);
       return;
    }
}
