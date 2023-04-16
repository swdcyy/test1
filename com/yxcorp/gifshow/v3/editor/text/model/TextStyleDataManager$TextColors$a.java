package com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;

public class TextStyleDataManager$TextColors$a implements Parcelable$Creator	// class@00146d
{

    public void TextStyleDataManager$TextColors$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       TextStyleDataManager$TextColors textColors = PatchProxy.applyOneRefs(p0, this, TextStyleDataManager$TextColors$a.class, "1");
       if (textColors != PatchProxyResult.class) {
       }else {
          textColors = new TextStyleDataManager$TextColors(p0);
       }
       return textColors;
    }
    public Object[] newArray(int p0){
       TextStyleDataManager$TextColors[] textColorsAr = new TextStyleDataManager$TextColors[p0];
       return textColorsAr;
    }
}
