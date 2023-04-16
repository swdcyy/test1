package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$3$a;
import msd.l;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import com.kwai.sdk.eve.proto.ClickEvent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import a0c.g;
import q87.c;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$a;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.List;
import java.util.Collection;
import ml5.a;
import lnc.a1;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.proto.CustomEvent;
import org.json.JSONObject;
import java.lang.Throwable;

public final class PostEntranceEveManager$activate$3$a implements l	// class@00104a
{

    public void PostEntranceEveManager$activate$3$a(){
       super();
    }
    public Object invoke(Object p0){
       String str1;
       QPhoto qPhoto;
       PostEntranceEveManager$a uoa1;
       Object[] objArray1;
       SimpleMagicFace magicFace;
       int this;
       PostShowInfo postShowInfo;
       Object[] obj1;
       Object obj2;
       Object obj3;
       String obj = p0;
       PostEntranceEveManager postEntrance = PostEntranceEveManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LinkedHashMap linkedHashMa = PatchProxy.applyOneRefs(obj, this, PostEntranceEveManager$activate$3$a.class, "1");
       if (linkedHashMa != patchProxyRe) {
       }else {
          a.p(obj, "event");
          linkedHashMa = new LinkedHashMap();
          String str = "";
          boolean i = 0;
          if (obj instanceof ClickEvent) {
             PostEntranceEveManager e = PostEntranceEveManager.e;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoidTwoRefs(obj, linkedHashMa, e, postEntrance, "3")) {
                String contentId = obj.getContentId();
                if (contentId == null) {
                   contentId = null;
                }
                QCurrentUser qCurrentUser = QCurrentUser.me();
                if (qCurrentUser != null) {
                   String id = qCurrentUser.getId();
                   if (id != null) {
                      str1 = id;
                   label_005e :
                      if (TextUtils.equals(obj.getAuthorId(), str1)) {
                         Object[] objArray = new Object[i];
                         g.C().w("PostEntranceEvePresenter", "authorId equals currentUid", objArray);
                      }else {
                         Objects.requireNonNull(LatestBrowsedFeedCache.h);
                         obj = (contentId == null || !contentId.length())? 1: null;
                         if (obj) {
                            qPhoto = null;
                         }else {
                            ReentrantReadWriteLock$ReadLock b = LatestBrowsedFeedCache.b;
                            b.lock();
                            qPhoto = LatestBrowsedFeedCache.d.get(contentId);
                            b.unlock();
                         }
                         if (qPhoto != null) {
                            PostEntranceEveManager$a uoa = PatchProxy.applyOneRefs(qPhoto, e, postEntrance, "4");
                            if (uoa != patchProxyRe) {
                            }else {
                               FlashPhotoTemplate flashPhotoTe = qPhoto.getFlashPhotoTemplate();
                               if (flashPhotoTe != null) {
                                  FlashPhotoTemplate mCoverImageU = flashPhotoTe.mCoverImageUrls;
                                  if (mCoverImageU != null) {
                                     i = (!mCoverImageU.length)? 1: 0;
                                     if (!i) {
                                        i = false;
                                     label_00be :
                                        this = 7;
                                        if (i) {
                                           if (PatchProxy.isSupport(postEntrance)) {
                                              postShowInfo = PatchProxy.applyTwoRefs(qPhoto, Integer.valueOf(this), e, postEntrance, "5");
                                              if (postShowInfo != patchProxyRe) {
                                              label_00fa :
                                                 obj1 = postShowInfo;
                                              label_00fd :
                                                 if (obj1 != null) {
                                                    obj2 = obj1;
                                                    obj1 = new Object[0];
                                                    g.C().w("PostEntranceEvePresenter", "KuaiShan Cover get cover url form postShowInfo success", obj1);
                                                 }else {
                                                    obj2 = obj1;
                                                 }
                                                 mCoverImageU = obj2;
                                              }
                                           }
                                           BaseFeed entity = qPhoto.getEntity();
                                           if (entity != null && entity.a(PhotoMeta.class) != null) {
                                              postShowInfo = w.a0(entity.a(PhotoMeta.class));
                                              if (postShowInfo != null && postShowInfo.mType == this) {
                                                 postShowInfo = postShowInfo.mIcon;
                                                 goto label_00fa ;
                                              }
                                           }
                                           obj1 = null;
                                           goto label_00fd ;
                                        }else {
                                           obj1 = new Object[0];
                                           g.C().w("PostEntranceEvePresenter", "KuaiShan Cover url is not null", obj1);
                                           mCoverImageU = mCoverImageU;
                                        }
                                        uoa = new PostEntranceEveManager$a(String.valueOf(flashPhotoTe.mId), Integer.valueOf(7), e.a(mCoverImageU, str));
                                     }
                                  }
                                  i = true;
                                  goto label_00be ;
                               }else {
                                  uoa = null;
                               }
                            }
                            if (!e.c(uoa)) {
                               uoa = PatchProxy.applyOneRefs(qPhoto, e, postEntrance, "6");
                               if (uoa != patchProxyRe) {
                               label_0192 :
                                  str = 0;
                                  uoa1 = uoa;
                               }else if(qPhoto.getMagicFace() != null){
                                  magicFace = qPhoto.getMagicFace();
                               }else {
                                  List magicFaces = qPhoto.getMagicFaces();
                                  magicFaces = (magicFaces == null || magicFaces.isEmpty())? 1: null;
                                  if (!magicFaces) {
                                     magicFace = qPhoto.getMagicFaces().get(0);
                                  }else {
                                     magicFace = null;
                                  }
                               }
                               if (magicFace != null) {
                                  uoa1 = new PostEntranceEveManager$a(magicFace.mId, Integer.valueOf(1), e.a(magicFace.mImages, null));
                               }else {
                                  str = 0;
                                  uoa1 = str;
                               }
                            }else {
                               goto label_0192 ;
                            }
                            if (e.c(uoa1)) {
                               String str2 = (uoa1 != null)? uoa1.b(): str;
                               linkedHashMa.put("materialId", new a(str2));
                               Integer integer = (uoa1 != null)? uoa1.c(): str;
                               linkedHashMa.put("materialType", new a(integer));
                               linkedHashMa.put("used", new a(false));
                               str1 = (uoa1 != null)? uoa1.a(): str;
                               linkedHashMa.put("iconUrl", new a(str1));
                               linkedHashMa.put("timestamp", new a(a1.k()));
                               objArray1 = new Object[0];
                               g.C().w("PostEntranceEvePresenter", "fillPhotoClickEvent success, "+linkedHashMa, objArray1);
                            }
                         }
                      }
                   }
                }
                str1 = str;
                goto label_005e ;
             }
          }else if(obj instanceof CustomEvent){
             try{
                PostEntranceEveManager e1 = PostEntranceEveManager.e;
                obj3 = obj;
                Objects.requireNonNull(e1);
                if (!PatchProxy.applyVoidTwoRefs(obj3, linkedHashMa, e1, postEntrance, "7") && a.g(obj3.getCustomKey(), "clearPostHomeReco")) {
                   JSONObject jSONObject = new JSONObject(obj3.getCustomValue());
                   String str3 = jSONObject.optString("materialId");
                   obj = jSONObject.optString("materialType");
                   a.o(str3, "materialId");
                   this = (str3.length() > 0)? 1: 0;
                   if (this) {
                      a.o(obj, "materialType");
                      this = (obj.length() > 0)? 1: 0;
                      if (this) {
                         linkedHashMa.put("materialId", new a(str3));
                         linkedHashMa.put("materialType", new a(obj));
                         linkedHashMa.put("used", new a(true));
                         linkedHashMa.put("timestamp", new a(a1.k()));
                         linkedHashMa.put("iconUrl", new a(str));
                         objArray1 = new Object[0];
                         g.C().w("PostEntranceEvePresenter", "clearPostHomeReco success, "+linkedHashMa, objArray1);
                      }
                   }
                }
             }catch(org.json.JSONException e0){
                g.C().e("PostEntranceEvePresenter", "fillCustomClick params error "+obj3.getCustomValue(), e0);
             }
          }
       }
    }
}
