package ena.i$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import vqa.k;
import pna.k;
import com.kwai.robust.PatchProxyResult;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Number;

public final class i$a implements GrowthTestLayout$Companion$a	// class@00277d
{

    public void i$a(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
       }else {
          int i = 0x7f110668;
          String str = (p0 == null)? "测试配置已清空": " 修改成功: 当前大小为 "+p0+" MB ";
          i.d(i, str);
          k.b.c("KEY_CLEANER_NOTIFICATION_SIZE", p0);
       }
       return;
    }
    public Object b(){
       Boolean tRUE;
       long l;
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, i$a.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          k b = k.b;
          String str = "KEY_CLEANER_NOTIFICATION_SIZE";
          int i = 1;
          if (!u.S1(str)) {
             try{
                d uod = m0.d(Long.class);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (b.a().getBoolean(str, false)) {
                      tRUE = Boolean.TRUE;
                   }
                }else if(a.g(uod, m0.d(String.class))){
                   tRUE = b.a().getString(str, "");
                   l = (tRUE == null || !tRUE.length())? 1: 0;
                   if (!l) {
                      if (tRUE != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   int intx = b.a().getInt(str, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      tRUE = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   long l1 = Long.MIN_VALUE;
                   l = b.a().getLong(str, l1);
                   if (l - l1) {
                      tRUE = Long.valueOf(l);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   float floatx = b.a().getFloat(str, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                   }
                }
             }catch(java.lang.Exception e0){
             }
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
