package com.kwai.platform.krouter.handler.annotation.PageRegexAnnotationHandler;
import com.kwai.platform.krouter.handler.annotation.BaseAnnotationHandler;
import java.lang.String;
import xh7.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import xh7.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import wh7.d;
import wh7.c;

public class PageRegexAnnotationHandler extends BaseAnnotationHandler	// class@001294
{

    public void PageRegexAnnotationHandler(String p0){
       super(p0);
    }
    public boolean d(b p0){
       String obj = PatchProxy.applyOneRefs(p0, this, PageRegexAnnotationHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.g().isOpaque()) {
          return false;
       }
       obj = p0.g().getScheme();
       if (!("https").equals(obj) && !("http").equals(obj)) {
          String str = this.e(p0);
          if (TextUtils.isEmpty(str)) {
             return false;
          }else {
             d uod = c.b(str);
             this.b = uod;
             if (uod != null) {
                return true;
             }
          }
       }
       return false;
    }
}
