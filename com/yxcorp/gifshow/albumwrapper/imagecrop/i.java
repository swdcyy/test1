package com.yxcorp.gifshow.albumwrapper.imagecrop.i;
import io.reactivex.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mz6.b;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.albumwrapper.imagecrop.i$a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public class i implements g	// class@001b6c
{
    public final k b;

    public void i(k p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       b uob = new b(this.b.b.getActivity());
       uob.j(new int[2]{R.string.arg_RES_7f1010fe,0x7f1010ff});
       uob.l(new i$a(this, p0));
       uob.q();
       return;
    }
}
