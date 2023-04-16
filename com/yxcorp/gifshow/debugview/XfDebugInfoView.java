package com.yxcorp.gifshow.debugview.XfDebugInfoView;
import android.widget.FrameLayout;
import java.lang.String;
import android.graphics.Color;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import yv9.c;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import yv9.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.LinearLayout;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.lang.CharSequence;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import yv9.d;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import yv9.b;
import yv9.a$b;
import java.util.Map;
import java.util.Map$Entry;
import com.yxcorp.gifshow.debugview.XfDebugInfoView$a;

public class XfDebugInfoView extends FrameLayout	// class@0012a8
{
    public boolean b;
    public String c;
    public Set d;
    public XfDebugInfoView$a e;
    public View f;
    public FrameLayout g;
    public LinearLayout h;
    public TextView i;
    public a j;
    public static final int k;
    public static final int l;

    static {
       XfDebugInfoView.k = Color.parseColor("#609C9C9C");
       XfDebugInfoView.l = Color.parseColor("#00000000");
    }
    public void XfDebugInfoView(Context p0){
       super(p0, null);
    }
    public void XfDebugInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void XfDebugInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, XfDebugInfoView.class, "1")) {
       }else {
          View view = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d171b, this);
          this.f = view;
          TextView textView = view.findViewById(R.id.tv_float);
          this.i = textView;
          textView.setOnClickListener(new c(this));
          RecyclerView recyclerView = this.f.findViewById(R.id.list);
          recyclerView.setLayoutManager(new LinearLayoutManager(p0));
          recyclerView.setFocusable(false);
          a uoa = new a();
          this.j = uoa;
          recyclerView.setAdapter(uoa);
          this.h = this.f.findViewById(0x7f0a289a);
          this.g = this.f.findViewById(0x7f0a0ed6);
       }
       this.d = new HashSet();
       return;
    }
    public boolean a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextView obj = PatchProxy.applyOneRefs(p0, this, XfDebugInfoView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.d.contains(p0)) {
          return false;
       }
       this.d.add(p0);
       obj = PatchProxy.applyOneRefs(p0, this, XfDebugInfoView.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = new TextView(this.f.getContext());
          obj.setText(p0);
          obj.setTextSize(24.00f);
          obj.setTextColor(a1.a(R.color.arg_RES_7f061dd2));
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
          layoutParams.topMargin = 5;
          layoutParams.bottomMargin = 5;
          obj.setLayoutParams(layoutParams);
          obj.setOnClickListener(new d(this, obj, p0));
          this.h.addView(obj);
       }
       if (this.d.size() == 1) {
          obj.performClick();
       }
       return true;
    }
    public void b(){
       String str = "2";
       if (PatchProxy.applyVoid(null, this, XfDebugInfoView.class, str)) {
          return;
       }
       XfDebugInfoView tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(null, tj, a.class, str)) {
          tj.e = new ArrayList();
          tj.k0();
       }
       this.h.removeAllViews();
       this.d = new HashSet();
       this.c = null;
       return;
    }
    public String getCurrentPage(){
       return this.c;
    }
    public void setList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfDebugInfoView.class, "4")) {
          return;
       }
       XfDebugInfoView tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidOneRefs(p0, tj, a.class, "1") && p0 != null) {
          tj.e.clear();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             tj.e.add(new a$b(uob.a));
             Iterator iterator1 = uob.b.entrySet().iterator();
             while (iterator1.hasNext()) {
                tj.e.add(new a$b(iterator1.next()));
             }
          }
          tj.k0();
       }
       return;
    }
    public void setOnPageSelectListener(XfDebugInfoView$a p0){
       this.e = p0;
    }
}
