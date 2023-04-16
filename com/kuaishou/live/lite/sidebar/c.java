package com.kuaishou.live.lite.sidebar.c;
import com.kuaishou.live.lite.sidebar.e$a;
import java.lang.String;
import java.lang.Object;
import va1.a;
import fd3.l;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.sidebar.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.view.View;
import com.kuaishou.live.lite.sidebar.c$a;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import com.kuaishou.live.lite.sidebar.e$b;
import fd3.m;
import android.content.Context;
import java.lang.Boolean;
import fg6.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarSimpleItemConfig;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import ekd.j;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import fd3.i;
import msd.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.widget.ImageView;
import fd3.h;
import android.view.View$OnClickListener;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import com.kuaishou.live.lite.sidebar.b;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import msd.l;

public class c implements e$a	// class@000b48
{
    public final int a;
    public final String b;
    public c$a c;
    public View$OnClickListener d;
    public k e;

    public void c(int p0,String p1){
       super();
       this.d = a.b;
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       l.c(this);
    }
    public JsonObject b(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.a(this.e, a.a).orNull();
    }
    public boolean c(){
       return l.e(this);
    }
    public JsonObject d(){
       return l.b(this);
    }
    public void e(){
       l.d(this);
    }
    public View f(){
       c tc = this.c;
       if (tc == null) {
          return null;
       }
       return tc.b;
    }
    public List g(){
       c obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return Collections.emptyList();
       }
       View[] viewArray = new View[]{obj.c,obj.d};
       return Arrays.asList(viewArray);
    }
    public String getLogName(){
       return this.b;
    }
    public void h(){
       m.c(this);
    }
    public void i(){
       m.d(this);
    }
    public int j(){
       return this.a;
    }
    public View k(Context p0,JsonObject p1,boolean p2){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.c == null) {
          this.c = new c$a(p0, p2);
          if (p1 != null) {
             LiveLiteSideBarSimpleItemConfig liveLiteSide = a.a.c(p1, LiveLiteSideBarSimpleItemConfig.class);
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p2), liveLiteSide, this, uoc, "2")) {
                LiveLiteSideBarSimpleItemConfig mLiteSideBot = (p2)? liveLiteSide.mLiteSideBottomEntryButtonIconUrl: liveLiteSide.mLiteSideEntryButtonIconUrl;
                if (!j.h(mLiteSideBot)) {
                   c tc = this.c;
                   LiveLiteSideBarIconHelper$Request request = new LiveLiteSideBarIconHelper$Request(this.a, tc.c, tc.d, mLiteSideBot);
                   request.f(new i(this, p2, liveLiteSide));
                   LiveLiteSideBarIconHelper.a(request);
                }
             }
             if (!TextUtils.x(liveLiteSide.mText) && !p2) {
                this.c.b.setText(liveLiteSide.mText);
             }
          }
       label_0081 :
          this.c.c.setVisibility(0);
          this.c.a.setOnClickListener(new h(this));
       }
       return this.c.a;
    }
    public View l(){
       c tc = this.c;
       if (tc != null) {
          return tc.f;
       }
       return null;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       c tc = this.c;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, c$a.class, "1") && tc.g != null) {
             tc.a.setOnClickListener(null);
             c$a b = tc.b;
             if (b != null) {
                b.setText("");
             }
             tc.c.i0();
             b = tc.e;
             if (b != null) {
                b.setBackground(null);
             }
             tc.f.setScaleX(0x3f800000);
             tc.f.setScaleY(0x3f800000);
             LiveLiteViewRecycler.d.d(tc.g, b.b);
          }
          this.c = null;
       }
       return;
    }
    public void n(View$OnClickListener p0){
       this.d = p0;
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.d.onClick(p0);
       return;
    }
}
