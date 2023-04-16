package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$a;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ClassLoader;
import android.os.Parcelable;
import org.parceler.b;

public class LiveTopicActivityBasicItemInfo$a implements c	// class@001b7e
{

    public void LiveTopicActivityBasicItemInfo$a(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public LiveTopicActivityBasicItemInfo c(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTopicActivityBasicItemInfo$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.readParcelable(LiveTopicActivityBasicItemInfo.class.getClassLoader()));
    }
    public void d(LiveTopicActivityBasicItemInfo p0,Parcel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveTopicActivityBasicItemInfo$a.class, "1")) {
          return;
       }
       p1.writeParcelable(b.b(p0.getClass(), p0), 0);
       return;
    }
}
