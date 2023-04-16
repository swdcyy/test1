package com.kwai.user.base.RichTextMetaExt;
import java.lang.Object;
import com.kwai.framework.model.user.RichTextMeta$Param;
import ok.h;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import ync.a;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableString;
import com.kwai.user.base.RichTextMetaExt$1;
import android.text.TextPaint;
import android.text.SpannableStringBuilder;
import rnc.i;
import android.text.StaticLayout;
import java.lang.Math;
import android.text.style.ReplacementSpan;
import com.kwai.framework.model.user.RichTextMeta;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import zu7.a;
import java.util.ArrayList;
import brd.a0;
import com.google.common.collect.Lists;
import lu7.c;
import java.util.Comparator;
import java.util.Collections;

public final class RichTextMetaExt	// class@001972
{

    public void RichTextMetaExt(){
       super();
    }
    public static CharSequence a(RichTextMeta$Param p0,h p1,int p2){
       if (PatchProxy.isSupport(RichTextMetaExt.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, null, Integer.valueOf(p2), null, RichTextMetaExt.class, "19");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       return RichTextMetaExt.c(p0.mTextValue, p0.mLinkUrl, p0, null, p2);
    }
    public static CharSequence b(String p0,String p1,RichTextMeta$Param p2,h p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, RichTextMetaExt.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RichTextMetaExt.c(p0, p1, p2, p3, a.d(a.b()));
    }
    public static CharSequence c(String p0,String p1,RichTextMeta$Param p2,h p3,int p4){
       SpannableString obj;
       RichTextMetaExt richTextMeta = RichTextMetaExt.class;
       if (PatchProxy.isSupport(richTextMeta)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, richTextMeta, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p1)) {
          return TextUtils.I(p0);
       }else {
          obj = new SpannableString(TextUtils.I(p0));
          obj.setSpan(new RichTextMetaExt$1(p1, p4, p3, p2), 0, obj.length(), 17);
          return obj;
       }
    }
    public static String d(TextPaint p0,int p1,String p2,String p3,String p4){
       String obj;
       int i;
       RichTextMetaExt richTextMeta = RichTextMetaExt.class;
       if (PatchProxy.isSupport(richTextMeta)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, richTextMeta, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p2.replace(p3, p4);
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(obj);
       i.i(spannableStr);
       float desiredWidth = StaticLayout.getDesiredWidth(spannableStr, p0);
       float f = (float)p1;
       if (desiredWidth - f <= 0) {
          return obj;
       }else {
          SpannableStringBuilder spannableStr1 = new SpannableStringBuilder(p4);
          i.i(spannableStr1);
          desiredWidth = Math.max(0, (StaticLayout.getDesiredWidth(spannableStr1, p0) - (desiredWidth - f)));
          if (desiredWidth <= 0) {
             return p2.replace(p3, "...");
          }else {
             desiredWidth = desiredWidth - StaticLayout.getDesiredWidth("...", p0);
             while (true) {
                f = p4.length() - 1;
                ReplacementSpan[] spans = spannableStr1.getSpans(f, p4.length(), ReplacementSpan.class);
                i = spannableStr1.length() - 1;
                if (spans.length > 0) {
                   int len = spans.length;
                   for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                      i = Math.min(spannableStr1.getSpanStart(spans[i1]), i);
                   }
                }else {
                   spans = i - 1;
                   if (i.b(p4.subSequence(spans, p4.length()))) {
                      i = spans;
                   }
                }
                spannableStr1.delete(i, spannableStr1.length());
                if (StaticLayout.getDesiredWidth(spannableStr1, p0) - desiredWidth <= 0) {
                   if (spannableStr1.length() < p4.length()) {
                      spannableStr1.append("...");
                      break ;
                   }
                   break ;
                }
             }
             return p2.replace(p3, spannableStr1.toString());
          }
       }
    }
    public static String e(RichTextMeta p0){
       boolean b;
       RichTextMeta obj = PatchProxy.applyOneRefs(p0, null, RichTextMetaExt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (!TextUtils.x(p0.mCutRawText)) {
          return p0.mCutRawText;
       }
       if (TextUtils.x(p0.mRawText)) {
          return null;
       }
       if (q.f(p0.mParamList)) {
          return null;
       }
       obj = p0.mRawText;
       Iterator iterator = p0.mParamList.iterator();
       StringBuilder str = null;
       while (iterator.hasNext()) {
          RichTextMeta$Param param = iterator.next();
          String str1 = RichTextMetaExt.i(param);
          Object obj1 = PatchProxy.applyOneRefs(param, null, RichTextMetaExt.class, "6");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(param.mTextType == 2 && (param.mTruncationThreshold > null && (!TextUtils.x(RichTextMetaExt.i(param)) && (param.mTruncationThreshold < (RichTextMetaExt.i(param)).length() && !TextUtils.x(param.mKeyName))))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             str1 = str1.substring(0, param.mTruncationThreshold)+"бн";
             str = 1;
          }
          p0.mRealShowName = str1;
          String str2 = obj.replace(param.mKeyName, str1);
       }
       if (str == null) {
          return null;
       }
       p0.mCutRawText = obj;
       return obj;
    }
    public static String f(RichTextMeta p0,int p1){
       String obj;
       RichTextMetaExt richTextMeta = RichTextMetaExt.class;
       if (PatchProxy.isSupport(richTextMeta)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, richTextMeta, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }else if(!TextUtils.x(p0.mCutRawText)){
          return p0.mCutRawText;
       }else if(TextUtils.x(p0.mRawText)){
          return obj;
       }else if(q.f(p0.mParamList)){
          return TextUtils.I(p0.mRawText);
       }else {
          RichTextMeta mRawText = p0.mRawText;
          Iterator iterator = p0.mParamList.iterator();
          while (iterator.hasNext()) {
             RichTextMeta$Param param = iterator.next();
             String str = RichTextMetaExt.i(param);
             if (param.mTextType == 2 && (p1 > 0 && (!TextUtils.x(RichTextMetaExt.i(param)) && (p1 < (RichTextMetaExt.i(param)).length() && !TextUtils.x(param.mKeyName))))) {
                str = str.substring(0, p1)+"бн";
             }
          label_0093 :
             p0.mRealShowName = str;
             mRawText = mRawText.replace(param.mKeyName, str);
          }
          p0.mCutRawText = mRawText;
          return mRawText;
       }
    }
    public static String g(RichTextMeta p0){
       RichTextMeta obj = PatchProxy.applyOneRefs(p0, null, RichTextMetaExt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       if (!TextUtils.x(p0.mTotalRawText)) {
          return p0.mTotalRawText;
       }
       if (q.f(p0.mParamList)) {
          return TextUtils.I(p0.mRawText);
       }
       obj = p0.mRawText;
       Iterator iterator = p0.mParamList.iterator();
       while (iterator.hasNext()) {
          RichTextMeta$Param param = iterator.next();
          if (!TextUtils.x(param.mKeyName)) {
             String str = obj.replace(param.mKeyName, RichTextMetaExt.i(param));
          }
       }
       p0.mTotalRawText = obj;
       return obj;
    }
    public static String h(RichTextMeta p0,int p1,int p2){
       RichTextMeta obj;
       RichTextMeta$Param param;
       String str;
       if (PatchProxy.isSupport(RichTextMetaExt.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, RichTextMetaExt.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return "";
       }else if(!TextUtils.x(p0.mTotalRawText)){
          return p0.mTotalRawText;
       }else if(q.f(p0.mParamList)){
          return TextUtils.I(p0.mRawText);
       }else {
          obj = p0.mRawText;
          Iterator iterator = p0.mParamList.iterator();
          while (iterator.hasNext()) {
             param = iterator.next();
             if (!TextUtils.x(param.mKeyName) && param.mTextType == 1) {
                str = obj.replace(param.mKeyName, TextUtils.I(param.mTextValue));
             }
          }
          iterator = p0.mParamList.iterator();
          while (iterator.hasNext()) {
             param = iterator.next();
             if (!TextUtils.x(param.mKeyName)) {
                String str1 = RichTextMetaExt.i(param);
                String str2 = obj.replace(param.mKeyName, str1);
                if (str2.length() > p1 && str1.length() > p2) {
                   str2 = obj.replace(param.mKeyName, str1.substring(0, p2)+"бн");
                }
                str = str2;
             }
          }
          p0.mTotalRawText = obj;
          return obj;
       }
    }
    public static String i(RichTextMeta$Param p0){
       RichTextMeta$Param obj = PatchProxy.applyOneRefs(p0, null, RichTextMetaExt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mTextType;
       if (obj == 1) {
          return TextUtils.I(p0.mTextValue);
       }
       String str = "";
       if (obj == 2) {
          if (p0.mEnableAlias != null) {
             str = d.a(-2117944241).ZM(String.valueOf(p0.mUserId));
          }
          if (TextUtils.x(str)) {
             str = TextUtils.k(p0.mThirdPartyName);
          }
          if (TextUtils.x(str)) {
             str = TextUtils.k(p0.mTextValue);
          }
       }
       return str;
    }
    public static ArrayList j(RichTextMeta p0){
       ArrayList uArrayList = null;
       RichTextMeta obj = PatchProxy.applyOneRefs(p0, uArrayList, RichTextMetaExt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return uArrayList;
       }
       if (TextUtils.x(p0.mRawText)) {
          return uArrayList;
       }
       if (q.f(p0.mParamList)) {
          return uArrayList;
       }
       obj = p0.mRawText;
       if (p0.mParamList.size() == 1) {
          RichTextMeta$Param param = p0.mParamList.get(0);
          if (param.mTextType == 2 && obj.startsWith(param.mKeyName)) {
             uArrayList = new ArrayList();
             uArrayList.add(RichTextMetaExt.i(param));
             uArrayList.add(obj.replace(param.mKeyName, ""));
          }
       }
       return uArrayList;
    }
    public static a0 k(RichTextMeta p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, RichTextMetaExt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || TextUtils.x(p0.mRawText)) {
          return a0.B(Lists.b());
       }
       if (q.f(p0.mParamList)) {
          return a0.B(Lists.b());
       }
       obj = new ArrayList();
       RichTextMeta mRawText = p0.mRawText;
       Collections.sort(p0.mParamList, new c(p0));
       int i = 0;
       int i1 = 0;
       while (i1 < p0.mParamList.size()) {
          RichTextMeta$Param param = p0.mParamList.get(i1);
          if (param != null && !TextUtils.x(param.mKeyName)) {
             int i2 = mRawText.indexOf(param.mKeyName);
             if (i2 >= 0) {
                if (!i2) {
                   obj.add(param);
                }
                if (i2 > 0) {
                   RichTextMeta$Param param1 = new RichTextMeta$Param();
                   param1.mTextValue = mRawText.substring(i, i2);
                   obj.add(param1);
                   obj.add(param);
                }
                i2 = i2 + (param.mKeyName).length();
                mRawText = (i2 > 0 && mRawText.length() > i2)? mRawText.substring(i2): "";
                int i3 = p0.mParamList.size() - 1;
                if (i1 == i3) {
                   param = new RichTextMeta$Param();
                   param.mTextValue = mRawText;
                   obj.add(param);
                }
             }
          }
          i1 = i1 + 1;
       }
       if (q.f(obj)) {
          return a0.B(Lists.b());
       }
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          RichTextMeta$Param param2 = iterator.next();
          if (!TextUtils.x(param2.mThirdPartyName)) {
             param2.mTextValue = param2.mThirdPartyName;
          }else if(param2.mEnableAlias != null){
             param2.mTextValue = TextUtils.i(d.a(-2117944241).ZM(String.valueOf(param2.mUserId)), param2.mTextValue);
          }
       }
       return a0.B(obj);
    }
}
