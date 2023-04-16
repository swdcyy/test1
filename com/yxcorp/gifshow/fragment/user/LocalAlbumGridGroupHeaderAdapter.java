package com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import ika.a;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$a;
import nsd.u;
import com.yxcorp.gifshow.fragment.user.h;
import p8c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import g9c.a;
import java.util.Calendar;
import ika.a$b;
import usd.n;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import lnc.a1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$kSelector$1;
import msd.l;
import xf6.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$kSelector$2;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$b;
import java.util.Iterator;
import java.lang.Iterable;
import android.widget.TextView;
import java.lang.IllegalAccessException;
import java.lang.Throwable;
import lnc.i1;

public final class LocalAlbumGridGroupHeaderAdapter extends a	// class@00127e
{
    public final l o;
    public final int p;
    public static final LocalAlbumGridGroupHeaderAdapter$a q;

    static {
       LocalAlbumGridGroupHeaderAdapter.q = new LocalAlbumGridGroupHeaderAdapter$a(null);
    }
    public void LocalAlbumGridGroupHeaderAdapter(h p0,int p1){
       a a;
       long l1;
       long l2;
       String str3;
       long l3;
       LocalAlbumGridGroupHeaderAdapter$kSelector$1 okSelector$1;
       LocalAlbumGridGroupHeaderAdapter localAlbumGr = this;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a.p(p0, "contentAdapter");
       super(p0);
       localAlbumGr.p = p1;
       Calendar.getInstance();
       a = a.a;
       Objects.requireNonNull(a);
       Object obj = null;
       a$b obj1 = PatchProxy.applyOneRefs(obj, a, uoa, "1");
       int i = 5;
       long l = 1000;
       String str = "it";
       int i1 = 1;
       int i2 = 2;
       if (obj1 != patchProxyRe) {
          l1 = obj1.longValue();
       }else {
          Calendar instance1 = Calendar.getInstance();
          instance1.set(instance1.get(i1), instance1.get(i2), instance1.get(i), 0, 0, 0);
          a.o(instance1, str);
          l1 = (instance1.getTimeInMillis() / l) * l;
       }
       String str1 = a1.p(R.string.arg_RES_7f100acb);
       a.o(str1, "CommonUtil.string\(R.stri¡­.draft_group_title_today\)");
       int i3 = 1;
       int i4 = 2;
       int i5 = 1;
       String str2 = str;
       obj1 = new a$b(new n(l1, Long.MAX_VALUE), str1, 0, 0, 8, 0);
       Objects.requireNonNull(a);
       Calendar obj2 = PatchProxy.applyOneRefs(obj, a, uoa, "3");
       if (obj2 != patchProxyRe) {
          l2 = obj2.longValue();
          str3 = str2;
       }else {
          obj2 = Calendar.getInstance();
          int i6 = 7;
          i2 = obj2.get(i6);
          i2 = (i2 == i5)? i2 - i6: i2 - 2;
          obj2.add(i, i2);
          obj2.set(obj2.get(i5), obj2.get(i4), obj2.get(i), 0, 0, 0);
          str3 = str2;
          a.o(obj2, str3);
          long l5 = 1000;
          l2 = (obj2.getTimeInMillis() / l5) * l5;
       }
       String str4 = a1.p(R.string.arg_RES_7f100acc);
       a.o(str4, "CommonUtil.string\(R.string.draft_group_title_week\)");
       a$b uob = new a$b(new n(l2, Long.MAX_VALUE), str4, i3, 0, 8, null);
       Objects.requireNonNull(a);
       String obj3 = PatchProxy.applyOneRefs(obj, a, uoa, "2");
       if (obj3 != patchProxyRe) {
          l3 = obj3.longValue();
       }else {
          Calendar instance = Calendar.getInstance();
          instance.set(instance.get(1), instance.get(2), 1, 0, 0, 0);
          a.o(instance, str3);
          long l4 = 1000;
          l3 = (instance.getTimeInMillis() / l4) * l4;
       }
       obj3 = a1.p(R.string.arg_RES_7f100aca);
       a.o(obj3, "CommonUtil.string\(R.stri¡­.draft_group_title_month\)");
       a$b uob1 = new a$b(new n(l3, Long.MAX_VALUE), obj3, 2, 0, 8, null);
       String str5 = a1.p(R.string.arg_RES_7f100ac9);
       a.o(str5, "CommonUtil.string\(R.stri¡­.draft_group_title_early\)");
       a$b uob2 = new a$b(new n(0, Long.MAX_VALUE), str5, 3, 0, 8, null);
       this.S0().clear();
       a$b[] uobArray = new a$b[]{v10,obj1,v4,obj3};
       this.S0().addAll(CollectionsKt__CollectionsKt.L(uobArray));
       c uoc = a.a();
       String str6 = "AppEnv.get\(\)";
       a.o(uoc, str6);
       if (uoc.c()) {
          okSelector$1 = new LocalAlbumGridGroupHeaderAdapter$kSelector$1(localAlbumGr);
          Object obj4 = PatchProxy.applyOneRefs(okSelector$1, localAlbumGr, LocalAlbumGridGroupHeaderAdapter.class, "4");
          if (obj4 != patchProxyRe) {
             okSelector$1 = obj4;
          }else {
             c uoc1 = a.a();
             a.o(uoc1, str6);
             if (uoc1.c()) {
                String str7 = l.g("key_policy_draft_divide_by_time", "");
                if (!TextUtils.isEmpty(str7)) {
                   a.o(str7, "policy");
                   String[] stringArray = new String[]{" "};
                   List list = StringsKt__StringsKt.H4(str7, stringArray, false, 0, 6, null);
                   if (list.size() == this.S0().size()) {
                      Ref$IntRef intRef = new Ref$IntRef();
                      intRef.element = 0;
                      okSelector$1 = new LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1(localAlbumGr, intRef, list);
                   }
                }
             }
          }
       }else {
          okSelector$1 = new LocalAlbumGridGroupHeaderAdapter$kSelector$2(localAlbumGr);
       }
       localAlbumGr.o = okSelector$1;
       return;
    }
    public void O0(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumGridGroupHeaderAdapter.class, "3")) {
          return;
       }
       super.O0();
       return;
    }
    public l T0(){
       return this.o;
    }
    public RecyclerView$ViewHolder U0(ViewGroup p0,int p1){
       LocalAlbumGridGroupHeaderAdapter localAlbumGr = LocalAlbumGridGroupHeaderAdapter.class;
       if (PatchProxy.isSupport(localAlbumGr)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, localAlbumGr, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.e(p0.getContext(), R.layout.arg_RES_7f0d0e9d, p0, false, this.p);
       a.o(view, "view");
       return new LocalAlbumGridGroupHeaderAdapter$b(this, view);
    }
    public void t(RecyclerView$ViewHolder p0,int p1){
       Object obj;
       a$b b;
       LocalAlbumGridGroupHeaderAdapter localAlbumGr = LocalAlbumGridGroupHeaderAdapter.class;
       if (PatchProxy.isSupport(localAlbumGr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, localAlbumGr, "2")) {
          return;
       }
       a.p(p0, "holder");
       if (p0 instanceof LocalAlbumGridGroupHeaderAdapter$b) {
          Iterator iterator = this.k.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = (obj.a() == p1)? 1: null;
                if (!obj1) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null) {
                b = obj.b;
                if (b != null) {
                label_004b :
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoidOneRefs(b, p0, LocalAlbumGridGroupHeaderAdapter$b.class, "1")) {
                      RecyclerView$ViewHolder itemView = p0.itemView;
                      a.o(itemView, "itemView");
                      TextView textView = itemView.findViewById(R.id.recyclerItemHeaderTxt);
                      a.o(textView, "itemView.recyclerItemHeaderTxt");
                      textView.setText(b);
                      p0.a = b;
                      break ;
                   }
                }
             }
             b = "";
             goto label_004b ;
          }
       }else {
          i1.b("LocalAlbumGridGroupHeaderAdapter", new IllegalAccessException(String.valueOf(p1)));
       }
       return;
    }
}
