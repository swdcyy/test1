package com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.bridge.ContextBaseJavaModule;
import android.content.Context;
import pe.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.HashMap;
import vd.d;
import java.util.Locale;

public class I18nManagerModule extends ContextBaseJavaModule	// class@0012b9
{
    public final a sharedI18nUtilInstance;

    public void I18nManagerModule(Context p0){
       super(p0);
       this.sharedI18nUtilInstance = a.b();
    }
    public void allowRTL(boolean p0){
       I18nManagerModule i18nManagerM = I18nManagerModule.class;
       if (PatchProxy.isSupport(i18nManagerM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i18nManagerM, "2")) {
          return;
       }
       i18nManagerM = this.sharedI18nUtilInstance;
       Context context = this.getContext();
       Objects.requireNonNull(i18nManagerM);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(context, Boolean.valueOf(p0), i18nManagerM, uoa, "4")) {
          i18nManagerM.e(context, "RCTI18nUtil_allowRTL", p0);
       }
       return;
    }
    public void forceRTL(boolean p0){
       I18nManagerModule i18nManagerM = I18nManagerModule.class;
       if (PatchProxy.isSupport(i18nManagerM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i18nManagerM, "3")) {
          return;
       }
       i18nManagerM = this.sharedI18nUtilInstance;
       Context context = this.getContext();
       Objects.requireNonNull(i18nManagerM);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(context, Boolean.valueOf(p0), i18nManagerM, uoa, "8")) {
          i18nManagerM.e(context, "RCTI18nUtil_forceRTL", p0);
       }
       return;
    }
    public Map getConstants(){
       Context obj = PatchProxy.apply(null, this, I18nManagerModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContext();
       HashMap hashMap = d.b();
       hashMap.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.d(obj)));
       hashMap.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.a(obj)));
       hashMap.put("localeIdentifier", obj.getResources().getConfiguration().locale.toString());
       return hashMap;
    }
    public String getName(){
       return "I18nManager";
    }
    public void swapLeftAndRightInRTL(boolean p0){
       I18nManagerModule i18nManagerM = I18nManagerModule.class;
       if (PatchProxy.isSupport(i18nManagerM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i18nManagerM, "4")) {
          return;
       }
       i18nManagerM = this.sharedI18nUtilInstance;
       Context context = this.getContext();
       Objects.requireNonNull(i18nManagerM);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(context, Boolean.valueOf(p0), i18nManagerM, uoa, "6")) {
          i18nManagerM.e(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", p0);
       }
       return;
    }
}
