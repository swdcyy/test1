package com.yxcorp.gifshow.growth.push.model.PushConfigRecord;
import android.os.Parcelable;
import com.yxcorp.gifshow.growth.push.model.PushConfigRecord$a;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Parcel;
import com.yxcorp.gifshow.growth.push.model.PushCofigRdItem;
import android.os.Parcelable$Creator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Long;

public class PushConfigRecord implements Parcelable	// class@0014a1
{
    public List b;
    public List c;
    public List d;
    public List e;
    public static final Parcelable$Creator CREATOR;

    static {
       PushConfigRecord.CREATOR = new PushConfigRecord$a();
    }
    public void PushConfigRecord(){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayList();
    }
    public void PushConfigRecord(Parcel p0){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayList();
       Parcelable$Creator cREATOR = PushCofigRdItem.CREATOR;
       this.b = p0.createTypedArrayList(cREATOR);
       this.c = p0.createTypedArrayList(cREATOR);
       this.d = p0.createTypedArrayList(cREATOR);
       this.e = p0.createTypedArrayList(cREATOR);
    }
    public PushCofigRdItem a(int p0){
       PushConfigRecord obj;
       if (PatchProxy.isSupport(PushConfigRecord.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PushConfigRecord.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c;
       if (obj == null || (p0 >= 0 && !obj.isEmpty())) {
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             PushCofigRdItem pushCofigRdI = iterator.next();
             if (pushCofigRdI != null && pushCofigRdI.a() == p0) {
                return pushCofigRdI;
             }
          }
       }
       return null;
    }
    public void b(int p0,long p1){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, PushConfigRecord.class, "5")) {
          return;
       }
       this.f(this.d, p0, p1);
       return;
    }
    public void c(int p0,long p1){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, PushConfigRecord.class, "2")) {
          return;
       }
       this.f(this.c, p0, p1);
       return;
    }
    public void d(int p0,long p1){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, PushConfigRecord.class, "3")) {
          return;
       }
       this.f(this.b, p0, p1);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void e(int p0,long p1){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, PushConfigRecord.class, "4")) {
          return;
       }
       this.f(this.e, p0, p1);
       return;
    }
    public final void f(List p0,int p1,long p2){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), this, PushConfigRecord.class, "6")) {
          return;
       }
       if (p0 != null) {
          int i = 0;
          int i1 = -1;
          while (i < p0.size()) {
             if (p1 == this.b.get(i).a()) {
                i1 = i;
             }
             i = i + 1;
          }
          if (i1 == -1) {
             p0.add(new PushCofigRdItem(p1, p2));
          }else if(p0.get(i1) != null){
             p0.c = p2;
          }
       }
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PushConfigRecord.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PushConfigRecord.class, "7")) {
          return;
       }
       p0.writeTypedList(this.b);
       p0.writeTypedList(this.c);
       p0.writeTypedList(this.d);
       p0.writeTypedList(this.e);
       return;
    }
}
