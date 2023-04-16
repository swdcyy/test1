package com.reactcommunity.rnlocalize.KrnLocalizeModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.reactcommunity.rnlocalize.KrnLocalizeModule$1;
import com.facebook.react.bridge.ReactContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import java.lang.RuntimeException;
import com.kuaishou.krn.exception.KrnException;
import java.lang.Throwable;
import com.kuaishou.krn.KrnInternalManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import kj0.l;
import ek0.d;
import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
import java.util.Currency;
import java.util.ArrayList;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.util.Iterator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import java.util.TimeZone;
import android.content.Context;
import android.text.format.DateFormat;
import java.util.Objects;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.os.LocaleList;
import java.text.DecimalFormatSymbols;
import java.lang.reflect.Method;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import com.facebook.react.bridge.BaseJavaModule;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class KrnLocalizeModule extends KrnBridge implements LifecycleEventListener	// class@000b54
{
    public final List USES_FAHRENHEIT;
    public final List USES_IMPERIAL;
    public final List USES_RTL_LAYOUT;
    public boolean emitChangeOnResume;
    public BroadcastReceiver mLocalizationReceiver;
    public boolean mainActivityVisible;

    public void KrnLocalizeModule(ReactApplicationContext p0){
       super(p0);
       String[] stringArray = new String[]{"BS","BZ","KY","PR","PW","US"};
       this.USES_FAHRENHEIT = Arrays.asList(stringArray);
       stringArray = new String[]{"LR","MM","US"};
       this.USES_IMPERIAL = Arrays.asList(stringArray);
       stringArray = new String[]{"ar","ckb","fa","he","ks","lrc","mzn","ps","ug","ur","yi"};
       this.USES_RTL_LAYOUT = Arrays.asList(stringArray);
       this.mainActivityVisible = true;
       this.emitChangeOnResume = false;
       this.mLocalizationReceiver = new KrnLocalizeModule$1(this);
       p0.addLifecycleEventListener(this);
       this.registerLocalizeReceiver();
    }
    public final String createLanguageTag(String p0,String p1,String p2){
       if (!TextUtils.isEmpty(p1)) {
          p0 = p0+"-"+p1;
       }
       return p0+"-"+p2;
    }
    public final void emitLocalizationDidChange(){
       if (this.getReactApplicationContext().hasActiveCatalystInstance()) {
          this.notifyEventToJS("localizationDidChange", this.getExportedConstants());
       }
       return;
    }
    public Map getConstants(){
       HashMap hashMap = new HashMap();
       hashMap.put("initialConstants", this.getExportedConstants());
       return hashMap;
    }
    public final String getCountryCode(Locale p0){
       String str = "";
       try{
          String country = p0.getCountry();
          if (country.equals("419")) {
             return "UN";
          }
          if (!TextUtils.isEmpty(country)) {
             str = country;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final String getCurrencyCode(Locale p0){
       String str = "";
       try{
          Currency instance = Currency.getInstance(p0);
          if (instance != null) {
             str = instance.getCurrencyCode();
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final WritableMap getExportedConstants(){
       List locales = this.getLocales();
       Locale locale = locales.get(0);
       String regionCode = this.getRegionCode(locale);
       if (TextUtils.isEmpty(regionCode)) {
          regionCode = "US";
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       WritableArray writableArra = Arguments.createArray();
       WritableArray writableArra1 = Arguments.createArray();
       Iterator iterator = locales.iterator();
       while (iterator.hasNext()) {
          Locale locale1 = iterator.next();
          String languageCode = this.getLanguageCode(locale1);
          String scriptCode = this.getScriptCode(locale1);
          String countryCode = this.getCountryCode(locale1);
          String currencyCode = this.getCurrencyCode(locale1);
          if (TextUtils.isEmpty(countryCode)) {
             countryCode = regionCode;
          }
          String str = this.createLanguageTag(languageCode, scriptCode, countryCode);
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("languageCode", languageCode);
          writableMap.putString("countryCode", countryCode);
          writableMap.putString("languageTag", str);
          writableMap.putBoolean("isRTL", this.getIsRTL(locale1));
          if (!TextUtils.isEmpty(scriptCode)) {
             writableMap.putString("scriptCode", scriptCode);
          }
          if (!uArrayList.contains(str)) {
             uArrayList.add(str);
             writableArra.pushMap(writableMap);
          }
          if (!TextUtils.isEmpty(currencyCode) && !uArrayList1.contains(currencyCode)) {
             uArrayList1.add(currencyCode);
             writableArra1.pushString(currencyCode);
          }
       }
       if (!writableArra1.size()) {
          writableArra1.pushString("USD");
       }
       WritableMap writableMap1 = Arguments.createMap();
       writableMap1.putString("calendar", "gregorian");
       writableMap1.putString("country", regionCode);
       writableMap1.putArray("currencies", writableArra1);
       writableMap1.putArray("locales", writableArra);
       writableMap1.putMap("numberFormatSettings", this.getNumberFormatSettings(locale));
       String str1 = (this.USES_FAHRENHEIT.contains(regionCode))? "fahrenheit": "celsius";
       writableMap1.putString("temperatureUnit", str1);
       writableMap1.putString("timeZone", TimeZone.getDefault().getID());
       writableMap1.putBoolean("uses24HourClock", DateFormat.is24HourFormat(this.getReactApplicationContext()));
       writableMap1.putBoolean("usesAutoDateAndTime", this.getUsesAutoDateAndTime());
       writableMap1.putBoolean("usesAutoTimeZone", this.getUsesAutoTimeZone());
       writableMap1.putBoolean("usesMetricSystem", (this.USES_IMPERIAL.contains(regionCode) ^ 0x01));
       return writableMap1;
    }
    public final boolean getIsRTL(Locale p0){
       boolean b = true;
       if (TextUtils.getLayoutDirectionFromLocale(p0) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final String getLanguageCode(Locale p0){
       String language = p0.getLanguage();
       Objects.requireNonNull(language);
       int i = -1;
       switch (language.hashCode()){
           case 3365:
             if (language.equals("in")) {
                i = 0;
             }
             break;
           case 3374:
             if (language.equals("iw")) {
                i = 1;
             }
             break;
           case 3391:
             if (language.equals("ji")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return "id";
           case 1:
             return "he";
           case 2:
             return "yi";
           default:
             return language;
       }
    }
    public final List getLocales(){
       ArrayList uArrayList = new ArrayList();
       Configuration configuratio = this.getReactApplicationContext().getResources().getConfiguration();
       if (Build$VERSION.SDK_INT < 24) {
          uArrayList.add(configuratio.locale);
       }else {
          LocaleList locales = configuratio.getLocales();
          for (int i = 0; i < locales.size(); i = i + 1) {
             uArrayList.add(locales.get(i));
          }
       }
       return uArrayList;
    }
    public String getName(){
       return "RNLocalize";
    }
    public final WritableMap getNumberFormatSettings(Locale p0){
       WritableMap writableMap = Arguments.createMap();
       DecimalFormatSymbols uDecimalForm = new DecimalFormatSymbols(p0);
       writableMap.putString("decimalSeparator", String.valueOf(uDecimalForm.getDecimalSeparator()));
       writableMap.putString("groupingSeparator", String.valueOf(uDecimalForm.getGroupingSeparator()));
       return writableMap;
    }
    public final String getRegionCode(Locale p0){
       String systemProper = this.getSystemProperty("ro.miui.region");
       if (!TextUtils.isEmpty(systemProper)) {
          return systemProper;
       }
       return this.getCountryCode(p0);
    }
    public final String getScriptCode(Locale p0){
       String script = p0.getScript();
       if (TextUtils.isEmpty(script)) {
          script = "";
       }
       return script;
    }
    public final String getSystemProperty(String p0){
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          return uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
       }catch(java.lang.Exception e0){
          return "";
       }
    }
    public final boolean getUsesAutoDateAndTime(){
       int i = 0;
       if (Settings$Global.getInt(this.getReactApplicationContext().getContentResolver(), "auto_time", i)) {
          i = true;
       }
       return i;
    }
    public final boolean getUsesAutoTimeZone(){
       int i = 0;
       if (Settings$Global.getInt(this.getReactApplicationContext().getContentResolver(), "auto_time_zone", i)) {
          i = true;
       }
       return i;
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       this.unRegisterLocalizeReceiver();
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       this.mainActivityVisible = false;
    }
    public void onHostResume(){
       this.mainActivityVisible = true;
       if (this.emitChangeOnResume != null) {
          this.emitLocalizationDidChange();
          this.emitChangeOnResume = false;
       }
       return;
    }
    public void onLocalizationDidChange(){
       if (this.mainActivityVisible != null) {
          this.emitLocalizationDidChange();
       }else {
          this.emitChangeOnResume = true;
       }
       return;
    }
    public final void registerLocalizeReceiver(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.DATE_CHANGED");
       intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
       intentFilter.addAction("android.intent.action.TIME_SET");
       intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
       UniversalReceiver.e(this.getReactApplicationContext(), this.mLocalizationReceiver, intentFilter);
       return;
    }
    public final void unRegisterLocalizeReceiver(){
       UniversalReceiver.f(this.getReactApplicationContext(), this.mLocalizationReceiver);
       return;
    }
}
