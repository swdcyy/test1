package com.kwai.sharelib.a$m;
import erd.o;
import com.kwai.sharelib.a;
import uo7.a0;
import java.lang.Object;
import com.kwai.sharelib.model.ShareInitResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import au6.e;
import java.lang.StringBuilder;
import uo7.k;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import xo7.b;
import com.google.gson.JsonObject;
import com.kwai.sharelib.jsshare.StartShareParam$PanelConfig;
import java.lang.Double;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import com.google.gson.JsonElement;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import com.kwai.sharelib.model.ShareInitResponse$PanelPoster;
import com.kwai.sharelib.model.PosterConfig;
import com.kwai.sharelib.model.PainterModel;
import com.kwai.sharelib.model.PainterModel$ImageContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sharelib.model.TkConfig;
import java.util.Objects;
import uo7.i0;
import uo7.h0;
import brd.t;
import com.kwai.sharelib.KsShareDataEngine;
import uo7.w;
import erd.g;
import com.kwai.sharelib.model.ShareAnyResponse;
import uo7.d0;
import uo7.v;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import com.kwai.sharelib.KsShareManager$showSharePanel$5$8;
import msd.l;
import kotlin.jvm.internal.Ref$BooleanRef;
import ip7.i;
import ip7.h;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.sharelib.model.ShareInitResponse$ShareInitArea;
import java.util.Collection;
import ekd.q;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import uo7.z;
import uo7.x;
import uo7.h;
import uo7.k0;
import com.kwai.sharelib.KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2;
import msd.a;
import uo7.y;
import uo7.j0;
import uo7.a;
import zo7.b;

public final class a$m implements o	// class@0016b0
{
    public final a b;
    public final a0 c;

