package com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor$mEmptyView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m3c.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;

public final class SimpleButtonProcessor$mEmptyView$2 extends Lambda implements a	// class@001341
{
    public final SimpleButtonProcessor this$0;

    public void SimpleButtonProcessor$mEmptyView$2(SimpleButtonProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       a obj = PatchProxy.apply(null, this, SimpleButtonProcessor$mEmptyView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.b;
       a.o(obj, "mBaseFragment");
       View view = n.G(obj.getContext(), R.layout.arg_RES_7f0d124b);
       this.this$0.e = view.findViewById(0x7f0a0333);
       this.this$0.f = view.findViewById(0x7f0a3f2c);
       this.this$0.g = view.findViewById(0x7f0a0092);
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
