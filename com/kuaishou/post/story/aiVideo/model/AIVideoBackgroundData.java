package com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import android.os.Parcelable;
import java.lang.Cloneable;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData$a;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import java.io.File;
import java.lang.Boolean;
import tp4.v;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;

public final class AIVideoBackgroundData implements Parcelable, Cloneable	// class@000abb
{
    public final List b;
    public final List c;
    public int d;
    public int e;
    public String f;
    public static final Parcelable$Creator CREATOR;

    static {
       AIVideoBackgroundData.CREATOR = new AIVideoBackgroundData$a();
    }
    public void AIVideoBackgroundData(List p0,List p1,int p2,int p3,String p4){
       a.p(p0, "textList");
       a.p(p1, "recoData");
       a.p(p4, "placeholderImageFilePath");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void AIVideoBackgroundData(List p0,List p1,int p2,int p3,String p4,int p5,u p6){
       int i = (p5 & 0x04)? 0: p2;
       int i1 = (p5 & 0x08)? 0: p3;
       String str = (p5 & 0x10)? "": 0;
       super(p0, p1, i, i1, str);
       return;
    }
    public AIVideoBackgroundData a(){
       Object obj = PatchProxy.apply(null, this, AIVideoBackgroundData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData");
       return obj;
    }
    public final AIVideoBackgroundRecoData b(){
       Object[] objArray = null;
       AIVideoBackgroundData obj = PatchProxy.apply(objArray, this, AIVideoBackgroundData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj < null || obj >= this.c.size()) {
          return objArray;
       }
       return this.c.get(this.e);
    }
    public final AIVideoBackgroundRecoData c(){
       Object[] objArray = null;
       AIVideoBackgroundData obj = PatchProxy.apply(objArray, this, AIVideoBackgroundData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj < null || obj >= this.c.size()) {
          return objArray;
       }
       return this.c.get(this.d);
    }
    public Object clone(){
       return this.a();
    }
    public final File d(){
       AIVideoBackgroundRecoData obj = PatchProxy.apply(null, this, AIVideoBackgroundData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.i()) {
          return null;
       }
       obj = this.c();
       a.m(obj);
       return obj.a();
    }
    public int describeContents(){
       return 0;
    }
    public final int e(){
       return this.d;
    }
    public final String f(){
       return this.f;
    }
    public final List g(){
       return this.c;
    }
    public final List h(){
       return this.b;
    }
    public final boolean i(){
       Object obj = PatchProxy.apply(null, this, AIVideoBackgroundData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c() != null && v.b.g(this.c()))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AIVideoBackgroundData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AIVideoBackgroundData\(textList="+this.b+", recoData="+this.c+", currentIndex="+this.d+", "+"attemptSelectIndex="+this.e+", currentBackground="+this.c()+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AIVideoBackgroundData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AIVideoBackgroundData.class, "8")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeStringList(this.b);
       AIVideoBackgroundData tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, 0);
       }
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       p0.writeString(this.f);
       return;
    }
}
