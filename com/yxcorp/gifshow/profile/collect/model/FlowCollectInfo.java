package com.yxcorp.gifshow.profile.collect.model.FlowCollectInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FlowCollectInfo implements Serializable	// class@0012c2
{
    public List mCollects;
    public int mCount;
    public List mMagicFaceList;
    public List mMusicList;
    public List mPoiList;
    public JsonArray mQPhotoList;
    public JsonArray mSerialFeeds;
    public String mTabType;
    public List mTagList;
    public boolean mWithMostNum;
    public static final long serialVersionUID = 0x44e5949487d03d13;

    public void FlowCollectInfo(){
       super();
       this.mCollects = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FlowCollectInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CollectTabInfo{mTabType=\'"+this.mTabType+'''+'}';
    }
}
