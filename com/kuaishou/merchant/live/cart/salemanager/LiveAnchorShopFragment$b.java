package com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import im8.g;
import java.lang.Object;
import java.util.ArrayList;
import o54.a;
import js3.a;
import r54.a;
import com.kuaishou.merchant.live.cart.salemanager.model.SandeaSwitchInfo;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo;
import java.util.HashMap;
import com.kuaishou.merchant.live.cart.salemanager.model.TopToolBar;
import com.kuaishou.merchant.live.cart.salemanager.model.TopNoticeBarInfo;
import com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo;
import r54.b;
import com.kuaishou.merchant.live.cart.salemanager.model.AnchorManagerTabSelectedEvent;
import com.kuaishou.merchant.live.cart.salemanager.model.AnchorManagerTabVisibleEvent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import b34.b;
import lnc.c3$b;
import lnc.c3;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import java.util.Map;

public class LiveAnchorShopFragment$b implements g	// class@0019ce
{
    public List b;
    public a c;
    public c$a d;
    public LiveMerchantBaseContext e;
    public a f;
    public a g;
    public a h;
    public List i;
    public String j;
    public SandeaSwitchInfo k;
    public c l;
    public ExcellentCommodityInfo m;
    public String n;
    public HashMap o;
    public TopToolBar p;
    public TopNoticeBarInfo q;
    public TabBarInfo r;
    public RecyclerView s;
    public int t;
    public ViewGroup u;
    public b v;
    public AnchorManagerTabSelectedEvent w;
    public AnchorManagerTabVisibleEvent x;
    public TabBarInfo$TabInfo y;
    public boolean z;

    public void LiveAnchorShopFragment$b(){
       super();
       this.b = new ArrayList();
       this.c = new a();
       this.g = new a();
       this.h = new a();
       this.i = new ArrayList();
       this.k = new SandeaSwitchInfo();
       this.m = new ExcellentCommodityInfo();
       this.o = new HashMap();
       this.p = new TopToolBar();
       this.q = new TopNoticeBarInfo();
       this.r = new TabBarInfo();
       this.v = new b();
       this.w = new AnchorManagerTabSelectedEvent();
       this.x = new AnchorManagerTabVisibleEvent();
       this.y = null;
    }
    public String a(){
       LiveAnchorShopFragment$b obj = PatchProxy.apply(null, this, LiveAnchorShopFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       String id = (obj == null)? QCurrentUser.ME.getId(): obj.getLiveAuthorId();
       return id;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorShopFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.e, b.a);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorShopFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.j, "LiveCoverOptionPart");
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorShopFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.j, "LiveEscrowFragment");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorShopFragment$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorShopFragment$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAnchorShopFragment$b.class, new e0());
       }else {
          obj.put(LiveAnchorShopFragment$b.class, null);
       }
       return obj;
    }
}
