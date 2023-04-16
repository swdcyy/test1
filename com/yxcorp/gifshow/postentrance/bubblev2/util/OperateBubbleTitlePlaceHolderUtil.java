package com.yxcorp.gifshow.postentrance.bubblev2.util.OperateBubbleTitlePlaceHolderUtil;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.gifshow.postentrance.bubblev2.util.OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1;
import msd.l;

public final class OperateBubbleTitlePlaceHolderUtil	// class@00103d
{
    public static final Regex a;
    public static final OperateBubbleTitlePlaceHolderUtil b;

    static {
       OperateBubbleTitlePlaceHolderUtil.b = new OperateBubbleTitlePlaceHolderUtil();
       OperateBubbleTitlePlaceHolderUtil.a = new Regex("#\\{.*?\\}", RegexOption.IGNORE_CASE);
    }
    public void OperateBubbleTitlePlaceHolderUtil(){
       super();
    }
    public final String a(PublishGuideInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperateBubbleTitlePlaceHolderUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "publishGuideInfo");
       return this.b(p0.mTitle);
    }
    public final String b(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, OperateBubbleTitlePlaceHolderUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Regex regex = (p0 == null || !p0.length())? 1: null;
       if (regex) {
          p0 = obj;
          a.o(p0, "stringBuilder.toString\(\)");
          return p0;
       }else {
          p0 = obj+OperateBubbleTitlePlaceHolderUtil.a.replace(p0, OperateBubbleTitlePlaceHolderUtil$getTitleText$result$1.INSTANCE);
          a.o(p0, "stringBuilder.append\(result\).toString\(\)");
          return p0;
       }
    }
}
