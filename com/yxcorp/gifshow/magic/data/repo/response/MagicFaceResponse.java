package com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
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
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;

public class MagicFaceResponse implements Serializable, Cloneable	// class@001b97
{
    public List mMagicFaces;
    public int mSelectedIndex;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void MagicFaceResponse(){
       super();
       this.mSelectedIndex = -1;
       this.mMagicFaces = new ArrayList();
    }
    public MagicFaceResponse clone(){
       ArrayList uArrayList;
       MagicFaceResponse obj = PatchProxy.apply(null, this, MagicFaceResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          uArrayList = new ArrayList();
          MagicFaceResponse tmMagicFaces = this.mMagicFaces;
          if (tmMagicFaces != null) {
             Iterator iterator = tmMagicFaces.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().clone());
             }
          }
          obj.mMagicFaces = uArrayList;
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return uArrayList;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public MagicEmoji$MagicFace getMagicFace(String p0){
       MagicEmoji$MagicFace magicFace;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MagicFaceResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMagicFaces.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          magicFace = obj.next();
          if (TextUtils.equals(magicFace.mId, p0)) {
             break ;
          }
       }
       return magicFace;
    }
}
