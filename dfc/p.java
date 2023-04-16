package dfc.p;
import java.lang.Object;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.user.RichTextMeta$Param;
import android.text.TextPaint;
import lnc.a1;
import java.util.Collections;
import android.text.Layout;
import java.lang.Boolean;
import com.kwai.user.base.RichTextMetaExt;
import java.lang.Character;
import java.lang.StringBuilder;
import rnc.i;

public final class p	// class@0021ae
{

    public void p(){
       super();
    }
    public static String a(RichTextMeta p0,int p1){
       String obj1;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       String obj = null;
       if (PatchProxy.isSupport(op)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, op, "2");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = "";
       if (p0 == null) {
          return obj1;
       }else if(!p1){
          p0.mCutRawText = " ";
          return " ";
       }else if(!TextUtils.x(p0.mCutRawText)){
          return p0.mCutRawText;
       }else if(TextUtils.x(p0.mRawText)){
          return obj1;
       }else if(q.f(p0.mParamList)){
          return TextUtils.I(p0.mRawText);
       }else {
          ArrayList uArrayList = Lists.b();
          ArrayList uArrayList1 = Lists.b();
          ArrayList uArrayList2 = Lists.b();
          Iterator iterator = p0.mParamList.iterator();
          while (iterator.hasNext()) {
             RichTextMeta$Param param = iterator.next();
             RichTextMeta$Param mTextType = param.mTextType;
             if (mTextType == 2) {
                uArrayList1.add(param);
             }else if(mTextType == true){
                uArrayList.add(param);
             }else {
                uArrayList2.add(param);
             }
          }
          RichTextMeta mRawText = p0.mRawText;
          TextPaint textPaint = new TextPaint();
          textPaint.setTextSize((float)a1.e(14.00f));
          if (uArrayList2.size() > 0) {
             mRawText = p.c(p0.mRawText, uArrayList2, true);
          }
          if (!uArrayList1.size()) {
             str = p.c(mRawText, uArrayList, true);
             p0.mCutRawText = str;
             return str;
          }else if(uArrayList1.size() > 1){
             obj = PatchProxy.applyTwoRefs(mRawText, uArrayList1, obj, op, "5");
             if (obj != patchProxyRe) {
                mRawText = obj;
             }else {
                RichTextMeta richTextMeta = mRawText;
                for (int i = 1; i < uArrayList1.size(); i = i + 1) {
                   richTextMeta = mRawText.replace(uArrayList1.get(i).mKeyName, obj1);
                }
                mRawText = richTextMeta;
             }
          }
          List list = Collections.singletonList(uArrayList1.get(0));
          if (!uArrayList.size()) {
             String str1 = p.b(mRawText, list, 0);
             if (Layout.getDesiredWidth(str1, textPaint) - (float)p1 >= 0) {
                str1 = p.b(mRawText, list, true);
             }
             p0.mCutRawText = str1;
             return str1;
          }else {
             obj = p.c(p.b(mRawText, list, 0), uArrayList, true);
             float f = (float)p1;
             if (Layout.getDesiredWidth(obj, textPaint) - f < 0) {
                p0.mCutRawText = obj;
                return obj;
             }else {
                String str2 = p.b(mRawText, list, true);
                if (PatchProxy.isSupport(op)) {
                   Object obj2 = PatchProxy.applyFourRefs(str2, textPaint, Integer.valueOf(p1), uArrayList, null, p.class, "4");
                   if (obj2 != patchProxyRe) {
                      str2 = obj2;
                   }else if(q.f(uArrayList)){
                      str = p.c(str2, uArrayList, true);
                      if (Layout.getDesiredWidth(str, textPaint) - f < 0) {
                         str2 = str;
                      }else {
                         str = str2.indexOf(uArrayList.get(0).mKeyName);
                         if (str == -1) {
                            str2 = p.c(str2, uArrayList, true);
                         }else {
                            str = str2.substring(str);
                            str2 = (TextUtils.x(str))? p.c(str2, uArrayList, true): p.c(str, uArrayList, true);
                         }
                      }
                   }
                }else {
                   goto label_0129 ;
                }
                p0.mCutRawText = str2;
                return str2;
             }
          }
       }
    }
    public static String b(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, p.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(p1)) {
          return p0;
       }else {
          return p.c(p0, Collections.singletonList(p1.get(0)), p2);
       }
    }
    public static String c(String p0,List p1,boolean p2){
       RichTextMeta$Param obj;
       int i;
       if (PatchProxy.isSupport(p.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, p.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          String str = (obj.mTextType == 2)? RichTextMetaExt.i(obj): obj.mTextValue;
          if (p2) {
             RichTextMeta$Param mTruncationT = obj.mTruncationThreshold;
             if (PatchProxy.isSupport(p.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(str, Integer.valueOf(mTruncationT), null, p.class, "7");
                if (obj1 != PatchProxyResult.class) {
                   str = obj1;
                }
             }
             if (TextUtils.x(str) || (mTruncationT >= true && str.length() > mTruncationT)) {
                i = 0;
                while (mTruncationT > 0 && mTruncationT < str.length()) {
                   boolean i1 = mTruncationT - 1;
                   char c = str.charAt(i1);
                   c = (c && (c != 9 && (c != 10 && (c != 13 && (c < ' ' || (c > 0xd7ff && (c < 0xe000 || c > 0xfffd)))))))? 1: 0;
                   if (c) {
                      char c1 = str.charAt(i1);
                      c = str.charAt(mTruncationT);
                      if (PatchProxy.isSupport(p.class)) {
                         Object obj2 = PatchProxy.applyTwoRefs(Character.valueOf(c1), Character.valueOf(c), null, p.class, "8");
                         if (obj2 != PatchProxyResult.class) {
                            i1 = obj2.booleanValue();
                         }else if((Integer.toHexString(c1)).compareTo("dc00") >= 0 && ((Integer.toHexString(c1)).compareTo("dfff") > 0 || (Integer.toHexString(c)).equals("200D"))){
                            i1 = true;
                         }else {
                            i1 = false;
                         }
                      }else {
                         goto label_00c1 ;
                      }
                      if (i1) {
                         mTruncationT = mTruncationT + 1;
                      }else {
                         break ;
                      }
                   }else {
                      break ;
                   }
                }
                str = str.substring(i, mTruncationT)+"...";
             }
          }
       label_0104 :
          p0 = p0.replace(obj.mKeyName, i.i(str));
       }
       return p0;
    }
}
