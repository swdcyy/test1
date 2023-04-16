package com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiPageResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class MagicEmojiPageResponse implements Serializable, Cloneable	// class@001b90
{
    public List mCollectionIds;
    public String mDefaultTabId;
    public List mMagicEmojis;
    public List mMagicFaceIds;
    public List mMagicFaces;
    public List mNextPageIds;
    public List mOperationMagicFaces;
    public String mPCursor;
    public static final long serialVersionUID = 0x2130967ba390531e;

    public void MagicEmojiPageResponse(){
       super();
    }
    public MagicEmoji$MagicFace getMagicFace(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MagicEmojiPageResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mMagicFaces)) {
          obj = this.mMagicFaces.iterator();
          while (obj.hasNext()) {
             MagicEmoji$MagicFace magicFace = obj.next();
             if (TextUtils.n(magicFace.mId, p0)) {
                return magicFace;
             }
          }
       }
       return null;
    }
}
