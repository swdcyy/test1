package d4b.k;
import erd.o;
import d4b.h;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiPageResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicEmoji;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import f4b.b;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import o4b.a0;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;

public final class k implements o	// class@002434
{
    public final h b;
    public final Ref$ObjectRef c;

    public void k(h p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       h a;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "pageResponse");
          if (TextUtils.x(p0.mPCursor)) {
             this.b.c.mNoMore = true;
          }
          h c = this.b.c;
          c.mPCursor = p0.mPCursor;
          c.mNextPageIds = p0.mNextPageIds;
          b uob = b.D();
          StringBuilder str = "get nextList : ";
          MagicEmoji mNextPageIds = this.b.c.mNextPageIds;
          Integer integer = (mNextPageIds != null)? Integer.valueOf(mNextPageIds.size()): null;
          Object[] objArray = new Object[0];
          uob.w("MagicRepository", str+integer+" pCursor: "+this.b.c.mPCursor, objArray);
          k tb = this.b;
          a = tb.a;
          MagicEmoji mLoadIndex = tb.c.mLoadIndex;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(a, p0, Integer.valueOf(mLoadIndex), tb, h.class, "4")) {
             b.e(p0.mMagicFaces);
             c = tb.c;
             if (c.mTabType == 3 && mLoadIndex == null) {
                b.a(a, c.mId);
             }
             b.f(a, tb.c.mId, mLoadIndex, p0.mMagicFaceIds);
          }
          a0.f().e(p0.mCollectionIds);
          c = this.b.c;
          c.mLoadIndex = c.mLoadIndex + p0.mMagicFaceIds.size();
          uArrayList = new ArrayList();
          Iterator iterator = p0.mMagicFaceIds.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             MagicEmoji$MagicFace magicFace = p0.getMagicFace(str1);
             if (magicFace == null) {
                magicFace = this.c.element.get(str1);
             }
             if (magicFace != null) {
                uArrayList.add(magicFace);
             }else {
                Object[] objArray1 = new Object[0];
                b.D().w("MagicRepository", "pageLoad getMagicFace error "+str1, objArray1);
             }
          }
       }
       return uArrayList;
    }
}
