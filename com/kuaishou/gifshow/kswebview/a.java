package com.kuaishou.gifshow.kswebview.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewCounterModel;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewStartupModel;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel;

public final class a	// class@0019eb
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static void a(CNYWebviewIntelligentPreinit$CNYWebviewCounterModel p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("mCounterMap", b.e(p0.mCounterMap));
       g.a(uEditor);
    }
    public static void b(CNYWebviewIntelligentPreinit$CNYWebviewStartupModel p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("webKernelPreLoad", b.e(p0.mStartupRuleList));
       g.a(uEditor);
    }
    public static void c(CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("kswitchWebviewPreload", b.e(p0.mSwitchConfigRuleList));
       g.a(uEditor);
    }
}
