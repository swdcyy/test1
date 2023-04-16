package com.kuaishou.live.core.show.test.m0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import gj1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.collection.ArraySet;
import d61.l0;
import java.util.HashSet;
import java.util.ArrayList;
import g91.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import java.lang.CharSequence;
import e17.i;

public final class m0 implements View$OnClickListener	// class@0011b4
{
    public static final m0 b;

    static {
       m0.b = new m0();
    }
    public void m0(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoid(null, null, b.class, "7")) {
       }else {
          b.a.i(new ArraySet());
          b.b.i(new HashSet());
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("lastExplicitGiftIds", b.e(new ArrayList()));
          g.a(uEditor);
       }
       i.d(R.style.arg_RES_7f110668, "ÒÑÇå³ý");
       return;
    }
}
