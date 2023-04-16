package az3.h;
import erd.g;
import az3.f;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ot3.u0;
import com.kwai.robust.PatchProxyResult;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class h implements g	// class@0002df
{
    public final f b;
    public final TextView c;
    public final String d;

    public void h(f p0,TextView p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          h tb = this.b;
          h tc = this.c;
          long l = p0.longValue();
          p0 = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(tc, Long.valueOf(l), p0, tb, f.class, "8")) {
             int i = 0;
             if (l - false > 0) {
                tc.setVisibility(i);
                p0 = u0.class;
                if (PatchProxy.isSupport(p0)) {
                   p0 = PatchProxy.applyOneRefs(Long.valueOf(l), null, p0, "5");
                   if (p0 != PatchProxyResult.class) {
                   }else if(l - 0x36ee80 >= 0){
                      p0 = u0.a;
                      p0.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
                      p0 = p0.format(new Date(l));
                   }else {
                      p0 = u0.b.format(new Date(l))+":"+((l % 1000) / 100);
                   }
                }else {
                   goto label_005b ;
                }
                tc.setText(p0);
             }else if(TextUtils.x(p0)){
                tc.setVisibility(8);
             }else {
                tc.setVisibility(i);
                tc.setText(p0);
             }
          }
       }
       return;
    }
}
