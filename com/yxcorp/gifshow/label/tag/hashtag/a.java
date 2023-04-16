package com.yxcorp.gifshow.label.tag.hashtag.a;
import com.yxcorp.gifshow.label.tag.hashtag.c;
import java.lang.Object;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper;
import gya.h;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.yxcorp.gifshow.label.tag.span.ColorClickableSpan;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import com.kuaishou.android.model.mix.TagItem;
import gya.a;
import android.view.View$OnClickListener;
import gya.b;
import android.view.View$OnLongClickListener;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Iterator;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment;
import gya.f;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.yxcorp.gifshow.label.tag.span.FakeBoldStyleSpan;
import android.text.style.StyleSpan;
import gw8.a;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import qn9.b;
import java.net.URLEncoder;
import lnc.a1;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import gya.g;
import wh5.c;
import com.gifshow.twitter.widget.Extractor;
import java.util.Collection;
import com.gifshow.twitter.widget.Extractor$Entity;
import android.text.style.CharacterStyle;
import android.text.Spanned;
import com.gifshow.twitter.widget.Extractor$Entity$Type;
import java.lang.StringBuilder;
import hya.b;
import lnc.n3;
import q87.c;
import java.lang.Throwable;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.label.tag.hashtag.a$a;

public class a implements c	// class@001a0f
{
    public QPhoto a;
    public int b;
    public final h c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public a$a o;
    public a$b p;
    public Map q;
    public f r;
    public final PhotoCommonHashTagHelper s;

