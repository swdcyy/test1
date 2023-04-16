package com.yxcorp.gifshow.v3.previewer.AssetSubAssetAssociation;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.previewer.AssetSubAssetAssociation$a;
import android.os.Parcel;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.List;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public class AssetSubAssetAssociation implements Serializable, Parcelable	// class@00157a
{
    public List mStickerIndexList;
    public List mTextIndexList;
    public static final Parcelable$Creator CREATOR;

    static {
       AssetSubAssetAssociation.CREATOR = new AssetSubAssetAssociation$a();
    }
    public void AssetSubAssetAssociation(Parcel p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mStickerIndexList = uArrayList;
       p0.readList(uArrayList, Integer.class.getClassLoader());
       uArrayList = new ArrayList();
       this.mTextIndexList = uArrayList;
       p0.readList(uArrayList, Integer.class.getClassLoader());
    }
    public void AssetSubAssetAssociation(List p0,List p1){
       super();
       this.mStickerIndexList = p0;
       this.mTextIndexList = p1;
    }
    public int describeContents(){
       return 0;
    }
    public List getStickerIndexList(){
       return this.mStickerIndexList;
    }
    public List getTextIndexList(){
       return this.mTextIndexList;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AssetSubAssetAssociation.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AssetSubAssetAssociation.class, "1")) {
          return;
       }
       p0.writeList(this.mStickerIndexList);
       p0.writeList(this.mTextIndexList);
       return;
    }
}
