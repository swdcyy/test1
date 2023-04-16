package dm0.a$c;
import lf3.g;
import dm0.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.ad.brand.activity.nano.SCAdWatchLiveTaskSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.protobuf.ad.brand.activity.nano.AdWatchLiveTaskWidgetInfo;
import yx.j0;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import dm0.b;
import com.kuaishou.protobuf.ad.brand.activity.nano.WidgetInfo;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import lf3.f;

public final class a$c implements g	// class@001fbb
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoa, "5")) {
             SCAdWatchLiveTaskSignal widgetInfo = p0.widgetInfo;
             if (widgetInfo != null) {
                tb.w = widgetInfo.widgetClientInfo;
                AdWatchLiveTaskWidgetInfo widgetShowSt = widgetInfo.widgetShowStatus;
                String str = "LiveAdWatchLivePendantPresenter";
                int i = 0;
                Object[] objArray = null;
                if (widgetShowSt == true) {
                   if (!PatchProxy.applyVoid(objArray, tb, uoa, "6")) {
                      Object[] objArray1 = new Object[i];
                      j0.f(str, "addPendant", objArray1);
                      if (tb.y == null) {
                         tb.y = true;
                         m om = tb.R8();
                         a p = tb.p;
                         if (p != null) {
                            p.b(om);
                         }
                      }
                   }
                   AdWatchLiveTaskWidgetInfo widgetInfo1 = widgetInfo.widgetInfo;
                   if (!PatchProxy.applyVoidOneRefs(widgetInfo1, tb, uoa, "7")) {
                      uoa = tb.z;
                      String str1 = "mWatchLivePendantView";
                      if (uoa == null) {
                         a.S(str1);
                      }
                      uoa.setOnClickListener(new b(tb, widgetInfo1));
                      a z = tb.z;
                      if (z == null) {
                         a.S(str1);
                      }
                      WidgetInfo title = (widgetInfo1 != null)? widgetInfo1.title: objArray;
                      if (widgetInfo1 != null) {
                         objArray = widgetInfo1.imgUrl;
                      }
                      CDNUrl[] uCDNUrlArray = e0.i(objArray);
                      a.o(uCDNUrlArray, "CDNUtil.parsePicUrl\(widgetInfo?.imgUrl\)");
                      Objects.requireNonNull(z);
                      if (!PatchProxy.applyVoidTwoRefs(title, uCDNUrlArray, z, WatchLivePendantView.class, "3")) {
                         a.p(uCDNUrlArray, "cdnUrls");
                         a$a uoa1 = a.d();
                         uoa1.b(":ks-features:ft-commercial:commercial-live");
                         uoa1.d(ImageSource.ICON);
                         a uoa2 = uoa1.a();
                         WatchLivePendantView b = z.b;
                         if (b != null) {
                            b.X(uCDNUrlArray, uoa2);
                         }
                         WatchLivePendantView c = z.c;
                         if (c != null) {
                            if (title == null) {
                               title = "";
                            }
                            c.setText(title);
                         }
                      }
                   }
                }else if(widgetShowSt != null || PatchProxy.applyVoid(objArray, tb, uoa, "8")){
                   Object[] objArray2 = new Object[i];
                   j0.f(str, "removePendent", objArray2);
                   if (tb.y != null) {
                      tb.y = i;
                      a p1 = tb.p;
                      if (p1 != null) {
                         p1.c(tb.R8());
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