    public void a$m(a p0,a0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject;
       a$m c;
       ShareInitResponse mSharePanel;
       a$m c1;
       a$m c2;
       Iterator iterator;
       v obj3;
       a$m b;
       String str5;
       ArrayList uArrayList2;
       String str6;
       a uoa1;
       PatchProxyResult patchProxyRe1;
       ShareInitResponse$SharePanelElement sharePanelEl;
       ShareInitResponse$ShareInitArea obj4;
       int i3;
       String obj6;
       h0 oh0;
       ArrayList obj7;
       ShareInitResponse$SharePanelElement mActionUrl;
       Object obj8;
       String str7;
       String str8;
       Ref$BooleanRef uBooleanRef1;
       Object obj9;
       Object obj10;
       Iterator iterator3;
       int i4;
       ArrayList uArrayList5;
       String str9;
       Iterator obj12;
       String str10;
       ArrayList uArrayList6;
       h0 oh01;
       t ot;
       String str12;
       int b3;
       ShareInitResponse$ShareInitArea obj13;
       ShareInitResponse$ShareInitArea obj14;
       b obj15;
       int i5;
       Object obj18;
       ArrayList obj19;
       Ref$BooleanRef uBooleanRef2;
       t obj20;
       i0 oi0;
       Iterator obj21;
       PatchProxyResult patchProxyRe2;
       a uoa2;
       Object obj23;
       a$m om;
       int i7;
       ShareInitResponse$SharePanelElement obj26;
       String obj27;
       ShareInitResponse$ShareInitArea shareInitAre;
       ShareInitResponse$ShareInitArea mArea;
       h obj30;
       int i10;
       l1 a;
       a$m obj = this;
       ArrayList obj1 = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       e obj2 = PatchProxy.applyOneRefs(obj1, obj, a$m.class, str);
       if (obj2 != patchProxyRe) {
       }else {
          a.p(obj1, "it");
          obj2 = e.a;
          String str1 = null;
          int i = 1;
          e.d(obj2, str1, "shareInitRequest response received before "+obj1, i, str1);
          a g = obj.b.g;
          g.q = obj1;
          StartShareParam$JsShareParam jsShareParam = g.f();
          String str2 = "actionUrl";
          if (jsShareParam != null) {
             jsonObject = PatchProxy.applyOneRefs(jsShareParam, str1, b.class, "10");
             if (jsonObject != patchProxyRe) {
             }else {
                a.p(jsShareParam, "jsShareParam");
                jsShareParam = jsShareParam.mPanelConfig;
                if (jsShareParam != null) {
                   jsonObject = new JsonObject();
                   JsonObject jsonObject1 = new JsonObject();
                   jsonObject1.a0("aspectRatio", Double.valueOf(jsShareParam.mHeaderImageAspectRatio));
                   jsonObject1.c0(str2, jsShareParam.mHeaderActionUrl);
                   jsonObject1.c0("imageBytes", jsShareParam.mHeaderImageBytes);
                   jsonObject1.c0("imageUrl", jsShareParam.mHeaderImageUrl);
                   jsonObject1.H("hideClicked", Boolean.valueOf(jsShareParam.isHidePanelOnHeaderClicked));
                   jsonObject.G("jsCustomBanner", jsonObject1);
                }else {
                label_0094 :
                   str5 = str1;
                }
             }
          }else {
             goto label_0094 ;
          }
          if (jsonObject == null) {
             mSharePanel = obj1.mSharePanel;
             ShareInitResponse$SharePanelData mExtParams = (mSharePanel != null)? mSharePanel.mExtParams: str1;
             if (!mExtParams instanceof JsonObject) {
                mExtParams = str1;
             }
             jsonObject = mExtParams;
          }
          if (jsonObject != null) {
             c = obj.c;
             if (c != null) {
                c.n8(jsonObject);
             }
          }
          mSharePanel = obj1.mSharePanel;
          if (mSharePanel != null) {
             e.d(obj2, str1, "shareInitRequest response has panel params "+mSharePanel, i, str1);
             c1 = obj.c;
             if (c1 != null) {
                c1.S6(mSharePanel);
             }
          }
          mSharePanel = obj1.mPanelPoster;
          if (mSharePanel != null) {
             e.d(obj2, str1, "shareInitRequest response has panel poster "+mSharePanel, i, str1);
             c1 = obj.c;
             if (c1 != null) {
                c1.nd(mSharePanel);
             }
          }
          mSharePanel = obj1.mPosterConfig;
          if (mSharePanel != null) {
             e.d(obj2, str1, "shareInitRequest response has poster config "+mSharePanel, i, str1);
             c1 = obj.c;
             if (c1 != null) {
                c1.r3(mSharePanel);
             }
          }
          mSharePanel = obj1.mPainterModel;
          if (mSharePanel != null) {
             e.d(obj2, str1, "shareInitRequest response has painter model "+mSharePanel, i, str1);
             obj.b.g.C(mSharePanel);
             PainterModel mImageConten = mSharePanel.mImageContent;
             if (mImageConten != null) {
                mImageConten.mImageBytes = obj.b.g.o();
             }
             c2 = obj.c;
             if (c2 != null) {
                c2.Qg(mSharePanel);
             }
          }
          ShareInitResponse mTkConfigLis = obj1.mTkConfigList;
          String str3 = "banner";
          int i1 = 0;
          if (mTkConfigLis != null) {
             c = obj.c;
             if (c != null) {
                c.R5(mTkConfigLis);
             }
             ArrayList uArrayList = new ArrayList();
             iterator = mTkConfigLis.iterator();
             while (iterator.hasNext()) {
                obj3 = iterator.next();
                if (a.g(obj3.mViewArea, str3)) {
                   uArrayList.add(obj3);
                }
             }
             TkConfig tkConfig = (uArrayList.isEmpty() ^ i)? uArrayList.get(i1): str1;
             if (tkConfig != null && tkConfig.mTkContent.s0(str2)) {
                JsonElement jsonElement = tkConfig.mTkContent.e0(str2);
                a.o(jsonElement, "this.mTkContent.get\(\"actionUrl\"\)");
                String str4 = jsonElement.w();
                c = (str4 == null || !str4.length())? 1: null;
                if (!c) {
                   c = obj.c;
                   if (c != null) {
                      b = obj.b;
                      Objects.requireNonNull(b);
                      obj3 = PatchProxy.applyOneRefs(str4, b, uoa, "16");
                      if (obj3 != patchProxyRe) {
                      }else {
                         h0 oh02 = new h0(str4);
                         str4 = oh02.c();
                         if (str4 != null) {
                            obj20 = (oh02.f())? b.a(b.b.b(b.g, oh02, "TOP_BANNER")).doOnNext(new w(b, str4, oh02)): t.just(new ShareAnyResponse());
                            if (b.a.e(str4)) {
                               obj3 = new v(b, oh02, obj20, str4);
                            }
                         }
                         str5 = str1;
                      }
                      c.v8(obj3);
                   }
                }
             }
          }
       label_0201 :
          ShareInitResponse$SharePanelData mTheme = obj1.mSharePanel.mTheme;
          if (mTheme != null) {
             e.d(e.a, str1, "shareInitRequest response has theme "+mTheme, i, str1);
             c = obj.c;
             if (c != null) {
                c.W8(mTheme);
             }
          }
          c2 = obj.c;
          if (c2 != null) {
             c2.J8(new KsShareManager$showSharePanel$5$8(obj));
          }
          a$m b1 = obj.b;
          Objects.requireNonNull(b1);
          obj2 = PatchProxy.applyOneRefs(obj1, b1, uoa, "13");
          if (obj2 != patchProxyRe) {
          }else {
             ArrayList uArrayList1 = new ArrayList();
             Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
             uBooleanRef.element = i1;
             i b2 = i.b;
             g = b1.a;
             Objects.requireNonNull(b2);
             h oh = PatchProxy.applyTwoRefs(obj1, g, b2, i.class, str);
             str5 = "placeholder";
             str2 = "element.mActionUrl";
             if (oh != patchProxyRe) {
                uArrayList2 = uArrayList1;
                str6 = str3;
                uoa1 = uoa;
                patchProxyRe1 = patchProxyRe;
                sharePanelEl = null;
             }else {
                a.p(obj1, "response");
                a.p(g, "serviceContainer");
                mTkConfigLis = obj1.mSharePanel;
                if (mTkConfigLis != null) {
                   mTheme = mTkConfigLis.mBundlePrime;
                   if (mTheme != null) {
                      iterator = mTheme.iterator();
                      int i8 = 0;
                      while (true) {
                         if (iterator.hasNext()) {
                            Object obj28 = iterator.next();
                            i3 = i8 + 1;
                            if (i8 < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            if (q.f(obj28.mArea)) {
                               iterator3 = iterator;
                            }else {
                               shareInitAre = obj28.mArea;
                               str12 = "shareInitArea.mArea";
                               a.o(shareInitAre, str12);
                               Iterator iterator4 = shareInitAre.iterator();
                               obj12 = null;
                               while (true) {
                                  str7 = "";
                                  if (iterator4.hasNext()) {
                                     obj7 = iterator4.next();
                                     iterator3 = iterator;
                                     mActionUrl = obj7.mActionUrl;
                                     a.o(mActionUrl, str2);
                                     obj27 = new h0(mActionUrl).c();
                                     if (obj27 == null) {
                                        obj27 = str7;
                                     }
                                     obj27 = (obj7.mPrime != null && g.e(obj27))? 1: 0;
                                     if (obj27) {
                                        i7 = obj12;
                                     label_02f2 :
                                        if (i7 >= 0) {
                                           obj19 = new ArrayList();
                                           obj7 = new ArrayList(obj28.mArea);
                                           obj19.add(obj28.mArea.get(i7));
                                           ArrayList uArrayList7 = new ArrayList();
                                           uArrayList2 = uArrayList1;
                                           mArea = obj28.mArea;
                                           a.o(mArea, str12);
                                           Iterator iterator5 = mArea.iterator();
                                           str6 = str3;
                                           int i9 = 0;
                                           obj18 = 0;
                                           Object obj29 = null;
                                           uoa1 = uoa;
                                           str10 = "MORE_CHANNELS";
                                           while (iterator5.hasNext()) {
                                              obj30 = iterator5.next();
                                              i10 = i9 + 1;
                                              if (i9 < 0) {
                                                 CollectionsKt__CollectionsKt.W();
                                              }
                                              iterator3 = iterator5;
                                              int b4 = obj30;
                                              if (i9 != i7) {
                                                 patchProxyRe1 = patchProxyRe;
                                                 sharePanelEl = b4.mActionUrl;
                                                 a.o(sharePanelEl, str2);
                                                 str3 = new h0(sharePanelEl).c();
                                                 if (str3 == null) {
                                                    str3 = str7;
                                                 }
                                                 if (TextUtils.n(str10, b4.mId)) {
                                                    b4.mAutoHidePanelWhenClicked = false;
                                                    obj18 = b4;
                                                 }else if(obj29 == null && ArraysKt___ArraysKt.P7(i.a, str3)){
                                                    uArrayList7.add(b4);
                                                 }else if(g.e(str3) || a.g(b4.mElementType, str5)){
                                                    if (obj29 == null) {
                                                       obj29 = b4;
                                                    }
                                                    obj19.add(b4);
                                                    b4 = uArrayList7.isEmpty() ^ 1;
                                                    if (b4) {
                                                       obj19.addAll(uArrayList7);
                                                       uArrayList7.clear();
                                                    }
                                                 }
                                              }else {
                                                 patchProxyRe1 = patchProxyRe;
                                                 patchProxyRe = null;
                                              }
                                              i9 = i10;
                                              iterator5 = iterator3;
                                              uoa = uoa1;
                                              patchProxyRe = patchProxyRe1;
                                           }
                                           patchProxyRe1 = patchProxyRe;
                                           if (obj18 == null) {
                                              obj26 = new ShareInitResponse$SharePanelElement();
                                              obj26.mId = str10;
                                              obj26.mElementType = "button";
                                              obj26.mCamelName = "moreChannels";
                                              obj26.mActionUrl = "kwaishare://moreChannels";
                                              a = l1.a;
                                           }else {
                                              obj6 = obj18;
                                           }
                                           if (obj19.size() >= 4 && obj29 != null) {
                                              obj28 = obj28.mArea.get(i7);
                                              a.o(obj28, "shareInitArea.mArea[primeChannelIndex]");
                                              a.m(obj29);
                                              obj30 = new h(i8, i7, obj28, obj29, obj26, obj19, obj7);
                                              oh = a;
                                           }else {
                                              oh = null;
                                           }
                                        }
                                     }else {
                                        i10 = obj12 + 1;
                                        iterator = iterator3;
                                        Object obj31 = null;
                                     }
                                  }else {
                                     iterator3 = iterator;
                                     i7 = -1;
                                     goto label_02f2 ;
                                  }
                               }
                            }
                            i8 = i3;
                            iterator = iterator3;
                            shareInitAre = null;
                         }
                      }
                   }
                }
                uArrayList2 = uArrayList1;
                str6 = str3;
                uoa1 = uoa;
                patchProxyRe1 = patchProxyRe;
                b obj11 = null;
             label_03fe :
                if (obj == null) {
                   mTkConfigLis = obj1.mSharePanel;
                   if (mTkConfigLis != null) {
                      mTheme = mTkConfigLis.mBundle;
                   }else {
                   label_0426 :
                      mTheme = null;
                   }
                }else {
                   mTkConfigLis = obj1.mSharePanel;
                   if (mTkConfigLis != null) {
                      mTheme = mTkConfigLis.mBundlePrime;
                      if (mTheme != null) {
                         obj4 = mTheme.get(obj.b());
                         if (obj4 != null) {
                            obj4.mArea = obj.h;
                         }
                      }
                   }
                   mTkConfigLis = obj1.mSharePanel;
                   if (mTkConfigLis != null) {
                      mTheme = mTkConfigLis.mBundlePrime;
                   }else {
                      goto label_0426 ;
                   }
                }
                if (mTheme != null) {
                   Iterator iterator1 = mTheme.iterator();
                   int i2 = 0;
                   while (iterator1.hasNext()) {
                      obj4 = iterator1.next();
                      i3 = i2 + 1;
                      if (i2 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      x obj5 = obj4;
                      ArrayList uArrayList3 = new ArrayList();
                      obj4 = obj5.mArea;
                      a.o(obj4, "area.mArea");
                      ArrayList uArrayList4 = new ArrayList();
                      iterator = obj4.iterator();
                      while (iterator.hasNext()) {
                         obj6 = iterator.next();
                         oh0 = (obj6.mActionUrl != null)? 1: null;
                         if (!oh0) {
                         }
                         uArrayList4.add(obj6);
                      }
                      Iterator iterator2 = uArrayList4.iterator();
                      while (iterator2.hasNext()) {
                         obj7 = iterator2.next();
                         mActionUrl = obj7.mActionUrl;
                         a.o(mActionUrl, str2);
                         z oz = (!mActionUrl.length())? 1: null;
                         if (oz) {
                            uArrayList3.add(new z(obj7));
                         label_064f :
                            obj8 = obj;
                            str7 = str2;
                            str8 = str5;
                            uBooleanRef1 = uBooleanRef;
                            obj = b1;
                            obj9 = obj5;
                            obj10 = obj1;
                            iterator3 = iterator1;
                            i4 = i2;
                            uArrayList5 = uArrayList2;
                            str9 = str6;
                            obj1 = uArrayList3;
                         }else {
                            mActionUrl = obj7.mActionUrl;
                            a.o(mActionUrl, str2);
                            oh0 = new h0(mActionUrl);
                            obj6 = oh0.c();
                            if (obj6 != null) {
                               if (oh0.f()) {
                                  x ox = uArrayList4;
                                  obj12 = obj5;
                                  obj5 = uArrayList4;
                                  iterator3 = iterator1;
                                  str10 = obj6;
                                  str7 = str2;
                                  uArrayList6 = uArrayList3;
                                  str3 = str5;
                                  uBooleanRef1 = uBooleanRef;
                                  uArrayList5 = uArrayList2;
                                  oh01 = oh0;
                                  obj8 = obj;
                                  obj = b1;
                                  ox = new x(obj6, oh0, b1, uBooleanRef, obj1, obj, uArrayList5);
                                  ot = b1.a(b1.b.b(b1.g, oh0, obj7.mId)).doOnNext(obj5);
                               }else {
                                  obj8 = obj;
                                  str7 = str2;
                                  uBooleanRef1 = uBooleanRef;
                                  obj = b1;
                                  uArrayList6 = uArrayList3;
                                  obj12 = obj5;
                                  iterator3 = iterator1;
                                  uArrayList5 = uArrayList2;
                                  str10 = obj6;
                                  str3 = str5;
                                  oh01 = oh0;
                                  ot = t.just(new ShareAnyResponse());
                               }
                               t ot1 = ot;
                               String str11 = " need request any:";
                               str12 = "  operation:";
                               String str13 = " col type:";
                               String str14 = "showSharePanel row index ";
                               if (a.g(str3, obj7.mElementType)) {
                                  a c3 = obj.c;
                                  b3 = (c3 != null)? c3.b(str10): false;
                                  if (!b3) {
                                     c3 = null;
                                  }
                                  if (c3 != null) {
                                     if (!oh01.f()) {
                                        ot1 = null;
                                     }
                                     a.o(obj7, "element");
                                     List list = c3.c(ot1, obj.g, obj7);
                                     if (list != null) {
                                        iterator1 = list.iterator();
                                        while (iterator1.hasNext()) {
                                           obj13 = iterator1.next();
                                           e.d(e.a, null, str14+i2+str13+obj7.mElementType+str12+obj13.a()+str11+oh01.f(), 1, null);
                                           KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2 omapShareIni = ot1;
                                           obj14 = obj13;
                                           KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2 omapShareIni1 = ot1;
                                           obj15 = obj13;
                                           obj1 = uArrayList6;
                                           omapShareIni = new KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2(obj14, i2, obj7, oh01, uArrayList6, obj, uBooleanRef1, obj1, obj8, uArrayList5);
                                           obj1.add(new k0(obj15, omapShareIni1));
                                           str3 = str3;
                                           iterator1 = iterator1;
                                           i2 = i2;
                                           uArrayList6 = obj1;
                                           obj1 = obj1;
                                        }
                                     }
                                  }
                                  obj10 = obj1;
                                  i5 = i2;
                                  obj9 = obj12;
                                  obj1 = uArrayList6;
                                  str9 = str6;
                                  str8 = str3;
                               }else {
                                  String str15 = str14;
                                  String str16 = str13;
                                  Object obj16 = obj7;
                                  String str17 = str12;
                                  obj10 = obj1;
                                  String str18 = str11;
                                  i5 = i2;
                                  obj9 = obj12;
                                  obj1 = uArrayList6;
                                  str9 = str6;
                                  str8 = str3;
                                  if (obj.a.e(str10)) {
                                     i4 = i5;
                                     Object obj17 = obj16;
                                     e.d(e.a, null, str15+i4+str16+obj17.mElementType+str17+obj17+str18+oh01.f(), 1, null);
                                     y oy = str3;
                                     y oy1 = str3;
                                     oy = new y(oh01, ot1, obj17, str10, obj, uBooleanRef1, obj10, obj8, uArrayList5);
                                     obj1.add(oy1);
                                  }
                               }
                               i4 = i5;
                               i2 = 1;
                            }else {
                               goto label_064f ;
                            }
                         }
                         b1 = obj;
                         uArrayList3 = obj1;
                         i2 = i4;
                         iterator1 = iterator3;
                         str2 = str7;
                         str5 = str8;
                         uBooleanRef = uBooleanRef1;
                         uArrayList2 = uArrayList5;
                         obj1 = obj10;
                         obj11 = obj8;
                         str6 = str9;
                         obj5 = obj9;
                         i4 = 0;
                      }
                      obj8 = obj;
                      str7 = str2;
                      str8 = str5;
                      uBooleanRef1 = uBooleanRef;
                      obj = b1;
                      obj9 = obj5;
                      obj10 = obj1;
                      iterator3 = iterator1;
                      i4 = i2;
                      uArrayList5 = uArrayList2;
                      str9 = str6;
                      obj18 = null;
                      i2 = 1;
                      obj1 = uArrayList3;
                      int i6 = obj1.isEmpty() ^ i2;
                      if (i6) {
                         obj19 = obj9;
                         obj14 = obj19.mArea;
                         i1 = (obj14 != null)? obj14.size(): 0;
                         if (i1 > 0) {
                            ShareInitResponse$SharePanelElement sharePanelEl1 = obj19.mArea.get(0);
                            sharePanelEl1 = (sharePanelEl1 != null)? sharePanelEl1.mElementType: obj18;
                            str2 = str9;
                            b3 = a.g(sharePanelEl1, str2) ^ i2;
                            if (b3) {
                               uBooleanRef2 = uBooleanRef1;
                               b3 = 1;
                            label_06cc :
                               if (uBooleanRef2.element == null) {
                                  obj13 = obj19.mTitle;
                                  obj20 = (obj13 == null || !obj13.length())? 1: null;
                                  if (obj20 && b3) {
                                     uBooleanRef2.element = i2;
                                     obj20 = obj10;
                                     mTkConfigLis = obj20.mSharePanel;
                                     if (mTkConfigLis != null) {
                                        mTheme = mTkConfigLis.mTitle;
                                     }else {
                                        mTheme = obj18;
                                     }
                                  }else {
                                  label_06ef :
                                     obj20 = obj10;
                                     obj4 = obj19.mTitle;
                                  }
                               }else {
                                  goto label_06ef ;
                               }
                               if (uBooleanRef2.element == null && b3) {
                                  uBooleanRef2.element = i2;
                               }
                               if (obj8 != null && i4 == obj8.b()) {
                                  oi0 = obj8;
                                  obj21 = PatchProxy.applyOneRefs(obj1, oi0, h.class, "3");
                                  patchProxyRe2 = patchProxyRe1;
                                  if (obj21 != patchProxyRe2) {
                                     b3 = obj21.booleanValue();
                                  }else {
                                     a.p(obj1, "ops");
                                     obj21 = obj1.iterator();
                                     while (true) {
                                        if (obj21.hasNext()) {
                                           obj7 = obj21.next();
                                           if (obj7.a().mPrime == null) {
                                              continue ;
                                           }
                                        }else {
                                           obj7 = obj18;
                                        }
                                        obj21 = obj1.iterator();
                                        while (true) {
                                           if (obj21.hasNext()) {
                                              obj23 = obj21.next();
                                              if (!TextUtils.n(obj23.a().mId, oi0.f.mId)) {
                                                 continue ;
                                              }
                                           }else {
                                              obj23 = obj18;
                                           }
                                           if (obj7 != null && obj23 != null) {
                                              oi0.a = obj7;
                                              oi0.b = obj23;
                                              b3 = true;
                                           }else {
                                              b3 = false;
                                           }
                                        }
                                     }
                                  }
                                  if (b3) {
                                     obj21 = oi0;
                                  label_0773 :
                                     ShareInitResponse mSharePanel1 = obj20.mSharePanel;
                                     ShareInitResponse$SharePanelData mShareElemen = (mSharePanel1 != null)? mSharePanel1.mShareElementDecors: obj18;
                                     uoa2 = uoa1;
                                     Object obj22 = PatchProxy.applyTwoRefs(obj1, mShareElemen, obj, uoa2, "14");
                                     if (obj22 != patchProxyRe2) {
                                        obj23 = obj22;
                                     label_079a :
                                        om = obj;
                                        g = obj23;
                                     label_081c :
                                        obj11 = null;
                                     }else if(mShareElemen == null || mShareElemen.isEmpty()){
                                        iterator1 = 1;
                                     }else {
                                        iterator1 = null;
                                     }
                                     if (iterator1) {
                                        obj23 = obj18;
                                        goto label_079a ;
                                     }else {
                                        iterator1 = obj1.iterator();
                                        i = 0;
                                        while (true) {
                                           if (iterator1.hasNext()) {
                                              i0 oi01 = iterator1.next();
                                              obj12 = mShareElemen.iterator();
                                              while (true) {
                                                 if (obj12.hasNext()) {
                                                    Object obj24 = obj12.next();
                                                    b obj25 = obj24;
                                                    om = obj;
                                                    if (a.g(obj25.mId, oi01.a().mId)) {
                                                       obj11 = obj25.mAnchoredOrientation;
                                                       obj11 = (obj11 == null || !obj11.length())? 1: 0;
                                                       if (!obj11) {
                                                          i7 = 1;
                                                       label_07e5 :
                                                          if (i7) {
                                                             obj25 = obj24;
                                                          label_07f2 :
                                                             obj25 = (obj25 != null)? obj25.mAnchoredOrientation: null;
                                                             if (obj25 != null) {
                                                                i7 = obj25.hashCode();
                                                                if (i7 != 0x239807) {
                                                                   if (i7 == 0x4a5c9fc && obj25.equals("RIGHT")) {
                                                                      g = new a(i, true);
                                                                      goto label_081c ;
                                                                   }
                                                                }else if(obj25.equals("LEFT")){
                                                                   g = new a(i, false);
                                                                }else {
                                                                label_081e :
                                                                   obj = null;
                                                                   i = i + 1;
                                                                   obj = om;
                                                                   obj26 = null;
                                                                }
                                                             }
                                                             obj15 = 1;
                                                             goto label_081e ;
                                                          }else {
                                                             obj = om;
                                                             obj15 = 1;
                                                          }
                                                       }
                                                    }
                                                    i7 = 0;
                                                    goto label_07e5 ;
                                                 }else {
                                                    om = obj;
                                                    obj26 = null;
                                                    goto label_07f2 ;
                                                 }
                                              }
                                           }else {
                                              om = obj;
                                              g = null;
                                           }
                                        }
                                     }
                                     obj19 = uArrayList5;
                                     obj19.add(new j0(obj1, mTheme, g, obj21));
                                  }
                               }else {
                                  patchProxyRe2 = patchProxyRe1;
                                  oi0 = obj8;
                               }
                               obj21 = obj18;
                               goto label_0773 ;
                            }
                         }else {
                            str2 = str9;
                            obj26 = 0;
                         }
                         uBooleanRef2 = uBooleanRef1;
                         b3 = 0;
                         goto label_06cc ;
                      }else {
                         om = obj;
                         uBooleanRef2 = uBooleanRef1;
                         obj19 = uArrayList5;
                         obj20 = obj10;
                         uoa2 = uoa1;
                         patchProxyRe2 = patchProxyRe1;
                         oi0 = obj8;
                         str2 = str9;
                         obj27 = null;
                      }
                      uArrayList2 = obj19;
                      str6 = str2;
                      obj1 = obj20;
                      patchProxyRe1 = patchProxyRe2;
                      obj11 = oi0;
                      uoa1 = uoa2;
                      i2 = i3;
                      iterator1 = iterator3;
                      str2 = str7;
                      b1 = om;
                      uBooleanRef = uBooleanRef2;
                      str5 = str8;
                   }
                }
                obj19 = uArrayList2;
             }
             obj = oh;
             goto label_03fe ;
          }
       }
       return obj2;
    }
}
