package com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.MultiImageObject$1;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.util.List;

public class MultiImageObject extends MediaObject	// class@000ba0
{
    public ArrayList imageList;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       MultiImageObject.CREATOR = new MultiImageObject$1();
    }
    public void MultiImageObject(){
       super();
    }
    public void MultiImageObject(Parcel p0){
       super(p0);
       this.imageList = p0.createTypedArrayList(Uri.CREATOR);
    }
    public int describeContents(){
       return 0;
    }
    public ArrayList getImageList(){
       return this.imageList;
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeTypedList(this.imageList);
    }
}
