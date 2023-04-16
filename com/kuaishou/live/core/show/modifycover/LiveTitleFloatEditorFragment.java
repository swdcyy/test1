package com.kuaishou.live.core.show.modifycover.LiveTitleFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import b36.a;
import r16.d;
import lnc.x6;
import lnc.y6;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.Paint$Align;
import android.content.res.Resources;
import android.os.Build;
import com.yxcorp.utility.TextUtils;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;

public class LiveTitleFloatEditorFragment extends FloatEditorFragment	// class@000d16
{
    public a w1;

    public void LiveTitleFloatEditorFragment(){
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       String str1;
       if (PatchProxy.isSupport(LiveTitleFloatEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveTitleFloatEditorFragment.class, "2")) {
          return;
       }
       this.w1.C = p0.toString();
       String str = y6.r(d.class).DM(this.w1);
       if (p0.length() > str.length()) {
          this.W0.setText(str);
          this.W0.setSelection(str.length());
          str1 = str;
       }
       super.onTextChanged(str1, p1, p2, p3);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveTitleFloatEditorFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       InputFilter[] inputFilterA = new InputFilter[]{new InputFilter$LengthFilter(13)};
       this.W0.setFilters(inputFilterA);
       int i = n.c(a.a().a(), 5.00f);
       a uoa = new a();
       uoa.a = -1;
       uoa.i = "banner_text0";
       uoa.d = n.y(a.a().a());
       uoa.h = true;
       int[] ointArray = new int[]{i,i,i,i};
       uoa.k = ointArray;
       uoa.c = 0x7f0807f0;
       uoa.x = Paint$Align.CENTER.ordinal();
       uoa.b = a.a().a().getResources().getColor(0x7f060759);
       uoa.e = 0;
       uoa.j = 3;
       uoa.z = n.y(a.a().a());
       uoa.A = n.u(a.a().a());
       uoa.B = 3;
       this.w1 = uoa;
       String mODEL = Build.MODEL;
       if (!TextUtils.x(mODEL) && mODEL.contains("vivo NEX")) {
          this.getDialog().getWindow().addFlags(1024);
       }
       return;
    }
}
