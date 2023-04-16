package b74.a;
import cs5.f;
import b74.a$a;
import nsd.u;
import android.app.Activity;
import lp3.e;
import c74.c;
import cs5.g;
import b74.b;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import cs5.h;
import cs5.i;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ot3.u0;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import c74.b;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import b74.a$b;
import android.view.View$OnClickListener;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;

public final class a extends f	// class@00031e
{
    public final Activity q;
    public final e r;
    public final c s;
    public b t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(Activity p0,e p1,c p2,g p3,b p4){
       super(p1, p3, LiveMiniWidgetPositionType.RIGHT_BOTTOM_NORMAL, null);
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p4;
       i oi = new i(this.z(), p2.shrinkBarTitle, p2.shrinkBarBackgroundColor, null, null, null, this.u());
       this.r0(p0);
    }
    public f h(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.q, this.r, this.s, this.y(), null);
       uoa = this.t;
       if (uoa != null) {
          obj.t = uoa;
       }
       this.g(obj);
       return obj;
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return u0.b();
    }
    public View n0(){
       KwaiImageView obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiImageView(this.q);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.s.displayImageUrls.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().url);
       }
       int i = 0;
       String[] stringArray = new String[i];
       Object[] objArray = uArrayList.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       CDNUrl[] uCDNUrlArray = e0.g(objArray);
       if (!uCDNUrlArray.length) {
          i = 1;
       }
       if (i ^ 1) {
          obj.U(uCDNUrlArray);
       }
       obj.setOnClickListener(new a$b(this));
       return obj;
    }
    public LiveMiniWidgetItemType o(){
       return LiveMiniWidgetItemType.MERCHANT_ACTIVITY_TYPE;
    }
    public void o0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          tt.b(this.s);
       }
       return;
    }
    public boolean t0(f p0,String p1){
       return false;
    }
}
