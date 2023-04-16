package g4a.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.detail.plc.adapter.WeakStyleDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.StrongStyleDataAdapter;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;

public class c	// class@0023a8
{

    public void c(){
       super();
    }
    public static PlcEntryDataAdapter a(QPhoto p0){
       Object obj = null;
       PlcEntryStyleInfo obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.getPlcEntryStyleInfo();
       if (obj1 != null && obj1.mStyleInfo != null) {
          if (obj1.isWeakValid()) {
             return new WeakStyleDataAdapter(p0, p0.getPlcEntryStyleInfo());
          }else if(obj1.isStrongValid()){
             return new StrongStyleDataAdapter(p0, p0.getPlcEntryStyleInfo());
          }
       }
       return obj;
    }
    public static String b(String p0,QPhoto p1,PlcEntryStyleInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0) || (p1 != null && p2 != null)) {
          if (!p1.isAd()) {
             p2 = p2.mBizType;
             if (p2 == 1 || (p2 != 23 && p2 != 39)) {
                return p0;
             }
          }
          p0 = d.a(-1694791652).Fi(p0, p1.mEntity);
       }
    label_0042 :
       return p0;
    }
}
