package com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Resp;
import android.os.Bundle;
import java.lang.String;

public final class SendTdiAuth$Resp extends SendAuth$Resp	// class@000ee7
{
    public byte[] tdiAuthBuffer;

    public void SendTdiAuth$Resp(Bundle p0){
       super(p0);
    }
    public boolean checkArgs(){
       return true;
    }
    public void fromBundle(Bundle p0){
       super.fromBundle(p0);
       this.tdiAuthBuffer = p0.getByteArray("_wxapi_sendauth_resp_tdi_buffer");
    }
    public int getType(){
       return 31;
    }
    public void toBundle(Bundle p0){
       super.toBundle(p0);
       p0.putByteArray("_wxapi_sendauth_resp_tdi_buffer", this.tdiAuthBuffer);
    }
}
