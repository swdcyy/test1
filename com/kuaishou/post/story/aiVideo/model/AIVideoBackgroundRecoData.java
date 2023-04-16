package com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import android.os.Parcelable;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData$a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tp4.v;
import qkd.b;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;

public final class AIVideoBackgroundRecoData implements Parcelable	// class@000abe
{
    public final String id;
    public List urls;
    public static final Parcelable$Creator CREATOR;

    static {
       AIVideoBackgroundRecoData.CREATOR = new AIVideoBackgroundRecoData$a();
    }
    public void AIVideoBackgroundRecoData(String p0,List p1){
       a.p(p0, "id");
       a.p(p1, "urls");
       super();
       this.id = p0;
       this.urls = p1;
    }
    public final File a(){
       File obj = PatchProxy.apply(null, this, AIVideoBackgroundRecoData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(v.b.d(this));
       if (!b.S(obj)) {
          return null;
       }
       return obj;
    }
    public final String b(){
       return this.id;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AIVideoBackgroundRecoData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AIVideoBackgroundRecoData\(id=\'"+this.id+"\', urls="+this.urls+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AIVideoBackgroundRecoData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AIVideoBackgroundRecoData.class, "4")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.id);
       AIVideoBackgroundRecoData turls = this.urls;
       p0.writeInt(turls.size());
       Iterator iterator = turls.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       return;
    }
}
