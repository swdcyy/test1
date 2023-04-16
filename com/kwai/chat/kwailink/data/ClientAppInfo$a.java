package com.kwai.chat.kwailink.data.ClientAppInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.ClassLoader;
import java.util.HashMap;

public class ClientAppInfo$a implements Parcelable$Creator	// class@000a42
{

    public void ClientAppInfo$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       String str = "1";
       ClientAppInfo uClientAppIn = PatchProxy.applyOneRefs(p0, this, ClientAppInfo$a.class, str);
       if (uClientAppIn != PatchProxyResult.class) {
       }else {
          uClientAppIn = new ClientAppInfo();
          if (!PatchProxy.applyVoidOneRefs(p0, uClientAppIn, ClientAppInfo.class, str)) {
             uClientAppIn.n(p0.readInt());
             uClientAppIn.w(p0.readInt());
             uClientAppIn.x(p0.readString());
             uClientAppIn.t(p0.readString());
             uClientAppIn.o(p0.readString());
             uClientAppIn.q(p0.readString());
             uClientAppIn.y(p0.readString());
             uClientAppIn.C(p0.readString());
             uClientAppIn.A(p0.readString());
             uClientAppIn.B(p0.readString());
             uClientAppIn.l = p0.readString();
             uClientAppIn.z(p0.readInt());
             uClientAppIn.n = p0.readHashMap(ClientAppInfo.class.getClassLoader());
          }
       }
       return uClientAppIn;
    }
    public Object[] newArray(int p0){
       ClientAppInfo[] uClientAppIn = new ClientAppInfo[p0];
       return uClientAppIn;
    }
}
