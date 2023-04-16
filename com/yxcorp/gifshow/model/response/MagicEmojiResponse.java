package com.yxcorp.gifshow.model.response.MagicEmojiResponse;
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
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiBriefResponse;

public class MagicEmojiResponse implements Serializable, Cloneable	// class@001f48
{
    public List mBriefEmojis;
    public String mDefaultTabId;
    public boolean mIsFromNetwork;
    public List mMagicEmojis;
    public List mOperationMagicFaces;
    public MagicEmojiUserInfo mUserInfo;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void MagicEmojiResponse(){
       super();
       this.mIsFromNetwork = true;
    }
    public MagicEmojiResponse clone(){
       ArrayList uArrayList;
       Iterator iterator;
       MagicEmojiResponse obj = PatchProxy.apply(null, this, MagicEmojiResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          uArrayList = new ArrayList();
          MagicEmojiResponse tmBriefEmoji = this.mBriefEmojis;
          if (tmBriefEmoji != null) {
             iterator = tmBriefEmoji.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().clone());
             }
          }
          obj.mBriefEmojis = uArrayList;
          uArrayList = new ArrayList();
          tmBriefEmoji = this.mMagicEmojis;
          if (tmBriefEmoji != null) {
             iterator = tmBriefEmoji.iterator();
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
    public boolean containsMagicFace(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mMagicEmojis != null && !TextUtils.isEmpty(p0)) {
          obj = this.mMagicEmojis.iterator();
          while (obj.hasNext()) {
             MagicEmoji mMagicFaces = obj.next().mMagicFaces;
             if (mMagicFaces == null) {
             }else {
                Iterator iterator = mMagicFaces.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      MagicEmoji$MagicFace magicFace = iterator.next();
                      if (magicFace != null && p0.equals(magicFace.mId)) {
                         return true;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return false;
    }
    public MagicEmoji getBriefEmoji(String p0){
       MagicEmojiResponse obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBriefEmojis;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             MagicEmoji magicEmoji = iterator.next();
             if (TextUtils.equals(p0, magicEmoji.mId)) {
                return magicEmoji;
             }
          }
       }
       return null;
    }
    public MagicEmojiBriefResponse toBriefResponse(){
       MagicEmojiBriefResponse obj = PatchProxy.apply(null, this, MagicEmojiResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MagicEmojiBriefResponse();
       ArrayList uArrayList = new ArrayList();
       MagicEmojiResponse tmBriefEmoji = this.mBriefEmojis;
       if (tmBriefEmoji != null) {
          Iterator iterator = tmBriefEmoji.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().clone());
          }
       }
       obj.mMagicEmojis = uArrayList;
       obj.mUserInfo = this.mUserInfo;
       return obj;
    }
}
