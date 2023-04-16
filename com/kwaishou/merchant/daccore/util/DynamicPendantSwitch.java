package com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.CharSequence;
import zsd.u;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$Config;
import com.kwai.sdk.switchconfig.a;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$CloseComponentConfig;
import java.lang.reflect.Type;
import java.util.List;

public final class DynamicPendantSwitch	// class@001344
{
    public static final DynamicPendantSwitch$a a;

    static {
       DynamicPendantSwitch.a = new DynamicPendantSwitch$a(null);
    }
    public static final boolean a(int p0,String p1){
       DynamicPendantSwitch$a a = DynamicPendantSwitch.a;
       Objects.requireNonNull(a);
       int i = 1;
       int i1 = (p1 == null || u.S1(p1))? 1: 0;
       if (!i1) {
          DynamicPendantSwitch$Config uConfig = a.a();
          i1 = uConfig.getLoadType();
          String componentNam = uConfig.getComponentName();
          if (i1 && i1 != i) {
             DynamicPendantSwitch$CloseComponentConfig value = a.t().getValue("MerchantPendantCloseConfig", DynamicPendantSwitch$CloseComponentConfig.class, new DynamicPendantSwitch$CloseComponentConfig());
             List anchorCloseC = (p0 != i)? value.getAnchorCloseComponent(): value.getAudienceCloseComponent();
             int i2 = (p1 == null || u.S1(p1))? 1: 0;
             if (i2 || (anchorCloseC == null || anchorCloseC.contains(p1) != i)) {
                if (i1 == 6) {
                label_0083 :
                   return i;
                }else if(p0 == i){
                   if (i1 != 2) {
                      if (i1 == 3) {
                      }
                   }else if(componentNam != null){
                      i = componentNam.equals(p1);
                      goto label_0083 ;
                   }
                }else if(p0 == 2 && i1 != 3){
                   if (i1 != 4) {
                      if (i1 == 5) {
                      }
                   }else if(componentNam != null){
                      i = componentNam.equals(p1);
                      goto label_0083 ;
                   }
                }
             }
          }
       }
    label_0070 :
       i = false;
       goto label_0083 ;
    }
}
