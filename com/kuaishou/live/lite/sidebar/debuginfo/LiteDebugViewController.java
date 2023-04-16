package com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController;
import gd3.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController$container$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import android.widget.GridLayout;
import android.content.Context;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.drawable.ColorDrawable;
import java.lang.Number;
import ssd.e;
import ssd.e$a;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import qrd.l1;
import java.util.Iterator;

public final class LiteDebugViewController extends ViewController implements a	// class@000b4b
{
    public final p j;

    public void LiteDebugViewController(){
       super();
       this.j = s.c(new LiteDebugViewController$container$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiteDebugViewController.class, "2")) {
          return;
       }
       this.R2(this.V2());
       return;
    }
    public final ViewGroup V2(){
       Object obj = PatchProxy.apply(null, this, LiteDebugViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public void X1(String p0,Iterable p1){
       int i2;
       View view1;
       LiteDebugViewController liteDebugVie = LiteDebugViewController.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, liteDebugVie, "3")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "debugViews");
       GridLayout gridLayout = new GridLayout(this.D2());
       gridLayout.setColumnCount(4);
       int i = a1.e(6.00f);
       int i1 = a1.e(2.00f);
       TextView textView = new TextView(gridLayout.getContext());
       textView.setText(p0);
       Object[] obj = PatchProxy.apply(null, this, liteDebugVie, "4");
       if (obj != PatchProxyResult.class) {
          i2 = obj.intValue();
       }else {
          e$a b = e.b;
          int i3 = b.l(255);
          int i4 = b.l(255);
          i2 = Color.argb(255, i3, i4, b.l(255));
       }
       textView.setBackground(new ColorDrawable(i2));
       textView.setPadding(i, i1, i, i1);
       gridLayout.addView(textView);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          obj = (!view instanceof TextView)? null: view;
          if (obj != null) {
             obj.setMaxEms(4);
          }
          gridLayout.addView(view);
       }
       this.V2().addView(gridLayout);
       return;
    }
}
