package com.kwai.slide.play.detail.information.caption.CaptionView$a;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import com.kwai.slide.play.detail.information.caption.CaptionTextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import u0.d;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import cw9.c;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;

public final class CaptionView$a	// class@0017c9
{

    public void CaptionView$a(){
       super();
    }
    public void CaptionView$a(u p0){
       super();
    }
    public final CaptionTextView a(Context p0){
       CaptionTextView obj = PatchProxy.applyOneRefs(p0, this, CaptionView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new CaptionTextView(new d(p0, 0x7f040057));
       obj.setAutoLinkMask(0);
       obj.setClickable(true);
       obj.setIncludeFontPadding(0);
       obj.setLinksClickable(true);
       obj.setVerticalScrollBarEnabled(0);
       obj.setHorizontalScrollBarEnabled(0);
       obj.setTextColor(ContextCompat.getColor(p0, R.color.arg_RES_7f061ff3));
       obj.setTextDirection(3);
       obj.setTextSize(0, (float)c.b(p0.getResources(), R.dimen.arg_RES_7f070e95));
       obj.setLineSpacing((float)a1.d(R.dimen.arg_RES_7f07030a), 0x3f800000);
       return obj;
    }
}
