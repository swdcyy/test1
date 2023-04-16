package dz9.a;
import mf5.k;
import mf5.w0;
import dz9.a$a;
import nsd.u;
import java.lang.String;
import lnc.a1;
import dz9.a$c;
import dz9.a$d;
import dz9.a$e;
import dz9.a$f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import java.lang.Integer;
import java.util.List;
import bld.c;
import android.graphics.drawable.Drawable;
import bld.b;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import java.lang.Runnable;
import ekd.k1;
import q0.e;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import android.view.View$OnClickListener;
import android.view.View;
import tkd.b;
import tkd.d;
import vo5.b;
import vo5.b$b;
import dz9.a$g;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.content.Context;
import i2b.a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import kf5.g;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import com.kwai.plugin.dva.install.b;
import com.kwai.dva.design.PluginInstallerUIHandler;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import uw9.o;
import java.lang.Throwable;
import q87.c;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;

public class a extends w0 implements k	// class@002007
{
    public QPhoto C;
    public Activity D;
    public int E;
    public a$b F;
    public final Runnable G;
    public c H;
    public View I;
    public TextView J;
    public KwaiImageView K;
    public View L;
    public View M;
    public int N;
    public final a$d O;
    public final a$e P;
    public final b$b Q;
    public static final String R;
    public static final a$a S;

