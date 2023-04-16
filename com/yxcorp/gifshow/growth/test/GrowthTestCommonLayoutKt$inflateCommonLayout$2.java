package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vma.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$2 extends Lambda implements a	// class@0014ec
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$2 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$2.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$2();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$2(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestCommonLayoutKt$inflateCommonLayout$2.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("growthKwaiChannelAppDialogShowCount", 0);
       g.a(uEditor);
       return;
    }
}
