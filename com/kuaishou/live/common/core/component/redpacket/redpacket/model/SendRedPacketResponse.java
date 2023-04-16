package com.kuaishou.live.common.core.component.redpacket.redpacket.model.SendRedPacketResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw1.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.Base64;
import java.io.IOException;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class SendRedPacketResponse implements Serializable	// class@001763
{
    public String mCustomRedPackSkinThemeString;
    public RedPacket mRedPacket;
    public WalletResponse mWallet;
    public static final long serialVersionUID = 0x125bd2cf90472371;

    public void SendRedPacketResponse(){
       super();
    }
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme parseCustomRedPackSkinTheme(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SendRedPacketResponse obj = PatchProxy.apply(objArray, this, SendRedPacketResponse.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mCustomRedPackSkinThemeString;
       Object[] objArray1 = PatchProxy.applyOneRefs(obj, objArray, g.class, "3");
       if (objArray1 != patchProxyRe) {
       }else if(!TextUtils.x(obj)){
          byte[] uobyteArray = Base64.decode(obj, 0);
          try{
             objArray = LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme.parseFrom(uobyteArray);
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             e0.printStackTrace();
             b.B(LiveLogTag.LIVE_RED_PACKET_SKIN, "parse base64 error. "+obj);
          }
       }
       return objArray1;
    }
}
