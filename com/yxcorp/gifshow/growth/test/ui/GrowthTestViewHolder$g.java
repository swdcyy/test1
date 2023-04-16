package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$g;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.ImageView;
import android.widget.TextView;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zqa.b$k;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$g$a;
import android.view.View$OnClickListener;
import vqa.k;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import android.widget.ImageView$ScaleType;

public final class GrowthTestViewHolder$g extends GrowthTestViewHolder	// class@00157b
{
    public final GrowthTestViewHolderEnum a;
    public final ImageView b;
    public final TextView c;

    public void GrowthTestViewHolder$g(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Switch;
       this.b = p0.findViewById(0x7f0a3da7);
       this.c = p0.findViewById(0x7f0a3da8);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       ImageView$ScaleType fIT_END;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$g.class, "1")) {
          return;
       }
       if (!p0 instanceof b$k) {
          return;
       }
       GrowthTestViewHolder$g tb = this.b;
       if (tb != null) {
          this.itemView.setOnClickListener(new GrowthTestViewHolder$g$a(tb, p0));
          k b = k.b;
          String str = p0.b();
          Boolean fALSE = Boolean.FALSE;
          Class uClass = 1;
          int b1 = false;
          Class uClass1 = (str == null || u.S1(str))? 1: null;
          if (!uClass1) {
             try{
                d uod = m0.d(fALSE.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   fALSE = Boolean.valueOf(b.a().getBoolean(str, b1));
                }else {
                   String str1 = null;
                   if (a.g(uod, m0.d(String.class))) {
                      if (fALSE instanceof String) {
                         str1 = fALSE;
                      }
                      if (str1 == null) {
                         str1 = "";
                      }
                      str2 = b.a().getString(str, str1);
                      if (str2 != null && str2.length()) {
                         uClass = 0;
                      }
                      if (!uClass) {
                         if (str2 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      if (fALSE instanceof Integer) {
                         str1 = fALSE;
                      }
                      b1 = (str1 != null)? str1.intValue(): Integer.MIN_VALUE;
                      int b2 = b.a().getInt(str, b1);
                      if (b2 != Integer.MIN_VALUE) {
                         str2 = Integer.valueOf(b2);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      if (fALSE instanceof Long) {
                         str1 = fALSE;
                      }
                      long l = (str1 != null)? str1.longValue(): Long.MIN_VALUE;
                      long longx = b.a().getLong(str, l);
                      if (longx - Long.MIN_VALUE) {
                         str2 = Long.valueOf(longx);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      if (fALSE instanceof Float) {
                         str1 = fALSE;
                      }
                      float f = (str1 != null)? str1.floatValue(): Float.MIN_VALUE;
                      float floatx = b.a().getFloat(str, f);
                      if (floatx - 1) {
                         str2 = Float.valueOf(floatx);
                      }
                   }
                   fALSE = str2;
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
    label_0146 :
       return;
    }
}
