package ki1.a;
import kz2.c;
import com.kuaishou.live.core.show.gift.GiftMessage;
import g03.a;
import mz2.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeedEffectiveInfo;
import com.kuaishou.live.basic.model.QLiveMessage;
import mz2.n;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import mz2.i;
import java.util.List;
import java.lang.Boolean;
import e92.d;

public class a extends c	// class@002d41
{
    public final GiftMessage l;
    public final boolean m;
    public final int n;
    public String o;

    public void a(GiftMessage p0,boolean p1,int p2,a p3){
       super(p3);
       this.o = "";
       this.l = p0;
       this.m = p1;
       this.n = p2;
    }
    public a J(){
       UserInfo giftReceiver;
       LiveStreamMessages$GiftFeedEffectiveInfo needParamTyp;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.S()) {
          obj = PatchProxy.apply(objArray, this, uoa, "4");
          if (obj != patchProxyRe) {
          }else {
             Object[] objArray1 = PatchProxy.apply(objArray, this, uoa, "5");
             if (objArray1 != patchProxyRe) {
             }else {
                a tl = this.l;
                GiftMessage mGiftFeedEff = tl.mGiftFeedEffectInfo;
                objArray1 = (mGiftFeedEff == null)? null: mGiftFeedEff.needParamType;
                if (objArray1 != 1) {
                   if (objArray1 != 2) {
                      objArray1 = objArray;
                   }else {
                      giftReceiver = tl.getGiftReceiverUserInfo();
                   }
                }else {
                   giftReceiver = tl.mUser;
                }
                objArray1 = giftReceiver;
             }
             if (objArray1 != null) {
                this.o = objArray1.mName;
             }
             if (objArray1 != null) {
                objArray = new n(objArray1);
             }
             obj = objArray;
          }
          return obj;
       }else {
          ArrayList obj1 = PatchProxy.apply(objArray, this, uoa, "6");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             GiftMessage mGiftFeedEff1 = this.l.mGiftFeedEffectInfo;
             if (mGiftFeedEff1 != null) {
                obj1 = new ArrayList();
                if (mGiftFeedEff1.needAvatar != null || mGiftFeedEff1.showNickname != null) {
                   if (this.l.getGiftReceiverUserInfo() != null) {
                      obj1.add(this.l.getGiftReceiverUserInfo());
                   }
                   QLiveMessage mUser = this.l.mUser;
                   if (mUser != null) {
                      obj1.add(mUser);
                   }
                }
                if (!q.f(obj1)) {
                   objArray = new i(obj1, mGiftFeedEff1.needAvatar, mGiftFeedEff1.showNickname);
                }
             }
          }
          return objArray;
       }
    }
    public int K(){
       return this.n;
    }
    public byte[] L(){
       return this.l.mGiftFeedSerializableData;
    }
    public int M(){
       return this.l.mGiftId;
    }
    public String N(){
       GiftMessage mGiftFeedEff = this.l.mGiftFeedEffectInfo;
       String str = (mGiftFeedEff == null)? null: mGiftFeedEff.interactiveTip;
       return str;
    }
    public int O(){
       return this.l.mMagicGiftAudioEffectType;
    }
    public String P(){
       return this.o;
    }
    public boolean Q(){
       GiftMessage mGiftFeedEff = this.l.mGiftFeedEffectInfo;
       boolean b = (mGiftFeedEff != null && mGiftFeedEff.needInteractive != null)? true: false;
       return b;
    }
    public boolean R(){
       boolean b = ((this.l.mType & 0x800000) > 0)? true: false;
       return b;
    }
    public boolean S(){
       GiftMessage mGiftFeedEff = this.l.mGiftFeedEffectInfo;
       boolean b = false;
       if (mGiftFeedEff == null) {
          return b;
       }
       LiveStreamMessages$GiftFeedEffectiveInfo needParamTyp = mGiftFeedEff.needParamType;
       if (needParamTyp == 1 || needParamTyp == 2) {
          b = true;
       }
       return b;
    }
    public long b(){
       return this.l.mMagicFaceId;
    }
    public long e(){
       return this.l.mExpireDate;
    }
    public long getCreateTime(){
       return this.l.mTime;
    }
    public boolean h(){
       return this.m;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(this.l);
    }
    public int n(){
       return 0xdb9ff;
    }
    public int p(){
       int i = (this.l.mIsStreamMergingGift != null)? 2: 1;
       return i;
    }
    public int z(){
       return this.l.mRank;
    }
}
