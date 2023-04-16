package b4b.i;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s5b.b;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import b4b.b;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.StringBuilder;
import b4b.d;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ekd.q$b;
import java.util.HashSet;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import b4b.g;
import java.util.Set;
import b4b.e;
import b4b.c;
import com.yxcorp.gifshow.magic.data.repo.response.OperationMagicFace;
import b4b.f;
import java.util.Collections;
import w3b.l;

public final class i	// class@000363
{

    public void i(){
       super();
    }
    public static List a(MagicEmojiResponse p0,MagicEmojiPageConfig p1){
       Object[] objArray2;
       HashSet hashSet;
       i oi = i.class;
       Object[] obj = null;
       ArrayList obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, oi, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceFilterDataHelper", "filterResponse", objArray);
       if (p0 == null || q.f(p0.mMagicEmojis)) {
          return Collections.emptyList();
       }
       obj1 = new ArrayList(p0.mMagicEmojis);
       if (p1 == null) {
          return obj1;
       }
       MagicEmojiPageConfig mTopMagicFac = p1.mTopMagicFaces;
       MagicEmojiPageConfig mTopMagicFac1 = p1.mTopMagicFace;
       MagicEmojiResponse mOperationMa = p0.mOperationMagicFaces;
       if (mTopMagicFac1 == null && q.f(mTopMagicFac)) {
          Object[] objArray1 = new Object[0];
          b.D().w("MagicFaceFilterDataHelper", "has no insert magicfaces.", objArray1);
          return obj1;
       }else if(mTopMagicFac1 != null){
          mTopMagicFac1.mGroupId = p0.mDefaultTabId;
       }
       MagicEmoji magicEmoji = y.y(obj1, new b(p0, p1)).orNull();
       String str = " , topMagicFace:";
       if (!PatchProxy.applyVoidThreeRefs(magicEmoji, mTopMagicFac1, mTopMagicFac, null, i.class, "9")) {
          Object[] objArray3 = new Object[0];
          b.D().w("MagicFaceFilterDataHelper", "insertTopMagicFacesIfNeed, magicEmoji:"+magicEmoji+str+mTopMagicFac1+" , topMagicFaceList:"+mTopMagicFac, objArray3);
          if (magicEmoji != null && !q.f(mTopMagicFac)) {
             if (mTopMagicFac1 != null) {
                q.c(mTopMagicFac, new d(mTopMagicFac1));
                mTopMagicFac.add(0, mTopMagicFac1);
             }
             hashSet = new HashSet();
             Iterator iterator2 = mTopMagicFac.iterator();
             while (iterator2.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator2.next();
                hashSet.add(magicFace.mId);
                magicFace.mGroupId = magicEmoji.mId;
             }
             q.c(magicEmoji.mMagicFaces, new g(hashSet));
             objArray3 = new Object[0];
             b.D().w("MagicFaceFilterDataHelper", "insertTopMagicFaces: "+mTopMagicFac, objArray3);
             magicEmoji.mMagicFaces.addAll(0, mTopMagicFac);
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(magicEmoji, mTopMagicFac1, obj, oi, "8")) {
          objArray = new Object[0];
          b.D().w("MagicFaceFilterDataHelper", "insertTopMagicFaceIfNeed, magicEmoji:"+magicEmoji+str+mTopMagicFac1, objArray);
          if (mTopMagicFac1 != null && magicEmoji != null) {
             if (!MagicEmoji$MagicFace.isChildMagicFace(mTopMagicFac1)) {
                mTopMagicFac1.mGroupId = magicEmoji.mId;
                if (magicEmoji.mMagicFaces.size() > 0) {
                   obj = magicEmoji.mMagicFaces.get(0);
                }
                if (mTopMagicFac1 != obj) {
                   q.c(magicEmoji.mMagicFaces, new e(mTopMagicFac1));
                   magicEmoji.mMagicFaces.add(0, mTopMagicFac1);
                }else {
                   objArray2 = new Object[0];
                   b.D().w("MagicFaceFilterDataHelper", "insertTopMagicFaceIfNeed, first and top magic is one.", objArray2);
                }
             }else {
                MagicEmoji$MagicFace parentMagicF = MagicEmoji$MagicFace.getParentMagicFace(mTopMagicFac1);
                MagicEmojiPageConfig magicEmojiPa = (parentMagicF == null)? mTopMagicFac1: parentMagicF;
                if (!magicEmoji.mMagicFaces.size() || !magicEmojiPa.equals(magicEmoji.mMagicFaces.get(0))) {
                   magicEmojiPa.mGroupId = magicEmoji.mId;
                   q.c(magicEmoji.mMagicFaces, new c(magicEmojiPa));
                   magicEmoji.mMagicFaces.add(0, magicEmojiPa);
                }
                if (parentMagicF != null) {
                   mTopMagicFac1.mGroupId = magicEmoji.mId;
                   magicEmoji.mMagicFaces.add(0, mTopMagicFac1);
                }
             }
          }
       }
       if (!PatchProxy.applyVoidThreeRefs(magicEmoji, mTopMagicFac1, mOperationMa, null, i.class, "7")) {
          obj = new Object[0];
          b.D().w("MagicFaceFilterDataHelper", "insertOperationMagicFacesIfNeed, magicEmoji:"+magicEmoji+" , operationMagicFaces:"+mOperationMa, obj);
          if (magicEmoji != null && !q.f(mOperationMa)) {
             hashSet = new HashSet();
             Iterator iterator = mOperationMa.iterator();
             while (iterator.hasNext()) {
                OperationMagicFace operationMag = iterator.next();
                if (operationMag == null || operationMag.mIndex < null) {
                   continue ;
                }
                operationMag.mGroupId = magicEmoji.mId;
                hashSet.add(operationMag.mId);
             }
             q.c(magicEmoji.mMagicFaces, new f(hashSet));
             Iterator iterator1 = mOperationMa.iterator();
             while (iterator1.hasNext()) {
                OperationMagicFace operationMag1 = iterator1.next();
                if (operationMag1.equals(mTopMagicFac1)) {
                   magicEmoji.mMagicFaces.add(operationMag1.mIndex, mTopMagicFac1);
                }else {
                   magicEmoji.mMagicFaces.add(operationMag1.mIndex, operationMag1);
                }
             }
          }
       }
       objArray2 = new Object[0];
       b.D().s("MagicFaceFilterDataHelper", "insert magicfaces end, result:"+magicEmoji.mMagicFaces, objArray2);
       return obj1;
    }
    public static List b(List p0,MagicEmojiPageConfig p1){
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, oi, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (q.f(p0)) {
          return p0;
       }
       p0 = l.m(p0);
       if (i.c(p1)) {
          obj = PatchProxy.applyOneRefs(p0, null, oi, "1");
          if (obj != patchProxyRe) {
          }else if(q.f(p0)){
             obj = new ArrayList();
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace2 = iterator.next();
                if (magicFace2.mResourceType != 3) {
                   obj.add(magicFace2);
                }
             }
          }
          p0 = obj;
       }
       obj = 1;
       String str = (p1 != null && p1.mFilterUnswitchableEmoji != null)? 1: null;
       if (str) {
          ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, oi, "2");
          if (uArrayList != patchProxyRe) {
          }else if(q.f(p0)){
             uArrayList = new ArrayList();
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace1 = iterator.next();
                if (magicFace1.mSwitchable != null) {
                   uArrayList.add(magicFace1);
                }
             }
          }
          p0 = uArrayList;
       }
       if (p1 == null || p1.mIsSupportImmerseMagicFace != null) {
          obj = 0;
       }
       if (obj) {
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(p0, null, oi, "3");
          if (uArrayList1 != patchProxyRe) {
          }else if(q.f(p0)){
             uArrayList1 = new ArrayList();
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace = iterator.next();
                if (!MagicEmoji$MagicFace.isImmerseMagicFace(magicFace)) {
                   uArrayList1.add(magicFace);
                }
             }
          }
          p0 = uArrayList1;
       }
       return p0;
    }
    public static boolean c(MagicEmojiPageConfig p0){
       boolean b = (p0 != null && p0.mNoLoginMode != null)? true: false;
       return b;
    }
}
