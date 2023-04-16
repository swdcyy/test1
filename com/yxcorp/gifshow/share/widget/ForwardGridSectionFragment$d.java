package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import mp7.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sharelib.ui.SharePanelFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import zf6.k;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import ip7.j;
import android.content.Context;
import androidx.core.content.ContextCompat;
import ml8.d;
import djc.w;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d$a;
import android.view.View$OnClickListener;
import fjc.c;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.yxcorp.gifshow.share.im.ImSharePanelElement;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.Number;
import mhc.g2;
import mhc.g2$a;
import mp7.e$a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d$b;
import java.util.List;
import mp7.d;
import java.util.Objects;
import ip7.h;
import mp7.a;
import yo7.b;
import mp7.c;
import java.util.Collection;
import ekd.q;

public class ForwardGridSectionFragment$d implements e	// class@001cc7
{
    public int a;
    public c b;
    public final ForwardGridSectionFragment c;

    public void ForwardGridSectionFragment$d(ForwardGridSectionFragment p0){
       a.p(p0, "panel");
       super();
       this.c = p0;
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       View obj;
       ForwardGridSectionFragment$d uod = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       ForwardGridSectionFragment$d uod1 = ForwardGridSectionFragment$d.class;
       int i1 = 4;
       int i2 = 1;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uod1, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       obj = p1.findViewById(R.id.divider);
       if (obj != null) {
          int i3 = p3 + 1;
          RecyclerView recyclerView = uod.c.Xh().h0();
          if (recyclerView != null) {
             RecyclerView$Adapter adapter = recyclerView.getAdapter();
             if (adapter != null && i3 == adapter.getItemCount()) {
             label_006c :
                obj.setVisibility(i1);
             label_0073 :
                ShareInitResponse$ShareTheme shareTheme = uod.c.Xh().Vg();
                if (shareTheme != null) {
                   shareTheme = shareTheme.mPanel;
                   if (shareTheme != null) {
                      ShareInitResponse$ThemeElement mSeparatorCo = shareTheme.mSeparatorColour;
                      if (mSeparatorCo != null) {
                         Integer integer = j.b(mSeparatorCo);
                         if (integer != null) {
                            i3 = integer.intValue();
                         label_009d :
                            obj.setBackgroundColor(i3);
                         }
                      }
                   }
                }
                i3 = ContextCompat.getColor(p1.getContext(), R.color.arg_RES_7f060b1b);
                goto label_009d ;
             }
          }
          if (i == 2 && !k.d()) {
             goto label_006c ;
          }else {
             obj.setVisibility(0);
             goto label_0073 ;
          }
       }
       if (i == 2) {
          if (k.d()) {
             p1.setBackgroundColor(0);
          }else {
             p1.setBackgroundColor(ContextCompat.getColor(p1.getContext(), R.color.arg_RES_7f060183));
          }
       }
       if (a.g(p0.c(), "FANS_BANNER")) {
          ForwardGridSectionFragment e = uod.c.E;
          if (e != null) {
             e.doBindView(p1);
          }
          e = uod.c.E;
          if (e != null) {
             obj = e.da();
             if (obj != null) {
                obj.setOnClickListener(new ForwardGridSectionFragment$d$a(this));
             }
          }
       }else if(i == 3){
          uod1 = uod.b;
          a.m(uod1);
          i2 = uod1.a(p0, p1, p2, p3, p4);
       }else {
          i2 = false;
       }
       return i2;
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       View view1;
       ForwardGridSectionFragment$d uod = ForwardGridSectionFragment$d.class;
       int i = 4;
       int i1 = 2;
       int i2 = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
             return;
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       if (p2 == i2) {
          ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
          if (!sharePanelEl instanceof ImSharePanelElement) {
             sharePanelEl = null;
          }
          if (sharePanelEl != null) {
             KwaiImageView kwaiImageVie = p1.findViewById(R.id.image);
             p3 = (sharePanelEl.isGroup())? 0x7f080145: 0x7f081ffe;
             kwaiImageVie.setFailureImage(p3);
             kwaiImageVie.setPlaceHolderImage(p3);
             ForwardGridSectionFragment e = this.c.E;
             p3 = 0x7f0a2eac;
             if (e != null && e.p9() == i2) {
                ImageView imageView = p1.findViewById(p3);
                if (imageView != null) {
                   imageView.setImageResource(R.drawable.arg_RES_7f08048e);
                }
             }
             int i3 = 0x7f0a3f2c;
             if (sharePanelEl.isGroup() || TextUtils.isEmpty(sharePanelEl.getOnlineStatus())) {
                TextView textView = p1.findViewById(R.id.group_title);
                TextView textView1 = p1.findViewById(i3);
                View view = p1.findViewById(R.id.group_title);
                a.o(view, "v.findViewById<TextView>\(R.id.group_title\)");
                view.setText(sharePanelEl.mDisplayName);
                a.o(textView1, "textSingle");
                textView1.setVisibility(8);
                a.o(textView, "textGroup");
                textView.setVisibility(0);
                view1 = p1.findViewById(p3);
                a.o(view1, "v.findViewById<View>\(R.id.online_badge\)");
                view1.setVisibility(8);
                view1 = p1.findViewById(R.id.online_status_text);
                a.o(view1, "v.findViewById<TextView>\(R.id.online_status_text\)");
                view1.setVisibility(8);
                textView.setTextSize(0, textView1.getTextSize());
                textView.setTextColor(textView1.getCurrentTextColor());
             }else {
                View view2 = p1.findViewById(i3);
                a.o(view2, "v.findViewById<TextView>\(R.id.title\)");
                view2.setVisibility(0);
                view2 = p1.findViewById(R.id.group_title);
                a.o(view2, "v.findViewById<TextView>\(R.id.group_title\)");
                view2.setVisibility(8);
                view2 = p1.findViewById(p3);
                a.o(view2, "v.findViewById<View>\(R.id.online_badge\)");
                if (sharePanelEl.isOnLine()) {
                   i = 0;
                }
                view2.setVisibility(i);
                if (this.c.bi()) {
                   view1 = p1.findViewById(R.id.online_status_text);
                   a.o(view1, "v.findViewById<TextView>\(R.id.online_status_text\)");
                   view1.setVisibility(8);
                }else {
                   TextView textView2 = p1.findViewById(R.id.online_status_text);
                   textView2.setVisibility(0);
                   String onlineStatus = sharePanelEl.getOnlineStatus();
                   if (onlineStatus == null) {
                      onlineStatus = "";
                   }
                   textView2.setText(onlineStatus);
                }
             }
          }
       }else if(p2 == i1){
          TextView textView3 = p1.findViewById(R.id.recent_channel_label);
          if (textView3 != null) {
             TextPaint paint = textView3.getPaint();
             a.o(paint, "paint");
             paint.setFakeBoldText(i2);
             textView3.setText(this.c.G);
          }
       }
       return;
    }
    public int c(i0 p0,int p1,int p2){
       g2$a obj;
       int i;
       if (PatchProxy.isSupport(ForwardGridSectionFragment$d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ForwardGridSectionFragment$d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       if (a.g("IM", p0.a().mId)) {
          i = 1;
       }else {
          obj = g2.X;
          if (a.g(obj.d().b(), p0.a().mId)) {
             i = 4;
          }else if(a.g(this.c.Wh(), p0.a().mId)){
             i = 2;
          }else if(a.g(obj.y().a(), p0.a().mCamelName)){
             i = 3;
          }else {
             i = -1;
          }
       }
       return i;
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       ForwardGridSectionFragment$d uod = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p3;
       ForwardGridSectionFragment$d uod1 = ForwardGridSectionFragment$d.class;
       int i1 = 3;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uod1, "5")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       e$a.e(this, p0, p1, p2, p3, p4);
       if (p2 == i1) {
          uod1 = uod.b;
          a.m(uod1);
          uod1.d(p0, p1, p2, p3, p4);
       }
       View view = p1.findViewById(R.id.forward_panel_item_cancel);
       if (view != null) {
          ForwardGridSectionFragment e = uod.c.E;
          View view1 = (e != null)? e.da(): null;
          if (view1 != null) {
             view.setVisibility(8);
          }else {
             view.setOnClickListener(new ForwardGridSectionFragment$d$b(this, i, p0, p1));
             if (i == uod.a) {
                view.setVisibility(0);
                if (TextUtils.isEmpty(p0.c())) {
                   view = p1.findViewById(R.id.textTitle);
                   if (view != null) {
                      view.setVisibility(4);
                   }
                }
             }else {
                view.setVisibility(8);
             }
          }
       }
    label_0095 :
       return;
    }
    public List e(int p0){
       return d.b(this, p0);
    }
    public boolean f(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       ForwardGridSectionFragment$d uod = ForwardGridSectionFragment$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, uod, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       return e$a.b(this, p0, p1, p2, p3, p4, p5);
    }
    public int g(int p0){
       ForwardGridSectionFragment e;
       ForwardGridSectionFragment$d uod = ForwardGridSectionFragment$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == 1) {
          e = this.c.E;
          e = (e != null)? e.y0(): -1;
       }else if(p0 == 3){
          ForwardGridSectionFragment$d tb = this.b;
          a.m(tb);
          Objects.requireNonNull(tb);
          tb = 0x7f0d14f4;
       }else {
          p0 = 0x7f0d0492;
       }
       return e;
    }
    public int h(j0 p0,int p1){
       ShareInitResponse$SharePanelElement sharePanelEl;
       ForwardGridSectionFragment$d uod = ForwardGridSectionFragment$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       boolean i = 1;
       if (a.g(p0.c(), "FANS_BANNER")) {
          this.a = i;
       }else {
          i = false;
          if (p0.b() != null && this.c.Yh() != null) {
             this.c.gi(i);
             h oh = p0.b();
             a.m(oh);
             a uoa = this.c.Yh();
             a.m(uoa);
             c uoc = new c(oh, this.c.Xh().Vg(), uoa, this.c.Uh(), this.c.Zh(), 0x7f0d10ec);
             this.b = this.c;
             i = 3;
          }else if(!q.f(p0.a())){
             i0 oi0 = p0.a().get(i);
             if (oi0 != null) {
                sharePanelEl = oi0.a();
                if (sharePanelEl != null) {
                   sharePanelEl = sharePanelEl.mId;
                label_009a :
                   if (a.g(sharePanelEl, "IM")) {
                      ForwardGridSectionFragment e = this.c.E;
                      if (e != null && !e.p9()) {
                         i = 2;
                      }
                   }
                }
             }
             sharePanelEl = null;
             goto label_009a ;
          }
       label_00b0 :
          i = -1;
       }
       return i;
    }
    public int i(int p0){
       int i = 0x7f0d10ec;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                i = 0x7f0d10f0;
             }
          }else {
             i = 0x7f0d10ee;
          }
       }else {
          i = 0x7f0d0613;
       }
       return i;
    }
}
