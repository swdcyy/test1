package com.yxcorp.gifshow.v3.editor.magicfinger.l;
import p16.c;
import com.yxcorp.gifshow.v3.editor.magicfinger.o;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nrc.e;
import java.lang.Runnable;

public final class l implements c	// class@001039
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void a(){
       l tb = this.b;
       tb.getActivity().runOnUiThread(new e(tb));
    }
}
