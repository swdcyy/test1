package com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.io.Serializable;
import java.lang.Object;
import pt2.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import qs2.r;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Integer;

public class VoicePartyMicSeatData implements Serializable	// class@0015ba
{
    public l mDecoration;
    public int mId;
    public boolean mIsApplyingAboardMic;
    public boolean mIsVideoOpened;
    public int[] mMicSeatTypes;
    public int mMicState;
    public b mMicUser;
    public long mReadyTime;
    public static final VoicePartyMicSeatData EMPTY;
    public static final long serialVersionUID;

    static {
       VoicePartyMicSeatData.EMPTY = new VoicePartyMicSeatData();
    }
    public void VoicePartyMicSeatData(){
       super();
       this.mMicState = 0;
    }
    public void VoicePartyMicSeatData(VoicePartyMicSeatData p0){
       super();
       this.mMicState = 0;
       this.mMicState = p0.mMicState;
       this.mId = p0.mId;
       this.mMicSeatTypes = p0.mMicSeatTypes;
       this.mIsApplyingAboardMic = p0.mIsApplyingAboardMic;
       VoicePartyMicSeatData mMicUser = p0.mMicUser;
       if (mMicUser != null) {
          this.mMicUser = new b(mMicUser);
       }
       this.mIsVideoOpened = p0.mIsVideoOpened;
       this.mReadyTime = p0.mReadyTime;
       this.mDecoration = p0.mDecoration;
       return;
    }
    public String getKsCoin(){
       VoicePartyMicSeatData obj = PatchProxy.apply(null, this, VoicePartyMicSeatData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMicUser;
       String str = "";
       b g = (obj != null)? obj.g: str;
       if (!TextUtils.isEmpty(g)) {
          str = g;
       }
       return str;
    }
    public String getUserId(){
       VoicePartyMicSeatData tmMicUser = this.mMicUser;
       if (tmMicUser != null) {
          b a = tmMicUser.a;
          if (a != null) {
             return a.mId;
          }
       }
       return null;
    }
    public boolean isMuted(){
       boolean b;
       VoicePartyMicSeatData obj = PatchProxy.apply(null, this, VoicePartyMicSeatData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMicUser;
       obj = (obj != null && obj.b != null)? 1: null;
       if (!obj) {
          b = r.f(this.mMicState);
       }
       return b;
    }
    public boolean isOccupied(){
       boolean b = (this.mMicUser != null)? true: false;
       return b;
    }
    public String toString(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, VoicePartyMicSeatData.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "VoicePartyMicSeatData{mId="+this.mId+", mMicUserId=";
       VoicePartyMicSeatData tmMicUser = this.mMicUser;
       String str = "null";
       if (tmMicUser != null) {
          b a = tmMicUser.a;
          if (a != null) {
             str1 = a.mId;
          label_0033 :
             obj = obj+str1+", mMicState="+this.mMicState+", mMicSeatTypes="+Arrays.toString(this.mMicSeatTypes)+", mIsApplyingAboardMic="+this.mIsApplyingAboardMic+", mUserType=";
             tmMicUser = this.mMicUser;
             if (tmMicUser != null) {
                a = tmMicUser.f;
                b uob = b.class;
                if (PatchProxy.isSupport(uob)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(a), objArray, uob, "1");
                   if (obj1 != patchProxyRe) {
                      str = obj1;
                   }
                }
                StringBuilder str2 = "[ ";
                if (a & 0x02) {
                   str2 = str2+"applyMic ";
                }
                if (a & 0x04) {
                   str2 = str2+"candidateSinger ";
                }
                if (a & 0x08) {
                   str2 = str2+"singer ";
                }
                if (a & 0x10) {
                   str2 = str2+"guest/anchor ";
                }
                if (a & 0x20) {
                   str2 = str2+"unionAnchor ";
                }
                str = str2+']';
             }
             return obj+str+'}'+", mReadyTime="+this.mReadyTime;
          }
       }
       str1 = str;
       goto label_0033 ;
    }
}
