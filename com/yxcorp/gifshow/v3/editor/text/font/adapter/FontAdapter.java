package com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import yuc.c;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$hostWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$layoutManager$2;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import zuc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zuc.b;
import java.lang.Runnable;
import android.view.View;
import java.lang.Integer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import d0c.d;
import com.yxcorp.gifshow.postfont.model.FontType;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import zuc.c;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH;

public final class FontAdapter extends RecyclerView$Adapter	// class@001438
{
    public final p e;
    public final List f;
    public final p g;
    public final FontAdapter$a h;
    public c i;
    public FontVMDelegate j;

    public void FontAdapter(c p0,FontVMDelegate p1){
       a.p(p0, "host");
       a.p(p1, "delegate");
       super();
       this.i = p0;
       this.j = p1;
       this.e = s.c(new FontAdapter$hostWidth$2(this));
       this.f = this.j.d();
       this.g = s.c(new FontAdapter$layoutManager$2(this));
       this.h = new FontAdapter$a(this);
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontAdapter.class, "8")) {
       }else {
          a.p(p0, "holder");
          p0.itemView.post(new b(this, p0.getAdapterPosition()));
       }
       return;
    }
    public final void J0(int p0){
       FontAdapter uFontAdapter = FontAdapter.class;
       if (PatchProxy.isSupport(uFontAdapter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontAdapter, "10")) {
          return;
       }
       int i = 2;
       if (p0 < i) {
          this.K0().scrollToPosition(0);
          return;
       }else {
          Number number = PatchProxy.apply(null, this, uFontAdapter, "1");
          if (number == PatchProxyResult.class) {
             number = this.e.getValue();
          }
          this.K0().scrollToPositionWithOffset(p0, ((number.intValue() / i) - a1.e(43.50f)));
          return;
       }
    }
    public final LinearLayoutManager K0(){
       Object obj = PatchProxy.apply(null, this, FontAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final List L0(){
       return this.f;
    }
    public final void M0(int p0){
       FontAdapter uFontAdapter = FontAdapter.class;
       if (PatchProxy.isSupport(uFontAdapter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontAdapter, "12")) {
          return;
       }
       this.m0(p0, FontPayload.BIND_WITHOUT_LOG_EVENT);
       return;
    }
    public final void N0(int p0){
       FontAdapter uFontAdapter = FontAdapter.class;
       if (PatchProxy.isSupport(uFontAdapter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontAdapter, "11")) {
          return;
       }
       int i = this.j.b();
       Object[] objArray = new Object[0];
       a.D().s("FontBIZ", "setSelectPosition: "+p0+" current: "+i, objArray);
       if (this.f.size() <= p0) {
          return;
       }
       if (i == p0) {
          return;
       }
       this.f.get(p0).q(true);
       this.M0(p0);
       if (i >= 0) {
          this.f.get(i).q(0);
          this.M0(i);
       }
       this.j.g(p0);
       return;
    }
    public final void O0(){
       if (PatchProxy.applyVoid(null, this, FontAdapter.class, "9")) {
          return;
       }
       if (this.j.b() >= 0) {
          return;
       }
       int i = 0;
       int i1 = this.f.size();
       while (i < i1) {
          if (this.f.get(i).l()) {
             this.j.g(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public int f0(int p0){
       FontAdapter uFontAdapter = FontAdapter.class;
       if (PatchProxy.isSupport(uFontAdapter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFontAdapter, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.f.get(p0).m() == FontType.LOCAL) {
          return 1;
       }else {
          return 0;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, FontAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       FontAdapter uFontAdapter = FontAdapter.class;
       if (!PatchProxy.isSupport(uFontAdapter) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFontAdapter, "6")) {
          a.p(p0, "holder");
          p0.c(p1, this.f.get(p1), new ArrayList(), this.j.f());
       }
       return;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(FontAdapter.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, FontAdapter.class, "7")) {
          a.p(p0, "holder");
          a.p(p2, "payloads");
          p0.c(p1, this.f.get(p1), p2, this.j.f());
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LocalFontVH localFontVH;
       View view;
       LocalFontVH localFontVH1;
       FontAdapter uFontAdapter = FontAdapter.class;
       if (PatchProxy.isSupport(uFontAdapter)) {
          localFontVH = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uFontAdapter, "4");
          if (localFontVH != PatchProxyResult.class) {
          label_0058 :
             return localFontVH;
          }
       }
       a.p(p0, "parent");
       if (p1 == 1) {
          view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0676, p0, false);
          a.o(view, "LayoutInflater.from\(pare¡­\n          parent, false\)");
          localFontVH1 = new LocalFontVH(view, this.h);
       }else {
          view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0677, p0, false);
          a.o(view, "LayoutInflater.from\(pare¡­\n          parent, false\)");
          localFontVH1 = new RemoteFontVH(view, this.h);
       }
       localFontVH = localFontVH1;
       goto label_0058 ;
    }
}
