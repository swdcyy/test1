package com.kuaishou.webkit.extension.KwDexPath$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.webkit.extension.KwDexPath;
import java.lang.String;

public class KwDexPath$1 implements Parcelable$Creator	// class@0012e9
{

    public void KwDexPath$1(){
       super();
    }
    public KwDexPath createFromParcel(Parcel p0){
       KwDexPath kwDexPath = new KwDexPath();
       kwDexPath.packageName = p0.readString();
       kwDexPath.dexPath = p0.readString();
       kwDexPath.optPath = p0.readString();
       kwDexPath.libPath = p0.readString();
       kwDexPath.dataDirectorySuffix = p0.readString();
       return kwDexPath;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public KwDexPath[] newArray(int p0){
       KwDexPath[] kwDexPathArr = new KwDexPath[p0];
       return kwDexPathArr;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
