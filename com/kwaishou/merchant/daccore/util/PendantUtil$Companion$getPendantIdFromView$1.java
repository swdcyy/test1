package com.kwaishou.merchant.daccore.util.PendantUtil$Companion$getPendantIdFromView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import f08.b;
import java.lang.StringBuilder;
import f08.b$a;
import java.lang.Throwable;
import java.util.Map;

public final class PendantUtil$Companion$getPendantIdFromView$1 extends Lambda implements l	// class@001345
{
    public final long $materialId;

    public void PendantUtil$Companion$getPendantIdFromView$1(long p0){
       this.$materialId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(View p0){
       String str;
       String tag;
       try{
          str = null;
          if (p0 != null) {
             int i = 0x7f0a0c6b;
             tag = p0.getTag(i);
          }else {
             tag = str;
          }
          if (!tag instanceof String) {
             tag = str;
          }
          str = tag;
       }catch(java.lang.Exception e8){
          b$a.b(b.a, this.$materialId+" view getPendantId tag error", e8, null, 4, null);
       }
       return str;
    }
}
