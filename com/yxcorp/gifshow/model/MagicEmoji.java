package com.yxcorp.gifshow.model.MagicEmoji;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.StringBuilder;

public class MagicEmoji implements Serializable, Cloneable	// class@001e51
{
    public CDNUrl[] mGifIconUrls;
    public int mGifMaxShowCount;
    public long mGifShowEndTime;
    public long mGifShowStartTime;
    public CDNUrl[] mIconUrls;
    public String mId;
    public int mLoadIndex;
    public List mMagicFaces;
    public String mName;
    public List mNextPageIds;
    public boolean mNoMore;
    public String mPCursor;
    public int mTabType;
    public boolean mUseLocalPageLoad;
    public static final long serialVersionUID = 0x5d7e512d070d61a9;

    public void MagicEmoji(){
       super();
       this.mMagicFaces = new ArrayList();
       this.mUseLocalPageLoad = false;
       this.mLoadIndex = 0;
       this.mNoMore = false;
       this.mTabType = -1;
    }
    public MagicEmoji clone(){
       MagicEmoji obj = PatchProxy.apply(null, this, MagicEmoji.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (!q.f(this.mMagicFaces)) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = this.mMagicFaces.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().clone());
             }
             obj.mMagicFaces = uArrayList;
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return q.f(this.mMagicFaces);
       }
    }
    public Object clone(){
       return this.clone();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicEmoji.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicEmoji{mId=\'"+this.mId+'''+", mName=\'"+this.mName+'''+", mTabType="+this.mTabType+", hashCode=\'"+this.hashCode()+'''+'}';
    }
}
