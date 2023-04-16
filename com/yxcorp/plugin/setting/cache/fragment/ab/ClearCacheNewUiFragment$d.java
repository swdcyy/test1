package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$d;
import erd.g;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Math;
import qsd.d;
import nsd.r0;
import lnc.a1;
import zsd.u;
import java.util.Arrays;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Double;
import android.text.TextPaint;

public final class ClearCacheNewUiFragment$d implements g	// class@000836
{
    public final ClearCacheNewUiFragment b;

    public void ClearCacheNewUiFragment$d(ClearCacheNewUiFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       double d;
       if (PatchProxy.applyVoidOneRefs(p0, this, ClearCacheNewUiFragment$d.class, "1")) {
       }else {
          long l = SystemUtil.v();
          a.o(p0, "kuaishouUsedSpace");
          long l1 = (l - p0.longValue()) - SystemUtil.u();
          ViewGroup$LayoutParams layoutParams = ClearCacheNewUiFragment.Hh(this.b).getLayoutParams();
          String str = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
          Objects.requireNonNull(layoutParams, str);
          float f = (float)l;
          float f1 = (float)p0.longValue() / f;
          layoutParams.weight = f1;
          ClearCacheNewUiFragment$d tb = this.b;
          ClearCacheNewUiFragment p = tb.P;
          int i = 0x33d6bf95;
          if ((f1 - p) - i < 0) {
             layoutParams.weight = p;
          }
          ClearCacheNewUiFragment.Hh(tb).setLayoutParams(layoutParams);
          ViewGroup$LayoutParams layoutParams1 = ClearCacheNewUiFragment.Ih(this.b).getLayoutParams();
          Objects.requireNonNull(layoutParams1, str);
          layoutParams1.weight = (float)l1 / f;
          ClearCacheNewUiFragment.Ih(this.b).setLayoutParams(layoutParams1);
          ViewGroup$LayoutParams layoutParams2 = ClearCacheNewUiFragment.Jh(this.b).getLayoutParams();
          Objects.requireNonNull(layoutParams2, str);
          float f2 = ((float)1 - layoutParams.weight) - layoutParams1.weight;
          layoutParams2.weight = f2;
          tb = this.b;
          ClearCacheNewUiFragment p1 = tb.P;
          if ((f2 - p1) - i < 0) {
             layoutParams2.weight = p1;
          }
          ClearCacheNewUiFragment.Jh(tb).setLayoutParams(layoutParams2);
          int i1 = d.H0((float)Math.ceil((double)(layoutParams.weight * (float)100)));
          ClearCacheNewUiFragment m = this.b.M;
          if (m == null) {
             a.S("mKuaishouDiskUsedProportionTextView");
          }
          int i2 = (i1 < 50)? 0x7f103a69: 0x7f103a6a;
          String str1 = a1.p(i2);
          a.o(str1, "CommonUtil.string\(if \(ra¡­_the_phone_storage_space\)");
          String str2 = u.g2(str1, "s%", "s%%", false, 4, null);
          Object[] objArray = new Object[]{String.valueOf(i1)};
          String str3 = String.format(str2, Arrays.copyOf(objArray, 1));
          a.o(str3, "java.lang.String.format\(format, *args\)");
          m.setText(str3);
          d = (double)1024;
          double d1 = (((double)p0.longValue() * 0x3ff0000000000000) / d) / d;
          p0 = this.b;
          p0.Q = d1;
          if (d1 - d > 0) {
             objArray = new Object[]{Double.valueOf((d1 / d))};
             str3 = String.format("%.2f GB", Arrays.copyOf(objArray, 1));
             a.o(str3, "java.lang.String.format\(format, *args\)");
             ClearCacheNewUiFragment.Gh(p0).setText(str3);
          }else {
             objArray = new Object[]{Double.valueOf(d1)};
             str3 = String.format("%.2f MB", Arrays.copyOf(objArray, 1));
             a.o(str3, "java.lang.String.format\(format, *args\)");
             ClearCacheNewUiFragment.Gh(p0).setText(str3);
          }
          p0 = this.b.K;
          if (p0 == null) {
             a.S("mAppDiskTipTextView");
          }
          p0 = p0.getPaint();
          a.o(p0, "mAppDiskTipTextView.paint");
          p0.setFakeBoldText(1);
          p0 = ClearCacheNewUiFragment.Gh(this.b).getPaint();
          a.o(p0, "mAppDiskSizeTextView.paint");
          p0.setFakeBoldText(1);
       }
       return;
    }
}
