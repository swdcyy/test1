package com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.google.gson.Gson;
import s26.d;

public class AtlasInfo implements Serializable, Cloneable	// class@001397
{
    public String mCoverFilePath;
    public List mDonePictures;
    public int mMixedType;
    public String mMusicFilePath;
    public float mMusicVolume;
    public List mPictureFiles;

    public void AtlasInfo(){
       super();
    }
    public AtlasInfo clone(){
       AtlasInfo obj = PatchProxy.apply(null, this, AtlasInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AtlasInfo();
       obj.mMusicFilePath = this.mMusicFilePath;
       obj.mPictureFiles = new ArrayList(this.mPictureFiles);
       obj.mMixedType = this.mMixedType;
       obj.mCoverFilePath = this.mCoverFilePath;
       obj.mMusicVolume = this.mMusicVolume;
       obj.mDonePictures = new ArrayList(this.mDonePictures);
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public String getCoverFilePath(){
       Object obj = PatchProxy.apply(null, this, AtlasInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       p3.D().w("AtlasInfo", "getCoverFilePath mCoverFilePath:"+this.mCoverFilePath, objArray);
       return this.mCoverFilePath;
    }
    public void setCoverFilePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasInfo.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("AtlasInfo", "setCoverFilePath coverFilePath:"+p0, objArray);
       this.mCoverFilePath = p0;
       return;
    }
    public String toJson(){
       Object obj = PatchProxy.apply(null, this, AtlasInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().q(this);
    }
}
