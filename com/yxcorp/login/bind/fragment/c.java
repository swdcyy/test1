package com.yxcorp.login.bind.fragment.c;
import v0d.m$b;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.bind.fragment.ChangePhoneFragment;
import android.widget.TextView;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.core.content.ContextCompat;
import java.lang.Integer;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;

public class c implements m$b	// class@001a5c
{
    public final ChangePhoneFragment$f a;

    public void c(ChangePhoneFragment$f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.a.b.o.setText(R.string.arg_RES_7f10422e);
       ChangePhoneFragment$f b = this.a.b;
       b.o.setTextColor(ContextCompat.getColor(b.getContext(), R.color.arg_RES_7f061fe8));
       this.a.b.o.setEnabled(true);
       return;
    }
    public void onProgress(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       this.a.b.o.setText(a.B.getString(R.string.arg_RES_7f104cee, objArray));
       ChangePhoneFragment$f b = this.a.b;
       b.o.setTextColor(ContextCompat.getColor(b.getContext(), R.color.arg_RES_7f061fe3));
       return;
    }
}
