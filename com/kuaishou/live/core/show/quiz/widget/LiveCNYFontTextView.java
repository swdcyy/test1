package com.kuaishou.live.core.show.quiz.widget.LiveCNYFontTextView;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import wkd.b;
import lnc.qb;
import java.util.Map;
import android.graphics.Typeface;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.ActivityLocalFontConfig;
import java.lang.String;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.ActivityLocalFontConfig$CustomFont;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.Yoda;
import android.net.Uri;
import java.io.File;
import ekd.d0;
import android.widget.TextView;

public class LiveCNYFontTextView extends LiveTextView	// class@000e44
{

    public void LiveCNYFontTextView(Context p0){
       super(p0, null);
    }
    public void LiveCNYFontTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveCNYFontTextView(Context p0,AttributeSet p1,int p2){
       File uFile;
       super(p0, p1, p2);
       qb oqb = b.a(-1923965980);
       Typeface typeface = oqb.a.get("puhui2-95");
       if (typeface == null) {
          ActivityLocalFontConfig value = a.t().getValue("activityLocalFontConfig", ActivityLocalFontConfig.class, null);
          if (value != null && !q.f(value.mCustomFontList)) {
             Iterator iterator = value.mCustomFontList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ActivityLocalFontConfig$CustomFont uCustomFont = iterator.next();
                   if (TextUtils.n(uCustomFont.mFontId, "puhui2-95") && uCustomFont.mFontUrl != null) {
                      uFile = Yoda.get().getOfflinePackageFile(uCustomFont.mFontId, Uri.parse(uCustomFont.mFontUrl));
                      break ;
                   }
                }
             }
             if (uFile != null && uFile.exists()) {
                typeface = d0.b(uFile);
                if (typeface != null) {
                   oqb.a.put("puhui2-95", typeface);
                }
             }
             typeface = null;
          }
          uFile = null;
          goto label_0062 ;
       }
       if (typeface != null) {
          this.setTypeface(typeface);
       }
       return;
    }
}