    public void a(){
       super();
       this.b = 0;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = 0;
       this.n = 0;
       this.s = new PhotoCommonHashTagHelper();
       this.c = new h();
       this.d = 0x7f010109;
       this.e = 0x7f0100e5;
       this.f = 0x7f0100e5;
       this.g = 0x7f010112;
    }
    public void a(List p0,SpannableStringBuilder p1){
    }
    public final List b(String p0,String p1){
       ColorClickableSpan uColorClicka;
       boolean b1;
       Iterator iterator;
       ColorClickableSpan uColorClicka1;
       a uoa = a.class;
       ActivityInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.a(p0);
       boolean b = false;
       String str = 1;
       if (obj != null) {
          uColorClicka = new ColorClickableSpan(this.e(p0, b, obj), p1);
          uColorClicka.c(this.f());
          uColorClicka.d(this.g(obj, p0));
          uColorClicka.g(this.h(obj, p0));
          b1 = true;
       }else {
          PhotoCommonTagInfo photoCommonT = this.s.c(p0);
          if (photoCommonT != null && (!TextUtils.x(photoCommonT.mActionUrl) && this.m != null)) {
             uColorClicka = new ColorClickableSpan(photoCommonT.mActionUrl, p1);
             if (URLUtil.isNetworkUrl(photoCommonT.mActionUrl)) {
                b1 = true;
             label_0098 :
                uColorClicka.c(this.i);
                uColorClicka.d(this.i(p0));
                uColorClicka.g(this.k);
             }
          }else {
             TagItem tagItem2 = this.c.c(p0);
             if (tagItem2 != null) {
                uColorClicka1 = new ColorClickableSpan(this.d(tagItem2.mName, tagItem2.mRich), p1);
             }else {
                tagItem2 = this.c.b(p0);
                if (tagItem2 != null) {
                   uColorClicka1 = new ColorClickableSpan(this.d(tagItem2.mName, tagItem2.mRich), p1);
                }else {
                   uColorClicka = new ColorClickableSpan(this.d(p0, str), p1);
                }
             }
             uColorClicka = uColorClicka1;
          }
          b1 = false;
          goto label_0098 ;
       }
       uColorClicka.e(new a(this, uColorClicka, b1, p0));
       uColorClicka.f(new b(this, p0, uColorClicka));
       if (this.q != null) {
          this.q.put(p0, uColorClicka);
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(uColorClicka);
       ColorClickableSpan c = uColorClicka.c;
       ColorClickableSpan d = uColorClicka.d;
       ColorClickableSpan e = uColorClicka.e;
       boolean b2 = (obj != null)? true: false;
       this.c(uArrayList, c, d, e, b2, p0);
       if (this.c.a(p0) != null) {
          b = true;
       }
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(b), this, uoa, "13") && this.r != null)) {
          TagItem tagItem = null;
          a ta = this.a;
          if (ta != null) {
             iterator = ta.getTags().iterator();
             while (iterator.hasNext()) {
                TagItem tagItem1 = iterator.next();
                if (p0.equals(tagItem1.mName)) {
                   tagItem = tagItem1;
                }
             }
          }
          String str1 = "";
          if (tagItem != null) {
             if (TextUtils.x(tagItem.mTag)) {
                if (!TextUtils.x(tagItem.mId)) {
                   str1 = tagItem.mId;
                }
             }else {
                str1 = tagItem.mTag;
             }
          }
          ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
          tagPackage.identity = str1;
          tagPackage.name = p0;
          tagPackage.type = 2;
          i3 oi3 = i3.f();
          oi3.c("highlight_judge", Integer.valueOf(b));
          if (this.r.a() != null) {
             String str2 = "tag_area";
             str1 = (this.r.a().getEntity().mIsUserInfo != null)? "COMMENT_PANEL": "COMMENT_PANEL_MACHINE_RECO";
             oi3.d(str2, str1);
          }
          tagPackage.params = oi3.e();
          a tr = this.r;
          _monitor_enter(tr);
          if (PatchProxy.applyVoidOneRefs(tagPackage, tr, f.class, "1")) {
             _monitor_exit(tr);
          }else {
             iterator = tr.b.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if ((iterator.next().name).equals(tagPackage.name)) {
                      _monitor_exit(tr);
                      break ;
                   }
                }else {
                   tr.b.add(tagPackage);
                   _monitor_exit(tr);
                   break ;
                }
             }
          }
       }
       return uArrayList;
    }
    public void c(List p0,int p1,int p2,int p3,boolean p4,String p5){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
             return;
          }
       }
       a th = this.h;
       if (th != null) {
          if (th == 1) {
             p0.add(new FakeBoldStyleSpan(0));
          }else {
             p0.add(new StyleSpan(this.h));
          }
       }
       return;
    }
    public String d(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.e(p0, p1, null);
    }
    public String e(String p0,boolean p1,ActivityInfo p2){
       Uri obj;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p2 != null) {
          a ta = this.a;
          a tb = this.b;
          if (PatchProxy.isSupport(a.class)) {
             obj = PatchProxy.applyThreeRefs(p2, ta, Integer.valueOf(tb), null, a.class, "2");
             if (obj != patchProxyRe) {
             label_0096 :
                return obj.toString();
             }
          }
          Uri$Builder uBuilder = w0.f(p2.mUrl).buildUpon();
          if (ta != null) {
             uBuilder.appendQueryParameter("photo_id", TextUtils.I(ta.getPhotoId()));
             uBuilder.appendQueryParameter("exp_tag", TextUtils.I(ta.getExpTag()));
             uBuilder.appendQueryParameter("server_exp_tag", TextUtils.I(ta.getServerExpTag()));
          }
          uBuilder.appendQueryParameter("content_tag_id", TextUtils.I(p2.mTagId));
          uBuilder.appendQueryParameter("content_tag_type", Integer.toString(p2.mTagType));
          uBuilder.appendQueryParameter("tagSource", Integer.toString(tb));
          obj = uBuilder.build();
          goto label_0096 ;
       }else {
          int i = 6;
          if (this.a == null) {
             objArray = new Object[i];
             objArray[0] = URLEncoder.encode(p0, "UTF-8");
             objArray[1] = Boolean.valueOf(p1);
             objArray[2] = "";
             objArray[3] = Integer.valueOf(this.b);
             objArray[4] = "";
             objArray[5] = "";
             return String.format(b.b, objArray);
          }else {
             objArray = new Object[i];
             objArray[0] = URLEncoder.encode(p0, "UTF-8");
             objArray[1] = Boolean.valueOf(p1);
             objArray[2] = TextUtils.I(this.a.getListLoadSequenceID());
             objArray[3] = Integer.valueOf(this.b);
             objArray[4] = this.a.getPhotoId();
             objArray[5] = this.a.getExpTag();
             return String.format(b.b, objArray);
          }
       }
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.a(0x7f06074b);
    }
    public int g(ActivityInfo p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       p0 = p0.mColor;
       if (p0 == null) {
          int i = a1.a(R.color.arg_RES_7f0607c5);
       }
       return p0;
    }
    public int h(ActivityInfo p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "8");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       p0 = p0.mPressedColor;
       if (p0 == null) {
          int i = a1.a(R.color.arg_RES_7f06072a);
       }
       return p0;
    }
    public int i(String p0){
       return this.j;
    }
    public Map j(SpannableStringBuilder p0){
       ArrayList obj2;
       Extractor$Entity obj3;
       int i;
       boolean i1;
       int i2;
       int i3;
       int i4;
       int i5;
       Extractor$Entity uEntity2;
       int i6;
       g b;
       Iterator iterator2;
       Extractor$Entity uEntity4;
       Map map = this;
       Object obj = p0;
       String str = "12";
       a obj1 = PatchProxy.applyOneRefs(obj, map, a.class, str);
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       map.q = Maps.u();
       g og = new g();
       og.b = map.n;
       og.d = map.l;
       og.c = map;
       if (!PatchProxy.applyVoidOneRefs(obj, og, g.class, "2") && c.g()) {
          List list = PatchProxy.applyOneRefs(obj, og, g.class, "1");
          if (list != PatchProxyResult.class) {
          }else {
             list = og.a.a(p0.toString());
             obj2 = new ArrayList(list);
             iterator2 = list.iterator();
             while (iterator2.hasNext()) {
                uEntity4 = iterator2.next();
                CharacterStyle[] spans = obj.getSpans(uEntity4.b().intValue(), uEntity4.a().intValue(), CharacterStyle.class);
                if (spans != null && spans.length > 0) {
                   obj2.remove(uEntity4);
                }
             }
             list = og.a.a(p0.toString());
          }
          obj2 = list;
          String str1 = " ";
          ColorClickableSpan uColorClicka = 1;
          if (og.d != null) {
             if (!PatchProxy.applyVoidTwoRefs(obj, obj2, og, g.class, str)) {
                i2 = 0;
                i3 = 0;
                while (i2 < obj2.size()) {
                   Extractor$Entity uEntity1 = obj2.get(i2);
                   i4 = 12;
                   if ((uEntity1.d()).length() > i4) {
                      i1 = uEntity1.b().intValue() + i4;
                      i1 = i1 + i3;
                      i1 = i1 + uColorClicka;
                      i4 = uEntity1.a().intValue() + i3;
                      if (i4 <= p0.length()) {
                         i5 = (i4 == p0.length())? 0: 1;
                         i4 = i4 + i5;
                         obj.replace(i1, i4, "... ");
                         i5 = uEntity1.b().intValue() + i3;
                         i3 = i5 + 12;
                         i3 = i3 + 4;
                         uEntity2 = new Extractor$Entity(i5, i3, uEntity1.d(), uEntity1.c());
                         i3 = i3 - uEntity1.a().intValue();
                      }
                   }else {
                      i5 = uEntity1.b().intValue() + i3;
                      i6 = uEntity1.a().intValue() + i3;
                      if (PatchProxy.isSupport(g.class)) {
                         Object obj4 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i6), null, g.class, "13");
                         if (obj4 != PatchProxyResult.class) {
                            i1 = obj4.booleanValue();
                         }else if(i6 >= p0.length()){
                            String str5 = 32;
                            if (obj.charAt(i6) != str5 && obj.charAt(i6) != str5) {
                               i1 = false;
                            }
                         }
                         i1 = true;
                      }else {
                         goto label_0138 ;
                      }
                      if (!i1) {
                         i6 = i6 + 1;
                         i3 = i3 + 1;
                         obj.insert(i6, str1);
                      }
                      uEntity2 = new Extractor$Entity(i5, i6, uEntity1.d(), uEntity1.c());
                   }
                   uEntity1 = uEntity2;
                label_0168 :
                   obj2.set(i2, uEntity1);
                   i2 = i2 + 1;
                   uColorClicka = 1;
                }
             }
          }else if(PatchProxy.applyVoidTwoRefs(obj, obj2, og, g.class, "4")){
             b = og.b;
             if (b == true) {
                iterator2 = obj2.iterator();
                while (iterator2.hasNext()) {
                   Extractor$Entity uEntity3 = iterator2.next();
                   if (uEntity3.a().intValue() < p0.length() && g.a(obj, uEntity3.a().intValue())) {
                      i3 = uEntity3.a().intValue() + 1;
                      obj.replace(uEntity3.a().intValue(), i3, str1);
                   }
                }
             }else if(b != 2 || PatchProxy.applyVoidTwoRefs(obj, obj2, og, g.class, "5")){
                i3 = 0;
                for (i2 = 0; i2 < obj2.size(); i2 = i2 + 1) {
                   uEntity4 = obj2.get(i2);
                   i5 = uEntity4.a().intValue() + i3;
                   if (i5 < p0.length()) {
                      i5 = uEntity4.a().intValue() + i3;
                      if (!g.a(obj, i5)) {
                         i6 = uEntity4.b().intValue() + i3;
                         i = uEntity4.a().intValue() + i3;
                         i = i + 1;
                         obj3 = new Extractor$Entity(i6, i, uEntity4.d(), uEntity4.c());
                         i6 = uEntity4.a().intValue() + i3;
                         i6 = i6 - 1;
                         i = uEntity4.a().intValue() + i3;
                         i4 = uEntity4.a().intValue() + i3;
                         i4 = i4 - 1;
                         obj.replace(i6, i, obj.charAt(i4)+"#");
                         i3 = i3 + 1;
                      }else {
                      label_0253 :
                         i5 = uEntity4.a().intValue() + i3;
                         if (i5 == p0.length()) {
                            i5 = uEntity4.a().intValue() + i3;
                            i5 = i5 - 1;
                            if (!g.a(obj, i5)) {
                               obj.append("#");
                               i6 = uEntity4.b().intValue() + i3;
                               i = uEntity4.a().intValue() + i3;
                               i = i + 1;
                               obj3 = new Extractor$Entity(i6, i, uEntity4.d(), uEntity4.c());
                            }
                         }
                         Map map1 = null;
                      }
                   }else {
                      goto label_0253 ;
                   }
                   if (obj3 == null) {
                      i6 = uEntity4.b().intValue() + i3;
                      i = uEntity4.a().intValue() + i3;
                      obj3 = new Extractor$Entity(i6, i, uEntity4.d(), uEntity4.c());
                   }
                   obj2.set(i2, obj3);
                }
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(obj, obj2, og, g.class, "3")) {
             Iterator iterator = obj2.iterator();
             while (iterator.hasNext()) {
                Extractor$Entity uEntity = iterator.next();
                if (obj.getSpans(uEntity.b().intValue(), uEntity.a().intValue(), ColorClickableSpan.class).length > 0) {
                   continue ;
                }else {
                   str1 = uEntity.d();
                   String str2 = str1.trim();
                   String str3 = "";
                   String str4 = PatchProxy.applyTwoRefs(str2, str3, null, g.class, "7");
                   if (str4 != PatchProxyResult.class) {
                   }else {
                      str4 = (str2.replace("#", str3)).replace("££", str3);
                   }
                   if (TextUtils.x(str4)) {
                   }else {
                      Iterator iterator1 = og.c.b(str4, str1).iterator();
                      while (iterator1.hasNext()) {
                         obj3 = iterator1.next();
                         if (obj3 == null) {
                            continue ;
                         }else {
                            i = 33;
                            if (obj3 instanceof b) {
                               i1 = uEntity.b().intValue() + 1;
                               obj.setSpan(obj3, uEntity.b().intValue(), i1, i);
                            }else if(uEntity.a().intValue() < p0.length() && g.a(obj, uEntity.a().intValue())){
                               i1 = uEntity.a().intValue() + 1;
                               obj.setSpan(obj3, uEntity.b().intValue(), i1, i);
                               continue ;
                            }else {
                               obj.setSpan(obj3, uEntity.b().intValue(), uEntity.a().intValue(), i);
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
             og.c.a(obj2, obj);
          }
       }
    label_03e2 :
       obj1 = map.q;
       map.q = null;
       return obj1;
    }
    public a k(int p0){
       this.n = p0;
       return this;
    }
    public a l(QPhoto p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a = p0;
       this.b = p1;
       this.c.e(p0);
       this.s.g(p0.mEntity);
       return this;
    }
    public a m(boolean p0){
       this.l = p0;
       return this;
    }
    public a n(a$a p0){
       this.o = p0;
       return this;
    }
    public final a o(int p0){
       this.j = p0;
       return this;
    }
    public final a p(int p0){
       this.h = p0;
       return this;
    }
    public final a q(int p0){
       this.k = p0;
       return this;
    }
}
