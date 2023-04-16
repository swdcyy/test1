package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$a;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import lnc.a1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import z1.k;
import msd.a;
import java.util.concurrent.ConcurrentHashMap;
import ec3.f;
import t45.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$pagerHeight$2;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$panelHeight$2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$b;
import brd.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import rm1.g;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;

public final class LiveGiftPanelConfig	// class@0011dd
{
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final boolean c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;
    public final String k;
    public final z l;
    public final p m;
    public final int n;
    public final p o;
    public final List p;
    public final List q;
    public final List r;
    public LiveGiftPanelConfig$c s;
    public LiveGiftPanelConfig$b t;
    public final k u;
    public static final UIBackground v;
    public static final UIText w;
    public static final UIText x;
    public static final UIGiftPanelTab y;
    public static final LiveGiftPanelConfig$a z;

    static {
       LiveGiftPanelConfig.z = new LiveGiftPanelConfig$a(null);
       UIBackground uIBackground = new UIBackground(0, null, null, null, null, 30, null);
       LiveGiftPanelConfig.v = v0;
       String str = a1.p(R.string.arg_RES_7f101cde);
       a.o(str, "CommonUtil.string\(R.string.lite_tab_gift_title\)");
       UIText uIText = new UIText(1, 14, str, "#F73B68");
       LiveGiftPanelConfig.w = uIText;
       String str1 = a1.p(R.string.arg_RES_7f101cde);
       a.o(str1, "CommonUtil.string\(R.string.lite_tab_gift_title\)");
       UIText uIText1 = new UIText(0, 14, str1, "#909092");
       LiveGiftPanelConfig.x = uIText1;
       UIText uIText2 = uIText1;
       UIGiftPanelTab uIGiftPanelT = new UIGiftPanelTab(v0, v0, uIText, uIText2, null, null, 0, 48, 0);
       LiveGiftPanelConfig.y = str1;
    }
    public void LiveGiftPanelConfig(){
       super(null, null);
    }
    public void LiveGiftPanelConfig(k p0,a p1){
       z c;
       super();
       this.u = p0;
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.d = "#1ABBBBFF";
       this.e = 12;
       this.f = 12;
       String str = "#FFFFFF";
       this.g = str;
       this.h = 10;
       this.i = "#80C6C6C6";
       this.j = 12;
       this.k = str;
       if (f.d()) {
          c = d.c;
          a.o(c, "KwaiSchedulers.ASYNC");
       }else {
          c = d.a;
          a.o(c, "KwaiSchedulers.MAIN");
       }
       this.l = c;
       this.m = s.c(new LiveGiftPanelConfig$pagerHeight$2(p1));
       this.n = a1.e(38.00f);
       this.o = s.c(new LiveGiftPanelConfig$panelHeight$2(this));
       String[] stringArray = new String[]{"NormalGift","PrivilegeGift","FansGroupGift"};
       this.p = CollectionsKt__CollectionsKt.L(stringArray);
       this.q = t.k("NormalGift");
       Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(5),Integer.valueOf(3)};
       this.r = CollectionsKt__CollectionsKt.L(integerArray);
       this.s = new LiveGiftPanelConfig$c();
       this.t = new LiveGiftPanelConfig$b();
       this.c = true;
       return;
    }
    public final z a(){
       return this.l;
    }
    public final String b(){
       return this.k;
    }
    public final int c(){
       return this.j;
    }
    public final int d(){
       return this.e;
    }
    public final int e(String p0){
       LiveGiftPanelRefreshConfig obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "tabId");
       obj = null;
       if (a.g(p0, "NormalGift") && g.a()) {
          LiveGiftPanelConfig tu = this.u;
          if (tu != null) {
             LiveGiftPanelRefreshConfig liveGiftPane = tu.get();
             if (liveGiftPane != null) {
                obj = liveGiftPane.mPanelRefreshMode;
             }
          }
       }
       return obj;
    }
    public final List f(){
       return this.r;
    }
    public final List g(){
       return this.q;
    }
}
