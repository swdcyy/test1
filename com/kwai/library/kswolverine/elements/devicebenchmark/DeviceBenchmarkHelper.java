package com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper;
import com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper$VERSION$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import lx6.a;
import io.reactivex.g;
import brd.t;
import v27.a;
import v27.c;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import lx6.b;
import lx6.c;
import erd.g;
import crd.b;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper$tryToGetDeviceLevel$1;
import com.kwai.library.kswolverine.utils.PreferenceUtil;
import android.content.SharedPreferences;
import w27.a;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Map;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import com.kwai.library.kswolverine.elements.devicebenchmark.DeviceBenchmarkHelper$tryToGetDeviceConfigManager$1;

public final class DeviceBenchmarkHelper	// class@000848
{
    public static final p a;
    public static final ConcurrentHashMap b;

    static {
       DeviceBenchmarkHelper.a = s.c(DeviceBenchmarkHelper$VERSION$2.INSTANCE);
       DeviceBenchmarkHelper.b = new ConcurrentHashMap();
    }
    public static final int a(String p0){
       a.p(p0, "sceneKey");
       Integer integer = DeviceBenchmarkHelper.b.get(p0);
       int i = (integer != null)? integer.intValue(): DeviceBenchmarkHelper.c(p0, true);
       return i;
    }
    public static final int b(String p0){
       a.p(p0, "sceneKey");
       Integer integer = DeviceBenchmarkHelper.b.get(p0);
       int i = (integer != null)? integer.intValue(): DeviceBenchmarkHelper.c(p0, false);
       return i;
    }
    public static final int c(String p0,boolean p1){
       int i1;
       t ot = t.create(new a(p0));
       z oz = c.b().b();
       if (oz != null) {
       }else {
          oz = b.a();
          a.o(oz, "Schedulers.computation\(\)");
       }
       ot.subscribeOn(oz).observeOn(a.c()).subscribe(new b(p0), new c(p0));
       int i = -1;
       if (p1) {
          DeviceConfigManager uDeviceConfi = DeviceBenchmarkHelper.g();
          if (uDeviceConfi != null) {
             Integer integer = DeviceBenchmarkHelper.f(new DeviceBenchmarkHelper$tryToGetDeviceLevel$1(uDeviceConfi, p0));
             if (integer != null) {
                i1 = integer.intValue();
             label_0052 :
                if (i1 == i) {
                   i1 = PreferenceUtil.b.a().getInt(DeviceBenchmarkHelper.d(p0), i);
                   a.a.b("getSpDeviceLevelInternal_"+p0, Integer.valueOf(i1));
                }else {
                   g.a(PreferenceUtil.b.a().edit().putInt(DeviceBenchmarkHelper.d(p0), i1));
                   a.a.b("getInstanceDeviceLevelInternal_"+p0, Integer.valueOf(i1));
                }
                DeviceBenchmarkHelper.b.put(p0, Integer.valueOf(i1));
                return i1;
             }
          }
       }
       i1 = -1;
       goto label_0052 ;
    }
    public static final String d(String p0){
       return "DeviceBenchmarkBySceneKey_"+p0;
    }
    public static final String e(){
       return DeviceBenchmarkHelper.a.getValue();
    }
    public static final Object f(a p0){
       String str = PreferenceUtil.b.a().getString("DEVICE_CONFIG_MANAGER_ERROR", "");
       if (str != null) {
          a.o(str, "it");
          int i = 0;
          String str1 = (!str.length())? 1: null;
          if (!str1) {
             String[] stringArray = new String[]{"#"};
             List list = StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
             if (!(a.g(list.get(i), DeviceBenchmarkHelper.e()) ^ 1)) {
                if (Integer.parseInt(list.get(1)) != 3) {
                   Integer.parseInt(list.get(1));
                }
             }
          }
          p0 = p0.invoke();
       label_008d :
          return p0;
       }
       p0 = null;
       goto label_008d ;
    }
    public static final DeviceConfigManager g(){
       return DeviceBenchmarkHelper.f(DeviceBenchmarkHelper$tryToGetDeviceConfigManager$1.INSTANCE);
    }
}
