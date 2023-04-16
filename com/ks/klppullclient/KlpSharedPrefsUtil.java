package com.ks.klppullclient.KlpSharedPrefsUtil;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.Context;
import oe6.o;
import oe6.g;

public class KlpSharedPrefsUtil	// class@000746
{
    public static Context mContext;

    public void KlpSharedPrefsUtil(){
       super();
    }
    public static SharedPreferences$Editor getEditor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KlpSharedPrefsUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KlpSharedPrefsUtil.getSharedPreferences(p0).edit();
    }
    public static SharedPreferences getSharedPreferences(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KlpSharedPrefsUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(KlpSharedPrefsUtil.mContext, p0, 0);
    }
    public static String getValue(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, KlpSharedPrefsUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KlpSharedPrefsUtil.mContext == null) {
          return p2;
       }
       return KlpSharedPrefsUtil.getSharedPreferences(p0).getString(p1, p2);
    }
    public static void init(Context p0){
       KlpSharedPrefsUtil.mContext = p0;
    }
    public static void putValue(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KlpSharedPrefsUtil.class, "1")) {
          return;
       }
       if (KlpSharedPrefsUtil.mContext == null) {
          return;
       }
       SharedPreferences$Editor editor = KlpSharedPrefsUtil.getEditor(p0);
       editor.putString(p1, p2);
       g.a(editor);
       return;
    }
}
