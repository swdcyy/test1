package com.yxcorp.gifshow.comment.image.model.ImagePreviewModel;
import android.os.Parcelable;
import com.yxcorp.gifshow.comment.image.model.ImagePreviewModel$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import android.graphics.Rect;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class ImagePreviewModel implements Parcelable	// class@0010d4
{
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Rect g;
    public Rect h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public static final Parcelable$Creator CREATOR;

    static {
       ImagePreviewModel.CREATOR = new ImagePreviewModel$a();
    }
    public void ImagePreviewModel(){
       super();
       this.m = 0x3f800000;
       this.n = 0;
       this.o = 0;
    }
    public void ImagePreviewModel(Parcel p0){
       super();
       this.m = 0x3f800000;
       this.n = 0;
       this.o = 0;
       this.b = p0.readString();
       this.d = p0.readString();
       this.e = p0.readString();
       this.f = p0.readString();
       this.g = p0.readParcelable(Rect.class.getClassLoader());
       this.h = p0.readParcelable(Rect.class.getClassLoader());
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       this.i = b1;
       this.c = p0.readString();
       b1 = (p0.readInt())? true: false;
       this.k = b1;
       this.m = p0.readFloat();
       this.n = p0.readFloat();
       this.o = p0.readFloat();
       if (!p0.readInt()) {
          b = false;
       }
       this.l = b;
       return;
    }
    public static ImagePreviewModel a(String p0,String p1,String p2,String p3,Rect p4,Rect p5,float p6,Float p7,Float p8,Boolean p9){
       ImagePreviewModel obj;
       if (PatchProxy.isSupport(ImagePreviewModel.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Float.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          obj = PatchProxy.apply(objArray, null, ImagePreviewModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ImagePreviewModel();
       obj.b = p0;
       obj.d = p1;
       obj.e = p2;
       obj.f = p3;
       obj.g = p4;
       obj.h = p5;
       obj.m = p6;
       float f = 0;
       float f1 = (p8 == null)? 0: p8.floatValue();
       obj.o = f1;
       if (p7 != null) {
          f = p7.floatValue();
       }
       obj.n = f;
       obj.l = p9.booleanValue();
       return obj;
    }
    public static ImagePreviewModel b(String p0,String p1,String p2,String p3,Rect p4,Float p5,Float p6){
       if (PatchProxy.isSupport(ImagePreviewModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, null, ImagePreviewModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = 0x3f800000;
       float f1 = (p4.height())? ((float)p4.width() * f) / (float)p4.height(): 0x3f800000;
       float f2 = 0;
       f = (p5 == null)? 0: p5.floatValue();
       Float uFloat = Float.valueOf(f);
       if (p6 != null) {
          f2 = p6.floatValue();
       }
       return ImagePreviewModel.a(p0, p1, p2, p3, p4, p4, f1, uFloat, Float.valueOf(f2), Boolean.FALSE);
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ImagePreviewModel.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ImagePreviewModel.class, "3")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeString(this.d);
       p0.writeString(this.e);
       p0.writeString(this.f);
       p0.writeParcelable(this.g, p1);
       p0.writeParcelable(this.h, p1);
       p0.writeInt(this.i);
       p0.writeString(this.c);
       p0.writeInt(this.k);
       p0.writeFloat(this.m);
       p0.writeFloat(this.n);
       p0.writeFloat(this.o);
       p0.writeInt(this.l);
       return;
    }
}
