package f4b.k;
import java.util.Set;
import com.google.common.collect.o;
import java.util.WeakHashMap;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import brd.v;
import brd.g;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import f4b.c;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import e4b.a;
import e4b.c;
import f4b.j;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import f4b.i;
import erd.o;
import f4b.f;
import f4b.g;
import f4b.e;
import erd.g;
import f4b.k$a;
import f4b.d;
import erd.a;
import f4b.b;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiBriefResponse;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import x3b.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import x3b.e;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import d4b.n;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.HashMap;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Long;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiUserInfo;
import e4b.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.c;
import o56.a;
import e17.i;

public final class k	// class@00289f
{
    public static Set a;
    public static Map b;

    static {
       k.a = o.g();
       k.b = new WeakHashMap();
    }
    public void k(){
       super();
    }
    public static void a(MagicBusinessId p0,MagicEmojiResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k.class, "4")) {
          return;
       }
       v ov = k.b.remove(p0);
       if (ov != null && !ov.isDisposed()) {
          ov.onNext(p1);
          ov.onComplete();
       }
       return;
    }
    public static t b(MagicBusinessId p0,MagicEmojiPageConfig p1){
       String str;
       SimpleMagicFace simpleMagicF = null;
       MagicEmojiPageConfig obj = PatchProxy.applyTwoRefs(p0, p1, simpleMagicF, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          obj = p1.mTopMagicFace;
          SimpleMagicFace mId = (obj != null)? obj.mId: p1.mTopMagicFaceId;
          simpleMagicF = mId;
       }
       p1 = (p1 != null)? p1.mTaskId: "";
       if (simpleMagicF == null) {
          simpleMagicF = "";
       }
       return k.c(p0, p1, simpleMagicF);
    }
    public static t c(MagicBusinessId p0,String p1,String p2){
       Object[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.a.contains(p0)) {
          obj = new Object[0];
          b.D().A("refresh_magic", p0.name()+" requsting, watting...", obj);
          return t.create(new c(p0)).timeout(15, TimeUnit.SECONDS);
       }else {
          k.a.add(p0);
          long l = System.currentTimeMillis();
          return t.fromCallable(j.b).subscribeOn(d.c).flatMap(new i(p0, p1, p2, c.a())).map(new f(l, p0)).onErrorResumeNext(new g(p0)).doOnNext(new e(l, p0)).doOnError(new k$a(l)).doFinally(new d(p0));
       }
    }
    public static MagicEmojiResponse d(MagicBusinessId p0){
       Iterator iterator;
       MagicEmoji magicEmoji1;
       MagicEmoji magicEmoji2;
       MagicEmoji mTabType;
       int a;
       MagicEmoji mMagicFaces;
       int i2;
       Iterator iterator4;
       MagicEmojiResponse obj = p0;
       k ok = k.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj1 = null;
       b obj2 = PatchProxy.applyOneRefs(obj, obj1, ok, "8");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       Object[] objArray = new Object[0];
       b.D().A("refresh_magic", "toGenerateMagicResponse", objArray);
       obj2 = b.class;
       MagicEmojiBriefResponse magicEmojiBr = PatchProxy.applyOneRefs(obj, obj1, obj2, "4");
       MagicEmoji magicEmoji = 1;
       if (magicEmojiBr != patchProxyRe) {
       }else {
          magicEmojiBr = new MagicEmojiBriefResponse();
          ArrayList uArrayList2 = PatchProxy.applyOneRefs(obj, obj1, obj2, "5");
          if (uArrayList2 != patchProxyRe) {
          }else {
             uArrayList2 = new ArrayList();
             List list = MagicDBProvider.b().a().l(obj.mId);
             if (!q.f(list)) {
                iterator4 = list.iterator();
                while (iterator4.hasNext()) {
                   e uoe = iterator4.next();
                   mTabType = new MagicEmoji();
                   mTabType.mId = uoe.b();
                   mTabType.mName = uoe.c();
                   mTabType.mTabType = uoe.a();
                   uArrayList2.add(mTabType);
                }
             }
          }
          if (!q.f(uArrayList2)) {
             iterator4 = uArrayList2.iterator();
             while (iterator4.hasNext()) {
                magicEmoji2 = iterator4.next();
                magicEmoji2.mMagicFaces = new ArrayList();
                magicEmoji2.mUseLocalPageLoad = magicEmoji;
                Iterator iterator5 = b.d(obj, magicEmoji2.mId, 0, 9999).iterator();
                while (iterator5.hasNext()) {
                   magicEmoji2.mMagicFaces.add(new MagicEmoji$MagicFace(iterator5.next()));
                }
             }
             magicEmojiBr.mMagicEmojis = uArrayList2;
          }
       }
       if (magicEmojiBr == null || q.f(magicEmojiBr.mMagicEmojis)) {
          return obj1;
       }else {
          obj = new MagicEmojiResponse();
          obj.mBriefEmojis = magicEmojiBr.mMagicEmojis;
          n on = n.class;
          ArrayList uArrayList = PatchProxy.applyOneRefs(obj, obj1, on, "1");
          if (uArrayList != patchProxyRe) {
          }else {
             a.p(obj, "response");
             MagicEmojiResponse mBriefEmojis = obj.mBriefEmojis;
             a.o(mBriefEmojis, "response.mBriefEmojis");
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator3 = mBriefEmojis.iterator();
             while (iterator3.hasNext()) {
                magicEmoji2 = iterator3.next();
                n c = n.c;
                Objects.requireNonNull(c);
                mTabType = magicEmoji2.mTabType;
                Integer integer = (mTabType != 3 && (mTabType != 4 && mTabType != 6))? 1: null;
                if (integer) {
                   a = (mTabType == null)? n.a: n.b;
                   int i1 = a;
                   if (PatchProxy.isSupport(on)) {
                      mTabType = PatchProxy.applyThreeRefs(magicEmoji2, Integer.valueOf(0), Integer.valueOf(i1), c, n.class, "2");
                      if (mTabType != patchProxyRe) {
                      label_0172 :
                         mTabType.mUseLocalPageLoad = magicEmoji2.mUseLocalPageLoad;
                         mMagicFaces = mTabType.mMagicFaces;
                         i2 = (mMagicFaces != null)? mMagicFaces.size(): 0;
                         magicEmoji2.mLoadIndex = i2;
                         uArrayList1.add(mTabType);
                      }
                   }
                   mTabType = new MagicEmoji();
                   mTabType.mId = magicEmoji2.mId;
                   mTabType.mName = magicEmoji2.mName;
                   mTabType.mTabType = magicEmoji2.mTabType;
                   i2 = 0 * i1;
                   int i3 = i1 + i2;
                   if (i3 > magicEmoji2.mMagicFaces.size()) {
                      i3 = magicEmoji2.mMagicFaces.size();
                   }
                   mTabType.mMagicFaces = magicEmoji2.mMagicFaces.subList(i2, i3);
                   goto label_0172 ;
                }else {
                   mTabType = magicEmoji2.mMagicFaces;
                   a = (mTabType != null)? mTabType.size(): 0;
                   magicEmoji2.mLoadIndex = a;
                   uArrayList1.add(magicEmoji2);
                }
                b uob = b.D();
                StringBuilder str = "getFirstPage: ";
                mMagicFaces = CollectionsKt___CollectionsKt.Y2(uArrayList1);
                mMagicFaces = (mMagicFaces != null)? mMagicFaces.mName: obj1;
                str = str+mMagicFaces+"  size: ";
                mMagicFaces = CollectionsKt___CollectionsKt.Y2(uArrayList1);
                if (mMagicFaces != null) {
                   mMagicFaces = mMagicFaces.mMagicFaces;
                   if (mMagicFaces != null) {
                      integer = Integer.valueOf(mMagicFaces.size());
                   label_01cd :
                      Object[] objArray2 = new Object[0];
                      uob.E("MagicRepositoryConfig", "[magicface][keypath][remote] ", str+integer, objArray2);
                   }
                }
                integer = obj1;
                goto label_01cd ;
             }
             uArrayList = uArrayList1;
          }
          obj.mMagicEmojis = uArrayList;
          HashMap hashMap = PatchProxy.applyOneRefs(uArrayList, obj1, ok, "10");
          if (hashMap != patchProxyRe) {
          }else {
             hashMap = new HashMap();
             if (uArrayList != null) {
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   magicEmoji1 = iterator.next();
                   if (!q.f(magicEmoji1.mMagicFaces)) {
                      Iterator iterator2 = magicEmoji1.mMagicFaces.iterator();
                      while (iterator2.hasNext()) {
                         MagicEmoji$MagicFace magicFace1 = iterator2.next();
                         hashMap.put(magicFace1.mId, Long.valueOf(magicFace1.mChecksum));
                      }
                   }
                }
             }
          }
          Map map = b.c(hashMap);
          if (q.h(map)) {
             return obj1;
          }else {
             obj.mIsFromNetwork = false;
             if (b.c() != null) {
                obj.mUserInfo = b.c();
             }
             if (!PatchProxy.applyVoidThreeRefs(obj, map, null, null, k.class, "9")) {
                if (map == null) {
                   map = new HashMap();
                }
                Object[] objArray1 = new Object[0];
                b.D().A("refresh_magic", "cache count is "+map.size(), objArray1);
                if (map.size()) {
                   iterator = obj.mMagicEmojis.iterator();
                   int i = 0;
                   while (iterator.hasNext()) {
                      magicEmoji1 = iterator.next();
                      if (magicEmoji1.mMagicFaces == null) {
                      }else {
                         uArrayList = new ArrayList(magicEmoji1.mMagicFaces.size());
                         Iterator iterator1 = magicEmoji1.mMagicFaces.iterator();
                         while (iterator1.hasNext()) {
                            MagicEmoji$MagicFace magicFace = map.get(iterator1.next().mId);
                            if (magicFace == null) {
                               i = i + 1;
                            }else if(TextUtils.x(magicFace.mResource)){
                               if (a.a().c()) {
                                  i.e(R.style.arg_RES_7f11066a, magicFace.mName+" resource×Ö¶Î²»ÄÜÎª¿Õ", 5000);
                                  continue ;
                               }else {
                                  continue ;
                               }
                            }else {
                               uArrayList.add(magicFace.clone());
                               continue ;
                            }
                         }
                         magicEmoji1.mMagicFaces = uArrayList;
                      }
                   }
                   obj1 = new Object[0];
                   b.D().w("refresh_magic", "can\'t find count:"+i, obj1);
                }
             }
             return obj;
          }
       }
    }
}
