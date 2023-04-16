package com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiBriefResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public class MagicEmojiBriefResponse implements Serializable, Cloneable	// class@00120b
{
    public List mMagicEmojis;
    public boolean mNeedSave;
    public MagicEmojiUserInfo mUserInfo;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void MagicEmojiBriefResponse(){
       super();
       this.mNeedSave = true;
    }
    public MagicEmojiBriefResponse clone(){
       ArrayList uArrayList;
       MagicEmojiBriefResponse obj = PatchProxy.apply(null, this, MagicEmojiBriefResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          uArrayList = new ArrayList();
          MagicEmojiBriefResponse tmMagicEmoji = this.mMagicEmojis;
          if (tmMagicEmoji != null) {
             Iterator iterator = tmMagicEmoji.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().clone());
             }
          }
          obj.mMagicEmojis = uArrayList;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return uArrayList;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public List getAllIds(){
       ArrayList obj = PatchProxy.apply(null, this, MagicEmojiBriefResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       MagicEmojiBriefResponse tmMagicEmoji = this.mMagicEmojis;
       if (tmMagicEmoji == null) {
          return obj;
       }
       Iterator iterator = tmMagicEmoji.iterator();
       while (iterator.hasNext()) {
          MagicEmoji mMagicFaces = iterator.next().mMagicFaces;
          if (mMagicFaces == null) {
             continue ;
          }else {
             Iterator iterator1 = mMagicFaces.iterator();
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator1.next();
                if (magicFace != null && !obj.contains(magicFace.mId)) {
                   obj.add(magicFace.mId);
                }else {
                   continue ;
                }
             }
          }
       }
       return obj;
    }
}
