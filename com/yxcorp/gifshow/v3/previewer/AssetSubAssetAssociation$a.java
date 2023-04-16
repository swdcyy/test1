package com.yxcorp.gifshow.v3.previewer.AssetSubAssetAssociation$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.AssetSubAssetAssociation;

public class AssetSubAssetAssociation$a implements Parcelable$Creator	// class@001579
{

    public void AssetSubAssetAssociation$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       AssetSubAssetAssociation uAssetSubAss = PatchProxy.applyOneRefs(p0, this, AssetSubAssetAssociation$a.class, "1");
       if (uAssetSubAss != PatchProxyResult.class) {
       }else {
          uAssetSubAss = new AssetSubAssetAssociation(p0);
       }
       return uAssetSubAss;
    }
    public Object[] newArray(int p0){
       AssetSubAssetAssociation[] uAssetSubAss = new AssetSubAssetAssociation[p0];
       return uAssetSubAss;
    }
}
