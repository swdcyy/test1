package com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container.model.PlcDynamicSearchInfo$b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class PlcDynamicSearchInfo implements Serializable, Parcelable	// class@000fee
{
    public final String area;
    public final String text;
    public final List words;
    public static final Parcelable$Creator CREATOR;
    public static final PlcDynamicSearchInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PlcDynamicSearchInfo.Companion = new PlcDynamicSearchInfo$a(null);
       PlcDynamicSearchInfo.CREATOR = new PlcDynamicSearchInfo$b();
    }
    public void PlcDynamicSearchInfo(String p0,List p1,String p2){
       a.p(p0, "text");
       super();
       this.text = p0;
       this.words = p1;
       this.area = p2;
    }
    public int describeContents(){
       return 0;
    }
    public final String getArea(){
       return this.area;
    }
    public final String getText(){
       return this.text;
    }
    public final List getWords(){
       return this.words;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlcDynamicSearchInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlcDynamicSearchInfo.class, "1")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.text);
       p0.writeStringList(this.words);
       p0.writeString(this.area);
       return;
    }
}
