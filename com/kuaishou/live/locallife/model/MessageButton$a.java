package com.kuaishou.live.locallife.model.MessageButton$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.model.MessageButton;

public final class MessageButton$a implements Parcelable$Creator	// class@000c3d
{

    public void MessageButton$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MessageButton$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       MessageButton messageButto = (p0.readInt())? new MessageButton(): null;
       return messageButto;
    }
    public final Object[] newArray(int p0){
       MessageButton[] messageButto = new MessageButton[p0];
       return messageButto;
    }
}