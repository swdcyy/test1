package com.kwai.feature.post.api.flywheel.widget.a;
import java.lang.Object;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import q36.g;
import java.lang.CharSequence;
import android.widget.TextView;
import fg6.a;
import com.kwai.feature.post.api.flywheel.widget.a$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import java.util.Collection;
import ekd.q;
import q87.c;
import java.util.ArrayList;
import q36.f;
import q36.h;
import com.google.gson.JsonElement;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.yxcorp.gifshow.util.FakeBoldStyleSpan;
import q36.e;
import android.graphics.drawable.LevelListDrawable;
import q36.a;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import q36.c;
import java.lang.Runnable;

public class a	// class@0013f1
{

    public void a(){
       super();
    }
    public static SpannableStringBuilder a(List p0){
       SpannableStringBuilder obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          int i = obj.length();
          obj.append(og.a);
          int i1 = obj.length();
          Iterator iterator1 = og.b.iterator();
          while (iterator1.hasNext()) {
             obj.setSpan(iterator1.next(), i, i1, 17);
          }
       }
       return obj;
    }
    public static void b(TextView p0,String p1){
       Collection uCollection;
       Object[] objArray;
       h oh;
       int i2;
       StyleSpan styleSpan;
       g og1;
       int[] ointArray2;
       int[] ointArray3;
       boolean[] uobooleanArr1;
       e uoe;
       Object obj = p0;
       List obj1 = p1;
       Object obj2 = null;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, obj2, a.class, "1")) {
          return;
       }
       try{
          obj1 = a.a.i(obj1, new a$a().getType());
       }catch(com.google.gson.JsonSyntaxException e0){
          p3.D().e("FlyWheel", "parse itemConfig error", e0);
          uCollection = obj2;
       }
       int i = 0;
       if (q.f(uCollection)) {
          objArray = new Object[i];
          p3.D().w("FlyWheel", "itemConfig is empty", objArray);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          int i1 = 1;
          boolean[] uobooleanArr = new boolean[i1];
          uobooleanArr[i] = i;
          int[] ointArray = new int[i1];
          ointArray[i] = i;
          int[] ointArray1 = new int[i1];
          ointArray1[i] = i;
          Iterator iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             f uof = iterator.next();
             if (uof == null) {
                objArray = new Object[i];
                p3.D().w("FlyWheel", "itemConfig is null", objArray);
             }else {
                g og = new g();
                if (("text").equals(uof.mType)) {
                   try{
                      oh = a.a.c(uof.mConfigJson, h.class);
                   }catch(com.google.gson.JsonSyntaxException e0){
                      p3.D().e("FlyWheel", "parse text config error", e0);
                      oh = obj2;
                   }
                   if (oh != null) {
                      h mText = oh.mText;
                      if (mText != null && !TextUtils.x(mText)) {
                         uobooleanArr[i] = i1;
                         og.a = oh.mText;
                         mText = oh.mSize;
                         if (mText != null) {
                            i2 = (oh.mIsFixedSize != null)? a1.e((float)mText.intValue()): n.c0(a1.c(), (float)oh.mSize.intValue());
                            og.a(new AbsoluteSizeSpan(i2, i));
                         }
                         mText = oh.mTextColor;
                         if (mText != null) {
                            og.a(new ForegroundColorSpan(TextUtils.J(mText, i)));
                         }
                         mText = oh.mWeight;
                         if (mText != null) {
                            if (("bold").equals(mText)) {
                               styleSpan = new StyleSpan(i1);
                            }else if(("semi-bold").equals(oh.mWeight)){
                               styleSpan = new FakeBoldStyleSpan(i);
                            }else if(("regular").equals(oh.mWeight)){
                               styleSpan = new StyleSpan(i);
                            }else {
                               styleSpan = obj2;
                            }
                            if (styleSpan != null) {
                               og.a(styleSpan);
                            }
                         }
                      }
                   }
                   objArray = new Object[i];
                   p3.D().w("FlyWheel", "text config is null", objArray);
                }else if(("image").equals(uof.mType)){
                   try{
                      uoe = a.a.c(uof.mConfigJson, e.class);
                   }catch(com.google.gson.JsonSyntaxException e0){
                      p3.D().e("FlyWheel", "parse image config error", e0);
                      uoe = obj2;
                   }
                   if (uoe != null && uoe.mUrl != null) {
                      e height = uoe.height;
                      if (height != null && uoe.width != null) {
                         i2 = ointArray[i] + i1;
                         ointArray[i] = i2;
                         uoe.height = Integer.valueOf(a1.e((float)height.intValue()));
                         uoe.width = Integer.valueOf(a1.e((float)uoe.width.intValue()));
                         og.a = "placeHolder";
                         LevelListDrawable levelListDra = new LevelListDrawable();
                         a uoa = new a(levelListDra, "placeHolder");
                         int i3 = uoe.width.intValue();
                         int i4 = uoe.height.intValue();
                         if (PatchProxy.isSupport(a.class) && PatchProxy.applyTwoRefs(Integer.valueOf(i3), Integer.valueOf(i4), uoa, a.class, "1") != PatchProxyResult.class) {
                         }else {
                            boolean b = false;
                            uoa.b = b;
                            uoa.c = new Rect(b, b, i3, i4);
                         }
                         og.b.add(uoa);
                         og1 = og;
                         ointArray2 = ointArray1;
                         ointArray3 = ointArray;
                         uobooleanArr1 = uobooleanArr;
                         c uoc = new c(uoe, ointArray1, uobooleanArr, ointArray, p0, uArrayList, levelListDra);
                         og1.c = i3;
                      label_01fa :
                         if (og1.a != null) {
                            uArrayList.add(og1);
                         label_0201 :
                            ointArray1 = ointArray2;
                            ointArray = ointArray3;
                            uobooleanArr = uobooleanArr1;
                            obj2 = null;
                            i = 0;
                            i1 = true;
                         }else {
                            goto label_0201 ;
                         }
                      }
                   }
                   ointArray2 = ointArray1;
                   ointArray3 = ointArray;
                   uobooleanArr1 = uobooleanArr;
                   Object[] objArray1 = new Object[0];
                   p3.D().w("FlyWheel", "image config is null", objArray1);
                   goto label_0201 ;
                }
                og1 = og;
                ointArray2 = ointArray1;
                ointArray3 = ointArray;
                uobooleanArr1 = uobooleanArr;
                goto label_01fa ;
             }
          }
          uobooleanArr1 = uobooleanArr;
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             g og2 = iterator1.next();
             g c = og2.c;
             if (c != null) {
                c.run();
                og2.c = null;
             }else {
                c = null;
             }
          }
          if (uobooleanArr1[0]) {
             obj.setText(a.a(uArrayList));
          }
          return;
       }
    }
}
