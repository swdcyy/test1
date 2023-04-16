package com.yxcorp.gifshow.share.KwaiOperator$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import kotlin.jvm.internal.a;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class KwaiOperator$b implements Runnable	// class@001b48
{
    public final KwaiOperator b;

    public void KwaiOperator$b(KwaiOperator p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KwaiOperator$b.class, "1")) {
          return;
       }
       this.b.o(new ProgressFragment());
       ProgressFragment progressFrag = this.b.j();
       a.m(progressFrag);
       progressFrag.setCancelable(false);
       progressFrag = this.b.j();
       a.m(progressFrag);
       progressFrag.Cb(this.b.c().getSupportFragmentManager(), "share");
       return;
    }
}
