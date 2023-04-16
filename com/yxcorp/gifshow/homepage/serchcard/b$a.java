package com.yxcorp.gifshow.homepage.serchcard.b$a;
import com.yxcorp.gifshow.homepage.serchcard.d$a;
import com.yxcorp.gifshow.homepage.serchcard.b;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;

public class b$a implements d$a	// class@0017f8
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(SearchCardMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (this.a.r.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.RESUMED)) {
          this.a.W8(p0);
       }
       return;
    }
}
