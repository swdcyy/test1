package b4a.a;
import java.lang.Runnable;
import b4a.b;
import java.lang.Object;
import java.util.Objects;
import tkd.b;
import tkd.d;
import vw5.h;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import j4a.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import fg6.a;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.Integer;

public final class a implements Runnable	// class@000363
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       String str = "goods_type";
       String str1 = "from_type";
       d.a(-686893323).IK("poi_d_is_low_phone", Boolean.valueOf(tb.n));
       d.a(-686893323).IK("local_life_jump_channel", "plc");
       PlcEntryStyleInfo$StrongStyleInfo strongStyleI = null;
       if (tb.a() != null) {
          if (tb.a().isStrongValid()) {
             strongStyleI = tb.a().mStyleInfo.mStrongStyleTemplateInfo.mTagPackage;
          }else if(tb.a().isWeakValid()){
             strongStyleI = tb.a().mStyleInfo.mWeakStyleTemplateInfo.mTagPackage;
          }
       }
       try{
          if (strongStyleI != null) {
             PlcEntryStyleInfo$TagPackage mParams = strongStyleI.mParams;
             if (mParams != null) {
                JsonObject jsonObject = a.a.h(mParams, JsonObject.class);
                if (jsonObject.e0(str1) != null) {
                   d.a(-686893323).IK("poi_d_from_type", jsonObject.e0(str1).w());
                }
                if (jsonObject.e0(str) != null) {
                   int i = 1;
                   if (jsonObject.e0(str).p() <= i) {
                      i = 0;
                   }
                   d.a(-686893323).IK("poi_d_goods_type", Integer.valueOf(i));
                }
             }
          }
          d.a(-686893323).o20("poi_d_click_plc");
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
