package com.yxcorp.gifshow.topic.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.topic.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.topic.HomeLocalTopicConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cya.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001da2
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putString("nearbyCommunityCaptionParserRegex", p0.mHomeLocalRegular);
          g.a(uEditor);
       }
       return;
    }
}
