package com.kwai.emotionsdk.bean.EmotionInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import bk5.c;
import dk5.b;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import com.yxcorp.utility.TextUtils;

public class EmotionInfo implements Serializable	// class@000d7d
{
    public int mBizType;
    public List mEmotionCode;
    public List mEmotionImageBigUrl;
    public List mEmotionImageSmallUrl;
    public String mEmotionName;
    public String mEmotionPackageId;
    public int mHeight;
    public boolean mHidePanel;
    public String mId;
    public int mIndex;
    public String mMessage;
    public int mPayStatus;
    public long mPayTime;
    public int mPayType;
    public int mPrice;
    public int mType;
    public int mWidth;
    public static final long serialVersionUID = 0x5188a2eb41b4122f;

    public void EmotionInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EmotionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.equals(this.mId, p0.mId);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, EmotionInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mId).hashCode();
    }
    public c transEmojiData(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, EmotionInfo.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.e();
       Objects.requireNonNull(obj);
       EmotionInfo$EmotionCode obj1 = PatchProxy.applyOneRefs(this, obj, b.class, "5");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(this.mBizType != true){
          String str = "";
          if (!q.f(this.mEmotionCode)) {
             Iterator iterator = this.mEmotionCode.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                if (TextUtils.n(obj1.mLanguage, obj.f()) && !q.f(obj1.mCode)) {
                   str = obj1.mCode.get(0);
                }
             }
          }
          objArray = new c(str, this.mId, this.mEmotionImageSmallUrl);
       }
       return objArray;
    }
}
