package f4b.h;
import erd.o;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiPageResponse;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import f4b.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f4b.b;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import x3b.b;
import java.util.Collection;
import ekd.q;
import x3b.e;
import o4b.a0;
import s5b.b;
import java.lang.StringBuilder;
import ekd.k1;
import q87.c;

public final class h implements o	// class@00289b
{
    public final MagicBusinessId b;
    public final long c;

    public void h(MagicBusinessId p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       MagicEmoji magicEmoji;
       MagicEmoji magicEmoji1;
       h oh = this;
       h b = oh.b;
       h c = oh.c;
       MagicEmojiPageResponse magicEmojiPa = p0;
       MagicEmojiResponse magicEmojiRe = new MagicEmojiResponse();
       magicEmojiRe.mDefaultTabId = magicEmojiPa.mDefaultTabId;
       magicEmojiRe.mBriefEmojis = magicEmojiPa.mMagicEmojis;
       magicEmojiRe.mMagicEmojis = new ArrayList();
       Iterator iterator = magicEmojiRe.mBriefEmojis.iterator();
       while (iterator.hasNext()) {
          magicEmoji = iterator.next();
          magicEmoji.mMagicFaces = new ArrayList();
          if (TextUtils.n(magicEmoji.mId, magicEmojiPa.mDefaultTabId)) {
             magicEmoji.mPCursor = magicEmojiPa.mPCursor;
             magicEmoji.mNextPageIds = magicEmojiPa.mNextPageIds;
             Iterator iterator1 = magicEmojiPa.mMagicFaceIds.iterator();
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace magicFace = magicEmojiPa.getMagicFace(iterator1.next());
                if (magicFace != null) {
                   magicEmoji.mMagicFaces.add(magicFace.clone());
                }
             }
             magicEmoji.mLoadIndex = magicEmojiPa.mMagicFaceIds.size();
             if (TextUtils.x(magicEmojiPa.mPCursor)) {
                magicEmoji.mNoMore = true;
             }
          }
          magicEmojiRe.mMagicEmojis.add(magicEmoji.clone());
       }
       magicEmojiRe.mOperationMagicFaces = magicEmojiPa.mOperationMagicFaces;
       Iterator obj = null;
       if (!PatchProxy.applyVoidTwoRefs(b, magicEmojiPa, obj, k.class, "7")) {
          b.e(magicEmojiPa.mMagicFaces);
          MagicEmojiPageResponse mMagicEmojis = magicEmojiPa.mMagicEmojis;
          if (!PatchProxy.applyVoidTwoRefs(b, mMagicEmojis, obj, b.class, "6")) {
             MagicDBProvider.b().a().f(b.mId);
             obj = mMagicEmojis.iterator();
             while (true) {
                if (obj.hasNext()) {
                   magicEmoji1 = obj.next();
                   if (magicEmoji1.mTabType == 3) {
                      magicEmoji = magicEmoji1.mId;
                   }
                }else {
                   String str = "";
                }
                MagicDBProvider.b().a().j(b.mId, magicEmoji);
                if (!q.f(mMagicEmojis)) {
                   ArrayList uArrayList = new ArrayList();
                   iterator = mMagicEmojis.iterator();
                   while (iterator.hasNext()) {
                      magicEmoji1 = iterator.next();
                      e uoe = v15;
                      e uoe1 = v15;
                      uoe = new e(b.mId, magicEmoji1.mId, magicEmoji1.mName, magicEmoji1.mTabType, uArrayList.size());
                      uArrayList.add(uoe1);
                   }
                   MagicDBProvider.b().a().c(uArrayList);
                }
             }
          }
          b.f(b, magicEmojiPa.mDefaultTabId, 0, magicEmojiPa.mMagicFaceIds);
       }
       a0.f().e(magicEmojiPa.mCollectionIds);
       Object[] objArray = new Object[0];
       b.D().A("refresh_magic", "get page response cost:"+k1.t(c), objArray);
       return magicEmojiRe;
    }
}
