package com.yxcorp.gifshow.model.WishMagicInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;

public class WishMagicInfo implements Serializable, Cloneable	// class@001ea8
{
    public String mChildMagicFaceId;
    public String mMagicFaceId;
    public String mModifiedTips;
    public String mTextColor;
    public String mTips;
    public String mTipsBg;
    public List mWishMagicDetailInfos;
    public static final long serialVersionUID = 0x2177e1f56ba5673d;

    public void WishMagicInfo(){
       super();
       this.mWishMagicDetailInfos = new ArrayList();
    }
    public WishMagicInfo clone(){
       WishMagicInfo obj = PatchProxy.apply(null, this, WishMagicInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.mWishMagicDetailInfos.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().clone());
          }
          obj.mWishMagicDetailInfos = uArrayList;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
