package com.yxcorp.gifshow.share.model.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.share.model.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.share.model.config.PhotoShareStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qxb.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001bdc
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("highQualityFeedbackUrl", p0.mHighQualityFeedbackUrl);
          g.a(uEditor);
       }
       return;
    }
}
