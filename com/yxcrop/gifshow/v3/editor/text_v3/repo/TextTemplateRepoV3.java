package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import lod.b;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import jb7.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicParamsExt;
import java.lang.Class;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import kb7.a;
import jb7.b;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$downloadHelper$2;
import lod.a;
import brd.v;
import com.kwai.robust.PatchProxy;
import ood.d;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ood.b;
import java.lang.Integer;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import nuc.c;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$b;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$c;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$d;
import erd.a;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$e;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$f;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$h;
import brd.w;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$i;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$j;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$a;
import crd.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.util.Map;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$n;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$o;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$k;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$l;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$m;
import crd.a;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$p;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$q;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$r;
import nuc.a;
import java.io.File;
import com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3;
import qkd.b;
import bod.a;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import nsd.u;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v3.model.CompTextBeanQT;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.text_v3.model.CompLayerQT;
import com.yxcrop.gifshow.v3.editor.text_v3.model.TextBeanQT;
import d0c.a;
import d0c.b;
import xod.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import brd.g;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$s;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$t;
import java.lang.Boolean;
import ekd.q;

public final class TextTemplateRepoV3 implements b	// class@000c36
{
    public final p a;
    public final a b;
    public final b c;
    public Result d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final p g;
    public final String h;
    public final TextFontRepoV3 i;

