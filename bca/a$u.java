package bca.a$u;
import erd.g;
import bca.a;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import java.util.Collection;
import bca.b;
import java.lang.Iterable;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import h69.j;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import fba.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.Workspace$Source;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import nsd.u;
import fg6.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.google.gson.Gson;
import com.kuaishou.edit.draft.FeatureId;
import lnc.p3;
import w46.b;

public final class a$u implements g	// class@00045e
{
    public final a b;
    public final ArrayList c;

    public void a$u(a p0,ArrayList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       List list;
       ArrayList uArrayList;
       VideoTemplateGroupInfo obj;
       ArrayList uArrayList2;
       g7 a;
       a j;
       VideoTemplate videoTemplat1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$u.class, "1")) {
       }else {
          ArrayList templateGrou = p0.getTemplateGroups();
          if (templateGrou != null) {
             Iterator iterator = templateGrou.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   VideoTemplateGroupInfo videoTemplat = iterator.next();
                   if (a.g(videoTemplat.getGroupName(), "ÍÆ¼ö") || (g7.a(this.b.j) && a.g(videoTemplat.getGroupName(), "ÈÈÃÅ"))) {
                      if (this.c.isEmpty() ^ 1) {
                         templateGrou = videoTemplat.getTemplates();
                         if (templateGrou != null) {
                            list = CollectionsKt___CollectionsKt.f5(templateGrou, new b(this, p0));
                            if (list != null) {
                            label_0067 :
                               uArrayList = new ArrayList(list);
                               String str = j.d(this.b.j, false);
                               Iterator iterator1 = uArrayList.iterator();
                               int i = 0;
                               while (true) {
                                  if (iterator1.hasNext()) {
                                     if (a.g(iterator1.next().getId(), str)) {
                                     label_0094 :
                                        if (i > 0 && i < uArrayList.size()) {
                                           AICutTheme uAICutTheme = a.a(this.b.j).v();
                                           if (uAICutTheme != null && !uAICutTheme.getIsRecommend()) {
                                              obj = uArrayList.remove(i);
                                              a.o(obj, "recommendStyles.removeAt\(prevSelectedIndex\)");
                                              uArrayList.add(false, obj);
                                           }
                                        }
                                        templateGrou = videoTemplat.getTemplates();
                                        if (templateGrou != null) {
                                           templateGrou.clear();
                                           templateGrou.addAll(uArrayList);
                                        }
                                     }else {
                                        i = i + 1;
                                     }
                                  }else {
                                     i = 0;
                                     goto label_0094 ;
                                  }
                               }
                            }
                         }
                         list = CollectionsKt__CollectionsKt.E();
                         goto label_0067 ;
                      }
                      j.u(j.d, this.b.j, videoTemplat.getTemplates(), false, 4, null);
                   }
                }
                ArrayList uArrayList1 = null;
                if (j.h(this.b.j.T0())) {
                   templateGrou = p0.getTemplateGroups();
                   if (templateGrou != null) {
                      obj = templateGrou.get(false);
                      if (obj != null) {
                         uArrayList2 = obj.getTemplates();
                      label_0100 :
                         if (uArrayList2 != null) {
                            iterator = uArrayList2.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  uArrayList = iterator.next();
                                  if (!a.g(uArrayList.getId(), j.d(this.b.j, false))) {
                                     continue ;
                                  }
                               }else {
                                  uArrayList = uArrayList1;
                               }
                               if (uArrayList != null) {
                                  uArrayList2.remove(uArrayList);
                                  uArrayList2.add(false, uArrayList);
                               }
                            }
                         }
                         j.u(j.d, this.b.j, uArrayList2, false, 4, null);
                      }
                   }
                   uArrayList2 = uArrayList1;
                   goto label_0100 ;
                }
                if (g7.a(this.b.j)) {
                   a = g7.a;
                   if (a.o(this.b.j)) {
                      j = this.b.j;
                      a.p(j, "draft");
                      if (g7.a(j) && a.o(j)) {
                         a uoa = j.F0();
                         if (uoa != null) {
                            Kuaishan kuaishan = uoa.v();
                            if (kuaishan != null) {
                               a.o(kuaishan, "draft.kuaishanDraft?.firstMessage ?: return null");
                               String extraInfo = kuaishan.getExtraInfo();
                               if (extraInfo != null) {
                                  VideoTemplate videoTemplat2 = new VideoTemplate(0, null, null, null, 15, null);
                                  v12.setType(1);
                                  KSFeedTemplateDetailInfo obj1 = a.a.h(extraInfo, KSTemplateDetailInfo.class);
                                  a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­teDetailInfo::class.java\)");
                                  obj1 = obj1.toKSFeedTemplateDetailInfo();
                                  a.o(obj1, "detailTemplate.toKSFeedTemplateDetailInfo\(\)");
                                  KSFeedTemplateDetailInfo mId = obj1.mId;
                                  FeatureId uFeatureId = (mId == null || !mId.length())? 1: null;
                                  if (uFeatureId) {
                                     uFeatureId = kuaishan.getFeatureId();
                                     a.o(uFeatureId, "kuaishan.featureId");
                                     obj1.mId = uFeatureId.getExternal();
                                  }
                                  mId = obj1.mName;
                                  String str1 = (mId == null || !mId.length())? 1: null;
                                  if (str1) {
                                     obj1.mName = kuaishan.getName();
                                  }
                                  if (obj1.mCoverUrls.isEmpty() || obj1.mTemplateZip == null) {
                                     Object[] objArray = new Object[false];
                                     p3.D().t("PostTemplateUtils", "getTemplateFromPhotoMovieDraft\(\) failed to parse coverUrl or resourceUrl", objArray);
                                  }else {
                                     v12.setKsTemplateInfo(obj1);
                                  label_01ff :
                                     if (videoTemplat1 != null) {
                                        p0 = p0.getTemplateGroups();
                                        if (p0 != null) {
                                           p0 = p0.get(false);
                                           if (p0 != null) {
                                              uArrayList1 = p0.getTemplates();
                                           }
                                        }
                                        if (uArrayList1 != null) {
                                           p0 = uArrayList1.iterator();
                                           a = 0;
                                           while (p0.hasNext()) {
                                              if (a.g(p0.next().getId(), videoTemplat1.getId())) {
                                                 a = 1;
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }else {
                                           a = 0;
                                        }
                                        if (!a && uArrayList1 != null) {
                                           uArrayList1.add(false, videoTemplat1);
                                           break ;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                      videoTemplat1 = uArrayList1;
                      goto label_01ff ;
                   }
                }
             }
          }
       }
       return;
    }
}
