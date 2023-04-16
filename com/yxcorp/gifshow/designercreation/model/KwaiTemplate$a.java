package com.yxcorp.gifshow.designercreation.model.KwaiTemplate$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import java.lang.Integer;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Long;
import java.util.List;

public final class KwaiTemplate$a implements Parcelable$Creator	// class@001300
{

    public void KwaiTemplate$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       int i1;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiTemplate$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       String str1 = p0.readString();
       int i = 0;
       Integer integer = (p0.readInt())? Integer.valueOf(p0.readInt()): i;
       String str2 = p0.readString();
       if (p0.readInt()) {
          i1 = p0.readInt();
          uArrayList = new ArrayList(i1);
          for (; i1; i1 = i1 - 1) {
             uArrayList.add(p0.readSerializable());
          }
       }else {
          uArrayList = i;
       }
       if (p0.readInt()) {
          i1 = p0.readInt();
          uArrayList1 = new ArrayList(i1);
          for (; i1; i1 = i1 - 1) {
             uArrayList1.add(p0.readSerializable());
          }
       }else {
          uArrayList1 = i;
       }
       Long longx = (p0.readInt())? Long.valueOf(p0.readLong()): i;
       Long longx1 = (p0.readInt())? Long.valueOf(p0.readLong()): i;
       Integer integer1 = (p0.readInt())? Integer.valueOf(p0.readInt()): i;
       Integer integer2 = (p0.readInt())? Integer.valueOf(p0.readInt()): i;
       Integer integer3 = (p0.readInt())? Integer.valueOf(p0.readInt()): i;
       KwaiTemplate kwaiTemplate = new KwaiTemplate(str, str1, integer, str2, uArrayList, uArrayList1, longx, longx1, integer1, integer2, integer3);
       return obj;
    }
    public final Object[] newArray(int p0){
       KwaiTemplate[] kwaiTemplate = new KwaiTemplate[p0];
       return kwaiTemplate;
    }
}
