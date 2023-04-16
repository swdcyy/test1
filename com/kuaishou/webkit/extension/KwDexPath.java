package com.kuaishou.webkit.extension.KwDexPath;
import android.os.Parcelable;
import com.kuaishou.webkit.extension.KwDexPath$1;
import java.lang.Object;
import java.lang.String;
import android.app.Application;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Parcel;

public class KwDexPath implements Parcelable	// class@0012ea
{
    public String dataDirectorySuffix;
    public String dexPath;
    public String libPath;
    public String optPath;
    public String packageName;
    public static final Parcelable$Creator CREATOR;

    static {
       KwDexPath.CREATOR = new KwDexPath$1();
    }
    public void KwDexPath(){
       super();
    }
    public int describeContents(){
       return 0;
    }
    public String getDataDirectorySuffix(){
       return this.dataDirectorySuffix;
    }
    public String getDexPath(){
       return this.dexPath;
    }
    public String getLibPath(){
       return this.libPath;
    }
    public String getOptPath(){
       return this.optPath;
    }
    public String getPackageName(){
       return this.packageName;
    }
    public boolean isUsedBuildin(Application p0){
       return TextUtils.equals(p0.getPackageName(), this.getPackageName());
    }
    public void setDataDirectorySuffix(String p0){
       this.dataDirectorySuffix = p0;
    }
    public void setDexPath(String p0){
       this.dexPath = p0;
    }
    public void setLibPath(String p0){
       this.libPath = p0;
    }
    public void setOptPath(String p0){
       this.optPath = p0;
    }
    public void setPackageName(String p0){
       this.packageName = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.packageName);
       p0.writeString(this.dexPath);
       p0.writeString(this.optPath);
       p0.writeString(this.libPath);
       p0.writeString(this.dataDirectorySuffix);
    }
}
