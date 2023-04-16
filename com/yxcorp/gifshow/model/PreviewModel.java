package com.yxcorp.gifshow.model.PreviewModel;
import android.os.Parcelable;
import com.yxcorp.gifshow.model.PreviewModel$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import android.graphics.Rect;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Integer;

public class PreviewModel implements Parcelable	// class@001e79
{
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Rect g;
    public boolean h;
    public boolean i;
    public boolean j;
    public float k;
    public static final Parcelable$Creator CREATOR;

    static {
       PreviewModel.CREATOR = new PreviewModel$a();
    }
    public void PreviewModel(){
       super();
       this.k = 0x3f800000;
    }
    public void PreviewModel(Parcel p0){
       super();
       this.k = 0x3f800000;
       this.b = p0.readString();
       this.d = p0.readString();
       this.e = p0.readString();
       this.f = p0.readString();
       this.g = p0.readParcelable(Rect.class.getClassLoader());
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       this.h = b1;
       this.c = p0.readString();
       if (!p0.readInt()) {
          b = false;
       }
       this.j = b;
       this.k = p0.readFloat();
       return;
    }
    public static PreviewModel a(String p0,String p1,String p2,Rect p3){
       p0 = PatchProxy.applyFourRefs(null, p1, null, p3, null, PreviewModel.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       float f = 0x3f800000;
       if (p3.height()) {
          f = ((float)p3.width() * f) / (float)p3.height();
       }
       return PreviewModel.b(null, p1, null, p3, f);
    }
    public static PreviewModel b(String p0,String p1,String p2,Rect p3,float p4){
       PreviewModel obj;
       if (PatchProxy.isSupport(PreviewModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, PreviewModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PreviewModel();
       obj.b = p0;
       obj.d = p1;
       obj.e = p1;
       obj.f = p2;
       obj.g = p3;
       obj.k = p4;
       return obj;
    }
    public static PreviewModel c(String p0,String p1,String p2,String p3,String p4,Rect p5){
       PreviewModel obj;
       if (PatchProxy.isSupport(PreviewModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, PreviewModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PreviewModel();
       obj.b = p0;
       obj.d = p2;
       obj.e = p3;
       obj.f = p4;
       obj.g = p5;
       obj.h = true;
       obj.c = p1;
       return obj;
    }
    public boolean d(){
       return this.i;
    }
    public int describeContents(){
       return 0;
    }
    public void e(boolean p0){
       this.i = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PreviewModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PreviewModel.class, "4")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeString(this.d);
       p0.writeString(this.e);
       p0.writeString(this.f);
       p0.writeParcelable(this.g, p1);
       p0.writeInt(this.h);
       p0.writeString(this.c);
       p0.writeInt(this.j);
       p0.writeFloat(this.k);
       return;
    }
}