    public void TextTemplateRepoV3(String p0,TextFontRepoV3 p1){
       a.p(p0, "subBiz");
       a.p(p1, "fontRepo");
       super();
       this.h = p0;
       this.i = p1;
       this.a = s.c(TextTemplateRepoV3$compositeDisposable$2.INSTANCE);
       a uoa = new a(p0, 1, DynamicParamsExt.class);
       this.b = uoa;
       this.c = ResourceSdk.d(ResourceSdk.f, uoa, null, 2, null);
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.g = s.c(new TextTemplateRepoV3$downloadHelper$2(this));
    }
    public void a(a p0,v p1){
       t ot;
       TextTemplateRepoV3 textTemplate = TextTemplateRepoV3.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, textTemplate, "6")) {
          return;
       }
       a.p(p0, "templateItemV3");
       a.p(p1, "paramEmitter");
       d uod = p0;
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateRepoV3", "downloadTextTemplate dynamicData:"+p0+", paramEmitter:"+p1+", "+"fontDownloadState:"+uod.l()+", templateDownloadState:"+uod.m(), objArray);
       int i = Integer.MIN_VALUE;
       uod.t(i);
       uod.u(i);
       if (uod.n() != null) {
          Object[] objArray1 = new Object[0];
          a.D().w("TextTemplateRepoV3", "downloadTextTemplate use template local", objArray1);
          ot = t.just(Integer.valueOf(100));
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w("TextTemplateRepoV3", "downloadTextTemplate use template network", objArray2);
          DynamicTextDownloadHelper uDynamicText = PatchProxy.apply(null, this, textTemplate, "2");
          if (uDynamicText == PatchProxyResult.class) {
             uDynamicText = this.g.getValue();
          }
          ot = uDynamicText.a(p0);
       }
       z c = d.c;
       ot = t.concat(ot.doOnNext(new TextTemplateRepoV3$b(p0)).doOnError(new TextTemplateRepoV3$c(p0)).doOnComplete(new TextTemplateRepoV3$d(p0)), t.create(new TextTemplateRepoV3$e(this, p0)).subscribeOn(c).doOnNext(new TextTemplateRepoV3$f(p0)).doOnError(new TextTemplateRepoV3$g(p0)).doOnComplete(new TextTemplateRepoV3$h(p0))).subscribeOn(c).observeOn(c);
       ot.subscribe(new TextTemplateRepoV3$i(this, p1, p0), new TextTemplateRepoV3$j(p0, p1), new TextTemplateRepoV3$a(this, p0, p1));
       return;
    }
    public void b(CachePolicy p0,v p1,Object p2){
       Object[] objArray1;
       t ot;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextTemplateRepoV3.class, "5")) {
          return;
       }
       a.p(p0, "cachePolicy");
       a.p(p1, "paramEmitter");
       a.p(p2, "payload");
       int b = this.h();
       CachePolicy nETWORK_ELSE = (b)? CachePolicy.NETWORK_ELSE_CACHE: p0;
       b = 0;
       Object[] objArray = new Object[b];
       a.D().w("TextTemplateRepoV3", "loadItemList cachePolicy:"+p0+", paramEmitter:"+p1+", memoryCacheIsEmpty:"+b+", finalCachePolicy:"+nETWORK_ELSE, objArray);
       if (nETWORK_ELSE != CachePolicy.NETWORK_ELSE_CACHE && (nETWORK_ELSE == CachePolicy.NETWORK_ONLY || this.d == null)) {
          objArray1 = new Object[b];
          a.D().w("TextTemplateRepoV3", "loadItemList network, payload:"+p2, objArray1);
          ot = t.create(new TextTemplateRepoV3$k(this)).observeOn(d.a).map(new TextTemplateRepoV3$l(this, p2)).flatMap(new TextTemplateRepoV3$m(this, nETWORK_ELSE));
       }else if(this.e.isEmpty() ^ 0x01){
          objArray1 = new Object[b];
          a.D().w("TextTemplateRepoV3", "loadItemList all memory, payload:"+p2, objArray1);
          ot = t.just(this.d);
       }else {
          objArray1 = new Object[b];
          a.D().w("TextTemplateRepoV3", "loadItemList template memory, font network, payload:"+p2, objArray1);
          ot = t.create(new TextTemplateRepoV3$n(this)).observeOn(d.a).map(new TextTemplateRepoV3$o(this, p2));
       }
       this.d().c(ot.observeOn(d.c).map(new TextTemplateRepoV3$p(this, p2)).observeOn(d.a).subscribe(new TextTemplateRepoV3$q(this, p1), new TextTemplateRepoV3$r(p2, p1)));
       return;
    }
    public final d c(a p0,b p1){
       b uob1;
       String str1;
       a uoa;
       int i2;
       String str2;
       a uoa1;
       String str3;
       Object obj = this;
       b obj1 = p0;
       b uob = p1;
       File obj2 = PatchProxy.applyTwoRefs(obj1, uob, obj, TextTemplateRepoV3.class, "11");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "item");
       obj2 = TextTemplateEnvV3.a(p0.m(), p0.o());
       if (uob == null) {
          if (b.S(obj2)) {
             str3 = obj2.getAbsolutePath();
             a.o(str3, "templateDirFile.absolutePath");
             uob = new b(str3);
             obj.f.put(p0.m(), uob);
          }else {
             uob1 = null;
          label_0049 :
             Object obj3 = obj.e.get(p0.e());
             if (obj3 != null) {
                String str = obj3.e();
                if (str != null) {
                   str1 = str;
                label_0067 :
                   int i = 1;
                   int i1 = (obj3 != null && obj3.c() == i)? Integer.MAX_VALUE: Integer.MIN_VALUE;
                   d uod = v11;
                   d uod1 = new d(p0, obj3, str1, i1, 0, null, null, null, 240, 0);
                   uod.v(uob1);
                   List list = obj.e(uod);
                   obj1 = uod.n();
                   if (obj1 != null) {
                      obj1.h(list);
                   }
                   if (uob1 != null && obj3 == null) {
                      uoa = PatchProxy.applyOneRefs(uod, obj, TextTemplateRepoV3.class, "7");
                      if (uoa != PatchProxyResult.class) {
                      }else {
                         uob = uod.n();
                         if (uob != null) {
                            str2 = PatchProxy.apply(null, uob, b.class, "3");
                            if (str2 != PatchProxyResult.class) {
                               uoa1 = 1;
                            }else if(uob.g()){
                               uoa1 = 1;
                            }else if(uob.a != null){
                               obj1 = uob.d;
                               if (obj1 != null) {
                                  List layers = obj1.getLayers();
                                  if (layers != null) {
                                     uoa1 = 1;
                                     if ((layers.isEmpty() ^ uoa1) == uoa1) {
                                        obj1 = uob.d;
                                        if (obj1 != null) {
                                           layers = obj1.getLayers();
                                           if (layers != null) {
                                              CompLayerQT uCompLayerQT = layers.get(uob.c());
                                              if (uCompLayerQT != null) {
                                                 TextBeanQT textBean = uCompLayerQT.getTextBean();
                                                 if (textBean != null) {
                                                    str = textBean.getFontID();
                                                    if (str != null) {
                                                    label_011b :
                                                       str2 = str;
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                               uoa1 = 1;
                            }else {
                               uoa1 = 1;
                               uob = uob.c;
                               if (uob != null) {
                                  str = uob.getFontID();
                                  if (str != null) {
                                     goto label_011b ;
                                  }
                               }
                            }
                            str = "590875";
                            goto label_011b ;
                         label_0108 :
                            str2 = "";
                            if (str2 != null) {
                            label_0122 :
                               uoa = obj.e.get(str2);
                               int i3 = 0;
                               if (uoa != null) {
                                  Object[] objArray = new Object[i3];
                                  a.D().w("TextTemplateRepoV3", "downloadTextTemplate use json first font", objArray);
                                  uod.r(uoa);
                                  uod.p().u(str2);
                               }else {
                                  Object[] objArray1 = new Object[i3];
                                  a.D().w("TextTemplateRepoV3", "downloadTextTemplate use default font", objArray1);
                                  uoa = new a(b.a(), f.a.c(), uoa1);
                                  uod.r(uoa);
                                  a uoa2 = uod.p();
                                  str3 = b.a().d();
                                  if (str3 == null) {
                                     str3 = "";
                                  }
                                  uoa2.u(str3);
                                  int i4 = (uoa.c())? Integer.MAX_VALUE: Integer.MIN_VALUE;
                                  uod.t(i4);
                               }
                            }
                         }else {
                            uoa1 = 1;
                         }
                         str2 = "";
                         goto label_0122 ;
                      }
                      obj3 = uoa;
                   }
                   if (obj3 != null) {
                      i2 = (obj3.c())? Integer.MAX_VALUE: Integer.MIN_VALUE;
                      uod.t(i2);
                   }
                   i2 = (uob1 != null)? Integer.MAX_VALUE: Integer.MIN_VALUE;
                   uod.u(i2);
                   uoa = uod.j();
                   if (uoa != null) {
                      str = uoa.e();
                      if (str != null) {
                      label_01b3 :
                         uod.s(str);
                         if (a.g(obj.h, "DESIGN_FONT_TEMPLATE")) {
                            uod.w(CommonDraftTextAssetModel$ResourceType.FLOWER_WORD);
                         }else {
                            uod.w(CommonDraftTextAssetModel$ResourceType.TEMPLATE);
                         }
                         return uod;
                      }
                   }
                   str = "";
                   goto label_01b3 ;
                }
             }
             str1 = "";
             goto label_0067 ;
          }
       }
       uob1 = uob;
       goto label_0049 ;
    }
    public final a d(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepoV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final List e(d p0){
       ArrayList uArrayList;
       Iterator iterator;
       String fontID;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepoV3.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       b uob = p0.n();
       if (uob != null) {
          uArrayList = PatchProxy.apply(null, uob, b.class, "5");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             if (!uob.g()) {
                String str = "590875";
                if (uob.a != null) {
                   b d = uob.d;
                   if (d != null) {
                      List layers = d.getLayers();
                      if (layers != null && (layers.isEmpty() ^ true) == 1) {
                         uob = uob.d;
                         if (uob != null) {
                            List layers1 = uob.getLayers();
                            if (layers1 != null) {
                               iterator = layers1.iterator();
                               while (iterator.hasNext()) {
                                  TextBeanQT textBean = iterator.next().getTextBean();
                                  if (textBean != null) {
                                     fontID = textBean.getFontID();
                                     if (fontID != null) {
                                     label_0075 :
                                        uArrayList.add(fontID);
                                     }
                                  }
                                  fontID = "";
                                  goto label_0075 ;
                               }
                            }
                         }
                      }
                   }
                   uArrayList.add(str);
                }else {
                   uob = uob.c;
                   if (uob != null) {
                      String fontID1 = uob.getFontID();
                      if (fontID1 != null) {
                         str = fontID1;
                      }
                   }
                   uArrayList.add(str);
                }
             }
          }
          if (uArrayList != null) {
          label_0093 :
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                a uoa = this.e.get(iterator.next());
                if (uoa != null) {
                   obj.add(uoa);
                }else {
                   obj.add(new a(b.a(), f.a.c(), true));
                }
             }
             return obj;
          }
       }
       uArrayList = new ArrayList();
       goto label_0093 ;
    }
    public final d f(String p0){
       MaterialDetailInfo materialDeta;
       String str;
       String str1;
       String str2;
       List list1;
       List list2;
       int i;
       int i1;
       boolean b;
       String str3;
       String str4;
       String str5;
       String str6;
       int i2;
       int i3;
       ArrayList uArrayList;
       Object obj = this;
       DynamicParamsExt obj1 = p0;
       TextTemplateRepoV3 obj2 = PatchProxy.applyOneRefs(obj1, obj, TextTemplateRepoV3.class, "12");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       d uod = null;
       if (TextUtils.isEmpty(p0)) {
          return uod;
       }
       obj2 = obj.d;
       if (obj2 != null) {
          List list = obj2.a();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   MaterialGroupInfo materialGrou = iterator.next();
                   List detailInfoLi = materialGrou.getDetailInfoList();
                   if (detailInfoLi != null) {
                      Iterator iterator1 = detailInfoLi.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            materialDeta = iterator1.next();
                            if (a.g(materialDeta.getMaterialId(), obj1)) {
                               obj1 = materialDeta.getExtObject();
                               String materialId = materialDeta.getMaterialId();
                               str = (materialId != null)? materialId: "";
                               materialId = materialDeta.getMaterialName();
                               str1 = (materialId != null)? materialId: "";
                               materialId = materialDeta.getMd5();
                               str2 = (materialId != null)? materialId: "";
                               List iconUrls = materialDeta.getIconUrls();
                               if (iconUrls == null) {
                                  uArrayList = new ArrayList();
                               }
                               list1 = iconUrls;
                               iconUrls = materialDeta.getResourceUrls();
                               if (iconUrls == null) {
                                  uArrayList = new ArrayList();
                               }
                               list2 = iconUrls;
                               i = (obj1 != null)? obj1.getControlType(): 0;
                               i1 = (obj1 != null)? obj1.getShowWhere(): 0;
                               b = (obj1 != null)? obj1.getNeedLogin(): false;
                               if (obj1 != null) {
                                  String defaultText = obj1.getDefaultText();
                                  if (defaultText != null) {
                                     str3 = defaultText;
                                  label_00c4 :
                                     if (obj1 != null) {
                                        String defaultFontI = obj1.getDefaultFontId();
                                        if (defaultFontI != null) {
                                           str4 = defaultFontI;
                                        label_00d1 :
                                           defaultFontI = materialGrou.getGroupId();
                                           str5 = (defaultFontI != null)? defaultFontI: "";
                                           defaultFontI = materialGrou.getGroupName();
                                           str6 = (defaultFontI != null)? defaultFontI: "";
                                           Integer groupType = materialGrou.getGroupType();
                                           i2 = (groupType != null)? groupType.intValue(): 0;
                                           groupType = materialGrou.getGroupRank();
                                           i3 = (groupType != null)? groupType.intValue(): 0;
                                        }
                                     }
                                     str4 = "";
                                     goto label_00d1 ;
                                  }
                               }
                               str3 = "";
                               goto label_00c4 ;
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
             a uoa = new a(str, str5, str6, i2, i3, str1, str2, list1, list2, i, i1, b, str4, str3, null, false, false, null, 0, null, null, null, null, null, 0xffc000, null);
             return obj.c(iterator, obj.f.get(materialDeta.getMaterialId()));
          }
       }
       return uod;
    }
    public final void g(CachePolicy p0,v p1){
       List list;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTemplateRepoV3.class, "3")) {
          return;
       }
       a.p(p0, "cachePolicy");
       a.p(p1, "paramEmitter");
       int b = this.h();
       CachePolicy nETWORK_ELSE = (b)? CachePolicy.NETWORK_ELSE_CACHE: p0;
       b = 0;
       Object[] objArray = new Object[b];
       a.D().w("TextTemplateRepoV3", "loadTab cachePolicy:"+p0+", paramEmitter:"+p1+", memoryCacheIsEmpty:"+b+", finalCachePolicy:"+nETWORK_ELSE, objArray);
       if (nETWORK_ELSE != CachePolicy.NETWORK_ELSE_CACHE && (nETWORK_ELSE == CachePolicy.NETWORK_ONLY || this.d == null)) {
          this.d = null;
          this.d().c(this.c.a(nETWORK_ELSE).observeOn(d.a).subscribe(new TextTemplateRepoV3$s(this, p1), new TextTemplateRepoV3$t(p1)));
       }else {
          Object[] objArray1 = new Object[b];
          a.D().w("TextTemplateRepoV3", "loadTab from memory cache", objArray1);
          TextTemplateRepoV3 td = this.d;
          if (td != null) {
             list = td.a();
             if (list != null) {
             label_007c :
                p1.onNext(list);
                p1.onComplete();
             }
          }
          list = new ArrayList();
          goto label_007c ;
       }
       return;
    }
    public final boolean h(){
       Object[] objArray = null;
       TextTemplateRepoV3 obj = PatchProxy.apply(objArray, this, TextTemplateRepoV3.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = true;
       boolean b1 = (obj == null)? true: false;
       if (obj != null) {
          objArray = obj.a();
       }
       boolean b2 = q.f(objArray);
       Object[] objArray1 = new Object[0];
       a.D().w("TextTemplateRepoV3", "memoryCacheIsEmptyButNotNull isEmpty:"+b2+", isNull:"+b1, objArray1);
       if (!b2 || b1) {
          b = false;
       }
       return b;
    }
}
