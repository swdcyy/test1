package h53.a;
import lf3.g;
import h53.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import java.lang.Number;
import fq5.b;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h53.f;
import java.lang.reflect.Type;
import el.a;
import java.util.LinkedHashMap;
import f37.a;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import com.kwai.live.gzone.widget.a;
import brd.t;
import h53.d;
import h53.e;
import erd.g;
import crd.b;
import lf3.f;

public final class a implements g	// class@002c59
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b2;
       int i;
       a b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uoc, "3")) {
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidOneRefs(obj, b, uoc, "4")) {
             SCGzoneBottomLiveCardMessage krnUrl = obj.krnUrl;
             SCGzoneBottomLiveCardMessage obj1 = PatchProxy.applyOneRefs(krnUrl, b, uoc, "7");
             boolean b1 = false;
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                Uri uri = x0.f(krnUrl);
                b2 = (uri == null || !uri.isHierarchical())? false: true;
             }
             if (b2) {
                String str = String.valueOf(obj.widgetId);
                obj1 = PatchProxy.applyOneRefs(obj, b, uoc, "5");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else {
                   long l = (long)obj.showDurationMillis;
                   SCGzoneBottomLiveCardMessage showExpiredT = obj.showExpiredTime;
                   obj1 = obj.showDelayMillis;
                   if (showExpiredT > 0) {
                      l = (!l)? showExpiredT - b.s.s(): Math.min(l, (showExpiredT - b.s.s()));
                   }
                label_0084 :
                   if (l > 0) {
                      l = l - (long)obj1;
                   }
                   if (l - 0x7fffffff > 0) {
                      i = -1;
                   }else {
                      i = (int)l;
                   }
                }
                if (i < 0) {
                   b.W8(str);
                }else {
                   LinkedHashMap obj2 = PatchProxy.applyOneRefs(obj, b, uoc, "8");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else if(TextUtils.x(obj.frequencyKey)){
                      obj2 = a.b(new f(b).getType());
                      if (obj2 != null) {
                         Set set = obj2.get(Integer.valueOf(obj.widgetId));
                         if (set == null || !set.contains(obj.frequencyKey)) {
                         }
                      }else {
                      }
                   }
                   if (b1) {
                      b.V8(String.valueOf(obj.widgetId));
                      if (obj.checkUserStatus != null) {
                         b.P8(String.valueOf(obj.widgetId), a.a(b.s.getLiveStreamId(), String.valueOf(obj.widgetId), a.b(obj.maxCheckDelayMillis)).subscribe(new d(b, obj, i), new e(b)));
                      }else {
                         b.R8(obj, i);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
