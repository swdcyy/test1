package com.yxcorp.login.bind.fragment.ChangePhoneFragment$d;
import n3d.a;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.n0;
import mvb.b;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import o56.a;
import android.app.Application;
import java.lang.Exception;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class ChangePhoneFragment$d implements a	// class@001a4c
{
    public final ChangePhoneFragment b;

    public void ChangePhoneFragment$d(ChangePhoneFragment p0){
       this.b = p0;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       ChangePhoneFragment$d tb;
       if (PatchProxy.isSupport(ChangePhoneFragment$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ChangePhoneFragment$d.class, "1")) {
          return;
       }
       try{
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(ChangePhoneFragment.class) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), p2, tb, ChangePhoneFragment.class, "14") || (p1 == -1 && p2 != null))) {
             String stringExtra = p2.getStringExtra("COUNTRY_CODE");
             tb.t = "+"+stringExtra;
             int i = 0;
             int intExtra = p2.getIntExtra("COUNTRY_FLAT_DRAWABLE_ID", i);
             tb.u = intExtra;
             if (intExtra <= 0 && (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(b.c(n0.e(stringExtra), i)))) {
                tb.u = tb.getResources().getIdentifier(n0.d("_"+stringExtra), "drawable", a.B.getPackageName());
             }
          label_009f :
             tb.gh(tb.u, tb.t);
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          tb.l.setImageDrawable(null);
       }
       return;
    }
}
