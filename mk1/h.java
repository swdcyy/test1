package mk1.h;
import im8.g;
import vl8.c;
import java.util.Random;
import com.kuaishou.live.common.core.basic.fragment.LiveBaseFragment;
import mk1.a;
import mk1.b;
import mk1.x;
import mk1.a0;
import android.util.SparseArray;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mk1.f;
import mk1.u;
import mk1.t;
import java.util.Map;
import java.util.HashMap;

public class h extends c implements g	// class@0031a2
{
    public b A;
    public a B;
    public a C;
    public a D;
    public a E;
    public b F;
    public v G;
    public int H;
    public SparseArray I;
    public Map J;
    public Gift K;
    public boolean L;
    public a$c M;
    public x N;
    public a0 O;
    public final f c;
    public final a d;
    public final b e;
    public final c f;
    public final d g;
    public final e h;
    public final b i;
    public final b j;
    public View k;
    public a l;
    public LiveBaseFragment m;
    public e n;
    public a o;
    public a p;
    public b q;
    public a r;
    public a s;
    public c t;
    public a u;
    public a v;
    public c w;
    public a x;
    public b y;
    public a z;
    public static final Random P;

    static {
       h.P = new Random();
    }
    public void h(LiveBaseFragment p0,a p1,b p2,x p3,a0 p4){
       super();
       this.H = h.P.nextInt(0x989680);
       this.I = new SparseArray();
       this.J = new ConcurrentHashMap();
       this.m = p0;
       this.d = p1;
       this.e = p2;
       this.f = p2.a;
       this.g = p2.b;
       this.h = p2.c;
       this.i = p2.d;
       this.j = p2.e;
       this.c = p1.c;
       this.N = p3;
       this.O = p4;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableGiftBoxNavigationBarDisableOpt", false);
    }
    public String O(GiftTab p0){
       String obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          b.Z(LiveLogTag.GIFT, "[LiAudienceGiftBoxCallerContext] [getRecoGiftLlsid]: GiftTab is null");
          return obj;
       }else if(p0 != GiftTab.NormalGift){
          b.Z(LiveLogTag.GIFT, "[LiAudienceGiftBoxCallerContext] [getRecoGiftLlsid]: GiftTab is not narmalGift");
          return obj;
       }else {
          h tc = this.c;
          if (tc != null) {
             return tc.i(p0, this.e.l());
          }
          b.Z(LiveLogTag.GIFT, "[LiAudienceGiftBoxCallerContext] [getRecoGiftLlsid]: mGiftBoxDataSource is null");
          return obj;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new u();
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(h.class, new u());
       }else if(p0.equals("provider")){
          obj.put(h.class, new t());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
}
