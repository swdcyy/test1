package com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class TextStyleDataManager$TextColors implements Parcelable	// class@00146e
{
    public String b;
    public int c;
    public static final Parcelable$Creator CREATOR;

    static {
       TextStyleDataManager$TextColors.CREATOR = new TextStyleDataManager$TextColors$a();
    }
    public void TextStyleDataManager$TextColors(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = p0.readInt();
    }
    public void TextStyleDataManager$TextColors(String p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleDataManager$TextColors.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TextStyleDataManager$TextColors) {
          return false;
       }
       return (this.b).equals(p0.b);
    }
    public int hashCode(){
       return this.c;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextStyleDataManager$TextColors.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextStyleDataManager$TextColors.class, "2")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeInt(this.c);
       return;
    }
}
