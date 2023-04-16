package com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.TagItem;
import java.util.List;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import qn9.b;
import java.net.URLEncoder;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$c;
import android.text.style.URLSpan;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$1;
import com.yxcorp.gifshow.util.ColorURLSpan;
import com.kuaishou.webkit.URLUtil;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import wkd.b;
import ip.b;
import com.kuaishou.android.model.mix.PhotoCommonTags;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.label.tag.span.FakeBoldStyleSpan;
import android.text.style.StyleSpan;
import lnc.n3;
import java.lang.Exception;
import q87.c;
import hya.b;
import android.content.Context;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;
import gya.e;
import com.kuaishou.android.model.mix.PhotoMeta;

public class PhotoCommonHashTagHelper	// class@001a0c
{
    public Context a;
    public boolean b;
    public List c;
    public int d;
    public int e;
    public BaseFeed f;
    public int g;
    public int h;
    public View$OnClickListener i;
    public boolean j;
    public PhotoCommonHashTagHelper$a k;
    public PhotoCommonTags l;
    public int m;

    public void PhotoCommonHashTagHelper(){
       super();
       this.b = true;
       this.g = 0;
       this.h = 0;
       this.m = 0;
    }
    public static String f(String p0,CharSequence p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PhotoCommonHashTagHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (p0.replace("#", p1)).replace("££", p1);
    }
    public String a(String p0){
       TagItem tagItem1;
       Object[] objArray;
       PhotoCommonHashTagHelper obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonHashTagHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (this.c != null) {
          TagItem tagItem = new TagItem();
          tagItem.mTag = p0;
          int i = this.c.indexOf(tagItem);
          if (i != -1) {
             tagItem1 = this.c.get(i);
          }
       }
       boolean b = (tagItem1 == null || tagItem1.mRich != null)? true: false;
       PhotoCommonHashTagHelper tf = this.f;
       int i1 = 6;
       if (tf != null) {
          CommonMeta uCommonMeta = tf.a(CommonMeta.class);
          objArray = new Object[i1];
          objArray[0] = URLEncoder.encode(p0, "UTF-8");
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = TextUtils.I(uCommonMeta.mListLoadSequenceID);
          objArray[3] = Integer.valueOf(this.h);
          objArray[4] = this.f.getId();
          objArray[5] = uCommonMeta.mExpTag;
          p0 = String.format(b.b, objArray);
       }else {
          objArray = new Object[i1];
          objArray[0] = URLEncoder.encode(p0, "UTF-8");
          objArray[1] = Boolean.valueOf(b);
          objArray[2] = "";
          objArray[3] = Integer.valueOf(this.h);
          objArray[4] = "";
          objArray[5] = "";
          p0 = String.format(b.b, objArray);
       }
       return p0;
    }
    public URLSpan b(String p0,String p1,String p2,PhotoCommonHashTagHelper$c p3){
       PhotoCommonHashTagHelper$1 obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PhotoCommonHashTagHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p3 != null) {
          return p3.a(p0);
       }
       obj = new PhotoCommonHashTagHelper$1(this, p1, p2, p0, p2);
       p3.m(true);
       p3.g(this.d);
       p3.l(this.e);
       p3.k(URLUtil.isNetworkUrl(p1));
       p3.i(this.i);
       p3.f(this.b);
       p3.d(R.anim.arg_RES_7f010109, 0x7f0100e5);
       p3.t = true;
       p3.c(R.anim.arg_RES_7f0100e5, 0x7f010112);
       return p3;
    }
    public PhotoCommonTagInfo c(String p0){
       PhotoCommonHashTagHelper obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonHashTagHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f != null && b.a(-570058679).m(this.f, true, true) < 0) {
          obj = this.l;
          if (obj != null) {
             PhotoCommonTags mPhotoCommon = obj.mPhotoCommonTagsStyleInfo;
             if (mPhotoCommon != null && !q.f(mPhotoCommon.mMatchWords)) {
                Iterator iterator = this.l.mPhotoCommonTagsStyleInfo.mMatchWords.iterator();
                while (iterator.hasNext()) {
                   PhotoCommonTagInfo photoCommonT = iterator.next();
                   if (TextUtils.n(photoCommonT.mKeyWord, p0)) {
                      return photoCommonT;
                   }
                }
             }
          }
       }
       return null;
    }
    public void d(SpannableStringBuilder p0,PhotoCommonHashTagHelper$c p1,TextView p2){
       int i;
       PhotoCommonTagInfo mKeyWord;
       String str;
       URLSpan uRLSpan;
       int i1;
       PhotoCommonTagInfo mActionUrl;
       if (PatchProxy.applyVoidThreeRefs(p0, null, null, this, PhotoCommonHashTagHelper.class, "3")) {
          return;
       }
       if (this.f != null && b.a(-570058679).m(this.f, true, true) < 0) {
          try{
             PhotoCommonHashTagHelper tl = this.l;
             if (tl == null || (tl.mPhotoCommonTagsStyleInfo != null && !TextUtils.x(p0))) {
                i = 0;
                PhotoCommonTagsStyleInfo mFrontWord = this.l.mPhotoCommonTagsStyleInfo.mFrontWord;
                if (mFrontWord != null) {
                   p0.replace(i, i, "#"+mFrontWord.mKeyWord+" ");
                   mKeyWord = mFrontWord.mKeyWord;
                   str = (TextUtils.x(mFrontWord.mActionUrl))? this.a(mFrontWord.mKeyWord): mFrontWord.mActionUrl;
                   uRLSpan = this.b(mKeyWord, str, mFrontWord.mKeyWord, null);
                   i1 = (mFrontWord.mKeyWord).length() + true;
                   if (uRLSpan != null) {
                      p0.setSpan(uRLSpan, i, i1, 33);
                   }
                   if (this.g == true) {
                      p0.setSpan(new FakeBoldStyleSpan(i), i, i1, 33);
                   }else {
                      p0.setSpan(new StyleSpan(this.g), i, i1, 33);
                   }
                   if (this.f != null) {
                      this.e(p0, mFrontWord, 0, 1, null);
                   }
                }
                mFrontWord = this.l.mPhotoCommonTagsStyleInfo.mTailWord;
                if (mFrontWord != null) {
                   p0.replace(p0.length(), p0.length(), " #"+mFrontWord.mKeyWord);
                   mKeyWord = mFrontWord.mKeyWord;
                   str = (TextUtils.x(mFrontWord.mActionUrl))? this.a(mFrontWord.mKeyWord): mFrontWord.mActionUrl;
                   uRLSpan = this.b(mKeyWord, str, mFrontWord.mKeyWord, null);
                   int i2 = (p0.length() - (mFrontWord.mKeyWord).length()) - 1;
                   i1 = p0.length();
                   if (uRLSpan != null) {
                      p0.setSpan(uRLSpan, i2, i1, 33);
                   }
                   if (this.g == true) {
                      p0.setSpan(new FakeBoldStyleSpan(i), i2, i1, 33);
                   }else {
                      p0.setSpan(new StyleSpan(this.g), i2, i1, 33);
                   }
                   if (this.f != null) {
                      this.e(p0, mFrontWord, i2, (i2 + 1), null);
                   }
                }
             }
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[i];
             n3.C().w("HashTag", e0.getMessage(), objArray);
          }
       }
    }
    public void e(SpannableStringBuilder p0,PhotoCommonTagInfo p1,int p2,int p3,TextView p4){
       PhotoCommonHashTagHelper photoCommonH = PhotoCommonHashTagHelper.class;
       if (PatchProxy.isSupport(photoCommonH)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, photoCommonH, "2")) {
             return;
          }
       }
       if (p1.mIconInfo != null && this.f != null) {
          b uob = new b(this.a, p1.mIconInfo);
          uob.h = new e(this, p0, p4);
          p0.setSpan(uob, p2, p3, 33);
       }
       return;
    }
    public void g(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoCommonHashTagHelper.class, "7")) {
          return;
       }
       this.f = p0;
       PhotoMeta photoMeta = p0.a(PhotoMeta.class);
       if (photoMeta != null) {
          this.l = photoMeta.mPhotoCommonTags;
       }
       return;
    }
}
