package com.kwai.live.gzone.debugconfig.d;
import yf6.h;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import yf6.g;
import java.lang.String;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i2b.a;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.EditText;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.live.gzone.common.keyswitch.a;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.live.gzone.debugconfig.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.debugconfig.b;
import java.lang.Number;
import xf6.l;
import v47.c;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import android.widget.LinearLayout;
import com.kwai.live.gzone.debugconfig.GzoneDebugSwitch;
import v47.d;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public class d implements h	// class@000cd5
{
    public KwaiSizeAdjustableTextView b;
    public KwaiSizeAdjustableTextView c;
    public View d;
    public View e;
    public SlipSwitchButton f;
    public View g;
    public SlipSwitchButton h;
    public SlipSwitchButton i;
    public SlipSwitchButton j;
    public SlipSwitchButton k;
    public ArrayList l;
    public ArrayList m;
    public EditText n;
    public View o;

    public void d(){
       super();
       this.l = new ArrayList();
       this.m = new ArrayList();
    }
    public void a(View p0,boolean p1){
       g.a(this, p0, p1);
    }
    public String getTitle(){
       return "游戏直播";
    }
    public View newPage(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, uod, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (!PatchProxy.applyVoid(obj, this, uod, "4")) {
          this.l.add("不设置\(使用下发\)");
          this.l.add("强制打开");
          this.l.add("强制关闭");
          this.m.add("正常展示Tab");
          this.m.add("仅聊天Tab");
          this.m.add("仅聊天+主播Tab");
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d024c);
       if (!PatchProxy.applyVoidOneRefs(view, this, uod, "5")) {
          this.b = view.findViewById(0x7f0a1f4a);
          this.c = view.findViewById(0x7f0a1f4d);
          this.d = view.findViewById(0x7f0a1f48);
          this.e = view.findViewById(0x7f0a1f4b);
          this.f = view.findViewById(0x7f0a1ece);
          this.h = view.findViewById(0x7f0a1f45);
          this.i = view.findViewById(0x7f0a1f44);
          this.j = view.findViewById(0x7f0a1f46);
          this.k = view.findViewById(0x7f0a1f47);
          this.n = view.findViewById(0x7f0a10ab);
          this.o = view.findViewById(0x7f0a10a3);
       }
       if (!PatchProxy.applyVoidOneRefs(view, this, uod, "6")) {
          GifshowActivity context = view.getContext();
          this.b.setText(this.l.get(a.c()));
          this.d.setOnClickListener(new a(this, context));
          this.c.setText(this.m.get(a.b()));
          this.e.setOnClickListener(new b(this, context));
          String str = "7";
          if (!PatchProxy.applyVoid(obj, this, uod, str)) {
             Object obj2 = PatchProxy.apply(obj, this, uod, "10");
             int i1 = (obj2 != patchProxyRe)? obj2.intValue(): l.e("gzone_dev_gift", -1);
             if (i1 > 0) {
                this.n.setText(String.valueOf(i1));
             }
             this.o.setOnClickListener(new c(this));
          }
          d tf = this.f;
          Object obj1 = PatchProxy.apply(obj, obj, a.class, str);
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): b.b().a(LiveGzoneKeys.KEY_DEV_DEBUG_TOAST).a();
          tf.setSwitch(b);
          this.h.setSwitch(a.j());
          this.i.setSwitch(a.g());
          this.j.setSwitch(a.h());
          this.k.setSwitch(a.i());
       }
       LinearLayout linearLayout = view.findViewById(R.id.gzone_debug_linear_layout);
       if (!PatchProxy.applyVoidOneRefs(linearLayout, this, uod, "9")) {
          GzoneDebugSwitch[] gzoneDebugSw = GzoneDebugSwitch.values();
          int len = gzoneDebugSw.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = gzoneDebugSw[i];
             View view1 = a.i(linearLayout, R.layout.arg_RES_7f0d0baf);
             linearLayout.addView(view1);
             SlipSwitchButton slipSwitchBu = view1.findViewById(R.id.gzone_debug_switch);
             view1.findViewById(R.id.gzone_debug_switch_title_view).setText(oobject.mTitle);
             slipSwitchBu.setSwitch(oobject.isOn());
             slipSwitchBu.setOnSwitchChangeListener2(new d(this, oobject));
          }
       }
       return view;
    }
    public void onConfirm(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       a uoa = a.class;
       String str = "8";
       if (!PatchProxy.applyVoid(objArray, this, uod, str)) {
          boolean switch = this.f.getSwitch();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, str)) {
             b.b().c(LiveGzoneKeys.KEY_DEV_DEBUG_TOAST, switch);
          }
          switch = this.h.getSwitch();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "15")) {
             b.b().c(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_MULTI_TAB, switch);
          }
          switch = this.i.getSwitch();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "20")) {
             b.b().c(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_GRPR, switch);
          }
          switch = this.j.getSwitch();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "22")) {
             b.b().c(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT, switch);
          }
          switch = this.k.getSwitch();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(switch), objArray, uoa, "24")) {
             b.b().c(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_X_STREAM, switch);
          }
       }
       return;
    }
}
