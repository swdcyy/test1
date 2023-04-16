package com.yxcorp.gifshow.profile.util.ClickableSpanUtil;
import java.lang.Object;
import java.lang.String;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.util.ClickableSpanUtil$NoUnderlineSpan;
import android.text.style.ForegroundColorSpan;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ync.a;

public final class ClickableSpanUtil	// class@0015c3
{

    public void ClickableSpanUtil(){
       super();
    }
    public static SpannableStringBuilder a(String p0,String p1,ClickableSpan p2){
       SpannableStringBuilder obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClickableSpanUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder(p0);
       if (p0.contains(p1)) {
          int i = p0.indexOf(p1);
          int i1 = p1.length() + i;
          obj.setSpan(p2, i, i1, 33);
          obj.setSpan(new ClickableSpanUtil$NoUnderlineSpan(), i, i1, 33);
          obj.setSpan(new ForegroundColorSpan(a.c(a.a().a())), i, i1, 33);
       }
       return obj;
    }
}
