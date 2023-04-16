package com.yxcorp.gifshow.reminder.widget.a;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.reminder.widget.a$f;
import com.yxcorp.gifshow.reminder.widget.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.reminder.widget.a$b;
import com.yxcorp.gifshow.reminder.widget.a$c;
import com.yxcorp.gifshow.reminder.widget.a$d;
import com.yxcorp.gifshow.reminder.widget.a$e;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;
import rkd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ofc.a;
import hka.b;
import ofc.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import lnc.a1;

public class a	// class@001b04
{

    public void a(){
       super();
    }
    public static void a(Activity p0,View p1,int p2,int p3,Runnable p4){
       int i = 3;
       int i1 = 1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, a.class, "2")) {
             return;
          }
       }
       a uoa = new a(p0);
       uoa.K0(KwaiBubbleOption.e);
       uoa.o0(p1);
       uoa.x0(new LinearLayoutManager(p0));
       uoa.B0(p2);
       uoa.D0(BubbleInterface$Position.BOTTOM);
       uoa.A0(i1);
       uoa.C0(p3);
       uoa.z(i1);
       uoa.A(i1);
       ArrayList uArrayList = Lists.f(i);
       uArrayList.add(new a$f(R.drawable.arg_RES_7f08219a, 0x7f10426b, new a$a(uoa, p0, p4), null));
       uArrayList.add(new a$f(R.drawable.arg_RES_7f08053a, 0x7f1034da, new a$b(uoa, p0, p4), null));
       uArrayList.add(new a$f(R.drawable.arg_RES_7f08053e, 0x7f1034d9, new a$c(uoa, p0), null));
       uArrayList.add(new a$f(R.drawable.arg_RES_7f0821a1, 0x7f1034db, new a$d(uoa, p0), null));
       uoa.m0(new a$e(uArrayList));
       l.c(uoa, R.layout.arg_RES_7f0d12fe);
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, null, a.class, "3") && (b.g() && p0 instanceof GifshowActivity)) {
          a uoa1 = new a(uoa);
          p0.i3(uoa1);
          uoa.M(new c(p0, uoa1));
       }
    label_00da :
       return;
    }
    public static void b(Activity p0,View p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       a.a(p0, p1, a1.e(12.00f), (- a1.e(4.00f)), p2);
       return;
    }
}
