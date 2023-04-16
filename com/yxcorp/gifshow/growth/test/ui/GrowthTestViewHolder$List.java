package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.TextView;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zqa.b$f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List$onBind$1;
import android.view.View$OnClickListener;
import java.util.Map;
import java.util.Collection;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;
import java.util.Set;
import java.util.Iterator;

public final class GrowthTestViewHolder$List extends GrowthTestViewHolder	// class@00156b
{
    public final GrowthTestViewHolderEnum a;
    public View b;
    public TextView c;
    public TextView d;

    public void GrowthTestViewHolder$List(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.List;
       this.b = p0.findViewById(0x7f0a3dd7);
       this.c = p0.findViewById(0x7f0a3de7);
       this.d = p0.findViewById(0x7f0a3de9);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       String str1;
       d uod;
       Boolean tRUE;
       int intx;
       long longx;
       float floatx;
       String str = String.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$List.class, "1")) {
          return;
       }
       if (!p0 instanceof b$f) {
          return;
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       Context context = titemView.getContext();
       if (!context instanceof GifshowActivity) {
          return;
       }
       GrowthTestViewHolder$List tb = this.b;
       if (tb != null) {
          tb.setOnClickListener(new GrowthTestViewHolder$List$onBind$1(this, p0, context));
       }
       try{
          b$f uof = p0;
          k obj = CollectionsKt___CollectionsKt.p2(CollectionsKt___CollectionsKt.d2(uof.d().values()));
          Boolean uBoolean = null;
          int i = 1;
          if (obj instanceof Integer) {
             obj = k.b;
             str1 = p0.b();
             Integer integer = (str1 == null || u.S1(str1))? 1: null;
             if (!integer) {
                uod = m0.d(Integer.class);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (obj.a().getBoolean(str1, false)) {
                      tRUE = Boolean.TRUE;
                   label_0085 :
                      uBoolean = tRUE;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = obj.a().getString(str1, "");
                   if (tRUE != null && tRUE.length()) {
                      i = 0;
                   }
                   if (!i) {
                      if (tRUE != null) {
                         goto label_0085 ;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   intx = obj.a().getInt(str1, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      uBoolean = Integer.valueOf(intx);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   longx = obj.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      tRUE = Long.valueOf(longx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   floatx = obj.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                      goto label_0085 ;
                   }
                }
             }
          }else if(obj instanceof Long){
             obj = k.b;
             str1 = p0.b();
             Long longx1 = (str1 == null || u.S1(str1))? 1: null;
             if (!longx1) {
                uod = m0.d(Long.class);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (obj.a().getBoolean(str1, false)) {
                      tRUE = Boolean.TRUE;
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = obj.a().getString(str1, "");
                   if (tRUE != null && tRUE.length()) {
                      i = 0;
                   }
                   if (!i) {
                      if (tRUE != null) {
                         goto label_0085 ;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   intx = obj.a().getInt(str1, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      tRUE = Integer.valueOf(intx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   longx = obj.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      uBoolean = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   floatx = obj.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                      goto label_0085 ;
                   }
                }
             }
          }else if(obj instanceof Float){
             obj = k.b;
             str1 = p0.b();
             Float uFloat = (str1 == null || u.S1(str1))? 1: null;
             if (!uFloat) {
                uod = m0.d(Float.class);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (obj.a().getBoolean(str1, false)) {
                      tRUE = Boolean.TRUE;
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = obj.a().getString(str1, "");
                   if (tRUE != null && tRUE.length()) {
                      i = 0;
                   }
                   if (!i) {
                      if (tRUE != null) {
                         goto label_0085 ;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   intx = obj.a().getInt(str1, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      tRUE = Integer.valueOf(intx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   longx = obj.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      tRUE = Long.valueOf(longx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   floatx = obj.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      uBoolean = Float.valueOf(floatx);
                   }
                }
             }
          }else {
             obj = k.b;
             str1 = p0.b();
             uod = (str1 == null || u.S1(str1))? 1: null;
             if (!uod) {
                uod = m0.d(str);
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   if (obj.a().getBoolean(str1, false)) {
                      tRUE = Boolean.TRUE;
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(str))){
                   tRUE = obj.a().getString(str1, "");
                   if (tRUE != null && tRUE.length()) {
                      i = 0;
                   }
                   if (!i) {
                      if (tRUE != null) {
                         goto label_0085 ;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   intx = obj.a().getInt(str1, Integer.MIN_VALUE);
                   if (intx != Integer.MIN_VALUE) {
                      tRUE = Integer.valueOf(intx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   longx = obj.a().getLong(str1, Long.MIN_VALUE);
                   if (longx - Long.MIN_VALUE) {
                      tRUE = Long.valueOf(longx);
                      goto label_0085 ;
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   floatx = obj.a().getFloat(str1, Float.MIN_VALUE);
                   if (floatx - Float.MIN_VALUE) {
                      tRUE = Float.valueOf(floatx);
                      goto label_0085 ;
                   }
                }
             }
          }
       label_0354 :
          Iterator iterator = uof.d().keySet().iterator();
          while (iterator.hasNext()) {
             String str2 = iterator.next();
             if (a.g(uBoolean, uof.d().get(str2))) {
                GrowthTestViewHolder$List tc = this.c;
                if (tc != null) {
                   tc.setText(str2);
                }
             }
          }
          GrowthTestViewHolder$List td = this.d;
          if (td != null) {
             td.setText(p0.c());
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