    static {
       a.S = new a$a(null);
       a.R = a1.p(0x7f100e69);
    }
    public void a(){
       super("atlas_search_realted_photo");
       this.G = new a$c(this);
       this.N = -2;
       this.O = new a$d(this);
       this.P = new a$e(this);
       this.Q = new a$f(this);
       this.L(R.drawable.arg_RES_7f080dd5);
       this.T(R.string.arg_RES_7f100251);
    }
    public final boolean W(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C;
       if (obj != null) {
          QPhoto mEntity = obj.mEntity;
          if (mEntity != null) {
             PhotoMeta photoMeta = mEntity.a(PhotoMeta.class);
             if (photoMeta != null) {
                photoMeta = photoMeta.mMMUSimilarSearchInfo;
                if (photoMeta != null) {
                   MMUSimilarSearchInfo mHasCommodit = photoMeta.mHasCommodityPicIndexes;
                   if (mHasCommodit != null) {
                      b = mHasCommodit.contains(Integer.valueOf(this.E));
                   label_003a :
                      return b;
                   }
                }
             }
          }
       }
       b = false;
       goto label_003a ;
    }
    public final Drawable X(c p0){
       b obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       Application uApplication1 = a.b();
       a.o(uApplication1, "AppEnv.getAppContext\(\)");
       Resources resources = uApplication1.getResources();
       obj.p(uApplication.getResources().getColor(R.color.arg_RES_7f0616ed), resources.getColor(R.color.arg_RES_7f0617bb));
       obj.g(p0);
       Drawable uDrawable = obj.a();
       a.o(uDrawable, "DrawableCreator.Builder\(¡­yle\(style\)\n      .build\(\)");
       return uDrawable;
    }
    public final void Y(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       k1.m(this.G);
       a tF = this.F;
       if (tF != null) {
          tF.dismiss();
       }
       return;
    }
    public final boolean Z(){
       String obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.R;
       a.o(obj, "ATLAS_SEARCH_PLUGIN_NAME");
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       this.h();
       a tI = this.I;
       if (tI != null) {
          tI.setOnClickListener(null);
       }
       return;
    }
    public final void a0(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       b uob = d.a(0x3a21af1e);
       if (uob != null) {
          uob.I5(this.Q);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       a tI = this.I;
       if (tI != null) {
          tI.setOnClickListener(new a$g(this));
       }
       int i = this.k();
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                tI = this.I;
                if (tI != null) {
                   tI.setBackground(this.X(KwaiRadiusStyles.NULL));
                }
                tI = this.M;
                if (tI != null) {
                   tI.setVisibility(0);
                }
             }else {
                tI = this.I;
                if (tI != null) {
                   tI.setBackground(this.X(KwaiRadiusStyles.R12));
                }
                tI = this.M;
                if (tI != null) {
                   tI.setVisibility(8);
                }
             }
          }else {
             tI = this.I;
             if (tI != null) {
                tI.setBackground(this.X(KwaiRadiusStyles.BL12_BR12));
             }
             tI = this.M;
             if (tI != null) {
                tI.setVisibility(8);
             }
          }
       }else {
          tI = this.I;
          if (tI != null) {
             tI.setBackground(this.X(KwaiRadiusStyles.TL12_TR12));
          }
          tI = this.M;
          if (tI != null) {
             tI.setVisibility(0);
          }
       }
    label_007b :
       return;
    }
    public final void b0(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       this.a0();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          k1.r(this.G, 500);
       }
       b uob = d.a(0x3a21af1e);
       if (uob != null) {
          uob.Gq(this.C, this.E, this.N);
       }
       return;
    }
    public void c(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       a.p(p0, "rootView");
       a tI = this.I;
       if (tI != null) {
          a.m(tI);
          if (tI.getParent() != null) {
             return;
          }
       }
       View view = a.a(a.b(), R.layout.arg_RES_7f0d00ca);
       this.I = view;
       View view1 = null;
       view = (view != null)? view.findViewById(R.id.item_divider_line): view1;
       this.M = view;
       tI = this.I;
       TextView textView = (tI != null)? tI.findViewById(R.id.item_title): view1;
       this.J = textView;
       if (textView != null) {
          textView.setText(a1.p(this.v()));
       }
       tI = this.I;
       KwaiImageView kwaiImageVie = (tI != null)? tI.findViewById(R.id.item_icon): view1;
       this.K = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setImageResource(this.o());
       }
       tI = this.I;
       if (tI != null) {
          view1 = tI.findViewById(R.id.item_red_dot);
       }
       this.L = view1;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, a1.d(0x7f07031d));
       layoutParams.setMargins(a1.d(R.dimen.arg_RES_7f0702ab), 0, a1.d(R.dimen.arg_RES_7f0702ab), 0);
       p0.addView(this.I, layoutParams);
       return;
    }
    public void d(w0 p0,g p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       a tL = this.L;
       if (tL != null) {
          tL.setVisibility(8);
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putBoolean(b.d("user")+"enableShowAtlasRedDot", false);
       g.a(uEditor);
       if (!PatchProxy.applyVoid(null, this, uoa, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PIC_SEARCH_ENTRANCE";
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.elementPackage = uElementPack;
          u1.z(new ClientEvent$UrlPackage(), uClickEvent);
       }
       if (this.Z()) {
          this.b0();
       }else if(this.D != null){
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          b pluginInstal = uDva.getPluginInstallManager();
          a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
          String r = a.R;
          a.o(r, "ATLAS_SEARCH_PLUGIN_NAME");
          a tD = this.D;
          a.m(tD);
          PluginInstallerUIHandler$a uoa1 = PluginInstallerUIHandler.s.b(tD);
          h.a(pluginInstal, r, uoa1.d(this.O));
       }
       return;
    }
    public void h(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "5")) {
          b uob1 = d.a(0x3a21af1e);
          if (uob1 != null) {
             uob1.Ox(this.Q);
          }
       }
       this.Y();
       if (!PatchProxy.applyVoid(null, this, uoa, "10")) {
          b uob = d.a(0x3a21af1e);
          if (uob != null) {
             uob.destroy();
          }
          uoa = this.H;
          if (uoa != null) {
             uoa.n(this.P);
          }
          this.D = null;
       }
       return;
    }
    public void onShow(){
       String str;
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "14") && !this.Z()) {
          str = a.R;
          a.o(str, "ATLAS_SEARCH_PLUGIN_NAME");
          PluginDownloadExtension.k.s(str, 40);
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          c uoc = uDva.getPluginInstallManager().j(str);
          this.H = uoc;
          if (uoc != null) {
             uoc.a(this.P);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PIC_SEARCH_ENTRANCE";
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          u1.z0(new ClientEvent$UrlPackage(), showEvent);
       }
       a tL = this.L;
       str = null;
       if (tL != null) {
          Object obj = PatchProxy.apply(objArray, this, uoa, "20");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             long l = c.i();
             long l1 = DateUtils.o(l) + 0x4d3f6400;
             b = (c.a.getBoolean(b.d("user")+"enableShowAtlasRedDot", true) && (l - str <= 0 || System.currentTimeMillis() - l1 <= 0))? true: false;
          }
          if (!b) {
             i = 8;
          }
          tL.setVisibility(i);
       }
       if (c.i() - str <= 0) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putLong(b.d("user")+"firstAtlasShowRedDotTime", System.currentTimeMillis());
          g.a(uEditor);
       }
       return;
    }
}
