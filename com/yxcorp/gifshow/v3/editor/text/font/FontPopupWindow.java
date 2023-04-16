package com.yxcorp.gifshow.v3.editor.text.font.FontPopupWindow;
import yuc.c;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.text.font.FontPopupWindow$mFontAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import yuc.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import yuc.d;
import java.lang.Number;
import com.yxcorp.utility.n;
import faa.a;
import q87.c;
import yuc.e;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import di0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import yuc.b;
import androidx.lifecycle.Observer;
import java.util.List;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Collection;

public final class FontPopupWindow extends PopupWindow implements c	// class@00142a
{
    public d b;
    public e c;
    public final Context d;
    public final int e;
    public final p f;
    public final RecyclerView g;
    public final Fragment h;
    public FontVMDelegate i;

    public void FontPopupWindow(Fragment p0,FontVMDelegate p1){
       a.p(p0, "fragment");
       a.p(p1, "mVMDelegate");
       super(p0.getContext());
       this.h = p0;
       this.i = p1;
       Context context = p0.getContext();
       this.d = context;
       this.e = a1.e(40.00f);
       this.f = s.c(new FontPopupWindow$mFontAdapter$2(this));
       this.setContentView(LayoutInflater.from(context).inflate(R.layout.arg_RES_7f0d047b, null));
       this.setWidth(-1);
       this.setHeight(-2);
       this.setTouchable(true);
       this.setOutsideTouchable(false);
       this.setFocusable(false);
       this.setInputMethodMode(true);
       this.setBackgroundDrawable(new ColorDrawable(false));
       View view = this.getContentView().findViewById(R.id.font_rv);
       a.o(view, "contentView.findViewById\(R.id.font_rv\)");
       this.g = view;
       if (PatchProxy.applyVoidOneRefs(view, this, FontPopupWindow.class, "2")) {
       }else {
          view.setLayoutManager(new LinearLayoutManager(context, false, false));
          view.setHasFixedSize(true);
          view.addItemDecoration(new a(this));
          view.setAdapter(this.a());
       }
       return;
    }
    public RecyclerView$LayoutManager B1(){
       RecyclerView$LayoutManager obj = PatchProxy.apply(null, this, FontPopupWindow.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.getLayoutManager();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       return obj;
    }
    public d C1(){
       return this.b;
    }
    public int D1(){
       Object obj = PatchProxy.apply(null, this, FontPopupWindow.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.y(this.d);
    }
    public final FontAdapter a(){
       Object obj = PatchProxy.apply(null, this, FontPopupWindow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, FontPopupWindow.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FontBIZ", "notifyViewPrepared", objArray);
       FontPopupWindow tc = this.c;
       if (tc != null) {
          tc.onPrepared();
       }
       return;
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(FontPopupWindow.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FontPopupWindow.class, "6")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       this.a().N0(p0);
       this.a().J0(p0);
       return;
    }
    public final void d(d p0){
       this.b = p0;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, FontPopupWindow.class, "5")) {
          return;
       }
       this.i.f().w0().removeObservers(this.h);
       View contentView = this.getContentView();
       a.o(contentView, "contentView");
       contentView.setVisibility(8);
       super.dismiss();
       Object[] objArray = new Object[0];
       a.D().s("FontBIZ", "dismiss", objArray);
       return;
    }
    public final void e(e p0){
       this.c = p0;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, FontPopupWindow.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getActivity();
    }
    public void showAtLocation(View p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FontPopupWindow.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FontPopupWindow.class, "4")) {
          return;
       }
       super.showAtLocation(p0, p1, p2, p3);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, FontPopupWindow.class, "7")) {
          this.i.f().w0().observe(this.h, new b(this));
          p3 = 0;
          if (this.i.d().isEmpty()) {
             ListHolder value = this.i.f().w0().getValue();
             if (value != null) {
                objArray = value.c();
             }
             if (objArray != null) {
                int i = 1;
                if ((objArray.isEmpty() ^ i) == i) {
                   Object[] objArray1 = new Object[p3];
                   a.D().s("FontBIZ", "vmList isNotEmpty", objArray1);
                   this.i.d().addAll(objArray);
                   this.a().O0();
                   this.a().k0();
                   this.b();
                }
             }
             objArray = new Object[p3];
             a.D().s("FontBIZ", "load cache", objArray);
             this.i.f().y0(p3);
          }else {
             objArray = new Object[p3];
             a.D().s("FontBIZ", "fontList isNotEmpty", objArray);
             this.a().O0();
             this.b();
          }
       }
       return;
    }
}
